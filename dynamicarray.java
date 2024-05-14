import java.util.ArrayList;
import java.util.Scanner;

public class dynamicarray {
    public static void main(String[] args) {
        ArrayList<Integer>nums=new ArrayList<>(3);
        ArrayList<Integer>values=new ArrayList<>(5);
        System.out.println("enter the values");
       
        // ArrayList<datatype>variable name=new ArrayList<>(size for reference)
        nums.add(33);
        nums.add(44);
        nums.add(87);
        nums.add(22);
        nums.add(12);
        nums.size();
        System.out.println(nums.contains(33));
        nums.set(0,7652);
        System.out.println(nums);
        


    }
    
}

