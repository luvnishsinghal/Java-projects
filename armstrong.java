// Checks whether a number is armstrong or not
import java.util.Scanner;
class Armstrong_number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int a  = sc.nextInt(); // Takes the input of a number
        int b = a,c = 0,d = 1,e = 0; // declaring necessary variables
        while(b!=0){ // loop for breaking the number into individual digits and performing maths for checking
            c = b%10;
            d = c*c*c;
            e = e+d;
            b = b/10;
        }
        if(e == a){ // conditon that checks whether a number is armstrong or not
            System.out.println("It is a Armstrong Number");
        }
        else{
            System.out.println("It is not a Armstrong Number");
        }
    }

}

