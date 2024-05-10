import java.util.Arrays;

public class varlengthargs {
    public static void main(String[] args) {
        // int...x=2,4,5,6,7,8; we cant declare
        // when me pass n number of arguments we can pass
        // we can also pass the different data types
        // the variable length parameter is last...decleration
        fun(3,4,5,5,6,7,76,54,32);
         fun1("sreekanth","ram","sachin","sanjev","hons");
         multiple(43, 89,6,4,3,2,1,1,1,2);


        
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
     static void fun1(String...v){
         System.out.println(Arrays.toString(v));
    }

    static void multiple(int a,int b,int...v){
        System.out.println("this is a value"+a);
        System.out.println(Arrays.toString(v));


    }
}
