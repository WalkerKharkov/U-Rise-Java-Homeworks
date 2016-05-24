package hellourise;

public class CheckPoint {
    public static void main(String[] args){
        System.out.println("---------------------Task1-----------------------------");
        taskSelect(1234, 4, 1);
        taskSelect(1234, 4, 2);
        taskSelect(1234, 4, 3);
        taskSelect(1333, 4, 3);
        taskSelect(123, 4, 1);
        taskSelect(1234, 4, 5);
        System.out.println("---------------------Task2-----------------------------");
        numberReductionWithTaskChange(1019, 4, 3, 1);
    }
    
    public static boolean lengthOfNumber(int number, int count){
        return ((""+number).length()==count);
    }
    
    public static void numberConsoleLog(int number){
        System.out.println("Заданное число : "+number);
    }
    
    public static int sumOfNumbers(int number){
        int sum=0;
        for (int i=0; i<(""+number).length(); i++){
           sum+=Character.digit((""+number).charAt(i), 10);
        }
        return sum;
    }
    
    public static boolean isIsoscelesTriangle(int number){
        return ((Character.digit((""+number).charAt(1), 10)==Character.digit((""+number).charAt(2), 10))&&(Character.digit((""+number).charAt(1), 10)==Character.digit((""+number).charAt(3), 10)));
    }
    
    public static void taskSelect(int number, int numberLength, int taskNumber){
        if (!lengthOfNumber(number, numberLength)){
            System.out.println("Количество цифр в числе "+number+" не соответствует условию задачи!");
            return;
        }
        switch(taskNumber){
            case 1:
                numberConsoleLog(number);
                break;
            case 2:
                System.out.println("Сумма цифр в заданном числе "+number+" : "+sumOfNumbers(number));
                break;
            case 3:
                System.out.println("Три последние цифры заданного числа "+number+" составляют равносторонний треугольник? "+isIsoscelesTriangle(number));
                break;
            default:
                System.out.println("Введен несуществующий номер задания!");
        }
    }
    
    public static void numberReductionWithTaskChange(int number, int startLength, int finishLength, int count){
        while (!lengthOfNumber(number, finishLength)){
            taskSelect(number, startLength, count);
            number-=count;
            count++;
            if (count>3){
                count=1;
            }
        }
        
    }
}
