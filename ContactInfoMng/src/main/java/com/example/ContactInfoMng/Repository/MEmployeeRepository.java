package com.example.ContactInfoMng.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ContactInfoMng.Entity.MEmployee;

@Repository
public interface MEmployeeRepository extends CrudRepository<MEmployee,String> {

		@Query (value="SELECT *" + " FROM m_employee" + " WHERE DEPART_CD = '40';" ,nativeQuery = true)
		Iterable<MEmployee> getMemployee();


}
