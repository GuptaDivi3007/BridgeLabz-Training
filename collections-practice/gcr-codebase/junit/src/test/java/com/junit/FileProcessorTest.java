package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.FileProcessor;

public class FileProcessorTest {

    private FileProcessor processor;
    private final String filename = "testfile.txt";

    @BeforeEach
    void setUp() {
        processor = new FileProcessor();
    }

    @AfterEach
    void tearDown() throws IOException {
        Path path = Paths.get(filename);
        if (Files.exists(path)) {
            Files.delete(path);
        }
    }
    @Test
    void testWriteAndReadFile() throws IOException {

        String content = "Hello JUnit File Test";

        processor.writeToFile(filename, content);
        String result = processor.readFromFile(filename);

        assertEquals(content, result);
    }
    @Test
    void testFileExistsAfterWrite() throws IOException {

        processor.writeToFile(filename, "Sample Data");

        Path path = Paths.get(filename);
        assertTrue(Files.exists(path));
    }
    @Test
    void testReadNonExistingFile() {

        assertThrows(IOException.class, () -> {
            processor.readFromFile("nofile.txt");
        });
    }
}
