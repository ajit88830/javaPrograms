package ARRAY;

import java.util.HashMap;

public class LargeSubArraySum extends Thread {
public void run(){


    HashMap<Integer,Integer> map=new HashMap<>();
    int[] arr={ -2,-3,4,-1,-2,1,5,-3};
    int currSum=0,maxSum=0;
    
    for(int i=0;i<arr.length;i++){
        currSum+=arr[i];

        if(currSum==0)
           maxSum=i+1;
           
        if(map.get(currSum)!=null)
            maxSum=Math.max(maxSum,i-map.get(currSum));
        else
            map.put(currSum, i);
    }
    System.out.println("max sum is : "+maxSum);
}
}
   
   
        

    

