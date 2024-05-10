public class scope {
static int a=909;
    public static void main(String[] args) {
        System.out.println(a);
        a=0 ;
        System.out.println(a);
        hh();
        
    }
    static void hh(){
        System.out.println(a);
    }
}