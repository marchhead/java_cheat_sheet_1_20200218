package me.baijuyi.javacheatsheet120200218.activity.command;

import me.baijuyi.javacheatsheet120200218.activity.criteria.Criteria;
import me.baijuyi.javacheatsheet120200218.activity.exception.JuyiFileNotException;
import me.baijuyi.javacheatsheet120200218.activity.view.CountFView;
import me.baijuyi.javacheatsheet120200218.activity.view.MenuView;


import java.io.File;
import java.io.FilenameFilter;


public class CountFilesOrFoldersCommand implements ICommand {
    private MenuView menuView = MenuView.getInstance();
    private CountFView cfView = CountFView.getInstance();

    @Override
    public void execute() {
        Criteria criteria = null;
        try {
            criteria = cfView.show();
        } catch (JuyiFileNotException e) {
            System.err.println("File not Found! Please Enter Again!");
            cfView.show();
        }

        CountResult result = getResult(criteria);
        System.out.printf("%s has %d %s files and %d folders \n", criteria.getFolderUrl(), result.fileCount, criteria.getExtension(), result.folderCount);
        menuView.show();
    }

    private CountResult getResult(Criteria criteria) {
        File f = new File(criteria.getFolderUrl());
        if (criteria.isIncludeSubFolder()) {
            return getCountRecursion(criteria.getFolderUrl(), criteria.getExtension());
        } else {
            return getCount(criteria.getFolderUrl(), criteria.getExtension());
        }
    }

    private CountResult getCount(String url, final String extension) {
        int fileCount = 0;
        int folderCount = 0;
        File root = new File(url);
        if (root.isDirectory()) {
            File[] fs = root.listFiles((File dir, String name) -> {
                File f = new File(dir.getPath() + File.separator + name);
                if (name.endsWith(extension) || f.isDirectory()) {
                    return true;
                }
                return false;
            });
            for (File f : fs) {
                if (f.isDirectory()) {
                    folderCount++;
                } else {
                    fileCount++;
                }
            }
        } else if (root.getName().endsWith(extension)) {
            fileCount++;
        }

        return new CountResult(fileCount, folderCount);
    }

    private CountResult getCountRecursion(String url, String extension) {

        int folderCount = 0;
        int fileCount = 0;
        File root = new File(url);

        if (root.isDirectory()) {
            File[] fs = root.listFiles(

                    (File dir, String name) -> {
                        File f = new File(dir.getPath() + File.separator + name);
                        if (name.endsWith(extension) || f.isDirectory()) {
                            return true;
                        }
                        return false;
                    }
            );
            for (File f : fs) {
                if (f.isDirectory()) {
                    folderCount++;
                    CountResult cr = getCountRecursion(f.getPath(), extension);
                    fileCount += cr.fileCount;
                    folderCount += cr.folderCount;
                } else {
                    fileCount++;
                }
            }
            return new CountResult(fileCount, folderCount);

        } else {
            return getCount(url, extension);
        }
    }


    class CountResult {
        int fileCount;
        int folderCount;

        CountResult(int fileCount, int folderCount) {
            this.fileCount = fileCount;
            this.folderCount = folderCount;
        }
    }
}
