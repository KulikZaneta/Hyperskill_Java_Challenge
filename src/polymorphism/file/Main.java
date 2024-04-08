package polymorphism.file;

public class Main {
    public static void main(String[] args) {
        byte[] someBytes = new byte[1024];
        File img = new ImageFile("/path/to/file/img.png", 480, 640, someBytes);
        img.printFileInfo();

        File img1 = new ImageFile("/path/to/file/img.png", 480, 640, someBytes);
        ImageFile img2 = new ImageFile("/path/to/file/img.png", 480, 640, someBytes);

        img1.getFullName();
        img1.getFileInfo();

        img2.getContent();
        img2.getHeight();
        img2.getWidth();
        img2.getFullName();
        img2.getFileInfo();
        img2.printFileInfo();
    }
}

