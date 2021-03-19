package edu.austral.ingsis;

public class interpreterApp {
    public static void main(String[] args) {
        final Parser parser = new Parser();
        if (parser.someParserMethod()){
            System.out.println("Interpreter Works");
        }else{
            System.out.println("Sad");
        }
    }
}
