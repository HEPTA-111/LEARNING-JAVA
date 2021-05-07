import java.util.Scanner;
public class Password_guess {
    public static void main(String[] args) {
        System.out.println("WHATS YOUR NAME:");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        switch (name) {
            case "Karen":
            System.out.println("WELCOME KAREN!\n\nThis game will help you practice your social engineering skills.\n\nHAVE FUN!");
           String password="Karen2002";
           System.out.println("GUESS PASSWORD:");
           String guess=scanner.nextLine();
           
        while (!guess.equals(password)) 
           {
            System.out.println("Wrong answer!TRY AGAIN.");
            guess=scanner.nextLine();
           
           }
           System.out.println("CONGRATULATION!YOU JUST GUESS THE PASSWORD CORRECT.YOU WIN.");    
           break;
        
            default:
            System.out.println("Sorry,this was not meant for you.");
                break;
        
        }
       
        
        
        }
    
}
