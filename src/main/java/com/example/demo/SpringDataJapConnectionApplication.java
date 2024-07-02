package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.dao.StudentDao;
import com.example.demo.dao.StudentInformation;

@SpringBootApplication
public class SpringDataJapConnectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringDataJapConnectionApplication.class, args);

		StudentDao bean = run.getBean(StudentDao.class);

		System.out.println("  Package name -> " + run.getClass().getName());
		System.out.println("  Bean Count ===>" + run.getBeanDefinitionCount());

		System.out.println("    Bean Information retreiving ..... ");
		System.out.println(bean.getClass().getName());

		List<StudentDao> details = Arrays.asList();
		System.out.println("Student Details ->" + details);

		System.out.println(" =============================");

		StudentInformation student1 = new StudentInformation(369, "Akhila", "MECHANICAL", "jAN12", "AAA@gamil.com",
				"Nellore", 12354);
		StudentInformation student2 = new StudentInformation(968, "Neeraja", "civil", "Jan45", "nnn@gamil.com",
				"Kadapa", 587537);
		StudentInformation student3 = new StudentInformation(339, "Rajitha", "IT", "june12", "rrr@gamil.com", "Kadapa",
				568745);
		StudentInformation student4 = new StudentInformation(169, "VijayaLakshmi", "Hyderabad", "March 22",
				"vvv@gamil.com", "Kakinada", 85247);
		StudentInformation student5 = new StudentInformation(987, "Sreeja", "Computer Science", "Mrch12",
				"sss@gamil.com", "Nellore", 698714);

		List<StudentInformation> detailss = Arrays.asList(student1, student2, student3, student4, student5);
		bean.saveAll(detailss);

		// bean.save(student1);

		System.out.println(" ====================== Find by Id ===========================        ");

		Optional<StudentInformation> byId = bean.findById(987);
		if (byId.isPresent()) {
			System.out.println("  Retrieving information from the data base ===>" + byId.get());
		}

		System.out.println(" ==================================================   ");

		Iterable<StudentInformation> allById = bean.findAllById(Arrays.asList(169, 333339));
		allById.forEach(System.out::println);

		System.out.println(" ================ Finding all ==================");

		Iterable<StudentInformation> all = bean.findAll();

		System.out.println("Finding all details from the student table -> " + all);
		all.forEach(System.out::println);

		System.out.println("==============Count ===================");

		long count = bean.count();
		System.out.println("Total Students Count =" + count);

		System.out.println(" ==========   ======= Exists by Id [checking the data exists or not]========= ");

		boolean existsById = bean.existsById(987);

		System.out.println("Student data found Present =" + existsById);

		boolean existsById1 = bean.existsById(97);

		System.out.println("Student data found Present =" + existsById1);

		System.out.println("================  JPA Repository =================================");

		System.out.println("====================Finding by native location =================  ");

		String locationName = "Nellore";
		List<StudentInformation> studentnativelocation = bean.findByStudentNativeLocation(locationName);

		for (StudentInformation data1 : studentnativelocation) {
			System.out.println("  Data fetched sucessfully ..." + data1);
		}

		System.out.println(" ============  Fetching the data by using student phone number ====================");

		Integer phoneNumber = 85247;
		List<StudentInformation> bystudentPhoneNumber = bean.findBystudentPhoneNumber(phoneNumber);
		System.out.println(bystudentPhoneNumber);

		System.out.println("  =======   Fetching throgh Id =================");

		Integer idNumber = 101;
		Optional<StudentInformation> byId2 = bean.findById(idNumber);

		System.out.println(byId2); // Optional.empty

		System.out.println(
				" ------------------------------------------------------------------------------------------------------------------");

		Optional<StudentInformation> byId3 = bean.findById(369);
		System.out.println("Student Id Fecthed sucessfully from data base =" + byId3);

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------");
		System.out.println(" ");

		System.out.println(
				"============  Getting Student  Information based on branch ======================================================");

		List<StudentInformation> byStudentBranch = bean.findByStudentBranch("IT");
		System.out.println("   Fetching student details by Branch =" + byStudentBranch);

		System.out.println(
				"  ==========  Getting student details by email and location ==================================================");

		/*
		 * String locationName1 = "Kakinada"; String email = "rrr@gmail.com";
		 */
		// List<StudentInformation> byEmailandLocation =
		// bean.findByStudentEmailandLocation("rrr@gamil.com", "Nellore");

		// System.out.println(byEmailandLocation);

		List<StudentInformation> byLocation = bean
				.findByStudentNativeLocationIn(Arrays.asList("Nellore", "Kadapa", "Kakinada"));

		byLocation.forEach(System.out::println);
		
		
		
		System.out.println(" ========================================================================================");
		
		
		List<StudentInformation> byAgeGreaterThanAndLocation = bean.findByStudentIdGreaterThanAndLocation(968, "Kadapa");
		byAgeGreaterThanAndLocation.forEach(System.out::println);
		
		

	}

}
