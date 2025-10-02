

public class PracticePattern {
    public static void main(String[] args) {
       int rows=6;
       for(int i=0;i<rows;i++)
       {
        for(int j=i;j<rows;j++)
            {
            System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print(" * ");
            }
        System.out.println();
       }
       for(int i=0;i<rows;i++)
       {
        for(int j=0;j<i;j++)
        {
            System.out.print(" ");
        }
        for(int k=i;k<rows;k++)
        {
            System.out.print(" * ");
        }
        System.out.println();
       }
       int[][] a={{1,2},{3,4}};
       a[1][1]=5;
      
       for(int[] row: a){
        for(int column :row){
            System.out.println(column+" ");
        }
        System.out.println();
       }
    }
}
