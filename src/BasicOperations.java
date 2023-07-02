import java.util.Scanner;

public class BasicOperations {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the 1st number");
        float num1= input.nextFloat();
        System.out.println("Enter the 2nd number");
        float num2= input.nextFloat();
        System.out.println("Enter the operator");
        char operator = input.next().charAt(0);
        if(operator== '+'){
            float ans=num1+num2;
        }
        else if(operator=='-'){
            if(num1>num2){
             float ans=num1-num2;
                System.out.println(ans);
            }
            else if (num2>num1){
                float ans=num2-num1;
                System.out.println(ans);
            }
        }

        else if (operator=='*'){
            float ans=num1*num2;
            System.out.println(ans);
        }
        else if (operator=='/'){
            float ans=num1/num2;
            System.out.println(ans);
        }
        else System.out.println("Invalid Operator");


    }
}
