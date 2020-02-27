package me.baijuyi.javacheatsheet120200218.activity.command;

public class QuitCommand implements ICommand {

    @Override
    public void execute() {
        System.exit(-1);
    }
}
