package Editor;

public class VideoEditor implements Editor{
    @Override
    public void Edit(String file) throws FileCannotBeEditedException {
        if(file.endsWith("wmv")||file.endsWith("mp4"))
            System.out.println("Video Editor is editing");
        else {
            String[] strArray=file.split("\\.");
            throw new FileCannotBeEditedException(strArray[1]);

        }
    }
}
