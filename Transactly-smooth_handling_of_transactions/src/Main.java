import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        OptionMenu customer1=new OptionMenu();

        try {
            customer1.getLogin();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}