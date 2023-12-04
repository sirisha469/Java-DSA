package CodeBlog;

public class RobotReturnOrigin {
  public static void main(String[] args) {
    String s = "UD";
    System.out.println("Is Robot return to origin: "+judgeCircle2(s));
  }

  public static boolean judgeCircle(String moves) {
    int UpDown = 0;
    int LeftRight = 0;

    for (char c : moves.toCharArray() )
    {
      switch (c){
        case 'U':
          UpDown++;
          break;
        case 'D':
          UpDown--;
          break;
        case 'L':
          LeftRight++;
          break;
        case 'R':
          LeftRight--;
          break;
      }
    }

    return (LeftRight == 0 && UpDown == 0); 
  }

  public static boolean judgeCircle1(String moves) {
    int leftRight=0,upDown=0;
    char[] c=moves.toCharArray();
    for(char ch:c){
      if(ch == 'U'){
        upDown++;
      }
      else if(ch == 'D'){
        upDown--;
      }
      else if(ch == 'L'){
        leftRight++;
      }
      else if(ch == 'R'){
        leftRight--;
      }
    }

    return (upDown==0 && leftRight==0);
  }

  public static boolean judgeCircle2(String moves) {
        
    int upDown=0, leftRight = 0;
    for(int i=0; i<moves.length(); i++){

      char move = moves.charAt(i);
      if(move == 'U')
        upDown++;
      else if(move == 'D')
        upDown--;
      else if(move == 'L')
        leftRight++;
      else if(move == 'R')
        leftRight--;
    }

    return (upDown==0 & leftRight==0);
  }
}
