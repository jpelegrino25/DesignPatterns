package com.julioluis.designpatterns.structural.bridge;

public class LinuxFileDownload implements FileDownloadPlatform {

    @Override
    public Object downloadFile(String path) {
        return new Object();
    }

    @Override
    public boolean storeFile(Object object) {
        System.out.println("File download Successfully in Linux");
        return false;
    }
}
