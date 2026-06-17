package shapesystem;

/**
 * Abstract Shape Class
 */
public abstract class Shape {

    // Shape color
    protected String color = "white";

    // Filled status
    protected boolean filled;

    /**
     * Default constructor
     */
    public Shape() {
    }

    /**
     * Constructor
     *
     * @param color
     * @param filled
     */
    public Shape(String color, boolean filled) {

        this.color = color;
        this.filled = filled;
    }

    /**
     * Calculates area.
     *
     * @return area
     */
    public abstract double getArea();

    /**
     * Calculates perimeter.
     *
     * @return perimeter
     */
    public abstract double getPerimeter();

    /**
     * Resizes shape.
     *
     * @param factor
     * @throws InvalidShapeException
     */
    public abstract void resize(double factor)
            throws InvalidShapeException;

    @Override
    public String toString() {

        return "Color: "
                + color
                + ", Filled: "
                + filled;
    }
}
