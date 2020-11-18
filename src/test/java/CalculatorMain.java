import java.util.Scanner;

public class CalculatorMain
{
    public static void main(String args[])
    {
        double num1,num2,result;
        char choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Num1:");
        num1=sc.nextDouble();
        System.out.println("Enter operation (+,-,*,/):");
        choice=sc.next().charAt(0);
        System.out.println("Num2:");
        num2=sc.nextDouble();



            switch (choice) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid choice Try a valid choice.......");
                    return;
            }
            System.out.println(num1 + " " + choice + " " + num2 + " = " + result);

        }

}
