import java.util.Scanner;
class dudeney_number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = sc.nextInt(); //Input of a number
        int b = a,c = 0,d = 0;
        while(b!=0){ // loop for breaking the number into individual digits
            c = b%10;
            d = d + c;
            b = b/10;
        }
        double e = Math.cbrt(a);// finds the cube root of the number
        double f = d;
        if( e == f){
            System.out.println("It is a dudeney Number");
        }
        else{
            System.out.println("It is not a dudeney Number");
        }
    }
}