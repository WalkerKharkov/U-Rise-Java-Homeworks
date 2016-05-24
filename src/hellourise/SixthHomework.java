package hellourise;

public class SixthHomework {
    public static void main(String[] args){
        System.out.println("-----------Task 1------------");
        System.out.println("Число Фибоначчи с индексом [8] равно "+fiboSum(8)+". Вычислено с помощью суммирования.");
        System.out.println("Число Фибоначчи с индексом [11] равно "+fiboSum(11)+". Вычислено с помощью суммирования.");
        System.out.println("Число Фибоначчи с индексом [0] равно "+fiboSum(0)+". Вычислено с помощью суммирования.");
        System.out.println("Число Фибоначчи с индексом [1] равно "+fiboSum(1)+". Вычислено с помощью суммирования.");
        System.out.println("Число Фибоначчи с индексом [-5] равно "+fiboSum(-5)+". Вычислено с помощью суммирования.");
        
        System.out.println("-----------Task 2------------");
        System.out.println("Число Фибоначчи с индексом [8] равно "+fiboRec(8)+". Вычислено с помощью рекурсии.");
        System.out.println("Число Фибоначчи с индексом [11] равно "+fiboRec(11)+". Вычислено с помощью рекурсии.");
        System.out.println("Число Фибоначчи с индексом [0] равно "+fiboRec(0)+". Вычислено с помощью рекурсии.");
        System.out.println("Число Фибоначчи с индексом [1] равно "+fiboRec(1)+". Вычислено с помощью рекурсии.");
        System.out.println("Число Фибоначчи с индексом [-5] равно "+fiboRec(-5)+". Вычислено с помощью рекурсии.");
        
        System.out.println("-----------Task 3------------");
        System.out.println("Факториал числа 5 равен "+factorial(5));
        System.out.println("Факториал числа 10 равен "+factorial(10));
        System.out.println("Факториал числа 0 равен "+factorial(0));
        System.out.println("Факториал числа 1 равен "+factorial(1));
        System.out.println("Факториал числа -3 равен "+factorial(-3));
        
        System.out.println("-----------Task 4------------");
        System.out.println(closestFactorial(2));
        System.out.println(closestFactorial(5));
        System.out.println(closestFactorial(7));
        System.out.println(closestFactorial(48));
        System.out.println(closestFactorial(96));
        System.out.println(closestFactorial(121));
        
        System.out.println("-----------Task 5------------");
        System.out.println("Является ли строка 2345 числом? "+isNumber("2345"));
        System.out.println("Является ли строка 2345f числом? "+isNumber("2345f"));
        System.out.println("Является ли строка 23j45 числом? "+isNumber("23j45"));
        
        System.out.println("-----------Task 6------------");
        System.out.println("Строка: 23456, число: "+stringToNumber("23456"));
        System.out.println("Строка: 1, число: "+stringToNumber("1"));
        System.out.println("Строка: 815, число: "+stringToNumber("815"));
        System.out.println("Строка: 234g5678, число: "+stringToNumber("234g5678"));
        
        System.out.println("-----------Task 7------------");
        System.out.println("Строка: 234g5678, число: "+getDigits("234g5678"));
        System.out.println("Строка: 2f3w4g5g6h7jj8, число: "+getDigits("234g5678"));
        System.out.println("Строка: gfhlg2ddf34g5gh678, число: "+getDigits("234g5678"));
        
        System.out.println("-----------Task 1 log------------");
        System.out.println("Стрелки часов находятся в положениях: 12 часов 30 минут 45 секунд. Совпадают ли часовая и минутная стрелки? "+isMatchPointers(12, 30, 45));
        System.out.println("Стрелки часов находятся в положениях: 3 часов 16 минут 13 секунд. Совпадают ли часовая и минутная стрелки? "+isMatchPointers(3, 16, 13));
        System.out.println("Стрелки часов находятся в положениях: 7 часов 37 минут 41 секунд. Совпадают ли часовая и минутная стрелки? "+isMatchPointers(7, 37, 41));
        System.out.println("Стрелки часов находятся в положениях: 25 часов 130 минут 845 секунд. Совпадают ли часовая и минутная стрелки? "+isMatchPointers(25, 130, 845));
        
        System.out.println("-----------Task 2 log------------");
        timeToMatch(3, 15, 10);
        timeToMatch(7, 40, 0);
        
    }
    
