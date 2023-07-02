import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number with till");
        int n= input.nextInt();
        int previous=0;
        int current=1;

        for(int count=2;count<=n;count++){
          int temp=current;
          current=previous+current;
          previous=temp;

            System.out.println(current);
        }

    }
}
