package redo;

/**
 * Represents a command that encapsulates an operation to be executed and undone.
 * This interface follows the Command design pattern, providing a structure for
 * implementing operations as objects.
 *
 * The {@code execute} method defines the action to be performed, while the
 * {@code undo} method provides the ability to reverse the action performed by
 * the {@code execute} method.
 */
public interface Command {
    void execute();
    void undo();
}
