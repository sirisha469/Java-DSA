package HCLAssignment6;

public class BankApplication {
  double balance;
  public synchronized void withdraw(int amount){
    synchronized(this){
      if(amount<=balance){
        double newBalance = balance-amount;
        balance = newBalance;
        System.out.println("Amount withdrawl: "+amount+", the balance after withdraw: "+newBalance);
      }
      else{
        System.out.println("Don't have sufficient funds");
      }
    }
  }

  public synchronized void deposit(int amount){
    synchronized(this){
      double newBalance = balance+amount;
      balance = newBalance;
      System.out.println("Amount deposit: "+amount+", the balance after deposit: "+newBalance);
    }
  }

  public static void main(String[] args) {
    BankApplication ba = new BankApplication();
    ba.balance = 600;
    ba.withdraw(100);
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    ba.deposit(50);
  }
}
