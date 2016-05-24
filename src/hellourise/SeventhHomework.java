package hellourise;

public class SeventhHomework {
    public static void main(String[] args){
        System.out.println("-----------Task 1------------");
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr=arrCopy(arr, 1, 3);
        for (int i=0; i<newArr.length; i++){
            System.out.println(newArr[i]);
        }
        System.out.println("-----------Task 2------------");
        int[] arrOdd=isOdd(1, 11);
        for (int i=0; i<arrOdd.length; i++){
            System.out.println(arrOdd[i]);
        }
        System.out.println("----------------------------------");
        int[] arrOdd1=isOdd(21, 47);
        for (int i=0; i<arrOdd1.length; i++){
            System.out.println(arrOdd1[i]);
        }
        System.out.println("-----------Task 3------------");
        arithmeticalProgressionNumbers(2, 14);
        arithmeticalProgressionNumbers(10, 25);
        arithmeticalProgressionNumbers(5, 9);
        arithmeticalProgressionNumbers(15, 14);
        System.out.println("-----------Task 3*-----------");
        arithmeticalProgression(1, 4);
        arithmeticalProgression(2, 14);
        arithmeticalProgression(1, 10);
        arithmeticalProgression(2, 3);
        arithmeticalProgression(2, 1);
        System.out.println("-----------Task 4------------");
        System.out.println("Число 123. Сумма его минимальной и максимальной цифры - четная? : "+isOddSum(123));
        System.out.println("Число 78413. Сумма его минимальной и максимальной цифры - четная? : "+isOddSum(78413));
        System.out.println("Число 0. Сумма его минимальной и максимальной цифры - четная? : "+isOddSum(0));
        System.out.println("Число -1. Сумма его минимальной и максимальной цифры - четная? : "+isOddSum(-1));
        System.out.println("-----------Task 5------------");
        System.out.println("Число 12321. ? : Является ли оно палиндромом без максимальной цифры? : "+isResultPalindrom(12321));
        System.out.println("Число 12341. ? : Является ли оно палиндромом без максимальной цифры? : "+isResultPalindrom(12341));
        System.out.println("Число 1203. ? : Является ли оно палиндромом без максимальной цифры? : "+isResultPalindrom(1203));
        System.out.println("Число 1. ? : Является ли оно палиндромом без максимальной цифры? : "+isResultPalindrom(1));
        System.out.println("-----------Task 6------------");
        System.out.println("Двоичное представление числа 256 : "+intToBinary(256));
        System.out.println("Двоичное представление числа 0 : "+intToBinary(0));
        System.out.println("Двоичное представление числа 100 : "+intToBinary(100));
        System.out.println("Двоичное представление числа -5 : "+intToBinary(-5));
        System.out.println("-----------Task 7------------");
        System.out.println("Двоичное представление числа 25.3548 с точностью 10 знаков после запятой : "+doubleToBinary(25.3548, 10));
        System.out.println("Двоичное представление числа 25.3548 с точностью 3 знаков после запятой : "+doubleToBinary(206.116, 3));
        System.out.println("Двоичное представление числа 1.001 с точностью 10 знаков после запятой : "+doubleToBinary(1.001, 10));
        System.out.println("Двоичное представление числа 0 с точностью 10 знаков после запятой : "+doubleToBinary(0, 10));
        System.out.println("Двоичное представление числа -524.12 с точностью 5 знаков после запятой : "+doubleToBinary(-524.12, 5));
        System.out.println("Двоичное представление числа -1.111 с точностью 20 знаков после запятой : "+doubleToBinary(-1.111, 20));
    }
    
    //Задание 1(15) реализация
    public static int[] arrCopy(int[] arr,int first, int second){
        if (first<0||first>(arr.length)||second<first||second>(arr.length)){
            int[] arrPart={-1};
            return arrPart;
        }
        int[] arrPart= new int [second-first+1];
        for (int i=first, j=0; i<=second; i++, j++){
            arrPart[j]=arr[i];
        }
        return arrPart;
    }
    
    //Задание 2(16) реализация
    public static int[] isOdd(int first, int second){
        if (first<0||second<=first){
            int[] arrOdd={-1};
            return arrOdd;
        }
        int length=(second-first)/2+(second-first)%2;
        int finLength=0;
        if (first%2==0||second%2==0){
            length--;
        }
        int[] arrOdd=new int[length];
        for (int i=0, m=0, k=first+1; k<second; k++){
            int counter=0;
            for (int j=0; j<(""+k).length(); j++){
                if (Character.getNumericValue((""+k).charAt(j))%2==0){
                    counter++;
                }
            }
            if (counter==(""+k).length()){
                arrOdd[m]=k;
                m++;
            }
        }
        for (int i=0; i<arrOdd.length; i++){
            if (arrOdd[i]==0){
                finLength=i-1;
                break;
            }
        }
        int[] finArrOdd=arrCopy(arrOdd, 0, finLength);
        return finArrOdd;
    } 
    
