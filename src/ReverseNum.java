import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= input.nextInt();
        int ans =0;
        while(num>0){
            int remainder=num%10;
            ans=ans*10+remainder;
            num=num/10;
        }
        System.out.println(ans);
    }
}
