package com.example.demo.dao;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/*import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter

@Setter*/

/*
 * @AllArgsConstructor
 * 
 * @NoArgsConstructor
 */

/*
 * @ToString
 * 
 * @EqualsAndHashCode
 */

@Entity
@Table(name = "Student_Updated_Information")
public class StudentInformation {

	@Id
	private Integer studentID;

	@Column(name = "StudentName")
	private String studentName;

	@Column(name = "StudentBranch")

	private String studentBranch;

	@Column(name = "StudentJoining")

	private String yearOfJoining;

	@Column(name = "StudentEmail")

	private String studentEmail;
	@Column(name = "studentNativeLocation")

	private String studentNativeLocation;

	@Column(name = "StudentPhoneNumber")

	private Integer studentPhoneNumber;

	public StudentInformation() {
		System.out.println("   Default constructor is Running .....");
	}

	public StudentInformation(Integer studentID, String studentName, String studentBranch, String yearOfJoining,
			String studentEmail, String studentNativeLocation, Integer studentPhoneNumber) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentBranch = studentBranch;
		this.yearOfJoining = yearOfJoining;
		this.studentEmail = studentEmail;
		this.studentNativeLocation = studentNativeLocation;
		this.studentPhoneNumber = studentPhoneNumber;
	}

	@Override
	public String toString() {
		return "StudentInformation [studentID=" + studentID + ", studentName=" + studentName + ", studentBranch="
				+ studentBranch + ", yearOfJoining=" + yearOfJoining + ", studentEmail=" + studentEmail
				+ ", studentNativeLocation=" + studentNativeLocation + ", studentPhoneNumber=" + studentPhoneNumber
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentBranch, studentEmail, studentID, studentName, studentNativeLocation,
				studentPhoneNumber, yearOfJoining);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentInformation other = (StudentInformation) obj;
		return Objects.equals(studentBranch, other.studentBranch) && Objects.equals(studentEmail, other.studentEmail)
				&& Objects.equals(studentID, other.studentID) && Objects.equals(studentName, other.studentName)
				&& Objects.equals(studentNativeLocation, other.studentNativeLocation)
				&& Objects.equals(studentPhoneNumber, other.studentPhoneNumber)
				&& Objects.equals(yearOfJoining, other.yearOfJoining);
	}

}
