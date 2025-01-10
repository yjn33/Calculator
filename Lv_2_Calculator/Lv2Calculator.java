package Lv2;
import java.util.*;



public class Lv2Calculator
{

    public static void main(String [] args)
    {

        Calculator calculator = new Calculator();
        calculator.calculate("/", 32,11);


    }

}



class Calculator
{

    public AddOperation addOperation = new AddOperation();
    public SubstractOperation substractOperation = new SubstractOperation();
    public MultiplyOperation multiplyOperation = new MultiplyOperation();
    public DivideOperation divideOperation = new DivideOperation();



    public double calculate(String operator, int firstNumber,
                            int secondNumber)
    {
        double retnNumber;

        char opCode;

        opCode = operator.charAt(0);


        switch(opCode)
        {

            case '+':
                retnNumber = this.addOperation.operate(firstNumber,secondNumber);
                System.out.println("가산 값은 " + retnNumber);
                break;

            case '-':
                retnNumber = this.substractOperation.operate(firstNumber,secondNumber);
                System.out.println("감산 값은 " + retnNumber);
                break;

            case '/':
                retnNumber = this.divideOperation.operate(firstNumber,secondNumber);
                System.out.println("나눈 값은 " + retnNumber);
                break;

            case '*':
                retnNumber = this.multiplyOperation.operate(firstNumber,secondNumber);
                System.out.println("곱셈 값은 " + retnNumber);
                break;

            default:
                System.out.println("연산자 에러");
                retnNumber = 0;
                break;

        }





        return retnNumber;
    }



}

class AddOperation
{


    public double operate(int firstNumber, int secondNumber)
    {
        double retnValue;

        retnValue = firstNumber + secondNumber;

        return retnValue;


    }

}

class SubstractOperation
{


    public double operate(int firstNumber, int secondNumber)
    {
        double retnValue;

        retnValue = firstNumber - secondNumber;

        return retnValue;


    }

}



class MultiplyOperation
{


    public double operate(int firstNumber, int secondNumber)
    {
        double retnValue;

        retnValue = firstNumber * secondNumber;

        return retnValue;


    }

}

class DivideOperation
{


    public double operate(int firstNumber, int secondNumber)
    {
        double retnValue;

        retnValue = (double)firstNumber / (double)secondNumber;

        return retnValue;


    }

}





