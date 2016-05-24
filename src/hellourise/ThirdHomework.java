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
public class ThirdHomework {
    public static void main(String[] args){
        //Test 1
        operatorsDemo();
        
        //Test 2
        extFormulaResultCheck(extendedFormula1(1, 2, 3, 4));
        extFormulaResultCheck(extendedFormula1(-5, 4, 1, 1));
        
        //Test 3
        int test=2;
        testSwitcher(test);
        test=5;
        testSwitcher(test);
        test=15;
        testSwitcher(test);
        
        //Test 4
        cycleDemo();
        
        //Test 5
        whileDemo();
           
    }

    private static void testSwitcher(int test) {
        switch (test){
            case 1:
                System.out.println("Запуск теста №1");
                operatorsDemo();
                break;
            case 2:
                System.out.println("Запуск теста №2");
                extendedFormula1(4, 5, 1, 0.5);
                break;
            case 3:
                System.out.println("Вы и так уже в тесте №3 ;-)");
                break;
            case 4:
                System.out.println("Запуск теста №4");
                cycleDemo();
                break;
            case 5:
                System.out.println("Запуск теста №5");
                whileDemo();
                break;    
            default:
                System.out.println("Теста №" + test + " не существует!");
        }
    }

    private static void operatorsDemo() {
        int firstNumber=10, secondNumber=5, thirdNumber=15;
        if (firstNumber >=secondNumber && firstNumber != thirdNumber){
            System.out.println(firstNumber + " больше или равно " + secondNumber +
                    " и не равно " + thirdNumber);
        }
        if (firstNumber <= secondNumber || firstNumber <= thirdNumber){
            System.out.println("First Number - не самое большое число");
        }else{
            System.out.println("First Number - самое большое число");
        }
        String compare;
        compare=(thirdNumber==15) ? "Third Number равно 15" : "Third Number не равно 15";
        System.out.println(compare);
    }

    private static void whileDemo() {
        int j=0;
        while (j<10){
            j++;
            System.out.println("Число j = " + j);
        }
    }

    private static void cycleDemo() {
        for(int i=0; i<5; i++){
            firstHomework();
        }
    }
    
    public static void compare(long a, long b){
        
    } 
    
    /*public static void extendedFormula(int numberOne, int numberTwo, int numberTree, double numberFour){
        double result;
        String msg;
        result=((numberOne+numberTwo)/2+Math.sqrt(numberTree))*numberFour;
        msg=(result<=5)? "Результат вычислений меньше или равен 5 (" + result +")" : "Результат вычислений больше 5 (" + result + ")";
        System.out.println(msg);
    }*/
    
    public static double extendedFormula1(int numberOne, int numberTwo, int numberTree, double numberFour){
        return ((numberOne+numberTwo)/2+Math.sqrt(numberTree))*numberFour;
    }
    
    public static void extFormulaResultCheck(double result){
        String msgIf, msgTernary;
        if (result<=5){
            msgIf="Результат вычислений меньше или равен 5 (" + result +")";
        }else{
            msgIf="Результат вычислений больше 5 (" + result + ")";
        }
        msgTernary=(result<=5)? "Результат вычислений меньше или равен 5 (" + result +")" : "Результат вычислений больше 5 (" + result + ")";
        System.out.println(msgTernary);
        System.out.println(msgIf);
    }
    
    //формат вызова extFormulaResultCheck(extendedFormula1(a, b, c, d))
    
    
    public static String concatAll(boolean myBool, int percent, double happiness){
        return "Hello, U-Rise! There is "+myBool+", that there are "+
                percent+" percent success with "+happiness+" happiness. ";
    }
    
    public static void firstHomework(){
        System.out.println(concatAll(true, 100, 0.99));
    }
}
