package com.pluralsight;

public class ForLoop {
    private String forLoop;

    public String getForLoop(){
        return forLoop;
    }

    public void setForLoopLoop(String forLoop) {
        int forLoopCounter = 0;
        String message = "LAUNCH!!!";
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(message);
        this.forLoop = forLoop;
    }
}
