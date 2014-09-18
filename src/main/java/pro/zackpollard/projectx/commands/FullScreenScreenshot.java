package pro.zackpollard.projectx.commands;

import pro.zackpollard.projectx.ProjectX;
import pro.zackpollard.projectx.io.image.ImageFormat;
import pro.zackpollard.projectx.io.image.SaveImage;
import pro.zackpollard.projectx.utils.Utils;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class FullScreenScreenshot extends Command {

	public FullScreenScreenshot(ProjectX projectX, String name) {

		super(projectX, name);
	}

	@Override
	public void execute() {

		Robot robot = ProjectX.getRobot();
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		BufferedImage image = robot.createScreenCapture(new Rectangle(0, 0,
				(int) toolkit.getScreenSize().getWidth(),
				(int) toolkit.getScreenSize().getHeight()));

		//TODO: Make the image saving configurable
		//TODO: Make the image saving location configurable

		File file = new File("./images/" + Utils.generateFileName("png"));

		SaveImage.saveImage(image, file, ImageFormat.PNG);

		super.getProjectX().getImageUploadManager().getUploader().upload(file);

		//TODO: Push this upstream to a server (Configurable).
	}
}