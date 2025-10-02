package ARRAY;

import java.util.HashMap;

public class SubArray3 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr={15, -2, 2, -8, 1, 7, 10, 23};
        int sum=0, currSum=0;
        int start=0,end=-1;

        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];

            if(currSum-sum==0){
                start=0;end=i;
            }
            if(map.containsKey(currSum-sum)){
                start=map.get(currSum-sum)+1;
                end=i;
            }
            map.put(currSum, i);
        }
        if(end==-1)
            System.out.println("mot found");
        else
            System.out.println(start+" "+end); 
    }
}
