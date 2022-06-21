import java.util.Scanner;

public class MandM{
    public static void main(String[] args){
       System.out.println("******************************************************************************************************************************");
        System.out.println("    Welcome To the Max&Min Program! Input any three numbers less than or equal 9 and it will give the max and min 3 digit values");
        System.out.println("******************************************************************************************************************************");
        Scanner zp = new Scanner(System.in);
        MandM obj = new MandM();
        System.out.println("Enter all three numers: ");
        int a = zp.nextInt();
        int b = zp.nextInt();
        int c = zp.nextInt();
        obj.comparer(a, b, c);

    }
    void comparer(int a, int b, int c){
        if(a > b && a > c){
            if(b > c){
                int d = (a * 100) + (b * 10) + c;
                int e = (c * 100) + (b * 10) + a;
                System.out.println("Max: "+d+"\nMin: "+e);
            }
            else{ // c > b
                int d = (a * 100) + (c * 10) + b;
                int e = (b * 100) + (c * 10) + a;
                System.out.println("Max: "+d+"\nMin: "+e);
            }
        }
        else if(b > c && b > a){
            if(a > c){
                int d = (b * 100) + (a * 10) + c;
                int e = (c * 100) + (a * 10) + b;
                System.out.println("Max: "+d+"\nMin: "+e);
            }
            else{ // c > a
                int d = (b * 100) + (c * 10) + a;
                int e = (a * 100) + (c * 10) + b;
                System.out.println("Max: "+d+"\nMin: "+e);
            }
        }
        else if(c > a && c > b){
            if(a > b){
                int d = (c * 100) + (a * 10) + b;
                int e = (b * 100) + (a * 10) + c;
                System.out.println("Max: "+d+"\nMin: "+e);
            }
            else{ //b > a
                int d = (c * 100) + (b * 10) + a;
                int e = (a * 100) + (b * 10) + c;
                System.out.println("Max: "+d+"\nMin: "+e);
            }
        }
    }
}
