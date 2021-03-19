package edu.austral.ingsis;

//import edu.austral.ingsis.Scanner;

public class app {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner();
        if (scanner.someScanMethod()){
            System.out.println("Works Parser");
        }else{
            System.out.println("Sad");
        }
    }
}
