package files;

public class TextFile extends File {
    public String content;

    public TextFile(String name, String content) {
        super(name);
        this.content = content;
    }

    @Override
    public long getSize() {
        return content.length() * 2L;
    }
}
