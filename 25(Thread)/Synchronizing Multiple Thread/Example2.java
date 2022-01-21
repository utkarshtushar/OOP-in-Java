//When we start two or more threads within a program, there may be a situation when multiple threads try to access the same resource.
import java.util.Scanner;
class Account{
  private int bal;
  public Account(int bal){
    this.bal=bal;
  }
  public boolean isSufficientBalance(int w){
    if(bal>w){
      return true;
    }
    else{
      return false;
    }
  }
  public void withdraw(int amt){
    bal=bal-amt;
    System.out.println("Withdrawl money is "+amt);
    System.out.println("Current Balance is "+bal);
  }
}

class Customer implements Runnable{
  private String name;
  private Account account;
  public Customer(Account account,String name){
    this.account=account;
    this.name=name;
  }
  public void run(){
    Scanner kb = new Scanner(System.in);
    
    //Synchronisation 
    synchronized(account){
    System.out.println(name+": Enter amount to withdraw");
    int amt=kb.nextInt();
    if(account.isSufficientBalance(amt)){
      System.out.println(name);
      account.withdraw(amt);
    }else{
      System.out.println("Insufficient Balance");
    }
  }
  }
}

public class Example2{
  public static void main(String[] args) {
    Account a1 = new Account(1000);
    Customer c1=new Customer(a1,"Raj"),c2=new Customer(a1,"Simran");
    Thread t1 = new Thread(c1);
    Thread t2 = new Thread(c2);
    t1.start();
    t2.start();
  }
}