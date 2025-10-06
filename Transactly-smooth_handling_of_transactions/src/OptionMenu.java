import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.io.IOException;
public class OptionMenu extends BankAccout{
    Scanner sc=new Scanner(System.in);
    HashMap<Integer,Integer> data=new HashMap<>();

    public void getLogin() throws IOException{
       int x=1;

       do{
           try{
               data.put(121,11);
               data.put(144,12);
               data.put(169,13);
               data.put(196,14);
               data.put(125,15);

               System.out.println("WELCOME TO TRANSACTLY");
               System.out.println("Enter the Bank Account!");
               setAccountNum(sc.nextInt());
               System.out.println("Enter the Pin!");
               setPinNum(sc.nextInt());
           } catch (Exception e){
               System.out.println("Invalid Charectors!");
               x=2;
           }

           for(Map.Entry<Integer,Integer> entry:data.entrySet()){

               if(entry.getKey()==getAccountNum()&&entry.getValue()==getPinNum()){
                   getAccoutType();
               }
           }

       }while(x==1);
    }

    public void getAccoutType(){
        System.out.println("Enter the Account Type!");
        System.out.println("1.Checking Account\n2.Saving Account\n3.Exit");
        int choise=sc.nextInt();

        switch (choise){
            case 1:getCheckingAccount();
                    getAccoutType();
                    break;
            case 2:getSavingAccount();
                    getAccoutType();
                    break;
            case 3:System.out.println("Exit");
                    break;
            default:System.out.println("Invalid!");
                    break;

        }
    }

    public void getCheckingAccount(){
        System.out.println("___________Checking Account_________");
        System.out.println("1.View balance\n2.Withdraw amount\n3.Deposit amount\n4.Exit");
        int choise=sc.nextInt();

        switch (choise){
            case 1: System.out.println("Checking Account Balanace="+getcheckingAccountBalance());
                    getAccoutType();
                    break;
            case 2: getCheckingWidrawInput();
                getAccoutType();
                break;
            case 3: getchekingDepositInput();
                    getAccoutType();
                    break;
            case 4: System.out.println("Thank You!");
                    break;
            default:System.out.println("Invalid Option!");
                    break;
        }
    }

    public void getSavingAccount(){
        System.out.println("___________Saving Account_________");
        System.out.println("1.View balance\n2.Withdraw amount\n3.Deposit amount\n4.Exit");
        int choise=sc.nextInt();

        switch (choise){
            case 1: System.out.println("Saving Account Balanace="+getSavingAccountBalance());
                getAccoutType();
                break;
            case 2: getSavingWidrawInput();
                getAccoutType();
                break;
            case 3: getSavingDepositInput();
                getAccoutType();
                break;
            case 4: System.out.println("Thank You!");
                break;
            default:System.out.println("Invalid Option!");
                break;
        }
    }
}