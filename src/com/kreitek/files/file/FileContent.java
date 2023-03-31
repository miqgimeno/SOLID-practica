package com.kreitek.files.file;

import com.kreitek.files.interfaces.FileAccess;

public class FileContent implements FileAccess {

    private int size = 0;
    private boolean isOpen = false;
    private int position = 0;


    public int getSize() {
        return size;
    }

    public void open() {
        isOpen = true;
        // Aquí vendría código que actualizaría también this.size
    }

    public void setPosition(int numberOfBytesFromBeginning) {
        if (!isOpen) {
            throw new UnsupportedOperationException("Debe abrir el fichero primero");
        }
        if (numberOfBytesFromBeginning > size) {
            throw new UnsupportedOperationException("La posición no puede ser mayor que el tamaño del fichero");
        }
        this.position = numberOfBytesFromBeginning;
    }

    public byte[] read(int numberOfBytesToRead) {
        if (position + numberOfBytesToRead > size) {
            numberOfBytesToRead = size - position;
        }
        // Aquí habría lógica que lee el contenido del fichero
        byte[] buffer = new byte[numberOfBytesToRead];
        position += numberOfBytesToRead;
        return buffer;
    }

    public void write(byte[] buffer) {
        // Aquí habría lógica que escribiría en el fichero
        size += buffer.length;
        position += buffer.length;
    }

    public void close() {
        isOpen = false;
    }
}
