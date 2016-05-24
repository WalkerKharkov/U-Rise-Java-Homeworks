package hellourise;

public class fifthHomework {
    public static void main(String[] args){
                
        //Test1
        System.out.println("-----------Тест 1------------");
        System.out.println(isRightangleTriangle(new int[] {1, 2, 3}));
        System.out.println(isRightangleTriangle(new int[] {3, 4, 5}));
        System.out.println(isRightangleTriangle(new int[] {5, 3, 4}));
        System.out.println(isRightangleTriangle(new int[] {5, 3, 3}));
        System.out.println(isRightangleTriangle(new int[] {5, -3, 3}));
        System.out.println(isRightangleTriangle(new int[] {1, 2}));
        System.out.println(isRightangleTriangle(new int[] {1, 2, 0, 4, 5}));
        
        //Test2
        System.out.println("-----------Тест 2------------");
        System.out.println(isIsoscelesTriangle(new int[] {1, 2, 3}));
        System.out.println(isIsoscelesTriangle(new int[] {2, 2, 3}));
        System.out.println(isIsoscelesTriangle(new int[] {1, 2}));
        System.out.println(isIsoscelesTriangle(new int[] {5, 0, 3}));
        System.out.println(isIsoscelesTriangle(new int[] {5, 1, 5}));
        
        //Test3
        System.out.println("-----------Тест 3------------");
        System.out.println(isTwoTriangles(new int[] {1, 1, 2, 2, 3, 1}));
        System.out.println(isTwoTriangles(new int[] {1, 1, 1, 2, 13, 1}));
        System.out.println(isTwoTriangles(new int[] {1, 3, 3, 1, 3, 1}));
        System.out.println(isTwoTriangles(new int[] {4, 3, 4, 4, 3, 3}));
        System.out.println(isTwoTriangles(new int[] {1, 2, 3, 4, 1}));
        System.out.println(isTwoTriangles(new int[] {1, 1, -1, 3, 3, 3}));
        System.out.println(isTwoTriangles(new int[] {1, 1, 1, 0, 3, 3, 3}));
        
        //Test4
        System.out.println("-----------Тест 4------------");
        System.out.println(isEvenSum(1234));
        System.out.println(isEvenSum(2234));
        System.out.println(isEvenSum(223));
        System.out.println(isEvenSum(22341));
        
        //Test5
        System.out.println("-----------Тест 5------------");
        System.out.println(isPalindrom(3993));
        System.out.println(isPalindrom(3994));
        System.out.println(isPalindrom(33933));
        System.out.println(isPalindrom(393));
        System.out.println(isPalindrom(1111));
        
        //Test6
        System.out.println("-----------Тест 6------------");
        System.out.println(isParity(1234));
        System.out.println(isParity(5234));
        System.out.println(isParity(1111));
        System.out.println(isParity(123));
        System.out.println(isParity(0));
        
        //Test7
        System.out.println("-----------Тест 7------------");
        System.out.println(isReduction(5432));
        System.out.println(isReduction(1111));
        System.out.println(isReduction(5467));
        
    }
    
    //проверка на количество цифр. возвращает массив цифр, из которых состоит число-аргумент, либо -1
    public static int[] numbersCheck(int number){
        int value=4;//здесь можно менять количество цифр в числе
        String stringNumber=""+number;
        int numberLength=stringNumber.length();
        int[] result = new int [value];
        if (numberLength==value){
            for (int i=0; i<value; i++){
                result[i] = Character.digit(stringNumber.charAt(i), 10);
            }
        }
        else{
            result[0]=-1;
        }
        return result;
    } 
    
    //Выборка большего числа из 3х
    public static int biggest(int[] numbers){
        if(numbers.length<3){
            return -1;
        }
        if(numbers[1]==numbers[2]&&numbers[0]>numbers[1]){
            return 0;
        }
        if(numbers[0]==numbers[2]&&numbers[1]>numbers[1]){
            return 1;
        }
        if(numbers[0]==numbers[1]&&numbers[2]>numbers[1]){
            return 2;
        }
        if(numbers[0]>numbers[1]&&numbers[0]>numbers[2]){
            return 0;
        }
        else{
            if(numbers[1]>numbers[2]){
                return 1;
            }
            else{
                return 2;
            }
        }    
    }
    
