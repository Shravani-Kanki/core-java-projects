import java.util.Scanner;

public class BankAccout {
    Scanner sc=new Scanner(System.in);

    private int accountNum;
    private int pinNum;
    private int checkingBalance=0;
    private int SavingBalanace=0;

    public void setAccountNum(int accountNum){
        this.accountNum=accountNum;
    }
    public int getAccountNum(){
        return accountNum;
    }
    public void setPinNum(int pinNum){
        this.pinNum=pinNum;
    }
    public int getPinNum(){
        return pinNum;
    }
    public int getcheckingAccountBalance(){
        return checkingBalance;
    }
    public void getCheckingWidraw(int amount){
         checkingBalance -=amount;
    }
    public void getCheckingDeposit(int amount){
         checkingBalance +=amount;
    }
    public void getCheckingWidrawInput(){
        System.out.println("Your Balance="+getcheckingAccountBalance());
        System.out.println("Enter the amount to withdraw!");
        int amount =sc.nextInt();

        if((checkingBalance-amount)>=0){
            getCheckingWidraw(amount);
            System.out.println("New Balance="+getcheckingAccountBalance());
        }
        else{
            System.out.println("Balance can't be Negative!");
        }
    }
    public void getchekingDepositInput(){
        System.out.println("Your Balance="+getcheckingAccountBalance());
        System.out.println("Enter the amount to Deposit!");
        int amount =sc.nextInt();

        if((checkingBalance+amount)>=0){
            getCheckingDeposit(amount);
            System.out.println("New Balance="+getcheckingAccountBalance());
        }
        else{
            System.out.println("Balance can't be Negative!");
        }
    }

    public int getSavingAccountBalance(){
        return SavingBalanace;
    }
    public void getSavingWidraw(int amount){
        checkingBalance -=amount;
    }
    public void getSavingDeposit(int amount){
        checkingBalance +=amount;
    }
    public void getSavingWidrawInput(){
        System.out.println("Your Balance="+getSavingAccountBalance());
        System.out.println("Enter the amount to withdraw!");
        int amount =sc.nextInt();

        if((SavingBalanace-amount)>=0){
            getSavingWidraw(amount);
            System.out.println("New Balance="+getSavingAccountBalance());
        }
        else{
            System.out.println("Balance can't be Negative!");
        }
    }
    public void getSavingDepositInput(){
        System.out.println("Your Balance="+getSavingAccountBalance());
        System.out.println("Enter the amount to Deposit!");
        int amount =sc.nextInt();

        if((SavingBalanace+amount)>=0){
            getCheckingDeposit(amount);
            System.out.println("New Balance="+getcheckingAccountBalance());
        }
        else{
            System.out.println("Balance can't be Negative!");
        }
    }
}
