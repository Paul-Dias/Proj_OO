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
