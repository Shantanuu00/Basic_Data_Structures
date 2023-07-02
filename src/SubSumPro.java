import java.util.Scanner;

public class SubSumPro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();
        int sum=0;
        int product=1;
        int result;
        while (num>0){
            int remainder=num%10;
            sum=sum+remainder;
            product=product*remainder;
            num=num/10;
            
        }
        result=product-sum;
        System.out.println(result);
    }
}
