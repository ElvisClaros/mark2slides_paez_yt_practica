package com.elvis.mark2slides;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class SlidesDeck {

    private final String name;
    private final String templateDir;
    private final FileSystem fileSystem;

    public SlidesDeck(String slideDeckName, String templateDir, FileSystem fs){

        this.name = slideDeckName;
        this.templateDir = templateDir;
        this.fileSystem = fs;
    }

    public void save() throws IOException {
        //Copiar un directori a otro
        String basePath = System.getProperty("user.dir");
        String srcDir = basePath + "/" + this.templateDir;
        String destDir = basePath + "/" + this.name;
        this.fileSystem.copiarDirectorio(srcDir, destDir);

    }


}
