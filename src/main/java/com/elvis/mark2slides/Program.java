package com.elvis.mark2slides;

import java.io.IOException;

public class Program {

    public static void main(String args[]) {
        String slideDeckName = args[0];
        System.out.println("Mark2Slide ==>" + slideDeckName);
        String templateDir = "template";
        FileSystem fs = new FileSystemWrapper();

        SlidesDeck slidesDeck = new SlidesDeck(slideDeckName, templateDir, fs);
        try {
            slidesDeck.save();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
