package com.student.jsondemo;
import org.json.JSONObject;
public class MergeTwoJSON {
	public static void main(String[] args) {
		JSONObject json1 = new JSONObject();
        json1.put("name", "Khushi Rathore");
        json1.put("age", 20);

        
        JSONObject json2 = new JSONObject();
        json2.put("email", "khushi@gmail.com");
        json2.put("city", "Delhi");
        
        for (String key : json2.keySet()) {
            json1.put(key, json2.get(key));
        }
        System.out.println(json1.toString(2));
	}
}
