package com.elvis.mark2slides;

import java.io.IOException;

public class FakeFileSystem implements FileSystem {

    private boolean copiDirV = false;

    @Override
    public void copiarDirectorio(String sruDir, String destDir) throws IOException {
        copiDirV = true;
    }

    public boolean copiFueVisitado() {
        return copiDirV;
    }
}
