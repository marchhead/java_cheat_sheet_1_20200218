package me.baijuyi.javacheatsheet120200218.activity.command;

import me.baijuyi.javacheatsheet120200218.activity.view.MenuView;

public class ShowErrorCommand implements ICommand {
    private MenuView menuView = MenuView.getInstance();

    @Override
    public void execute() {
        System.out.println("Wrong!");
        menuView.show();
    }
}
