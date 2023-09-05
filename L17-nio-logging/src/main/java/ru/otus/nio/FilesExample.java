package ru.otus.nio;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FilesExample {
    private static final Logger logger = LoggerFactory.getLogger(FilesExample.class);

    public static void main(String[] args) throws IOException, URISyntaxException {
        new FilesExample().go();
    }

    private void go() throws IOException, URISyntaxException {
        var path = Paths.get("L17-nio-logging/data.xml");
        var pathExists = Files.exists(path);
        logger.info("pathExists:{}", pathExists);

        var pathNE = Paths.get("L17-nio-logging/NE.xml");
        boolean pathNotExists = Files.exists(pathNE);
        logger.info("\npathExists:{}", pathNotExists);

        Files.createDirectory(Paths.get("L17-nio-logging/tmp"));

        // с файлами в ресурсах надо работать как с ресурсами
        var uri = ClassLoader.getSystemResource("share.xml").toURI();

        var source = Paths.get(uri);
        var destination = Paths.get("L17-nio-logging/tmp/share.xml");

        Files.copy(source, destination);

        var size = Files.size(path);
        logger.info("\nfile size: {}", size);

        logger.info("\ncontentAll:");

        try (var stream = Files.lines(path)) {
            stream.forEach(logger::info);
        }

        logger.info("\nfiltered:");

        try (var stream = Files.lines(path)) {
            stream.filter(line -> line.contains("share"))
                    .map(String::toUpperCase)
                    .forEach(logger::info);
        }

        var testString = "Test-Test-Data-String";
        Files.write(Paths.get("L17-nio-logging/tmp/newFile.txt"), testString.getBytes());
    }
}
