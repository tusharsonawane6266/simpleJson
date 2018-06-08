package simpleJson;

import com.google.gson.Gson;

public class ConvertToJson {

	public static void main(String[] args) {
		Student stud = createStudent();
		
		Gson gson = new Gson();
		String json = gson.toJson(stud);
		System.out.println(json);
		System.out.println("this is edited branch"); //created branch to merge 
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
