package Editor;

public class FileCannotBeEditedException extends Exception{
    String format;
    public FileCannotBeEditedException(String format) {
        this.format=format;
    }

    @Override
    public String toString() {
        return "<"+format+"> file cannot be edited";
    }
}
