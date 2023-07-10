package abs;

public interface Drawable extends Printable,Playable {
    void draw();


}
class Triangle implements Drawable{

    @Override
    public void draw() {
        System.out.println("   /|\\");
        System.out.println("  /|||\\");
    }

    @Override
    public void print() {

    }

    @Override
    public void play() {

    }

    @Override
    public void stop() {

    }
}
class Tester{
    public static void main(String[] args) {
        new Triangle().draw();
        new Triangle().printDefault();
    }
}