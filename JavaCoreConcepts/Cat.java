package JavaCoreConcepts;

public class Cat extends Dog {
    void sound(){
        System.out.println("meow!");
    }
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.sound();
         animal=new Cat();
         animal.sound();
    }
}
