package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<StudentInformation, Integer> {

	
	  public List<StudentInformation> findByStudentNativeLocation(String location);
	  
	  // public List<StudentInformation> findByAge(Integer age);
	  
	  // public List<StudentInformation> findByAge(Integer i);
	  
	  //public List<StudentInformation> findByStudentIdandStudentLocation(Integer
	//  id, String location);
	  
	  public List<StudentInformation> findBystudentPhoneNumber(Integer number);
	  
	  public List<StudentInformation> findBystudentID(Integer idNumber);
	  
	  public List<StudentInformation> findByStudentBranch(String branch);
	  
	  // List<StudentInformation> findBystudentEmailandstudentNativeLocation(String
	  //student_email,String location);
	 	
	public List<StudentInformation> findByStudentNativeLocationIn(List<String> location);
	
	public List<StudentInformation> findByStudentIDAndLocation(Integer id,String location);

	public List<StudentInformation> findByStudentIdGreaterThanAndLocation(Integer id, String string);
	

}
