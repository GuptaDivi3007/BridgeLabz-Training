package com.student.jsondemo;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
public class FilterJSONByAge {
	public static void main(String[] args) throws Exception {

        String json = "["
                + "{ \"name\": \"Aman\", \"age\": 22, \"email\": \"aman@gmail.com\" },"
                + "{ \"name\": \"Khushi\", \"age\": 26, \"email\": \"khushi@gmail.com\" },"
                + "{ \"name\": \"Rahul\", \"age\": 30, \"email\": \"rahul@gmail.com\" },"
                + "{ \"name\": \"Neha\", \"age\": 24, \"email\": \"neha@gmail.com\" }"
                + "]";

        ObjectMapper mapper = new ObjectMapper();

        // Parse JSON array
        JsonNode rootNode = mapper.readTree(json);

        System.out.println("Records with age > 25:\n");

        // Loop through array
        for (JsonNode node : rootNode) {

            int age = node.get("age").asInt();

            if (age > 25) {
                String name = node.get("name").asText();
                String email = node.get("email").asText();

                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Email: " + email);
                System.out.println("-------------------");
            }
        }
    }
}
