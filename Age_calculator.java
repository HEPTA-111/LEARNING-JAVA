import java.util.Scanner;
public class Age_calculator {
       public static void main(String[] args) {
         final int c_year=2021;
System.out.println("ENTER YOUR NAME:");
Scanner scanner=new Scanner(System.in);
var name=scanner.nextLine();
System.out.println("YEAR OF BIRTH:");
int year=scanner.nextInt();
int age=c_year-year;
System.out.println("HEY "+name+".!nYou are "+age+" years old.");
        
    }
    
}
