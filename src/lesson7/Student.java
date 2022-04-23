package lesson7;

public class Student {
   //переменные(поля класса), характиристики обьекта
   private String name;
   private String surname;
   private int age;

   public Student(){

   }
   public Student(int age,String name,String surname){
      this.age=age;
      this.name=name;
      this.surname=surname;
   }

   public void setAge(int age){
       this.age=age;

   }



   public int getAge() {
      return this.age;

   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getSurname() {
      return surname;
   }

   public void setSurname(String surname) {
      this.surname = surname;
   }
}
