package LambdaExpressions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.IntFunction;

public class BaseVariationsInterfaces {
  public static void main(String[] args) {
    
    IntFunction<String> getDayOfWeek = dayNo -> {
      Map<Integer,String> days = new HashMap<>();
      days.put(1,"sun");
      days.put(2,"mon");
      days.put(3,"tues");
      days.put(4,"wed");
      days.put(5,"Thurs");
      days.put(6,"Fri");
      days.put(7,"Sat");

      if(days.get(dayNo)!=null){
        return days.get(dayNo);
      }
      else{
        return "Value Entered must be between 1 and 7";
      }
    };

    int input = 1;
    String day = getDayOfWeek.apply(input);
    System.out.println("day No. "+input+" is : "+day);
  }
}
