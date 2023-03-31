package com.kreitek.files.file;

import com.kreitek.files.interfaces.FileSystemItem;
import java.util.List;

public class File extends FileSystemItemBase implements FileSystemItem {

    private final FileContent content;

    public File(FileSystemItem parent, String name) {
        super(parent, name);
        content = new FileContent();
    }

    @Override
    public String getExtension() {
        String extension = "";
        int indexOfLastDot = getName().lastIndexOf(".");
        if (indexOfLastDot > 0) {
            extension = getName().substring(indexOfLastDot + 1);
        }
        return extension;
    }
    @Override
    public int getSize() {return content.getSize();}

    @Override
    public void open() { content.open();
        // Aquí vendría código que actualizaría también this.size
    }

    @Override
    public void setPosition(int numberOfBytesFromBeginning) {content.setPosition(numberOfBytesFromBeginning);}

    @Override
    public byte[] read(int numberOfBytesToRead) {return content.read(numberOfBytesToRead);}

    @Override
    public void write(byte[] buffer) { content.write(buffer);
        // Aquí habría lógica que escribiría en el fichero
    }

    @Override
    public void close() {content.close();}

    //Estos 3 métodos no deberían de estar aquí
    @Override
    public List<FileSystemItem> listFiles() {
        throw new UnsupportedOperationException("No es necesario en File");
    }

    @Override
    public void addFile(FileSystemItem file) {
        throw new UnsupportedOperationException("No es necesario en File");
    }

    @Override
    public void removeFile(FileSystemItem file) {
        throw new UnsupportedOperationException("No es necesario en File");
    }

}
