package com.example.ContactInfoMng.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.ContactInfoMng.Entity.Tcontact;

@Repository
public interface TcontactRepository extends CrudRepository<Tcontact ,String> {

	
	@Query (value="SELECT MAX(CONTACT_NO)" + " FROM t_contact;" ,nativeQuery = true)
	int math();
	
	@Query (value="SELECT * " + "FROM t_contact" + " WHERE CONTACT_NO = :CONTACT_NO ;" ,nativeQuery = true)
	Tcontact getTcontact(@Param("CONTACT_NO") int CONTACT_NO);
	
	@Query (value="SELECT MAX(CONTACT_NO)" + " FROM t_contact;" ,nativeQuery = true)
	int get();
	
	
	
	@Transactional
	@Modifying
	@Query(value="UPDATE t_contact"
			   + " SET SALE_STAFF_NO = :SALE_STAFF_NO"
			   + " ,RECEPTION_DATE=:RECEPTION_DATE"
			   + " ,UPDATE_USER='springuser'"
			   + " ,UPDATE_DATE=:UPDATE_DATE"
			   + " WHERE CONTACT_NO=:CONTACT_NO;"
			   , nativeQuery = true)
	public void setDATE(@Param("SALE_STAFF_NO") String SALE_STAFF_NO
					   ,@Param("CONTACT_NO") String CONTACT_NO
					   ,@Param("RECEPTION_DATE") String RECEPTION_DATE
					   ,@Param("UPDATE_DATE") String UPDATE_DATE
					   );
}

	
	
//	// クエリの生成
//	//Query＝インターフェース			createNativeQueryクラスにSQLを実行するメソッド
//								//createNativeQueryの左にSQLを書いても構わない
//	Query query = entityManager.createNativeQuery(sql, Tcontact.class);
//
//	// クエリの実行
//	@SuppressWarnings("unchecked")
//	List<Tcontact> searchData = query.getResultList();
//	
//	return searchData;



//	@Query(value = "SELECT *"
//			+ "FROM T_contact;"
//			, nativeQuery = true)
//	ArrayList<T_contact> getAll();
//	
//    @Modifying
//    @Transactional
//    @Query("UPDATE t_contact"
//         + " SET SALE_STAFF_NO = sale_staff_no"
//         , update_date = update_date
//         , reception_date = reception_date);
//    public Integer updateData(
//    	 @Param("sale_staff_no") String sale_staff_no	// 戻り値は更新件数の数字
//        ,@Param("update_date") String contact_no
//        ,@Param("update_user") String contact_cd
//        ,@Param("contact_no") int contact_no
//        ,@Param("reception_date") String reception_date
//    	);


