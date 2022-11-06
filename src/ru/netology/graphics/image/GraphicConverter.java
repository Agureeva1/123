package ru.netology.graphics.image;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

//import static ru.netology.graphics.Main.DefSchema;

public class GraphicConverter implements TextGraphicsConverter{
   // public static TextColorSchema NextSchema = new TextColorSchema() {
        //@Override
        //public char convert(int color) {
            //return 0;
        //}
   // };

    @Override
    public String convert(String url) throws IOException, BadImageSizeException {
        BufferedImage img = ImageIO.read(new URL(url));
        //int newHeight;
        //int newWidth;
        BufferedImage bwImg = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
        Graphics2D graphics = bwImg.createGraphics();
        // А этому инструменту скажем, чтобы он скопировал содержимое из нашей суженной картинки:
        graphics.drawImage(img, 0, 0, null);
        return null;
    }

    @Override
    public void setMaxWidth(int width) {

    }

    @Override
    public void setMaxHeight(int height) {

    }

    @Override
    public void setMaxRatio(double maxRatio) {

    }

    //@Override
    public void setTextColorSchema(TextColorSchema schema) {
    //DefSchema = schema;

    }
}
