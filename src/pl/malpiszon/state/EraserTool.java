package pl.malpiszon.state;

public class EraserTool implements Tool {
    public void mouseDown() {
        System.out.println("Selection eraser");
    }

    public void mouseUp() {
        System.out.println("Erase it all!!!");
    }
}
