import java.util.Scanner;
class buzz_number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = sc.nextInt();
        int b = a%10;
        if(b == 7 || a%7 == 0){
            System.out.println("It is a buzz number");
        }
        else{
            System.out.println("It is not a buzz number");
        }  
        }
    }
