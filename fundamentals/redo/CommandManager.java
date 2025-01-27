package redo;

import java.util.Stack;

public class CommandManager {
    private Stack<Command> undoStack = new Stack<>();
    private Stack<Command> redoStack = new Stack<>();

    public void executeCommand(Command command, CommandActor commandActor) {
        commandActor.sendCommand(command);
        undoStack.push(command);
        redoStack.clear();
    }

    public void undoLastCommand(CommandActor commandActor) {
        if(!undoStack.isEmpty()) {
            Command command = undoStack.pop();
            command.undo();
            redoStack.push(command);
        } else {
            System.out.println("No commands to undo");
        }
    }

    public void redoLastCommand(CommandActor commandActor) {
        if(!redoStack.isEmpty()) {
            Command command = redoStack.pop();
            command.execute();
            undoStack.push(command);
        } else {
            System.out.println("No commands to redo");
        }
    }
}
