package redo;

public class Main {
    public static void main(String[] args){
        Document document = new Document();

        Command writeHello = new WriteCommand(document, "Hello");
        Command writeWorld = new WriteCommand(document, "World");

        CommandActor actor = new CommandActor();
        actor.start();

        CommandManager commandManager = new CommandManager();
        commandManager.executeCommand(writeHello, actor);
        commandManager.executeCommand(writeWorld, actor);

        commandManager.undoLastCommand(actor);
        commandManager.redoLastCommand(actor);

        Command writeJava = new WriteCommand(document, "Java");
        commandManager.executeCommand(writeJava, actor);
        commandManager.redoLastCommand(actor);
    }
}
