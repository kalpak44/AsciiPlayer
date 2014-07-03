import java.awt.Color;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;


class ImgToText {


    private BufferedImage img;
    private int intensity;
    
    public void convertToAscii(String imgname) {
        try {
            img = ImageIO.read(new File(imgname));
        } catch (IOException e) {
        }


        for (int i = 0; i < img.getHeight(); i++){
            for (int j = 0; j < img.getWidth(); j++){
                Color pixcol = new Color(img.getRGB(j, i));
                intensity = intensity(pixcol.getRed(), pixcol.getBlue(),pixcol.getGreen());
                System.out.print(strToChar(intensity));
            }
            System.out.println();
        }
    }
    
    public static int intensity(int red, int green, int blue){
        return (red + green + blue)/3;
    }


    public String strToChar(double g)
    {
        String str = " ";
        if (g >= 240) {
            str = " ";
        } else if (g >= 210) {
            str = ".";
        } else if (g >= 190) {
            str = "*";
        } else if (g >= 170) {
            str = "+";
        } else if (g >= 120) {
            str = "^";
        } else if (g >= 110) {
            str = "&";
        } else if (g >= 80) {
            str = "8";
        } else if (g >= 60) {
            str = "#";
        } else {
            str = "@";
        }
        return str;
    }


    
    public static void main(String[] args) {
        /*
        if (args.length==0){
            System.out.println("start program to agguments... ImageToText example.jpg out.txt");
            System.exit(1);
        }
        */
        ImgToText obj=new ImgToText();
        obj.convertToAscii("/home/kalpak44/Рабочий стол/image/1.bmp");
    }
}




