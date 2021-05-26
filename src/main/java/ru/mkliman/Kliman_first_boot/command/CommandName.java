package ru.mkliman.Kliman_first_boot.command;

/**
 * Enumeration for {@link Command}'s
 */
public enum CommandName {
    START("/start"),
    STOP("/stop"),
    STAT("/stat"),
    HELP("/help"),
    NO("/no"),
    UNKNOWN("/unknown"),
    ;
    private final String commandName;

    CommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }
}
