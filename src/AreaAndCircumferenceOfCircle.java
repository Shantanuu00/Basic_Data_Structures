
import java.util.Scanner;

public class AreaAndCircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Radius of the circle");
        double radius= input.nextDouble();
        double area=3.14*radius*radius;
        System.out.println("Area of the circle is:"+" "+area);
        double circumference = 2*3.14*radius;
        System.out.println("Circumference of the circle is:"+" "+circumference);
    }


    }

