package com.kreitek.files.interfaces;

import java.util.List;

public interface FileAccess {
    int getSize();
    void open();
    void close();
    void setPosition(int numberOfBytesFromBeginning);
    byte[] read(int numberOfBytesToRead);
    void write(byte[] buffer);
}
