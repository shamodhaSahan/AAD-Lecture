package lk.ijse.jsonTypeHandle.api;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import lk.ijse.jsonTypeHandle.dto.StudentDTO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 7/9/2023
 * Time : 1:17 AM
 */

public class JsonTypeHandle extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        if(req.getContentType() == null || ! req.getContentType().toLowerCase().startsWith("application/json")){
            res.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
        }

//        BufferedReader reader = req.getReader();
//        StringBuilder sb = new StringBuilder();
//        reader.lines().forEach(line -> sb.append(line+"\n"));
//        System.out.println(sb);

//++++++++Read JSON and manipulate++++++++
//        JsonReader reader = Json.createReader(req.getReader());

//*-------Read one object (JSONP)--------
//        JsonObject jsonObject = reader.readObject();
//        String name = jsonObject.getString("name");
//        int age = jsonObject.getInt("age");
//        System.out.println(name);
//        System.out.println(age);

//*-------Read object Array (JSONP)--------
//        JsonArray jsonArray = reader.readArray();
//        for (int i=0; i< jsonArray.size(); i++){
//            JsonObject jsonObject = jsonArray.getJsonObject(i);
//            System.out.println(jsonObject.getString("name"));
//            System.out.println(jsonObject.getInt("age"));
//            System.out.println(jsonObject.getJsonObject("address").getString("city"));
//            System.out.println(jsonObject.getJsonObject("address").getString("postalcode"));
//        }

//*-------Read object Array (JSONB)--------
//        Jsonb jsonb = JsonbBuilder.create();
//        List<StudentDTO> studentDTOS = jsonb.fromJson(
//                req.getReader(),
//                new ArrayList<StudentDTO>(){}.getClass().getGenericSuperclass()
//        );
//        studentDTOS.forEach(System.out::println);

//*-------Write object Array (JSONB)--------
//        List<StudentDTO> studentDTOS = new ArrayList<>();
//        studentDTOS.add(new StudentDTO("kamal", 25));
//        studentDTOS.add(new StudentDTO("amal", 30));
//        studentDTOS.add(new StudentDTO("nimal", 18));
//        studentDTOS.add(new StudentDTO("sunimal", 50));

//        res.setContentType("Application/json");
//        Jsonb jsonb = JsonbBuilder.create();
//        jsonb.toJson(studentDTOS, res.getWriter());

    }
}
