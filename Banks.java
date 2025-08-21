abstract class Bank
{
 public abstract void getBalance();
}
class BankA extends Bank
{
 public void getBalance()
 {
 System.out.println(" Bank A have balance of 100 $.");
}
}
class BankB extends Bank
{
 public void getBalance()
 {
 System.out.println(" Bank B have balance of 200 $.");
}
}
class BankC extends Bank
{
 public void getBalance()
 {
 System.out.println(" Bank C have balance of 300 $.");
}
}
class Banks
{
 public static void main(String[] args) {
 BankA bankA = new BankA();
 BankB bankB = new BankB();
 BankC bankC = new BankC();
 bankA.getBalance();
bankB.getBalance();
bankC.getBalance();
 }
}