import java.util.Scanner;

public class SumOF2 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a = input.nextInt();
        int b = input.nextInt();

        sum(a,b);

    }
    public static void sum(int a, int b){
        int sum;
        sum=a+b;
        System.out.println("Sum of 2 numbers"+sum);
    }



}
