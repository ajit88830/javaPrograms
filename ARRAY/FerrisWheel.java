package ARRAY;

import java.util.Arrays;

public class FerrisWheel {
    int[] weights={7,2,3,9};
    public static int minGondolas(int n,int x,int[] weights){
        Arrays.sort(weights);
        int start=0;
        int end=n-1;
        int gondolas=0;
         
        while(start<=end){
            if(start==end || weights[start]+weights[end]>x){
                gondolas++;
                end--;

            }else{
                gondolas++;
                start++;
                end--;
            }
        }
        return gondolas;
    }
    public static void main(String[] args) {
        
        int n=4,x=10;
        int[] weights={7,2,3,9};
       System.out.println("number of gondolas needed : ");
        System.out.println(minGondolas(n,x,weights));
        
    }
}
