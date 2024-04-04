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
