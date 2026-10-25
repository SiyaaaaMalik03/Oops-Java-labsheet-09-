import java.util.*;
class StudentRecord {
 int rollNo; String name;
 StudentRecord(int rollNo,String name){this.rollNo=rollNo;this.name=name;}
 String getName(){return name;}
 public String toString(){return rollNo+" - "+name;}
}
public class Q27_SortStudentsComparator {
 public static void main(String[] args) {
  ArrayList<StudentRecord> a=new ArrayList<>();
  a.add(new StudentRecord(1,"Riya"));a.add(new StudentRecord(2,"Aman"));a.add(new StudentRecord(3,"Karan"));
  a.sort(Comparator.comparing(StudentRecord::getName));
  for(StudentRecord s:a)System.out.println(s);
 }
}
