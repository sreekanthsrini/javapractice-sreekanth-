import java.sql.Array;
import java.util.Arrays;

public class arrayfunctionpass {
    public static void main(String[] args) {
        int[] arr={22,33,44,555};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void change(int[]arr){
        arr[1]=644;
    }
    
}
