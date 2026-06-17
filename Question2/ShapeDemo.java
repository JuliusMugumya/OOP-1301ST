package shapesystem;

/**
 * Shape Demo Class
 */
public class ShapeDemo {

    /**
     * Prints areas using polymorphism.
     *
     * @param shapes
     */
    public static void printAreas(
            Shape[] shapes) {

        System.out.println(
                "\nAREAS OF SHAPES");

        for (Shape shape : shapes) {

            System.out.println(
                    shape.getClass()
                            .getSimpleName()
                    + " Area = "
                    + shape.getArea());
        }
    }

    /**
     * Returns largest shape.
     *
     * @param shapes
     * @return largest shape
     */
    public static Shape largest(
            Shape[] shapes) {

        Shape largestShape = shapes[0];

        for (Shape shape : shapes) {

            if (shape.getArea()
                    > largestShape.getArea()) {

                largestShape = shape;
            }
        }

        return largestShape;
    }

    public static void main(String[] args) {

        try {

            Circle circle =
                    new Circle(
                            5,
                            "Red",
                            true);

            Rectangle rectangle =
                    new Rectangle(
                            4,
                            6,
                            "Blue",
                            true);

            Triangle triangle =
                    new Triangle(
                            3,
                            4,
                            5,
                            "Green",
                            true);

            Shape[] shapes = {
                circle,
                rectangle,
                triangle
            };

            // Demonstrate dynamic binding
            printAreas(shapes);

            System.out.println(
                    "\nLARGEST SHAPE");

            System.out.println(
                    largest(shapes));

            // Demonstrate resize
            circle.resize(2);

            System.out.println(
                    "\nAFTER RESIZING CIRCLE");

            System.out.println(circle);

            // Demonstrate exception handling
            System.out.println(
                    "\nINVALID TRIANGLE TEST");

            Triangle invalidTriangle =
                    new Triangle(
                            1,
                            2,
                            10,
                            "Black",
                            true);

        } catch (
                InvalidShapeException ex) {

            System.out.println(
                    "Exception Caught: "
                    + ex.getMessage());
        }
    }
}
