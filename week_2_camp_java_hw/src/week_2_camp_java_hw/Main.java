package week_2_camp_java_hw;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to our Java Tutorial Page");
		
		Student rookieStudent=new Student();
		rookieStudent.set_id(0);
		rookieStudent.set_mail("youngrookie@gmail.com");
		rookieStudent.set_name("Shmouel");
		rookieStudent.set_password("youcantlearnthis");
		rookieStudent.set_phone("+723 524 08 23");
		rookieStudent.set_username("ShmouelTheVanguard");
		Courses []newList=new Courses[2];
		rookieStudent.set_courseList(newList);
		Student []newList2=new Student[2];
		
		
		
		Courses courseTheMagnificent=new Courses(0,"Java Courses","Programming","Mr. E.D. :)","Computer Science",true);
		courseTheMagnificent.set_studentList(newList2);
		
		AddingCourses addCourseOperation=new AddingCourses(rookieStudent.get_courseList(),courseTheMagnificent.get_id
				(),courseTheMagnificent.get_title(),courseTheMagnificent.get_topic(),courseTheMagnificent.get_author(),
				courseTheMagnificent.get_category(),courseTheMagnificent.get_status());
		AddingStudents addStudentOperation=new AddingStudents(courseTheMagnificent.get_studentList(),rookieStudent.get_id(),rookieStudent.get_name(),rookieStudent.get_mail(),rookieStudent.get_phone(),rookieStudent.get_username(),rookieStudent.get_password());
		rookieStudent.showAllStudents(rookieStudent);
		courseTheMagnificent.showAllCourses(courseTheMagnificent);
		
	}
	//https://github.com/TahaAydas/Java_week2_hw.git

}
