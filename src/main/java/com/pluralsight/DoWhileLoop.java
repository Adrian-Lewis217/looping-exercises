package com.pluralsight;

public class DoWhileLoop {
        private String doWhileLoop;

        public String getDoWhileLoop(){
            return doWhileLoop;
        }

        public void setDoWhileLoop(String doWhileLoop) {
            int doWhileCounter = 0;
            String message = "I love Java!";
            do {
                System.out.println(message);
                doWhileCounter++;
            } while (doWhileCounter < 5);
            this.doWhileLoop = doWhileLoop;
        }
}
