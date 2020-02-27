package me.baijuyi.javacheatsheet120200218.activity.criteria;

public class Criteria {
    private String folderUrl;
    private boolean includeSubFolder;
    private String extension;

    public Criteria(String folderUrl, boolean includeSubFolder, String extension) {
        this.folderUrl = folderUrl;
        this.includeSubFolder = includeSubFolder;
        this.extension = extension;
    }

    public String getFolderUrl() {
        return folderUrl;
    }

    public boolean isIncludeSubFolder() {
        return includeSubFolder;
    }

    public String getExtension() {
        return extension;
    }
}