    //Разложение числа на массив цифр
    public static int[] numbersRow(int number){
        number=Math.abs(number);
        int[] numbersRow=new int[(""+number).length()];
        for (int i=0; i<(""+number).length(); i++){
             numbersRow[i]=Character.getNumericValue((""+number).charAt(i));  
        }
        return numbersRow;
    }
    
    //Задание 3 реализация
    public static void arithmeticalProgressionNumbers(int number1, int number2){
        if (number1<0||number2<number1){
            System.out.println("Введены некорректные данные");
            System.out.println("----------------------------------");
            return;
        }   
        int counter=0;
        System.out.println("Найти все числа между "+number1+" и "+number2+", цифры которых создают арифметическую прогрессию: ");
        for (int i=number1+1; i<number2; i++){
            int[] numbers=numbersRow(i);
            int innerCounter=0;
            for (int j=0; j<numbers.length; j++){
                int sum=number1;
                if(numbers[j]==0){
                    continue;
                }
                while(sum<number2){
                    sum+=numbers[j];
                    if (sum==number2){
                        innerCounter++;
                        break;
                    }
                }
            }
            if (innerCounter==numbers.length){
                    System.out.println("Цифры числа "+i+" удовлетворяют условию задачи.");
                    counter++;
            }
        }
        if (counter==0){
            System.out.println("Числа, удовлетворяющие условию задачи, не обнаружены");
        }
        System.out.println("----------------------------------");
    }
    
    //Задание 3* реализация
    public static void arithmeticalProgression(int number1, int number2){
        if (number1<0||number2<number1){
            System.out.println("Введены некорректные данные");
            System.out.println("----------------------------------");
            return;
        }
        int difference=number2-number1;
        if (difference==0){
            System.out.println("Числа, удовлетворяющие условию задачи, не обнаружены");
            return;
        }    
        System.out.println("Найти все числа между "+number1+" и "+number2+", создающие арифметическую прогрессию: ");
        int step, counter=0, buffer=0;
        for (int i=1; i<=difference; i++){
            System.out.println("Шаг: "+i);
            for (int j=number1; j<=number2; j++){
                step=j;
                while (step<=number2){
                    switch(counter){
                        case 0: 
                            buffer=step;
                            break;
                        case 1:
                            System.out.print(buffer+" ");
                            System.out.print(step+" ");
                            break;
                        default:
                            System.out.print(step+" ");
                    }
                    counter++;
                    step+=i;
                }
                if (counter>1){
                    System.out.println();
                }    
                    counter=0;
            }
        }
        System.out.println("----------------------------------");
    }
    
    //Задание 4(18) реализация      
    public static boolean isOddSum(int number){
        if (number<=10){
            return false;
        }
        int[] numbersRow=numbersRow(number);
        int max=0, min=9;
        for (int i=0; i<numbersRow.length; i++){
            if (numbersRow[i]>max){
                max=numbersRow[i];
            }
            if (numbersRow[i]<min){
                min=numbersRow[i];
            }
        }
        return ((max+min)%2==0);    
    }
    
    //Проверка, является ли число, представленное в виде массива из его цифр, палиндромом
    public static boolean isPalindrom(int[] number){
        for (int i=0, j=number.length-1; i<number.length; i++, j--){
            if (number[i]!=number[j]){
                return false;
            }
        }
        return true;
    }
    
    //Задание 5(19) реализация
    public static boolean isResultPalindrom(int number){
        if (number<=10){
            return false;
        }
        int[] numbersRow=numbersRow(number);
        int max=0;
        for (int i=0; i<numbersRow.length; i++){
            if(numbersRow[i]>max){
                max=numbersRow[i];
            }
        }
        int[] newNumber=new int[numbersRow.length-1];
        for (int i=0, j=0; i<numbersRow.length; i++){
            if (numbersRow[i]!=max){
                newNumber[j]=numbersRow[i];
                j++;
            }
        }
        return isPalindrom(newNumber);
    }
    
    //Задание 6(20) реализация
    public static String intToBinary(int number){
        if(number<0){
            return "Натуральное число не может быть отрицательным!";
        }
        if(number==0){
            return "0";
        }
        int result=0, remain=0;
        String binary="";
        do{
           result=number/2;
           remain=number%2;
           binary=""+remain+binary;
           number=result;
        }
        while(result!=0);
        return binary;
    }
    
    //Задание 7(21)
    public static String doubleToBinary(double number, int accuracy){
        if (number==0){
            return "0,0";
        }
        number=Math.abs(number);
        int intPart;
        intPart=(int)number;
        number-=intPart;
        String intString=intToBinary(intPart), fractString="";
        if (accuracy<0){
            return intString+",0";
        }
        for (int i=0; i<accuracy; i++){
            if (number==0){
                break;
            }
            number*=2;
            if (number>1){
                number-=1;
                fractString+="1";
            }else{
                fractString+="0";
            }
        }
        return intString+","+fractString;
    }
}
