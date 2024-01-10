package Hashing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private static final int pass_length = 5;
    private static final String s = "sfkaf";
    private static volatile String result;

    public static void main(String[] args) {
        brute_force task = new brute_force();

        ExecutorService executorService = Executors.newFixedThreadPool(24);
        for (int i = 0; i < 24; i++) {
            executorService.submit(task::startGeneration);
        }

        executorService.shutdown();

        while (!executorService.isTerminated()) {
        }

        String password = task.getResult();

        if (password != null) {
            System.out.println("Password is " + password);
            checkHash(password);
        } else {
            System.out.println("Password not found.");
        }

        System.out.println("Original hash is: " + checkHash(s));
        System.out.println("Brute force password hash is: " + checkHash(password));

        if (checkHash(s).equals(checkHash(password))) {
            System.out.println("Password found");
        } else {
            System.out.println("Password not found");
        }
    }

    private static String checkHash(String word) {
        String hashtext = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(word.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            hashtext = no.toString(16);
        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex);
        }
        return hashtext;
    }

    private static class brute_force {
        private volatile boolean found = false;

        public synchronized void startGeneration() {
            if (!found) {
                generatePasswords("", pass_length);
            }
        }

        public void generatePasswords(String currentString, int length) {
            if (length == 0) {
                if (currentString.equals(s)) {
                    setResult(currentString);
                    found = true;
                }
                return;
            }

            for (int i = 0; i < alphabet.length(); i++) {
                char nextChar = alphabet.charAt(i);
                String newPass = currentString + nextChar;

                generatePasswords(newPass, length - 1);
            }
        }

        private synchronized void setResult(String value) {
            result = value;
        }

        public String getResult() {
            return result;
        }
    }
}
