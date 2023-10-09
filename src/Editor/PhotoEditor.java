package Editor;

public class PhotoEditor implements Editor{
    @Override
    public void Edit(String file) throws FileCannotBeEditedException {
        if(file.endsWith("png")||file.endsWith("jpeg"))
            System.out.println("Photo Editor is editing");
        else {
            String[] strArray=file.split("\\.");
            System.out.println(strArray.length);
            throw new FileCannotBeEditedException(strArray[1]);

        }

    }
}
