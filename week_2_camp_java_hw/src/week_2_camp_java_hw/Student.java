package week_2_camp_java_hw;

public class Student {
	public Student() {
		System.out.println("Creating a new user account...");
	}
	
	private int _id;
	private String _name;
	private String _mail;
	private String _phone;
	private String _username;
	private String _password;
	private Courses [] _courseList;
	
	public int get_id() {
		return _id;
	}
	public void set_id(int id) {
		this._id = id;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String name) {
		this._name = name;
	}
	public String get_mail() {
		return _mail;
	}
	public void set_mail(String mail) {
		this._mail = mail;
	}
	public String get_phone() {
		return _phone;
	}
	public void set_phone(String phone) {
		this._phone = phone;
	}
	public String get_username() {
		return _username;
	}
	public void set_username(String username) {
		this._username = username;
	}
	public String get_password() {
		return _password;
	}
	public void set_password(String password) {
		this._password = password;
	}
	
	public void showAllStudents(Student newStudent) {
		System.out.println(newStudent.get_name()+newStudent.get_username()+newStudent.get_password()+newStudent.get_mail());
	}
	public Courses [] get_courseList() {
		return _courseList;
	}
	public void set_courseList(Courses [] _courseList) {
		this._courseList = _courseList;
	}
}
