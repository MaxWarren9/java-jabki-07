package files;

public abstract class File {
    public String name;

    public File(String name) {
        this.name = name;
    }

    public abstract long getSize();
}
