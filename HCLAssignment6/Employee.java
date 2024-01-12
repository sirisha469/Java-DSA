package HCLAssignment6;

import java.util.*;

class Employee{
  private String empNo;
  private String Depart;
  private int Basic;
  private int HRA_per;
  private int DA_per;
  private int PF_per;

  public Employee(String empNo,String Depart,int Basic,int HRA_per,int DA_per,int PF_per){
    this.empNo = empNo;
    this.Depart = Depart;
    this.Basic = Basic;
    this.HRA_per = HRA_per;
    this.DA_per = DA_per;
    this.PF_per = PF_per;
  }

  public String getDepartment(){
    return Depart;
  }
  
  public int NET_SALARY(){
    int hra = Basic * HRA_per / 100;
    int da = Basic * DA_per / 100;
    int pf = Basic * PF_per / 100;

    return Basic + hra + da - pf;
  }
  public String toString(){
    return String.format("[%s, %d, %d, %d, %d, %s]", empNo,Basic,HRA_per,DA_per,PF_per,NET_SALARY());
  }

  public static void main(String[] args) {
    Set<Employee> employeeSet = new HashSet<Employee>();
    
    employeeSet.add(new Employee("E001", "HR", 50000, 10, 5, 5));
    employeeSet.add(new Employee("E002", "Finance", 60000, 12, 6, 6));
    employeeSet.add(new Employee("E003", "IT", 55000, 11, 5, 5));
    employeeSet.add(new Employee("E004", "HR", 52000, 10, 5, 5));
    employeeSet.add(new Employee("E005", "Finance", 58000, 12, 6, 6));

    System.out.println(employeeSet);

    Set<String> dept = new TreeSet<>();
    for(Employee e:employeeSet){
      dept.add(e.getDepartment());
    }
    System.out.println(dept);

    HashMap<String, List<Employee>> map = new HashMap<>();
    String str="";
    for(String s:dept){
      List<Employee> l = new ArrayList<>();
      for(Employee o:employeeSet){
        if(o.getDepartment() == s){
          str = o.getDepartment();
          l.add(o);
        }
      } 
      map.put(str,l);
    }

    //System.out.println(map);
    for(Map.Entry<String,List<Employee>> m:map.entrySet()){
      System.out.println("Department: "+m.getKey());
      System.out.println("EMPNO BASIC HRA DA PF NET_SALARY");
      int dept_avg = 0;
      for(Employee e:m.getValue()){
        System.out.format("%s  %d  %d  %d  %d  %d",e.empNo,e.Basic,e.HRA_per,e.DA_per,e.PF_per,e.NET_SALARY());
        System.out.println();
        dept_avg+=e.Basic;
      }
      System.out.println("Department Average: "+dept_avg/2);
    }
  }
}
