package ARRAY;

public class SubArrayNormal {
    public static void main(String[] args) {

      //  find max sum subarray
      
        int a[]={-5,4,6,-3,4,-1};
        int maxSum=0,curSum=0;
        
        for(int i=0;i<a.length;i++){

            curSum=curSum+a[i];
            if(curSum>maxSum){
                maxSum=curSum;
            }
            if(curSum<0){
                curSum=0;
            }
        }
        System.out.println(maxSum);

    }
}
