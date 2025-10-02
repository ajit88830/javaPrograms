package HASHING;
//give an array of integer of size n,find al the elemet 
// that appear more than [n/3] time
//num[]={1,3,2,5,1,3,1,5,1}
//hashmap (key, value)
//num=key   freq=value

import java.util.HashMap;


public class HashingQues {
    public static void majorityElement(int nums[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length; //store the length of array
        for(int i=0;i<n;i++){  //loop
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]+1)); // putting same key and increment the frequency by 1
            }else
                map.put(nums[i], 1);  //add new key and update frequency to 1
        }
        for(int key:map.keySet()){  //gives the set of key
            if(map.get(key) > n/3){ //compares
                System.out.println(key);
            }
        }
    }
    
    public static void main(String[] args) {
        int nums[]={1,3,2,5,1,3,1,5,1};
        majorityElement(nums);
    }
}