package me.baijuyi.javacheatsheet120200218.activity.view;

import me.baijuyi.javacheatsheet120200218.activity.criteria.Criteria;
import me.baijuyi.javacheatsheet120200218.activity.criteria.validate.CriteriaValidator;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Scanner;

public class CountFView {
    private static CountFView cfView = new CountFView();


    private CountFView() {
    }

    public static CountFView getInstance() {
        return cfView;
    }

    public Criteria show() {
        System.out.println("*****************Count Folders or Files****************");
        System.out.println("*******************************************************");
        System.out.println("Please Enter the URL of Folder:");
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        System.out.println("Include Subfolder ? --y : Yes, Others : No");
        String includeSubFolder = scanner.nextLine();
        System.out.println("Which type of files do you wanna count?");
        String extension = scanner.nextLine();
        return CriteriaValidator.validate(url, includeSubFolder, extension);
    }


}
