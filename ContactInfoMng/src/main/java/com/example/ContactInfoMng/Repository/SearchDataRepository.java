package com.example.ContactInfoMng.Repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.ContactInfoMng.Entity.Tcontact;

@Repository
public class SearchDataRepository {
	
	// エンティティマネージャー インターフェーステーブルを操作するものでRepositoryと同じ機能　機能としてはcrudと同じ
	public EntityManager entityManager;
	
	public SearchDataRepository(EntityManager entityManager) {
		// エンティティマネージャー取得
		this.entityManager = entityManager;
	}
	
	// 引数は検索条件
	//getSearchData 必要な値の分だけ引数に入れる　4つ書く
	public List<Tcontact> getSearchData(@Param("CONTACT_CD") String contact_cd
										,@Param("CONTENTS") String contents
										,@Param("COMPANY") String company
										,@Param("REGISTER") String register
										) {
//		// SQL文字列生成  //WHEREの場所trueと書いてもいいand条件でつなげるため　動的SQL
		String sql =  "SELECT * FROM t_contact WHERE 1=1 ";
//		
//		// 画面上の検索条件の有無によりWHERE句の条件を追加　NULLか空白で設定
		if(contact_cd != null) {
			sql += " and CONTACT_CD like '%" + contact_cd + "%'";
		}
		if(contents != null) {
			sql += " and CONTENTS like '%" + contents + "%'";
		}
		if(company != null) {
			sql += " and COMPANY like '%" + company + "%'";
		}
		if(register != null) {
			sql += " and REGISTER like '%" + register + "%'";
		}
			sql += "and DATE_SUB(CURDATE(),INTERVAL 5 YEAR) <= CREATE_DATE";
			
		sql += ";";

//		// クエリの生成
//		//Query＝インターフェース			createNativeQueryクラスにSQLを実行するメソッド
//									//createNativeQueryの左にSQLを書いても構わない
		Query query = entityManager.createNativeQuery(sql, Tcontact.class);

//		// クエリの実行
		@SuppressWarnings("unchecked")
		List<Tcontact> searchData = query.getResultList();
		
		return searchData;
	}


}
