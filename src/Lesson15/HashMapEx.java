package Lesson15;

import java.util.*;

public class HashMapEx {
    public static void main(String[] args) {
        Student student=new Student(1,"иван",4);
        Student student1=new Student(2,"ирина ",2);
        Student student2=new Student(3,"влад ",3);
        Student student3=new Student(4,"елена ",5);
        Map<Student,Double>studentMap = new HashMap<>(18,75);
        studentMap.put(student,4.7);
      //  studentMap.put(student2,4.5);

        studentMap.putIfAbsent(student2,4.5);
       studentMap.containsKey(studentMap.containsKey(student));
     //   studentMap.put(",биолгия",student);
      //  studentMap.put(",биолгия",student2);
        System.out.println(studentMap);
    //    List<String>strings=new LinkedList<>();

        }
    }

