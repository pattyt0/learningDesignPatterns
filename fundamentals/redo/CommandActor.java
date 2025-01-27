package redo;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * CommandActor acts as a dispatcher and executor for {@code Command} objects.
 * It operates on a separate thread, continuously processing commands submitted
 * to its internal queue. Commands are executed in the order they are added.
 * <p>
 * Key features:
 * - Maintains a thread-safe queue for storing commands.
 * - Executes commands using their {@code execute()} method.
 * - Runs indefinitely until interrupted.
 * <p>
 * Thread Management:
 * The {@code CommandActor} extends {@code Thread}, and its {@code run()}
 * method processes commands one at a time from the queue. In the event of
 * an interruption, the thread is gracefully terminated, ensuring proper
 * handling of the interruption status.
 * <p>
 * Usage:
 * - Commands are submitted to the actor using the {@code sendCommand(Command command)} method.
 * - The {@code start()} method of the thread should be explicitly invoked
 * to begin processing commands.
 * <p>
 * Error Handling:
 * Handles {@code InterruptedException} to manage thread interruptions appropriately
 * and ensures the thread is terminated by setting the interrupted status.
 */
public class CommandActor extends Thread {
    private BlockingQueue<Command> commandQueue = new LinkedBlockingQueue<>();

    public void sendCommand(Command command) {
        commandQueue.add(command);
    }

    @Override
    public void run() {
        try {
            while (true) {
                Command command = commandQueue.take();
                command.execute();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
