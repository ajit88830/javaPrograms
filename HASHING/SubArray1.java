package HASHING;

import java.util.HashMap;

public class SubArray1 {
    public static void main(String[] args) {
        int a[]={10,15,-5,15,-10,5};
        int sum=5;//given
        int currSum=0;// 0 to i th index
        int start=0;//starting index
        int end=-1;

        HashMap<Integer,Integer> map=new HashMap<>(); // <currSum,index>

        for(int i=0;i<a.length;i++){
            currSum+=a[i];
            if(currSum-sum==0){
                start=0;
                end=i;
                break;
            }
            if(map.containsKey(currSum-sum)){
                start=map.get(currSum-sum)+1;
                end=i;
                break;
            }
            map.put(currSum, i);

        }
        if(end==-1)// for sum not found
            System.out.println("not found");
        else 
            System.out.println(start+","+end);
        
    }
}
