package hellourise;

public class FourthHomework {
    public static void main(String[] args){
        //Test1
        int[] Numbers={2, 5, 7, 9, 4, 21};
        System.out.println("Сумма элементов массива Numbers = "+sumArray(Numbers));
        //Test2
        System.out.println("Делится ли 4 на 2 без остатка? "+divisionCheck(4, 2));
        System.out.println("Делится ли 15 на 4 без остатка? "+divisionCheck(15, 4));
        //Test3
        System.out.println("Числа 6 и 8 либо оба четные, либо оба нечетные? : "+isEven(6, 8));
        System.out.println("Числа 5 и 13 либо оба четные, либо оба нечетные? : "+isEven(5, 13));
        System.out.println("Числа 5 и 8 либо оба четные, либо оба нечетные? : "+isEven(5, 8));
        //Test4
        System.out.println("Является ли символ 'E' цифрой? "+isNumber('E'));
        System.out.println("Является ли символ '1' цифрой? "+isNumber('1'));
        //Test5
        equationOut(quadraticEquation(4, 1, 5));
        equationOut(quadraticEquation(1, 2, 1));
        equationOut(quadraticEquation(3, 12, 5));
        equationOut(quadraticEquation(0, 0, 0));
        equationOut(quadraticEquation(1, -3, 0));
    }
    
    public static int sumArray(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            System.out.println("Значение элемента №"+i+" : "+arr[i]);
            sum+=arr[i];
        }
        return sum;
    }
    
    public static boolean divisionCheck(int a, int b){
        return (a%b==0);        
    }
    
    public static boolean isEven(int a, int b){
        return ((a%2==0&&b%2==0)||(a%2!=0&&b%2!=0));
    }
    
    public static double[] quadraticEquation(double a, double b, double c){
        double x[]=new double [2], d;
        x[0]=Double.NaN;
        x[1]=Double.NaN;
        System.out.println("Квадратное уравнение : "+a+"x^2 + "+b+"x + "+c+"=0");
        d=b*b-4*a*c;
        if (d<0)return x;
        if (d==0){
           x[0]=-(b/(2*a));
           return x;
        }
        x[0]=(-b+Math.sqrt(d))/(2*a);
        x[1]=(-b-Math.sqrt(d))/(2*a);
        return x;
    }
    
    public static boolean isNumber(char c){
        return (c>='0'&&c<='9');
    }
    
    public static void equationOut(double[] x){
        if (Double.isNaN(x[0])){
            System.out.println("Корней квадратного уравнения нет!");
            return;
        }
        if(Double.isNaN(x[1])){
            System.out.println("Корень квадратного уравнения один : "+x[0]);
            return;
        }
        System.out.println("Корни квадратного уравнения : "+x[0]+", "+x[1]);
    }
}
