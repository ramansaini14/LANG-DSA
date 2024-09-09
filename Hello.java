import java.util.Scanner;

public class Hello{
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] arr = new int[5];
        try 
            (Scanner in = new Scanner(System.in)) 
            {
                for (int i=0; i<=4; i++)
                {
                    arr[i] = in.nextInt();
                }
                for (int i=0; i<=4; i++)
                {
                    System.out.print(arr[i] + " ");
                }
            }
            catch (Exception e)
            {
                e.getStackTrace();
            }
        
    }
}