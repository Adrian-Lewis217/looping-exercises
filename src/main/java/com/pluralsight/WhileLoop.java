package com.pluralsight;

public class WhileLoop {
    private String whileLoop;

    public String getWhileLoop(){
        return whileLoop;
    }

    public void setWhileLoop(String whileLoop) {
        int counter = 0;
        String message = "I love Potatoes!";
        while (counter < 5){
            System.out.println(message);
            counter++;
        }
        this.whileLoop = whileLoop;
    }
}
