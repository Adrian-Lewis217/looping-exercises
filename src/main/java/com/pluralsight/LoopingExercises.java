package com.pluralsight;

public class LoopingExercises {
    public static void main(String[] args) {
        // Three loops
        WhileLoop whileLoop = new WhileLoop();
        DoWhileLoop doWhileLoop = new DoWhileLoop();
        ForLoop forLoop = new ForLoop();

        // print messages for Loops
        whileLoop.setWhileLoop(String.valueOf(whileLoop));
        System.out.println();
        doWhileLoop.setDoWhileLoop(String.valueOf(doWhileLoop));
        System.out.println();
        forLoop.setForLoopLoop(String.valueOf(forLoop));
        System.out.println();

    }
}
