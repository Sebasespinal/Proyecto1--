package uvg.edu.gt;

public class Token {
    private final TokenType type;
    private final String value;

    public Token(TokenType type, String value) {
        this.type = type;
        this.value = value;
    }

    public TokenType getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "(" + type + ", " + value + ")";
    }
}

enum TokenType {
    SYMBOL, // Símbolos como operadores y nombres de funciones
    NUMBER // Números
}

public class Main {

    public static void main(String[] args) {
        // Crear tokens para operaciones
        Token sumaToken = new Token(TokenType.SYMBOL, "+");
        Token restaToken = new Token(TokenType.SYMBOL, "-");
        Token multiplicacionToken = new Token(TokenType.SYMBOL, "*"); // Corrección aquí
        Token divisionToken = new Token(TokenType.SYMBOL, "/");

        // Mostrar los tokens creados
        System.out.println("Token para suma: " + sumaToken);
        System.out.println("Token para resta: " + restaToken);
        System.out.println("Token para multiplicación: " + multiplicacionToken);
        System.out.println("Token para división: " + divisionToken);
    }
}
