import java.util.Scanner; 
public class Area_of_circle {
    public static void main(String[] args) {
        final double pi=3.1426;
        System.out.println("A programme to calculate are of a circle.");
        System.out.println("ENTER RADIUS:");
        Scanner scanner=new Scanner(System.in);
        double rad=scanner.nextDouble();
        double area=pi*rad*rad;
        System.out.println("Area of the circle is "+area+"cm2");


  
    }
}
