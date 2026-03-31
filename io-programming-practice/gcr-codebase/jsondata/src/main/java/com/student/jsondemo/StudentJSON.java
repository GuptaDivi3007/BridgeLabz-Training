package com.student.jsondemo;
import org.json.JSONArray;
import org.json.JSONObject;
public class StudentJSON {
	public static void main(String[] args) {
		JSONObject student = new JSONObject();
		student.put("name", "Khushi Rathore");
		student.put("age", 23);
		JSONArray subjects = new JSONArray();
		subjects.put("Science");
		subjects.put("Mathematics");
		subjects.put("English");
		student.put("subjects",subjects);
		System.out.println(student.toString(2));
	}
}
