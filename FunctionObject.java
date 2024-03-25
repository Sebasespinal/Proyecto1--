package uvg.edu.gt;

import java.util.Stack;

public class FunctionObject {
    private Stack<Object> arguments;
    private Stack<String> variables;

    /**
     * Constructor de la clase FunctionObject
     */
    public FunctionObject() {
        this.arguments = new Stack<Object>();
        this.variables = new Stack<String>();
    }

    /**
     * Agrega un argumento al stack de arguments.
     * @param argument El argumento a agregar.
     */
    public void addArgument(Object argument) {
        this.arguments.push(argument);
    }

    /**
     * Obtiene los argumentos almacenados en el stack.
     * @return Una pila de argumentos.
     */
    public Stack<Object> getArguments() {
        return arguments;
    }

    /**
     * Establece los argumentos.
     * @param arguments La pila de argumentos a establecer.
     */
    public void setArguments(Stack<Object> arguments) {
        this.arguments = arguments;
    }

    /**
     * Agrega una variable al stack de variables.
     * @param variable La variable a agregar.
     */
    public void addVariable(String variable) {
        this.variables.push(variable);
    }

    /**
     * Obtiene las variables almacenadas en el stack.
     * @return Una pila de variables.
     */
    public Stack<String> getVariables() {
        return variables;
    }
}
