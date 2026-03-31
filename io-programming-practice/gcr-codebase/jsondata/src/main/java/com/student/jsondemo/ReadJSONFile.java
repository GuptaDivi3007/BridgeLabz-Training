package com.student.jsondemo;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
public class ReadJSONFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	FileReader reader=new FileReader("src/main/resources/user.json");
        	JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();
        	
        	String name = jsonObject.get("name").getAsString();
            String email = jsonObject.get("email").getAsString();
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
        }catch(Exception e) {
        	System.out.println(e);
        }
	}

}
