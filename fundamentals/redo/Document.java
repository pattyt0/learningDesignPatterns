package redo;

public class Document {
    private StringBuilder content = new StringBuilder();

    public void write(String text) {
        content.append(text).append(" ");
        System.out.println("Document content after write: " + content);
    }

    public void eraseLast() {
        int lastSpaceIndex = content.lastIndexOf(" ");
        if (lastSpaceIndex != -1) {
            content.delete(lastSpaceIndex, content.length());
            System.out.println("Document content after erase: " + content);
        } else {
            System.out.println("Document is empty");
        }
    }
}
