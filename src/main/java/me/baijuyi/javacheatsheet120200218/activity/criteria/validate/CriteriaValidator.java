package me.baijuyi.javacheatsheet120200218.activity.criteria.validate;

import me.baijuyi.javacheatsheet120200218.activity.criteria.Criteria;
import me.baijuyi.javacheatsheet120200218.activity.exception.JuyiFileNotException;
import me.baijuyi.javacheatsheet120200218.activity.view.CountFView;

import java.io.File;

public class CriteriaValidator {

    public static Criteria validate(String url, String includeSubFolder, String extension) {
        boolean isSubFolder = "y".equals(includeSubFolder) ? true : false;
        File f = new File(url);
        if (!f.exists()) {
            throw new JuyiFileNotException();
        }

        return new Criteria(url, isSubFolder, extension);
    }
}
