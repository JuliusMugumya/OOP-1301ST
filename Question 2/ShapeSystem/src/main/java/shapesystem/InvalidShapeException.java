package shapesystem;

/**
 * Custom exception for invalid shapes.
 */
public class InvalidShapeException extends Exception {

    /**
     * Constructor
     *
     * @param message
     */
    public InvalidShapeException(String message) {
        super(message);
    }
}