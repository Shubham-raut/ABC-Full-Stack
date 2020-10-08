import java.util.Scanner;

class Gamma{
    public static void main(String args[]){
        int a=10;
        int b;
        System.out.print("Enter the value of b: ");
        Scanner scan=new Scanner(System.in);
        b=scan.nextInt();

        int c=a+b;
        System.out.print("Sum og a and b is: "+c);

    }
}