import java.util.*;
class Student {
 int rollNo; String name;
 Student(int rollNo,String name){this.rollNo=rollNo;this.name=name;}
 public String toString(){return rollNo+" - "+name;}
}
public class Q26_StudentIterator {
 public static void main(String[] args) {
  ArrayList<Student> a=new ArrayList<>();
  a.add(new Student(1,"Aman"));a.add(new Student(2,"Riya"));a.add(new Student(3,"Karan"));
  Iterator<Student> it=a.iterator();while(it.hasNext())System.out.println(it.next());
 }
}
