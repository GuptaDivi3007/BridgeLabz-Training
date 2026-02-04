package com.student.jsondemo;
import com.fasterxml.jackson.databind.ObjectMapper;
public class JsonValidationExample {

	public static void main(String[] args) {

        String json = "{ \"name\": \"Khushi Rathore\", \"email\": \"khushi@gmail.com\", \"age\": 20 }";

        ObjectMapper mapper = new ObjectMapper();

        try {
            
            mapper.readTree(json);
            System.out.println("Valid JSON");

        } catch (Exception e) {
            System.out.println("Invalid JSON");
        }
    }

}
