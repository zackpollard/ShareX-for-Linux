package pro.zackpollard.projectx.uploaders.image;

import pro.zackpollard.projectx.uploaders.UploadStatus;

import java.io.File;

public class ImgurV3 extends ImageUploader {
    @Override
    public String upload(File file) {

        return null;
    }

    @Override
    public UploadStatus testConnection() {
        return null;
    }

    @Override
    public boolean isSetup() {
        //TODO: Get if the key values etc have been set by the runSetup method.
        return false;
    }

    @Override
    public void runSetup() {
        //TODO: This will be implemented when the GUI has begun development.
    }
}