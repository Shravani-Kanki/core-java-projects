import java.util.Arrays;
import java.util.Scanner;
public class EmailGenerate {

    public String name;
    public String lastname;
    public char[] password;
    public String department;
    public String email;
    public String altermail;
    public String alterpass;

    public int length=0, MailBoxCapacity = 500;

    Scanner sc = new Scanner(System.in);

    public EmailGenerate(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;

        this.department = setDepartment();
        this.password = setPassword(length);

        email = name.toLowerCase() + lastname.toLowerCase() + "@" + department + "." + "ShraTech.com";
    }

    private String setDepartment() {
        System.out.println("New Employee=" + name + "_" + lastname + "\nEnter the department code!");
        System.out.println("1.sale\n2.department\n3.account\n4.none");
        int code = sc.nextInt();
        if (code == 1) return "sale";
        else if (code == 2) return "depart";
        else if (code == 3) return "acct";
        else return "_";
    }

    private char[] setPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";

        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return password;
    }

    public void setMailBoxCapacity(int mailBoxCapacity) {
        MailBoxCapacity = MailBoxCapacity;
    }

    public int getMailBoxCapacity() {
        return MailBoxCapacity;
    }


    public void Display() {
        System.out.println("Department=" + department);
        System.out.println("Email Id=" + email);
        System.out.println("Password=" + setPassword(length));
        System.out.println("Capacity of the mail box=" + getMailBoxCapacity() + "MB");
    }

}
