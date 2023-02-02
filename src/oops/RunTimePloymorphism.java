package oops;
class Animal{
        public void eat()
        {
            System.out.println("Eat in Animal");
        }
        public void sleep(){
            System.out.println("Animal are sleepings");
        }
}
 class Dog extends Animal{
    public void eat()
    {
        System.out.println("Dog in Animal");
    }

}
class Lion extends Animal{
    public void eat()
    {
        System.out.println("Lion in Animal");
    }
}
 class Cat extends Animal{
    public void eat()
    {
        System.out.println("Cat in Animal");
    }
}
public class RunTimePloymorphism {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.sleep();
        Dog d = new Dog();
        d.eat();
        Cat c = new Cat();
        c.eat();
        Lion l = new Lion();
        l.eat();
        l.sleep();
    }

}
