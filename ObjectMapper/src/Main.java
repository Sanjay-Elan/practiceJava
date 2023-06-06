import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import EmployeePackage.Employee;


public class Main {
    public static void main(String args[]) throws IOException{
        ObjectMapper objectmapper = new ObjectMapper();
//        File f = new File("C:\\Work\\Codes\\Java\\ObjectMapper\\src\\Sample.json");
        Employee emp = objectmapper.readValue(new File("C:/Work/Codes/Java/ObjectMapper/src/Sample.json"), Employee.class);

        System.out.println("Employee Object : " +emp);

    }
}