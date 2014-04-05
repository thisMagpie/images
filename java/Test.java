import java.awt.image.BufferedImage;
import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file = new File("magpie.jpeg");
        BufferedImage image = null;
        try { new ImageReader(image, file); }
        catch (NullPointerException e) { e.printStackTrace(); }
    }
}
