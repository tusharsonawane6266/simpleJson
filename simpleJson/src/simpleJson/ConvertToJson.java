package simpleJson;

import com.google.gson.Gson;

public class ConvertToJson {

	public static void main(String[] args) {
		Student stud = createStudent();
		
		Gson gson = new Gson();
		String json = gson.toJson(stud);
		System.out.println(json); 
		//this is a mynewbranch which was created before
	}

	private static Student createStudent() {
		Student stud = new Student();
		stud.setName("tushar");
		stud.setAddress("pune");
		stud.setAge(21);
		stud.setSchool("All Saints");
		stud.setStandard("12th");
		return stud;
	}
}
