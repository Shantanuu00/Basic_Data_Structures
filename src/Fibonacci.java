import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number with till");
        int n = input.nextInt();
        int[] a=new int[n];
        a[0]=0;
        a[1]=1;

        for(int i=2;i<n;i++){
            a[i]=a[i-2]+a[i-1];

            System.out.println(a[i]);
        }

    }
}
