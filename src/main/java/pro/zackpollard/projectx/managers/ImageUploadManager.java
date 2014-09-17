package pro.zackpollard.projectx.managers;

import pro.zackpollard.projectx.ProjectX;
import pro.zackpollard.projectx.uploaders.image.CustomImageUploader;
import pro.zackpollard.projectx.uploaders.image.ImageUploader;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ImageUploadManager {

    private ProjectX instance;
    private ImageUploader selectedUploader;

	private Map<String, ImageUploader> uploaderMap = new HashMap<String, ImageUploader>();

    public ImageUploadManager(ProjectX instance) {

        this.instance = instance;
	    this.initiateUploaders();
        //TODO: Get selected uploader from config.

	    //TODO: Remove this once the GUI or there is ability to change this through CLI.
	    this.setUploader(uploaderMap.get("Custom"));
    }

    public ImageUploader getUploader() {

        return this.getUploader();
    }

    /**
     * This will change the current uploader to the new uploader selected by the user.
     *
     * @param uploader The uploader that will be used.
     */
    public void setUploader(ImageUploader uploader) {

        this.selectedUploader = uploader;
        //TODO: Save new uploader back to config
    }


	/**
	 * When a new ImageUploader is created, it should be added here with the name that it should have in the GUI. This makes it available for selection.
	 */
	private void initiateUploaders() {

		new CustomImageUploader(instance, "Custom");
	}

	public void addImageUploader(String name, ImageUploader uploader) {

		this.uploaderMap.put(name, uploader);
	}

	public Map<String, ImageUploader> getImageUploaders() {

		return this.uploaderMap;
	}
}
