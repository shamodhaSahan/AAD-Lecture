package lk.ijse.spring.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Base64;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 8/19/2023
 * Time : 12:36 PM
 */

@RestController
@RequestMapping("api/v1/teacher")
public class Teacher {
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE) // for file data accept
    String handleMultiPart(@RequestPart String id, @RequestPart String name, @RequestPart String city, @RequestPart byte[] profile) {
        System.out.println(id);
        System.out.println(name);
        System.out.println(city);
        System.out.println(profile);

        try {
            byte[] decode = Base64.getDecoder().decode(profile);
            String profileSrt = new String(decode);
            System.out.println(profileSrt);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Saved..!";
    }

    @GetMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String handleImage(@RequestPart byte[] bytes){
        System.out.println();
        System.out.println(bytes);
        return Arrays.toString(bytes);
    }
}
