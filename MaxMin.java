import java.util.*;
class MaxMin
{
    public static void main(String args[])
    {
        System.out.println("******************************************************************************************************************************");
        System.out.println("    Welcome To the Max&Min Program...Input any three numbers less than or equal 9 and it will give the max and min 3 digit values");
        System.out.println("******************************************************************************************************************************");
        Scanner sc = new Scanner(System.in);
        //Taking the three numbers input
        System.out.println("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter your third number: ");
        int num3 = sc.nextInt();
        int max, min = 0;
        //Checking if numbers are less than or equal to 9
        if (num1 >= 9 || num2 >= 9 || num3 >= 9)
        {
            System.out.println("Numbers are invalid");
        }
        //if numbers are valid we take out the maximum and minimum values and finally print them
        else
        {
            if (num1 > num2 && num1 > num3)
            {
                if (num2 > num3)
                {
                    max = ((num1 * 100) + num2 * 10) + num3;
                    min = ((num3 * 100) + num2 * 10) + num1;
                    System.out.println("Maximum value is :"+max+"\n"+"Minimum value is: "+min);
                }
                else
                {
                    max = ((num1 * 100) + num3 * 10) + num2;
                    min = ((num2 * 100) + num3 * 10) + num1;
                    System.out.println("Maximum value is :"+max+"\n"+"Minimum value is: "+min);
                }
            }
            else if(num2 > num1 && num2 > num3)
            {
                if(num1 > num3)
                {
                    max = ((num2*100)+num1*10)+num3;
                    min = ((num3*100)+num1*10)+num2;
                    System.out.println("Maximum value is :"+max+"\n"+"Minimum value is: "+min);
                }
                else
                {
                    max = ((num2*100)+num3*10)+num1;
                    min = ((num1*100)+num3*10)+num2;
                    System.out.println("Maximum value is :"+max+"\n"+"Minimum value is: "+min);
                }

            }
            else
            {
                if(num1>num2)
                {
                    max = ((num3*100)+num1*10)+num2;
                    min = ((num2*100)+num1*10)+num3;
                    System.out.println("Maximum value is :"+max+"\n"+"Minimum value is: "+min);
                }
                else
                {
                    max = ((num3*100)+num2*10)+num1;
                    min = ((num1*100)+num2*10)+num3;
                    System.out.println("Maximum value is :"+max+"\n"+"Minimum value is: "+min);
                }

            }

        }

    }
}
