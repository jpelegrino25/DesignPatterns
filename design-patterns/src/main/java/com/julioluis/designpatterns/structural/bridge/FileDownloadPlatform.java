package com.julioluis.designpatterns.structural.bridge;

public interface FileDownloadPlatform {
    Object downloadFile(String path);
    boolean storeFile(Object object);
}
