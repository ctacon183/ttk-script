package ttk.script;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;

/**
 *
 * @author ctacon
 */
public class ImageParser {
    
    static Map<Integer, BufferedImage> numbers = new HashMap<Integer, BufferedImage>();
    
    static void fill() {
        try {
            BufferedImage image1 = ImageIO.read(new File("344.png"));
            numbers.put(0, image1.getSubimage(20, 10, 16, 19));
            numbers.put(3, image1.getSubimage(35, 10, 16, 19));
            numbers.put(0, image1.getSubimage(54, 10, 16, 19));
//            numbers.put(0, image1.getSubimage(54, 10, 16, 19));
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public static void main(String args[]) {
        try {
            fill();
            for (Integer key : numbers.keySet()) {
                ImageIO.write(numbers.get(key), "PNG", new File(key + ".png"));
            }
            
        } catch (Exception ex) {
            System.err.println(ex.getStackTrace());
        }
    }
}
