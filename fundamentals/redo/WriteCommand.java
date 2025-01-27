package redo;

public class WriteCommand implements Command {
    private String text;
    private Document document;

    public WriteCommand(Document document, String text) {
        this.document = document;
        this.text = text;
    }

    @Override
    public void execute() {
        document.write(text);
    }

    @Override
    public void undo() {
        document.eraseLast();
    }

    @Override
    public String toString() {
        return "WriteCommand{" +
                "text='" + text + '\'' +
                '}';
    }
}
