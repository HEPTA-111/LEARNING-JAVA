import java.util.Scanner;
public class Interactive {

        public static void main(String[] args) {
            System.out.println("What's your name?");

            //type   identifier=new type();
            Scanner scanner=new Scanner(System.in);
            String name=scanner.nextLine();

            System.out.println("Hello "+name);
            
        }
    
    
}
 