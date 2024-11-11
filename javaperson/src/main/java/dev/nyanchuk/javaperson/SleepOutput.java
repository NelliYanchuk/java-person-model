package dev.nyanchuk.javaperson;

public class SleepOutput {

    // Method to delay output to increase readability
    public static void sleepOutput(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
