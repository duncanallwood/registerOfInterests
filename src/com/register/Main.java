package com.register;

import com.register.data.Politician;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            displayUsage();
            System.exit(0);
        }

        //First String from command line is file location
        String fileLocation = args[0];
        String outputLocation = null;

        if (args.length > 1) {
            outputLocation = args[1];
        }


    }

    private static void displayUsage() {
        System.out.println("Usage: registerOfInterests <fileLocation> [outputLocation]");
    }
}
