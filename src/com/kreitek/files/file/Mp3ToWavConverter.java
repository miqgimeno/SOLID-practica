package com.kreitek.files.file;

import com.kreitek.files.error.InvalidFileFormatException;
import com.kreitek.files.file.File;
import com.kreitek.files.interfaces.AudioConverter;
import com.kreitek.files.interfaces.FileSystemItem;

public class Mp3ToWavConverter implements AudioConverter {
    @Override
    public FileSystemItem convert(File file) {
        if (!"mp3".equalsIgnoreCase(file.getExtension())) {
            throw new InvalidFileFormatException("El fichero debe ser mp3");
        }
        int indexOfLastDot = file.getName().lastIndexOf(".");
        String nameWithoutExtension = file.getName();
        if (indexOfLastDot > 0) {
            nameWithoutExtension = file.getName().substring(0, indexOfLastDot);
        }
        String newFileName = nameWithoutExtension + ".wav";
        FileSystemItem result = new File(file.getParent(), newFileName);
        result.open();
        // Lógica de conversión de mp3 a wav. Se lee de este fichero y se escribe en result
        result.close();
        return result;
    }
}
