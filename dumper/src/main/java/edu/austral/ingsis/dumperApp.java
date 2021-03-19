package edu.austral.ingsis;

public class dumperApp {
    public static void main(String[] args) {
        final Interpreter interpreter = new Interpreter();
        if (interpreter.someInterpreterMethod()){
            System.out.println("Dumper Works");
        }else{
            System.out.println("Sad");
        }
    }
}
