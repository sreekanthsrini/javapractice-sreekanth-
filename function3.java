public class function3 {
    public static void main(String[] args) {
        String result=val("sreekanth");
        System.out.println(result);
        String result1=val1("cheeks");
        System.out.println(result1);
        val2("srinirenu");

        
    }
   
    // here this is consider as a reference varible
    // variable name declaration....
    static String val(String namk){
        return "hello"+namk;


        
    }
    static String val1(String name){
        return "hello"+name;


        
    }
    static void val2(String name1){
        System.out.println("vanakam"+name1);
    }
}
    

