import java.util.Scanner;

public class MaxMinOf3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
         int a = input.nextInt();
         int b = input.nextInt();
         int c = input.nextInt();

        int ans = max(a,b,c);
        System.out.println("Maximum number is" +ans);
        int ans2= min(a,b,c);
        System.out.println("Minimum number is" +ans2);
    }
    static int max(int a,int b, int c){
          int maximum=0;
        if(a>b && a>c){
            maximum=a;


        }
        if(b>a && b>c){
            maximum=b;

        }
       else if (c>a && c>b){
            maximum=c;

        }
     return maximum;
    }
    static int min(int a,int b, int c){
          int minimum=0;
         if(a<b && a<c){
             minimum=c;

         }
         if(b<a && b<c){
             minimum=b;

         }
         if(c<a && c<b){
             minimum=c;

         }
         return minimum;
    }
}
