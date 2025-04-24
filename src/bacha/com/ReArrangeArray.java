import java.util.*;
class ReArrangeArray {
    public static void main(String[] args) {
        int[] arr={-1,3,4,0,2,3,4,5,6,7,-6};
        System.out.println(Arrays.toString(reArrange2(arr)));
    }
    private static int[] reArrange(int[] arr){
        int temp;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>=0){
                    if(arr[j]<0){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                         System.out.println(j);
                    }
                }
            }
        }
        return arr;
    }
    
    
    
    private static int[] reArrange2(int []arr){
        
        int j=0, temp;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                if(i!=j){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }j++;
            }
        }
        return arr;
    }
}
