import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageReader {

    private int red, blue, green;

    public ImageReader(BufferedImage image, File file) {
        int imageWidth = 0;
        int imageHeight = 0;

        try {
            image = ImageIO.read(file); 
            imageWidth = image.getWidth();
            imageHeight = image.getHeight();
            System.out.println("Image Width = " +
                                imageWidth + " " +
                               "Image Height = " +
                                imageHeight
                                );

        } catch (IOException e) {
            e.printStackTrace();
        }

        for(int i = 0; i < imageWidth; ++i) {
           for(int j = 0; j < imageHeight; ++j) {
                int colour =  image.getRGB(i,j);
                setColours(colour);
            }
        }
    }
    public void setColours(int col){
        setRed((col & 0x00ff0000) >> 16);
        setGreen((col & 0x0000ff00) >> 8);
        setBlue(col & 0x000000ff);
    }
    public void setRed(int red) {
        this.red = red;
    }
    public int getRed() {
        return red;
    }
    public void setBlue(int blue) {
        this.blue = blue;
    }
    public int getBlue() {
       return blue;
    }
    public void setGreen(int green) {
       this.green = green;
    }
    public int getGreen() {
        return green;
    }
}
