package org.example.task;

import java.awt.*;
import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void getAvailableSites() {
        List<String> availableAdresses = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("src/main/resources/input.txt"))) {
            while (scanner.hasNextLine()) {
                String address = scanner.nextLine();
                if (isAvailable(address)) {
                    availableAdresses.add(address);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        writeOutput(availableAdresses);

        openAddress(availableAdresses.get(0));
    }

    private static boolean isAvailable(String name) {
        try {
            URL url = new URL("https://" + name);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(500);
            return connection.getResponseCode() == HttpURLConnection.HTTP_OK;
        } catch (IOException e) {
            return false;
        }
    }

    private static void writeOutput(List<String> addresses) {
        try {
            Files.createFile(Path.of("src/main/resources/output.txt"));
            File output = new File("src/main/resources/output.txt");
            try (FileWriter outputWriter = new FileWriter(output, true)) {
                addresses.forEach(address -> {
                    try {
                        outputWriter.write(address + "\n");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
            }
        } catch (IOException e) {
            throw new RuntimeException("Something went wrong");
        }
    }

    private static void openAddress(String address) {
        try {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                Desktop.getDesktop().browse(new URI("https://" + address));
            }
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
