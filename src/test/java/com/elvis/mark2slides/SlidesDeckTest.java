package com.elvis.mark2slides;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class SlidesDeckTest {
    @Test
    public void saveDeSlidesDeckTest() throws IOException {
        //arrenge
        FakeFileSystem fs = new FakeFileSystem();
        SlidesDeck slidesDeck = new SlidesDeck("miDeck1", "temp", fs);
        //act
        slidesDeck.save();

        //assert
        Assert.assertEquals(fs.copiFueVisitado(),true);
    }
}
