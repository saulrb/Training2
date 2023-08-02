package com.training.algorithms;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class NewFolder {

    static String defaultName = "New Folder";
    static String appendedNumber = " (%d)";

    public static String generateNewFolderName(List<String> existingFolders) {

        String[] arrNums = new String[existingFolders.size()+2];

        final AtomicInteger generated = new AtomicInteger(0);
        existingFolders.forEach(folderName -> {
            var temp = folderName;
            temp = temp.replace("New Folder","");
            if (temp.indexOf("(") > 0){
                var number = temp.replace("(","").replace(")","");
                if (number.length() > 0){
                    arrNums[Integer.parseInt(number.trim())] = number;
                }
            }
        });
        for(int i = 2 ; i < arrNums.length; i++ ){
            if ( arrNums[i] == null) {
                generated.addAndGet(i);
            }
        }
        return String.format(defaultName + appendedNumber, generated.get());
    }

}