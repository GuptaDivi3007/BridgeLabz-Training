import java.sql.*;
import java.io.*;

public class EmployeeCsvReport {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/companydb";
        String user = "root";
        String password = "password";

        String query = "select id, name, department, salary from employees";

        try (
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                BufferedWriter writer = new BufferedWriter(new FileWriter("employees_report.csv"))
        ) {
            writer.write("Employee ID,Name,Department,Salary");
            writer.newLine();

            while (resultSet.next()) {
                String row =
                        resultSet.getInt("id") + "," +
                        resultSet.getString("name") + "," +
                        resultSet.getString("department") + "," +
                        resultSet.getDouble("salary");
                writer.write(row);
                writer.newLine();
            }

        } catch (Exception e) {
            System.out.println("Error generating CSV report");
        }
    }
}
