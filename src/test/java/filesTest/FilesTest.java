package filesTest;

import files.*;
import org.junit.jupiter.api.*;

import main.Main;

public class FilesTest {

    @Test
    public void imageFileTest() {
        ImageFile file = new ImageFile("Картинка",2,3, 1);
        Assertions.assertEquals("Картинка", file.name);
        Assertions.assertEquals(2, file.width);
        Assertions.assertEquals(3, file.height);
        Assertions.assertEquals(1, file.bytesPerPixel);
        Assertions.assertEquals(6,file.getSize());
    }

    @Test
    public void textFileSize() {
        TextFile file = new TextFile("Текстовый файл", "Я ем фрукты");
        Assertions.assertEquals("Текстовый файл", file.name);
        Assertions.assertEquals(22, file.getSize());
    }

    @Test
    public void calculateTotalSizeTest() {
        TextFile file = new TextFile("Текстовый файл", "Я ем фрукты");
        Assertions.assertEquals("Текстовый файл", file.name);
        ImageFile file2 = new ImageFile("Картинка",2,3, 1);
        Assertions.assertEquals("Картинка", file2.name);
        File[] files3 = {file, file2};
        Assertions.assertEquals(28, Main.calculateTotalSize(files3));
    }
}
