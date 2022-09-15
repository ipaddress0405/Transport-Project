package com.infy.WorkItem.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infy.WorkItem.Entity.ftr_workitems;

@Repository
public interface WorkitemRepository extends JpaRepository<ftr_workitems,Long> {

  //@Query("select w.workitem_id from ftr_workitems w where w.user_id=?1.user_id")
  
//public List<String> getworkitemId(Integer userId)

	//public List<String> getworkitemId(Integer userId);
  
   // findByName(Name name);
	
	//findByworkId
	
}

