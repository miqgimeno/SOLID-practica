package com.kreitek.files.directory;

import com.kreitek.files.file.FileSystemItemBase;
import com.kreitek.files.interfaces.FileSystemItem;

import java.util.List;
public class Directory extends FileSystemItemBase implements FileSystemItem {

    private static final String NO_ES_VALIDO_PARA_DIRECTORIOS = "No es válido para directorios";
    private final DirectoryContent content;

    public Directory(FileSystemItem parent, String name) {
        super(parent, name);
        content = new DirectoryContent();
    }

    @Override
    public String getExtension() {
        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);
    }

    @Override
    public List<FileSystemItem> listFiles() {
        return content.getFiles();
    }

    @Override
    public void addFile(FileSystemItem file) {
        content.add(file);
        file.setParent(this);
    }

    @Override
    public void removeFile(FileSystemItem file) {
        content.remove(file);
    }

    @Override
    public int getSize() {
        return content.getSize();
    }

    @Override
    public void open() {
        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);
    }

    @Override
    public void setPosition(int numberOfBytesFromBeginning) {
        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);
    }

    @Override
    public byte[] read(int numberOfBytesToRead) {
        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);
    }

    @Override
    public void write(byte[] buffer) {
        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);

    }

    public void close() {
        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);
    }
}
