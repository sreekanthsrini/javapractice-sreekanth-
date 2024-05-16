public class arraymaxval {
    public static void main(String[] args) {
        int[]arr={100,32,44,55,3};
        maxval(arr ,2,4);
        System.out.println(maxval(arr, 0, 4));
    }
    static int maxval(int[]arr,int start,int end){
        int maxval=arr[start];
        for(int i=3;i<end;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;
    }
    
}
