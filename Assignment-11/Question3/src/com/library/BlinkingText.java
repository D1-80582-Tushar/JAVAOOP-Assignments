package com.library;

class BlinkingText {
    public static void main(String[] args) {
        int blinkCount = 10; // Number of times to blink
        int blinkDurationMillis = 500; // Blink duration in milliseconds

        for (int i = 0; i < blinkCount; i++) {
            System.out.print("."); // Print the message
            try {
                Thread.sleep(blinkDurationMillis); // Wait for the blink duration
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clearConsole(); // Clear the console
            try {
                Thread.sleep(blinkDurationMillis); // Wait for the blink duration
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Function to clear the console screen
    public static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            // Handle exceptions, if any
            e.printStackTrace();
        }
    }
}


