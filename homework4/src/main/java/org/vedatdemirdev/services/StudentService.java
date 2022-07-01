package org.vedatdemirdev.services;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.vedatdemirdev.entity.Student;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

    List<Student> studentList = new ArrayList<>();
    JsonService jsonService; //To get students we need jsonService

    public StudentService(JsonService jsonService) {
        this.jsonService = jsonService;
        setAttributes();
    }


    //Returns all list of students
    public List<Student> getAll(){

        return studentList;
    }


    private void setAttributes(){
        JSONArray objectList = jsonService.readAndGet("students.json");

        objectList.forEach(student -> parseJsonObjects((JSONObject) student));
    }

    //This method converts json objects to student object and adds to list.
    private void parseJsonObjects(JSONObject student){
        Student toAddStudent = new Student();

        toAddStudent.setName((String) student.get("name"));
        toAddStudent.setSurname((String) student.get("surname"));
        toAddStudent.setAge(Math.toIntExact((Long) student.get("age")));

        studentList.add(toAddStudent);
    }


}
