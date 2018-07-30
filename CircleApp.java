import java.util.Scanner;


public class CircleApp {
    
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Validator validate = new Validator();
        String radius;
        char choice = 'y';
        System.out.println("Welcome to the Circle Tester");
        while(choice == 'y' || choice == 'Y')
        {
        System.out.println("Enter radius: ");
        radius = scan.next();
        if(validate.isValidRadius(radius))
        {
        
        Circle c = new Circle(Double.parseDouble(radius));
        System.out.println("Circumference: "+c.getFormattedCircumference());
        System.out.println("Area: "+c.getFormattedArea());
        System.out.println("Continue? (y/n): ");
        choice = scan.next().charAt(0);
        
        }
        else{
        System.out.println("Invalid input!! Try Again..");
        }
        
    }
    
}
}
