package me.baijuyi.javacheatsheet120200218.activity.application;

import me.baijuyi.javacheatsheet120200218.activity.command.*;
import me.baijuyi.javacheatsheet120200218.activity.view.MenuView;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map<String, ICommand> commands = new HashMap<>();

    public static void main(String[] args) {
        new Main().start();
    }

    private void start() {
        intializeCommands();
        startFirstView();
    }

    private void intializeCommands() {
        commands.put("e", new ShowErrorCommand());
        commands.put("q", new QuitCommand());
        commands.put("cf", new CountFilesOrFoldersCommand());
    }

    private void startFirstView() {
        MenuView.getInstance().show();
    }
}