    //проверка на валидность аргументов (действительно ли значения массива могут являться длинами сторон треугольников)
    private static boolean noTriangleCheck(int[] sides) {
        if (sides.length<3) {
            return true;
        }
        //корректировка здесь 
        return (sides[0]<=0||sides[1]<=0||sides[2]<=0)||(!((sides[0]+sides[1])>sides[2]||(sides[0]+sides[1])>sides[2]||(sides[1]+sides[2])>sides[0]));
    }
    
    //Test1 realization
    public static boolean isRightangleTriangle(int[] sides){
        if (noTriangleCheck(sides)){
            return false;
        }
        int index=biggest(sides);
        switch (index){
            case 0: {
                return (sides[0]==Math.sqrt(sides[1]*sides[1]+sides[2]*sides[2]));
            }
            case 1: {
                return (sides[1]==Math.sqrt(sides[0]*sides[0]+sides[2]*sides[2]));
            }
            case 2: {
                return (sides[2]==Math.sqrt(sides[1]*sides[1]+sides[0]*sides[0]));
            }
        }
        return false;
    }
    
    //Test2 realization
    public static boolean isIsoscelesTriangle(int[] sides){
        if (noTriangleCheck(sides)){
            return false;
        }
        return ((sides[0]==sides[1])&&((sides[0]+sides[1])>sides[2])||(sides[0]==sides[2])&&((sides[0]+sides[2])>sides[1])||(sides[1]==sides[2])&&((sides[1]+sides[2])>sides[0]));
    }
    
    //Test3 realization
    public static boolean isTwoTriangles(int[] sides){
        if (sides.length<6){
            return false;
        }
        int[] triangle1={sides[0], sides[1], sides[2]};
        int[] triangle2={sides[3], sides[4], sides[5]};
        if (noTriangleCheck(triangle1)){
            return false;
        }
        if (noTriangleCheck(triangle2)){
            return false;
        }
        int counter=1, secondTriangle=0, mask;
        boolean triangleOne=false, triangleTwo=false;
        for (int i=0; i<6; i++){
            mask=sides[i];
            sides[i]=0;
            if (mask==0){
                continue;
            }
            for(int j=0; j<6; j++){
                if (sides[j]==mask){
                    counter++;
                    sides[j]=0;
                    if (counter==3){
                        if (secondTriangle==0){
                            counter=1;
                            triangleOne=true;
                            secondTriangle++;
                        }
                        else{
                            triangleTwo=true;
                        }
                    }
                }
            }
        }
        return(triangleOne&&triangleTwo);
    }
    
    //Test4 realization
    public static boolean isEvenSum(int number){
        int[] numbers = numbersCheck(number);
        if (numbers[0]==-1){
            return false;
        }
        int sum=0;
        for (int i=0; i<numbers.length; i++){
            sum+=numbers[i];
        }
        return (sum%2==0);
    }
    
    //Test5 realization
    public static boolean isPalindrom(int number){
        int[] numbers = numbersCheck(number);
        if (numbers[0]==-1){
            return false;
        }
        for (int i=0, j=numbers.length-1; i<numbers.length; i++, j--){
            if (numbers[i]!=numbers[j]){
                return false;
            }
        }
        return true;
    }
    
    //Test6 realization
    public static boolean isParity(int number){
       int[] numbers = numbersCheck(number);
        if (numbers[0]==-1){
            return false;
        }
        int half=numbers.length/2, sum1=0, sum2=0;
        for (int i=0; i<half; i++){
            sum1+=numbers[i];
        }
        for (int i=numbers.length-1; i>=half; i--){
            sum2+=numbers[i];
        }
        return sum1==sum2;
    }
    
    //Test7 realization
    public static boolean isReduction(int number){
        int[] numbers = numbersCheck(number);
        if (numbers[0]==-1){
            return false;
        }
        for (int i=0; i<numbers.length-1; i++){
            if (numbers[i]<numbers[i+1]){
                return false;
            }
        }
        return true;
    }
    
}
