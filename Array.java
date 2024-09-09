
import java.util.Arrays;

public class Array {
        public static void main(String[] args) {
                int arr[] = {1,2,3,4,5};

                // System.out.print(arr[1]);
                StringBuilder sb = new StringBuilder();
                sb.append(arr);
                System.out.print(Arrays.toString(arr));

                // StringBuffer sb = new StringBuffer();
                // sb.append(arr);
                // System.out.print(Arrays.toString(arr));
        }

}
