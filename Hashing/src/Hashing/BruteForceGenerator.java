package Hashing;
import java.util.concurrent.*;

public class BruteForceGenerator {

    private static final String CHARSET = "abcdefghijklmnopqrstuvwxyz"; // You can customize the character set
    private static final int PASSWORD_LENGTH = 5;
    private static final int THREAD_POOL_SIZE = 8; // You can adjust the number of threads

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

        for (int i = 0; i < CHARSET.length(); i++) {
            char initialChar = CHARSET.charAt(i);
            executorService.submit(new PasswordGeneratorTask(initialChar));
        }

        executorService.shutdown();
    }

    private static class PasswordGeneratorTask implements Callable<Void> {

        private final char initialChar;

        public PasswordGeneratorTask(char initialChar) {
            this.initialChar = initialChar;
        }

        @Override
        public Void call() {
            generatePasswords(String.valueOf(initialChar), PASSWORD_LENGTH - 1);
            return null;
        }

        private void generatePasswords(String currentPassword, int remainingLength) {
            Thread currentThread = Thread.currentThread();
            if (remainingLength == 0) {
                System.out.println("Thread: " + currentThread.getName() + " - " + currentPassword);
                return;
            }

            for (int i = 0; i < CHARSET.length(); i++) {
                char nextChar = CHARSET.charAt(i);
                String newPassword = currentPassword + nextChar;
                generatePasswords(newPassword, remainingLength - 1);
            }
        }
    }
}
