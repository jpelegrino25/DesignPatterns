package com.julioluis.designpatterns.structural.bridge;

public class Demo {

    public static void main(String[] args) {

        FileDownload fileDownload=new FileDownloadImpl(new LinuxFileDownload());
        Object object=fileDownload.download("file");
        boolean stored=fileDownload.store(object);
    }
}
