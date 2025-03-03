package ait.de.homeworks.homework42;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

@Slf4j
public class TripApp {
    public static void main(String[] args) {
        Path path = Path.of("homework42/travel_route.txt");
        try{
            List<String> lines = Files.readAllLines(path);
        } catch (IOException exception) {
            log.error("Files not founf: {}", exception.);


        }
    }
}
