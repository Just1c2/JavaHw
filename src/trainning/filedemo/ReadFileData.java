package trainning.filedemo;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadFileData {
    public void getCustomer() throws FileNotFoundException, IOException     {
        List<Customer> customerList;
        Gson gson = new Gson();
        FileReader reader = new FileReader("customer.json");
        customerList = new Gson().fromJson(reader, new TypeToken<List<Customer>>(){}.getType());

        for (Customer customer: customerList) {
            System.out.println(customer);
        }
        reader.close();
    }

    //cach 2
    private static void parseCustomerObject(JSONObject jsonObject) {
        long id = (long) jsonObject.get("id");
        String first_name = (String) jsonObject.get("String");
        String last_name = (String) jsonObject.get("String");
        String email = (String) jsonObject.get("email");
        String phone = (String) jsonObject.get("phone");
        String address = (String) jsonObject.get("address");

        System.out.println(id + " - " + first_name);
    }

    public void getCustomerData() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        FileReader fileReader = new FileReader("customer.json");

        Object obj = parser.parse(fileReader);
        JSONArray customerList = (JSONArray) obj;
    }
}
