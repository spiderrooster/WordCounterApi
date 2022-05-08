package util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class IOUtils {

    public boolean doesExist(Path path) {
        return Files.exists(path);
    }

    public boolean isRegularFile(Path path) {
        return Files.isRegularFile(path);
    }

    public InputStream createInputStream(Path path) throws IOException {
        return Files.newInputStream(path);
    }
}
