import java.util.Arrays;

public class overloading {
    // same function name but different data types ...
    // method or function overloading
    public static void main(String[] args) {
        fun("vanakam");
        fun(32);
        fun(45.32f);
        fun(1,2,3,4,5,5,66,77,78);
        
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
    System.out.println(name);
    }
    static void fun(float b){
        System.out.println(b);
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }

    
}
