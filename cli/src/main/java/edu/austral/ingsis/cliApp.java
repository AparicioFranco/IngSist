package edu.austral.ingsis;

public class cliApp {
    public static void main(String[] args) {
        final Dumper dumper = new Dumper();
        if (dumper.someDumperMethod()){
            System.out.println("CLI Works");
        }else{
            System.out.println("Sad");
        }
    }
}
