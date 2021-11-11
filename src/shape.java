public class shape {
    void draw()
    {
        System.out.println("Drawing Shape.");
    }
    void erase()
    {
        System.out.println("Erasing shape.");
    }

    public static void main(String[] args) {
        shape obj1 = new shape();
        obj1.draw();
        obj1.erase();
    }
}
