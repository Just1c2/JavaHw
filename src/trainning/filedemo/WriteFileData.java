package trainning.filedemo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WriteFileData {
    public static void writeFileWithMap() throws IOException {

        //create mapData
        Map<String, Object> mapData = new HashMap<>();
        mapData.put("id", "1");
        mapData.put("email", "trung@gmail.com");
        mapData.put("name", "Trung");
        mapData.put("roles", new String[]{"Admin", "Manager", "Memeber"});
        mapData.put("Manager", true);

        //Write
        Writer writer = new FileWriter("employee.json");

        //convert map to json file
        Gson gson = new Gson();
        gson.toJson(mapData, writer);

        //close file
        writer.close();
    }

    public static void writeFileWithEntity() throws IOException {
        //create object
        Employee employee = new Employee(1, "Nguyen", "nguyen@gmail.com", new String[]{"Manager", "Admin", "Member"}, true);

        //writer
        Writer writer = Files.newBufferedWriter(Paths.get("employeeEntity.json"));

        //create gson object
        new Gson().toJson(employee, writer);

        writer.close();
    }

    public static void writeFileWithEntities() throws IOException {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Quang", "quang@gmail.com", new String[]{"Member"}, false),
                new Employee(2, "Quang", "quang@gmail.com", new String[]{"Member", "Admin"}, false),
                new Employee(3, "Quang", "quang@gmail.com", new String[]{"Member"}, false),
                new Employee(4, "Quang", "quang@gmail.com", new String[]{"Member"}, false),
                new Employee(5, "Thanh", "quang@gmail.com", new String[]{"Member"}, true)
        );

        //writer
        Writer writer = new FileWriter("employeeEntities.json");

        //create gson object
        Gson gson = new Gson();

        //convert employee list to json
        gson.toJson(employees, writer);

        writer.close();
    }

    public static void writeFileWithFormat() throws IOException {
        Employee employee = new Employee(1, "Hieu", "hieu@gmail.com", new String[]{"Admin", "Manager"}, true);

        //create pretty print
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        //writer
        Writer writer = Files.newBufferedWriter(Paths.get("employeePretty.json"));

        //convert employee to json file
        gson.toJson(employee, writer);

        //close
        writer.close();
    }

    public static void main(String[] args) throws IOException {
//        writeFileWithMap();
//        writeFileWithEntity();
//        writeFileWithEntities();
        writeFileWithFormat();
    }
}
