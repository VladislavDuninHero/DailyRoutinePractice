package com.mydailyroutine.routine;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class CopyFilesInDirectory implements RoutineActionDispatcher {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        //напишите тут ваш код

        try (
                DirectoryStream<Path> stream = Files.newDirectoryStream(sourceDirectory);
        ) {
            for (Path path : stream) {
                if (Files.isRegularFile(path)) {
                    Files.copy(path, targetDirectory.resolve(path.getFileName()));
                }
            }
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}
