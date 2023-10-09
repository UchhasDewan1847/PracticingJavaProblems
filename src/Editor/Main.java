package Editor;

public class Main {
    public static void main(String[] args){
        PhotoEditor editor= new PhotoEditor();
        VideoEditor videoEditor= new VideoEditor();
        //Photo Editor Editing
        try {
            videoEditor.Edit("Online5.png");
        }
        catch (FileCannotBeEditedException e) {
            System.out.println(e.toString());
        }
//        editor.Edit("Online5.png");
//        editor.Edit("Online5.wmv");
//        editor.Edit("Online5.mp4");
//        videoEditor.Edit("Online5.jpeg");
//        videoEditor.Edit("Online5.png");
//        videoEditor.Edit("Online5.wmv");
//        videoEditor.Edit("Online5.mp4");

    }
}
