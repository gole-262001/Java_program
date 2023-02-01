package interference;
interface Drawable{
    void draw();
}

class Rectangle implements Drawable{
    public void draw(){System.out.println("drawing rectangle");}
}

class Circle implements Drawable{
    public void draw(){System.out.println("drawing circle");}
}

public class TestInterface {
    public static void main(String arg[])
    {
        Drawable d = new Circle();
        d.draw();
        Drawable d1 = new Rectangle();
        d1.draw();
    }


}
