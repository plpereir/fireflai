package com.ibm.fireflai.utils;

import java.io.IOException;

public class ProcessScripts {
    
    private final static String commandPath = "/bin/bash";

    private final static String scriptPath = "test.sh";

    public static void runPython()
    {
        try {
            Process execCommand = new ProcessBuilder(commandPath, scriptPath).start();
            execCommand.waitFor();
        } catch (IOException e) {
            // handle exceptions
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    

    public static void main(String[] args)
    {
        runPython();
    }
}
