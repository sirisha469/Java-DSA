package HCLAssignment6;

import java.util.TreeSet;
public class Student implements Comparable<Student>{
  private String rollNo;
  private String sem;
  private int[] marks;
  Student(String rollNo,String sem,int[] marks){
    this.rollNo = rollNo;
    this.sem = sem;
    this.marks = marks;
  }

  public String getRollNo(){
    return rollNo;
  }

  public int sum(){
    int sum=0;
    for(int i:marks){
      sum+=i;
    }
    return sum;
  }

  public String toString(){
    return ""+marks[0]+" "+marks[1]+" "+marks[2]+" "+marks[3]+" "+marks[4]+" ";
  }
  @Override
  public int compareTo(Student other){
    int semesterComparision = this.sem.compareTo(other.sem);
    if(semesterComparision!=0){
      return semesterComparision;
    }

    return this.rollNo.compareTo(rollNo);
  }
  public static void main(String[] args) {
    
    TreeSet<Student> set = new TreeSet<>();

    set.add(new Student("A01","S1",new int[]{90,87,80,56,40}));
    set.add(new Student("A02","S2",new int[]{80,87,60,64,50}));
    set.add(new Student("A03","S3",new int[]{91,78,67,76,70}));

    for(Student s:set){
      System.out.println("Roll No: "+s.rollNo);
      System.out.println("SEM M1 M2 M3 M4 M5 SUM");
      System.out.println(s.sem+" "+s.toString()+s.sum());
      System.out.println("Total: "+s.sum());
    }
  }
}
