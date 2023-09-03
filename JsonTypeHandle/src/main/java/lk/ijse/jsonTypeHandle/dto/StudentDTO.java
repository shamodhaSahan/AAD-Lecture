package lk.ijse.jsonTypeHandle.dto;

import java.io.Serializable;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 7/15/2023
 * Time : 11:14 AM
 */

public class StudentDTO implements Serializable {
    private String name;
    private int age;

    public StudentDTO() {
    }

    public StudentDTO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
