package uvg.edu.gt;
public class LispInterpreterException extends RuntimeException {
    public LispInterpreterException(String message) {
        super(message);
    }

    public LispInterpreterException(String message, Throwable cause) {
        super(message, cause);
    }
}
