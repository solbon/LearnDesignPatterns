package pl.malpiszon.state;

public class SelectionTool implements Tool {
    public void mouseDown() {
        System.out.println("Selection icon");
    }

    public void mouseUp() {
        System.out.println("Draw a rectangle");
    }
}
