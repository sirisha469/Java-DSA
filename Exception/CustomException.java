package Exception;

class InvalidIdException extends Exception{
  public InvalidIdException(String str){
    super(str);
  }
}

class WrongAgeException extends Exception{
  public WrongAgeException(String str){
    super(str);
  }
}

public class CustomException {
  public static void main(String[] args) {
    int age = 21;
    int id =0;
    //System.out.println("Age: "+age);
    try{
      if(age<20){
        throw new WrongAgeException("not valid age");
      }
      if(id<=0){
        throw new InvalidIdException("Invalid id");
      }
    }
    catch(WrongAgeException e){
      System.out.println(e);
    }
    catch(InvalidIdException e){
      System.out.println(e);
    }
  }
}
