import java.util.Scanner;
public class lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(addTwoNumber(a, b));
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(addTwoNumber(c, d));
        
    }
    static double addTwoNumber(double a,double b){
        return a+b;
        

    }
    static int addTwoNumber(int c,int d){
        return c+d;
    }

    
}
