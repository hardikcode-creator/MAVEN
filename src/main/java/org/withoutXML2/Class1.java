package org.withoutXML2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;


@Scope("prototype")
public class Class1 {

    @Value("Hardik")
    private String studentName;
    @Value("Amravati")
    private String city;
    private Samosa samosa;

    public Class1(Samosa samosa) {
        this.samosa = samosa;
    }

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }

    private List<String> friends;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Class1{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                ", samosa=" + samosa +
                ", friends=" + friends +
                '}';
    }
}
