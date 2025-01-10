package Lv1;

import java.util.*;


public class Lv1Calculator
{
    public static void main(String [] args)
    {
        Calculator calculator = new Calculator();

        calculator.compute();

    }
}


class Calculator
{

    Scanner scanner = new Scanner(System.in);



    public void compute()
    {
        String operator;
        int firstNumber, secondNumber;
        double returnValue;


        String inputString;

        char opCode;




        System.out.println("Lv1 계산기 프로그램");

        while(true)
        {

            System.out.println("종료하시려면 exit를 입력하시면 됩니다.");
            System.out.println("첫번째 피연산자를 입력하세요");
            inputString = scanner.next();

            if(inputString.equals("exit"))
            {
                System.out.println("계산기를 종료합니다.");
                break;
            }

            else
            {
                firstNumber = Integer.parseInt(inputString);
            }


            System.out.println("연산자를 입력하세요 + - / *");
            inputString = scanner.next();
            operator = inputString;


            System.out.println("두번째 피연산자를 입력하세요");
            inputString = scanner.next();
            secondNumber = Integer.parseInt(inputString);


            returnValue = calculate(operator, firstNumber, secondNumber);

            System.out.println("계산결과는" + returnValue + "입니다.");



        }


    }



    private double calculate(String operator, int firstNumber,
                             int secondNumber)
    {
        double returnNumber;

        char opCode;

        opCode = operator.charAt(0);


        switch(opCode)
        {

            case '+':
                returnNumber = firstNumber + secondNumber;
                break;


            case '-':
                returnNumber = firstNumber - secondNumber;
                break;

            case '/':
                returnNumber = ((double)firstNumber) / ((double)secondNumber);
                break;

            case '*':
                returnNumber = firstNumber * secondNumber;
                break;

            default:
                System.out.println("연산자 에러");
                returnNumber = -99999;
                break;


        }



        return returnNumber;
    }


}
