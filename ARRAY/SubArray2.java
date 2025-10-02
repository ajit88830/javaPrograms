package ARRAY;

import java.util.HashMap;

public class SubArray2 {
    public static void main(String[] args) {
        int a[]={1,4,20,3,10,5};
        int sum=33;
        int currSum=0,start=0,end=-1;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<a.length;i++){
            currSum+=a[i];
            if(currSum-sum==0){
                start=0;end=i;
                break;
            }
            if(map.containsKey(currSum-sum)){
                start=map.get(currSum-sum)+1;
                end=i;
                break;
            }
            map.put(currSum, i);
        }if(end==-1)
        System.out.println("not found");
        else
            System.out.println(start+" "+end);
    }
}
