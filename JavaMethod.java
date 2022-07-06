//Write a Java method to compute the average of three numbers

import java.util.Scanner;
class JavaMethod{
    public static double calculateAverage(double a,double b, double c){
        double result = (a+b+c)/3;
        return result;
    }
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();  
        double b = sc.nextDouble();
        double  c = sc.nextDouble();

        double average = calculateAverage(a,b,c);
        System.out.println("average of three numbers is:" +average);
    
    }
}