package week_2_camp_java_hw;

public class Courses {
	public Courses() {
		
	}
	public Courses(int id,String title,String topic, String author,String category,Boolean status) {
		this._id=id;
		this._title=title;
		this._topic=topic;
		this._author=author;
		this._category=category;
		this._status=status;
		System.out.println("-------The Courses of"+this._topic+" has been created.-------");
	}
		
		private int _id;
		private String _title;
		private String _topic;
		private String _author;
		private String _category;
		private Boolean _status;
		private Student [] _studentList;
		
		public int get_id() {
			return _id;
		}
		public void set_id(int id) {
			this._id = id;
		}
		public String get_title() {
			return _title;
		}
		public void set_title(String title) {
			this._title = title;
		}
		public String get_topic() {
			return _topic;
		}
		public void set_topic(String topic) {
			this._topic = topic;
		}
		public String get_author() {
			return _author;
		}
		public void set_author(String author) {
			this._author = author;
		}
		public String get_category() {
			return _category;
		}
		public void set_category(String category) {
			this._category = category;
		}
		public Boolean get_status() {
			return _status;
		}
		public void set_status(Boolean status) {
			this._status = status;
		}
		
		
		public void showAllCourses(Courses newCourse) {
			System.out.println(newCourse.get_title()+newCourse.get_category()+newCourse.get_author()+newCourse.get_topic());
		}
		public Student [] get_studentList() {
			return _studentList;
		}
		public void set_studentList(Student [] _studentList) {
			this._studentList = _studentList;
		}
}
