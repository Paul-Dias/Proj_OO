public class VectorDraw {
    protected Shape s; // Changed visibility to protected to allow access in subclasses

    // Constructor to set Shape instance
    public VectorDraw(Shape shape) {
        this.s = shape;
    }

    // Method to perform operations using Shape's characteristics
    public void op() {
        int x = s.getX();
        int height = s.getHeight();
        System.out.println("x: " + x + ", height: " + height);
        // Other operations as needed
    }
}

public class Adaptor extends VectorDraw {
    private RasterBox rasterBox;

    // Constructor to set RasterBox instance
    public Adaptor(RasterBox rasterBox) {
        super(null); // Passing null as a placeholder, actual Shape instance is not used
        this.rasterBox = rasterBox;
    }

    // Overriding op() to use RasterBox's characteristics
    @Override
    public void op() {
        Coords topLeft = rasterBox.getTopLeft();
        Coords bottomRight = rasterBox.getBottomRight();
        System.out.println("Top Left: (" + topLeft.x + ", " + topLeft.y + ")");
        System.out.println("Bottom Right: (" + bottomRight.x + ", " + bottomRight.y + ")");
    }
}

public class Shape {
    protected int x, y, height, width;

    public int getX() { return x; }
    public int getY() { return y; }
    public int getHeight() { return height; }
    public int getWidth() { return width; }
}

public class RasterBox {
    private Coords topLeft, bottomRight;

    public RasterBox() {
        // Initialize topLeft and bottomRight with some default values
        topLeft = new Coords();
        bottomRight = new Coords();
        topLeft.x = 0;
        topLeft.y = 0;
        bottomRight.x = 100;
        bottomRight.y = 100;
    }

    public Coords getTopLeft() { return topLeft; }
    public Coords getBottomRight() { return bottomRight; }
}

public class Coords {
    public int x, y;
}

public class Main {
    public static void main(String[] args) {
        // Create a RasterBox instance
        RasterBox rasterBox = new RasterBox();

        // Create an instance of the adapter and pass the RasterBox instance
        Adaptor adapter = new Adaptor(rasterBox);

        // Call the op() method to see if the adapter is working
        adapter.op();
    }
}

