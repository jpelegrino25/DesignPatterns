package com.julioluis.designpatterns.structural.bridge;

public interface FileDownload {
    Object download(String path);
    boolean store(Object object);
}
