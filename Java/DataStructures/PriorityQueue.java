import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
   private int token;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

class StudentComparator implements Comparator<Student>{
    @Override
    public int compare(Student a, Student b){
        if(Double.compare(a.getCgpa(), b.getCgpa()) == 0){
            if(a.getFname().compareTo(b.getFname()) == 0){
                return a.getToken() - b.getToken();
            }
            return a.getFname().compareTo(b.getFname());
        }
        return Double.compare(b.getCgpa(), a.getCgpa());
    }
}

public class Solution {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = Integer.parseInt(scan.nextLine());
      
        PriorityQueue<Student> pq = new PriorityQueue<Student>(n, new StudentComparator());
        while (n-- > 0) {
            String event = scan.next();
            switch (event) {
                case "ENTER":
                    String fname = scan.next();
                    double cgpa  = scan.nextDouble();
                    int token = scan.nextInt();
                    pq.add(new Student(token, fname, cgpa));
                    break;
                case "SERVED":
                    pq.poll();
                    break;
                default:
                    break;
            } 
        }
        scan.close();
        
        if (pq.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            while ( ! pq.isEmpty()) {
                Student s = pq.remove();
                System.out.println(s.getFname());
            }
        }
    }
}
