package LambdaExpressions;

// import java.util.List;
// import java.util.Map;
// import java.util.stream.Stream;

class Customer{
  String fname;
  String Type;
  Customer(String fname,String Type){
    this.fname=fname;
    this.Type=Type;
  }

  public String getCustomerType(){
    return Type;
  }
}
public class Collectors {
  public static void main(String[] args) {
    // Customer obj1 = new Customer("Alex", "regular");
    // Customer obj2 = new Customer("Cody", "premium");
    // Customer obj3 = new Customer("Gina", "regular");
    // Customer obj4 = new Customer("Alan", "premium");

    //Stream<Customer> streamData = Stream.of(obj1,obj2,obj3,obj4);

    //Grouping
    //Map<String, List<Customer>> map = streamData.collect(Collectors.groupingBy(Customer::getCustomerType));

    //System.out.println(map.get("premium"));
  }
}
