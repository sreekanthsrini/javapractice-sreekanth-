import java.lang.reflect.Array;
import java.util.Arrays;

public class ref {
    public static void main(String[] args) {
        int[] sri={1,2,3,4,5};
        change(sri);
        System.out.println(Arrays.toString(sri));

    }
    static void change(int[] nums){
        nums[0]=98;
        nums[4]=76;
    }
    
}
