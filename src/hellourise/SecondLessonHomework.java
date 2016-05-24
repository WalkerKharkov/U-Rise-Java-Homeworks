/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellourise;

/**
 *
 * @author User
 */
public class SecondLessonHomework {
    public static void main (String[] args){
        // Тест 1
        int a, b, c;
        boolean myBool=true;
        a=12;
        b=3;
        c=a+b;
        System.out.println("a + b = "+c);
        c=a-b;
        System.out.println("a - b = "+c);
        c=a*b;
        System.out.println("a * b = "+c);
        c=a/b;
        System.out.println("a / b = "+c);
        c=a%b;
        System.out.println("Остаток от целочисленного деления a на b = "+c);
        a++;
        System.out.println("Инкремент а = "+a);
        b--;
        System.out.println("Декремент b = "+b);
        System.out.println("Логическая переменная myBool : "+myBool);
        myBool=!myBool;
        System.out.println("Логическая переменная myBool после инвертирования : "+myBool);
        // Тест 2
        System.out.println("Результат вычисления формулы ((a+b)/2+math.sqrt(x))*y : "+formula(a, b, 4, .5));
        // Тест 3
        String str="This is homework for lesson #2";
        consoleOut(str);
        // Тест 4
        firstHomework();
    }
    public static double formula(int numberOne, int numberTwo, int numberTree, double numberFour){
        double result;
        result=((numberOne+numberTwo)/2+Math.sqrt(numberTree))*numberFour;
        return result;
    }
    
    public static void consoleOut(String phrase){
        System.out.println("Your phrase is: " + phrase);
    }
    
    public static String concatAll(boolean myBool, int percent, double happiness){
        return "Hello, U-Rise! There is "+myBool+", that there are "+
                percent+" percent success with "+happiness+" happiness. ";
    }
    
    public static void firstHomework(){
        System.out.println(concatAll(true, 100, 0.99));
    }
}
