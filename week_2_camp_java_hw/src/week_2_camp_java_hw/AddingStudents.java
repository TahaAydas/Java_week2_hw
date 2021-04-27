package week_2_camp_java_hw;

public class AddingStudents {
	
	public AddingStudents(Student [] allstudent,int id,String name,String mail,String phone,String username,String password) {
		int i=0;
		
		
		allstudent[i]=new Student();
		allstudent[i].set_id(id);
		allstudent[i].set_mail(mail);
		allstudent[i].set_name(name);
		allstudent[i].set_password(password);
		allstudent[i].set_phone(phone);
		allstudent[i].set_username(username);
	}
	 
}
