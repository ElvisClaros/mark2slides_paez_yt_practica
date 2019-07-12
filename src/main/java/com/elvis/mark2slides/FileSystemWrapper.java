package com.elvis.mark2slides;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileSystemWrapper implements FileSystem {
    @Override
    public void copiarDirectorio(String srcDir, String destDir) throws IOException {
        File srcDire = new File(srcDir);
        File destDire = new File(destDir);
        FileUtils.copyDirectory(srcDire, destDire);
    }
}
