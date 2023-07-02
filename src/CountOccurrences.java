import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter that number");
        int n= input.nextInt();
        int count=0;
        while(n>0){
            int remainder=n%10;
            if(remainder==7){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
