package com.example.ContactInfoMng;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ContactInfoMng.Entity.MEmployee;
import com.example.ContactInfoMng.Entity.Mcode;
import com.example.ContactInfoMng.Entity.Tcontact;
import com.example.ContactInfoMng.Repository.MEmployeeRepository;
import com.example.ContactInfoMng.Repository.McodeRepository;
import com.example.ContactInfoMng.Repository.SearchDataRepository;
import com.example.ContactInfoMng.Repository.TcontactRepository;


@Controller
public class ContactInfoMngController {
	//インスタンスを取得　すべてのテーブル
	@Autowired	
	public TcontactRepository t_contactRepository;
	
	@Autowired
	public McodeRepository m_codeRepository;
	
	@Autowired
	public MEmployeeRepository  memployeeRepository;
	
	@Autowired
	public EntityManager entityManager;

	
	//お問い合わせ一覧を開く
    @GetMapping(path="/contact/inputForm")
    public String index(Model model) {
    	//テーブルの全データの取得
		Iterable<Mcode> Mcodelist = m_codeRepository.findAll();
		
		//属性追加
		model.addAttribute("McodeList",Mcodelist);
		return "ContactInput.html";
    }
	    // DB登録処理
		@PostMapping(path="/contact/confirmation")
		//受け取るカラムを登録
		public String submitButtom(@RequestParam String contact_cd
								  ,@RequestParam String company
								  ,@RequestParam String register1
								  ,@RequestParam String register2
								  ,@RequestParam String tel1
								  ,@RequestParam String tel2
								  ,@RequestParam String tel3
								  ,@RequestParam String mall
								  ,@RequestParam String post_code1
								  ,@RequestParam String post_code2
								  ,@RequestParam String street_address
								  ,@RequestParam String contents
								  ,Model model){
			Tcontact t_contactAddData = new Tcontact();
			String tel = tel1 + "-" + tel2 + "-" + tel3;
			String post_code = post_code1 + "-" + post_code2;
			String register = register1 + register2;
			t_contactAddData.setAll(contact_cd,company,register,tel,mall,post_code,street_address,contents);
		
			//時間を一緒に登録する
	        Date dateget = new Date();
	        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm");
	        
	        t_contactAddData.setUPDATE_date(format.format(dateget));

	        t_contactAddData.setCREATE_date(format.format(dateget));

	        t_contactAddData.setCREATE_user("springuser");

	        t_contactAddData.setUPDATE_user("springuser");
	        


	        //自動採番と例外処理をひとまとめにおこなうtryで正常catchで例外の処理
	        int i;
	        try{
	        	i = t_contactRepository.math();
	        	i = i+1;
	        }catch(Exception e){
	        	i = 1;
	        }
	        t_contactAddData.setContact_no(i);
	        //登録チェックエラー
	        boolean ok = false;
		    try{
		    	model.addAttribute("hidden", ok);
		    	t_contactRepository.save(t_contactAddData);	        
		        return "confirmation.html";
		    }catch(Exception e){
		    	
		    	ok = true;
		    	model.addAttribute("company",company);
		    	model.addAttribute("register1",register1);
		    	model.addAttribute("register2",register2);
		    	model.addAttribute("tel1",tel1);
		    	model.addAttribute("tel2",tel2);
		    	model.addAttribute("tel3",tel3);
		    	model.addAttribute("mall",mall);
		    	model.addAttribute("post_code1",post_code1);
		    	model.addAttribute("street_address",street_address);
		    	model.addAttribute("contents",contents);

		    	return "ContactInput.html";
		    }
		    
		}


		//ここから検索一覧画面表示
		@RequestMapping(path="/contact/list")
		public String serchList(Model model) {

			Iterable<Mcode> mcodeList = m_codeRepository.findAll();
			model.addAttribute("mcodelist", mcodeList);
			
			Iterable<Tcontact> TcontactList = t_contactRepository.findAll();
			model.addAttribute("tcontactList", TcontactList);

			return "list.html";
		}
		

		@PostMapping(path="/contact/list")
		public String Registration(@RequestParam String contact_cd
				  		  ,@RequestParam String contents
				  		  ,@RequestParam String company
				  		  ,@RequestParam String register
				  		  ,Model model) {
			// M_CUSTOMERテーブルの全データを取得 パターン1.CrudRepositoryのfindAll
//			Adorable<Customer> customerList = customerRepository.findAll();
			
			// M_CUSTOMERテーブルの全データを取得 パターン2.CustomerRepositoryでnativeSQLで取得
//			ArrayList<Customer> customerList = customerRepository.getAll();
			//*************2021/6/4 検索条件を指定してcustomerテーブルからデータを取得する*******************//
			// M_CUSTOMERテーブルのデータを取得（条件つき） パターン3.SearchDataRepositoryで動的SQLにて取得

			SearchDataRepository searchData = new SearchDataRepository(entityManager);
			
			Iterable<Mcode> mcodeList = m_codeRepository.findAll();
			model.addAttribute("mcodelist", mcodeList);
			
			//@RequestParamで引数を設定する
			List<Tcontact> getResultList = searchData.getSearchData(contact_cd,contents,company,register);
			//******************************************************************************************//
			
			// モデルに属性追加
			model.addAttribute("getResultList",getResultList);
			
			// データ一覧画面を表示
			return "list.html";
		}
		
		
		
		
		//受付登録
		//対応者入力フォーム表示
//		@PostMapping(path="/contact/receptionForm")
//		public String List2(@RequestParam int CONTACT_NO
//		  		  		   ,Model model){
//			Tcontact tcontact = t_contactRepository.getTcontact(CONTACT_NO);
//			model.addAttribute("sale_staff_no",tcontact.getSale_staff_no());
//			
//			SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm");
//			if(tcontact.getReception_date()!=null) {
//				tcontact.setReception_date(format.format(tcontact.getReception_date()));
//			}else {
//				tcontact.setReception_date("");
//			}
//			
//			model.addAttribute("reception_date",tcontact.getReception_date());
//
//			
//			Iterable<MEmployee> memployeeList = memployeeRepository.getMemployee();
//			model.addAttribute("MEmployeelist", memployeeList);
//			
//			return "receptionForm.html";
//		}
//		
//		@PostMapping(path="/contact/reception",params="touroku")
//		public String getdate(Model model
//				   			 ,@RequestParam String SALE_STAFF_NO
//				   			 ,@RequestParam String CONTACT_NO) {
//			
//			Date dateget = new Date();
//	        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm");
//	        String nowDate = format.format(dateget);
//	        
//	        t_contactRepository.setDATE(SALE_STAFF_NO,CONTACT_NO,nowDate,nowDate);
//			return "receptionForm.html";
//
//		}
			
//			Iterable<Mcode> mcodeList = m_codeRepository.findAll();
//			model.addAttribute("mcodelist", mcodeList);
//			
//			Date dateget2 = new Date();
//	        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm");
//	        String date = d.format(dateget2);
//	        
//	        t_contactRepository.setDate(SALE_STAFF_NO,RECEPTION_DATE,point);
//	        
//	        return ContactInput.html;

		
//	    登録確認
	    @RequestMapping("/contact/confirmation")
	    public String index1(Model model) {

	        int get = t_contactRepository.get();
			model.addAttribute("get",get);

	        return "confirmation.html";
	    }		



}


