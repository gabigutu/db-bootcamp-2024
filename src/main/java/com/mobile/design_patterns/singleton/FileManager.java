package com.mobile.design_patterns.singleton;

public class FileManager {

    private static FileManager fileManager = null;

    private FileManager (){
    };

    public static synchronized FileManager getInstance() throws InterruptedException {
        if (fileManager == null) {
            fileManager = new FileManager();
        }
        return fileManager;
    }


}
