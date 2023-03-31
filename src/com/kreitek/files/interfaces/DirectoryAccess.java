package com.kreitek.files.interfaces;

import java.util.List;

public interface DirectoryAccess {
    public void add(FileSystemItem file);

    public void remove(FileSystemItem file);

    public int getSize();

    public List<FileSystemItem> getFiles();
}
