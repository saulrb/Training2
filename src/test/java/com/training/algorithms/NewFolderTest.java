package com.training.algorithms;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class NewFolderTest {

    NewFolder newFolder;
    List<String> existingFolders = List.of("New Folder", "New Folder (3)", "New Folder (4)");

    public void setUp() throws Exception {
        newFolder = new NewFolder();
    }
    @Test
    void generateNewFolderName() {
        assertEquals("New Folder (2)", newFolder.generateNewFolderName(existingFolders));
    }
}