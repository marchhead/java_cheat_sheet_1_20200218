package me.baijuyi.javacheatsheet120200218.activity.view;

import me.baijuyi.javacheatsheet120200218.activity.application.Main;
import me.baijuyi.javacheatsheet120200218.activity.command.DoSthCommand;
import me.baijuyi.javacheatsheet120200218.activity.command.ICommand;

import java.util.Scanner;

public class MenuView {

    private static MenuView menuView = new MenuView();

    private MenuView() {

    }

    public static MenuView getInstance() {
        return menuView;
    }

    public void show() {
        System.out.println("*********************WELCOME!!!!!!*********************");
        System.out.println("*********************Number---DO SOMETHING*************");
        System.out.println("*********************cf---CountFilesORFolders**********");
        System.out.println("*********************q---QUIT**************************");
        System.out.println("*******************************************************");
        System.out.println("Please Enter:");
        Scanner scanner = new Scanner(System.in);
        String commandStr = scanner.nextLine();
        ICommand cmd = Main.commands.get(commandStr);
        if (cmd == null) {
            try {
                int commandInt = Integer.parseInt(commandStr);
                cmd = commandInt > 0 ? new DoSthCommand(commandInt) : Main.commands.get("e");

            } catch (NumberFormatException e) {
                cmd = Main.commands.get("e");
            } finally {
                Main.commands.put(commandStr, cmd);
            }
        }
        cmd.execute();
    }

}
