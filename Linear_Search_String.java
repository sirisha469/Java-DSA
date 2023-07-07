public class Linear_Search_String {
  public static void main(String[] args) {
    String str="Dhaanvi";
    char target='a';

    System.out.println(searchInString(str,target));
    System.out.println(searchInString1(str,target));
  }

  static boolean searchInString(String str, char target) {
    if(str.length() ==0){
      return false;
    }
    
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)==target){
        return true;
      }
    }
    return false;
  }

  static boolean searchInString1(String str, char target) {
    if(str.length() ==0){
      return false;
    }
    
    for(char ch:str.toCharArray()){
      if(ch==target){
        return true;
      }
    }
    return false;
  }
}
