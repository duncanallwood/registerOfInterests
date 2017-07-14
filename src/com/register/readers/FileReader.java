package com.register.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    public List<String> read(String fileLocation) {
        File file = new File(fileLocation);
        List<String> strings = new ArrayList<String>();

        try(Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()) {
                strings.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return strings;
}
        }
