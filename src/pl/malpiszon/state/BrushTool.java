package pl.malpiszon.state;

public class BrushTool implements Tool {
    public void mouseDown() {
        System.out.println("Brush icon");
    }

    public void mouseUp() {
        System.out.println("Draw a line");
    }
}
