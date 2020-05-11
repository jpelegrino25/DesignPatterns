package com.julioluis.designpatterns.structural.bridge;

public class FileDownloadImpl implements FileDownload {

    private FileDownloadPlatform platform;

    public FileDownloadImpl(FileDownloadPlatform platform) {
        this.platform=platform;
    }

    @Override
    public Object download(String path) {
        return platform.downloadFile(path);
    }

    @Override
    public boolean store(Object object) {
        return platform.storeFile(object);
    }
}
