package com.kreitek.files.directory;

import com.kreitek.files.interfaces.FileSystemItem;

import java.util.ArrayList;
import java.util.List;

public class DirectoryContent{
    private final List<FileSystemItem> files;
    private int size;

    public DirectoryContent() {
        files = new ArrayList<>();
        size = 0;
    }

    public void add(FileSystemItem file) {
        if (!files.contains(file)) {
            files.add(file);
            size += file.getSize();
        }
    }

    public void remove(FileSystemItem file) {
        if (files.remove(file)) {
            size -= file.getSize();
        }
    }

    public int getSize() {
        return size;
    }

    public List<FileSystemItem> getFiles() {
        return files;
    }
}
