package GENERICS;



public class LearnGenerics {
    public static void main(String[] args) {
        Dogs<String> d=new Dogs<String>("1");
        Dogs<String> d2=new Dogs<>("2");
        Dogs<Integer> d3=new Dogs<>(2);
        System.out.println(d3.getId());
        System.out.println(d);
        System.out.println(d2);

    }
    
}
class Dogs<E>{
    E id;

   public Dogs(E id){
        this.id= id;
    }
    public E getId() {
        return id;
    }
    @Override
    public String toString() {
        
        return super.toString();
    }
    
}