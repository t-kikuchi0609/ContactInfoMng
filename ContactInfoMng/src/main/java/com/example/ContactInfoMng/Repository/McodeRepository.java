package com.example.ContactInfoMng.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ContactInfoMng.Entity.Mcode;

@Repository
public interface McodeRepository extends CrudRepository<Mcode ,String> {
//	@Query(value = "SELECT *"
//			+ "FROM m_code;"
//			, nativeQuery = true)
//	ArrayList<M_code> getAll();
//}
	
//    @Modifying
//    @Query("UPDATE customer"
//         + " SET c_name = :cName"
//         + " WHERE c_num = :cNum")
//    public Integer updateData(      // 戻り値は更新件数の数字
//        @Param("cName") String c_name,
//        @Param("cNum") String c_num
//    );
//    
//    //データ挿入
//    @Modifying
//    @Query(value = "INSERT INTO customer"
//    			 + "VALUES(:c_num,:c_num,:address,:office)"
//    			 ,nativeQuery = true)
//    void insertData(@Param("c_num")String c_num
//    				@Param("c_name")String c_name
//    			   ,@Param("address")String address
//    			   ,@Param("office")String office);
}
