import java.util.Scanner;
public class PatternOfANumber{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER HOW MANY NUMBERS TO PRINT:");
        int n = in.nextInt();
        int i;
        for(i=1;i<=n;i++){
            System.out.print(i);
        }
    }
}

