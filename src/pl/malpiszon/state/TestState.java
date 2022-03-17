package pl.malpiszon.state;

public class TestState {
    public static void main(String[] args) {

        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
