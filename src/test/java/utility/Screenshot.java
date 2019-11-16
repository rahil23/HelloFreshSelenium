package utility;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;


public class Screenshot 
{
	public static void captureDesktop(String imgPath) 
	{
		try 
		{
			Robot robot=new Robot();
			Dimension ScreenSize= Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle ScreenRect = new Rectangle(ScreenSize);
			BufferedImage screenShot=robot.createScreenCapture(ScreenRect);
			ImageIO.write(screenShot, "jpg", new File (imgPath));
			
		} 
		catch (Exception e)
		{
			
		}
	}
}
