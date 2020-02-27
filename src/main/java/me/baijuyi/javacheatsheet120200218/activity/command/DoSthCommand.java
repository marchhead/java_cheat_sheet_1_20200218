package me.baijuyi.javacheatsheet120200218.activity.command;

import me.baijuyi.javacheatsheet120200218.activity.view.MenuView;

public class DoSthCommand implements ICommand {
    private int loopCount;
    private MenuView menuView = MenuView.getInstance();

    public DoSthCommand(int loopCount) {
        this.loopCount = loopCount;
    }

    @Override
    public void execute() {
        System.out.println("Do Something " + loopCount + " times");
        for (int i = 0; i < loopCount; i++) {
            sum();
            displayCurentStamp();
            doReasonableThing();
        }
        menuView.show();
    }

    private void sum() {
        //TODO
    }

    private void displayCurentStamp() {
        //TODO
    }

    private void createFile() {
        // TODO
    }

    private void doReasonableThing() {
        // TODO
    }
}
