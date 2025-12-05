// Checks whether a number is armstrong or not
import java.util.Scanner;
class Armstrong_number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int a  = sc.nextInt();
        int b = a,c = 0,d = 1,e = 0;
        while(b!=0){
            c = b%10;
            d = c*c*c;
            e = e+d;
            b = b/10;
        }
        if(e == a){
            System.out.println("It is a Armstrong Number");
        }
        else{
            System.out.println("It is not a Armstrong Number");
        }
    }

}
