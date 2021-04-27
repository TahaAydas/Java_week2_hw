package week_2_camp_java_hw;

public class AddingCourses {
	
	public AddingCourses(Courses[] allcourses,int id,String title,String topic,String author,String category,Boolean status) {
		int i=0;

			
			allcourses[i]=new Courses();
			allcourses[i].set_id(id);
			allcourses[i].set_topic(topic);
			allcourses[i].set_author(author);
			allcourses[i].set_category(category);
			allcourses[i].set_status(status);
			}
			
		
	}
	