    public static int fiboSum(int number){
        if (number<0){
            return -1;
        }
        switch(number){
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                int fn1=1, fn2=0, fn=0;
                for(int i=2; i<=number; i++){
                    fn=fn1+fn2;
                    fn2=fn1;
                    fn1=fn;
                }
                return fn;
            }
    }
    
    public static int fiboRec(int number){
        if (number<0){
            return -1;
        }
        switch(number){
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 1;
            default:
                return fiboRec(number-1)+fiboRec(number-2);
        }
    }
    
    public static int factorial(int number){
        if (number<0){
            return -1;
        }
        switch(number){
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return number*factorial(number-1);
        }
    }
    
    public static int closestFactorial(int number){
        if (number<=0){
            return -1;
        }
        else{
            int i=0, minFac, maxFac, absMin=0, absMax=0;
            while(number>=factorial(i)){
                i++;
            }
            minFac=factorial(--i);
            maxFac=factorial(++i);
            absMin=Math.abs(number-minFac);
            absMax=Math.abs(number-maxFac);
            if (absMax<absMin){
                return maxFac;
            }
                return minFac;
        }
    }
    
    public static boolean isNumber(String strNumber){
        boolean result=true;
        for (int i=0; i<strNumber.length(); i++){
            if(!Character.isDigit(strNumber.charAt(i))){
                result=false;
            }
        }
        return result;
    }
    
    public static int stringToNumber(String strNumber){
        if (!isNumber(strNumber)){
            return -1;
        }
        int counter=1, result=0;
        for (int i=0; i<strNumber.length()-1; i++){
            counter=counter*10;
        }
        for (int i=0; i<strNumber.length(); i++, counter=counter/10){
            result+=Character.getNumericValue(strNumber.charAt(i))*counter;
        }
        return result;
    }
    
    public static int getDigits(String str){
        String buffer="";
        for (int i=0; i<str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                buffer+=Character.toString(str.charAt(i));
            }
        }
        return stringToNumber(buffer);
    }
    
    public static boolean isTime(int hr, int min, int sec){
        return (!((hr<0||hr>23)||(min<0||min>60)||(sec<0||sec>60)));
    }
    
    public static double[] getCorners(int hr, int min, int sec){
        double[] corners = new double[3];
        if(!isTime(hr, min, sec)){
            System.out.println("Ошибка данных! Следующее выражение не имеет смысла");
            corners[0]=-1;
            return corners;
        }
        if(hr>=12){
            hr-=12;
        }
        double dhr=hr,dmin=min, dsec=sec, hCorner, mCorner, sCorner;
        corners[0]=dhr*30+(dmin*0.5)+((dsec*0.5)/60);
        corners[1]=dmin*6+((dsec*60)/360);
        corners[2]=dsec*6;
        //System.out.println();
        return corners;
    }
    
    public static boolean isMatchPointers(int hr, int min, int sec){
        double[] corners = getCorners(hr, min, sec);
        if (corners[0]==-1){
            return false;
        }
        return (Math.abs(corners[0]-corners[1])<0.01);
    }
    
    public static void timeToMatch(int hr, int min, int sec){
        int newHr=hr, newMin=min, newSec=sec;
        while(!isMatchPointers(newHr, newMin, newSec)){
            newSec++;
            if (newSec>=60){
                newSec=0;
                newMin++;
            }
            if (newMin>=60){
                newMin=0;
                newHr++;
            }
        }
        System.out.println("Стрелки часов находятся в положениях: "+hr+" часов "+min+" минут "+sec+" секунд. Времени до следующего совпадения часовой и минутной стрелки: "+(newHr-hr)+" часов, "+(newMin-min)+" минут, "+(newSec-sec)+" секунд.");
        System.out.println("Это случится в "+newHr+" часов, "+newMin+" минут, "+newSec+" секунд.");
    }
}
