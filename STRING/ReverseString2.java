public class ReverseString2 {
    public static void main(String[] args) {
        //Approach-1
        String str="hello";
        char[] ch=str.toCharArray();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(ch[i]);
        }

        //Approach-2
        System.out.println("");
        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}
