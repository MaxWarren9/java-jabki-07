package files;

public class ImageFile extends File {
    public int width;
    public int height;
    public int bytesPerPixel;

    public ImageFile(String name, int width, int height, int bytesPerPixel) {
        super(name);
        this.width = width;
        this.height = height;
        this.bytesPerPixel = bytesPerPixel;
    }

    @Override
    public long getSize() {
        return width * height * bytesPerPixel;
    }
}
