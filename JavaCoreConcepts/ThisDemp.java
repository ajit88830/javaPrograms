package JavaCoreConcepts;

public class ThisDemp extends Detail {
    public static void main(String[] args) {
        Detail obj=new Detail();
     
    //   obj.setName("Ajit");
      Detail obj1=new Detail();
      obj.setAge(40);
      obj1.setName(22);
      obj1.setAge(25);      
      
    }
}
class Detail{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        System.out.println(this.age=age);
    }
    public String getName(){
        return name;
    }
    public void setName(int age){
        System.out.println(this.age=age);
    }
}
