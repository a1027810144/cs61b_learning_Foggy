
import java.util.Scanner;

public class triangle {
    public static Boolean draw_triangle(int n){
        if (n>0){
            for(int i = 0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("*"); //println会自动换行
                }
                System.out.print("\n");
            }
            return true;
        }
        else{
            System.out.println("n must be greater than zero.");
            return false;
        }
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input n:");
        int n;
        n=scanner.nextInt();
        Boolean check=draw_triangle(n);
        scanner.close();
    }
    
}
