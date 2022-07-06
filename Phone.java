import java.util.Scanner ;
class Phone
{
    
    public static double circumferance(int r){
        double cir = 2*3.14*r;
        System.out.println(cir);
        return 0;

    }
  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double result = circumferance(r);
        System.out.println(result);
    }
    

}