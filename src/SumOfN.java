import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Print nth number");
        int n= input.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){

            sum =sum+i;

        }
        System.out.println(sum);
    }
}
