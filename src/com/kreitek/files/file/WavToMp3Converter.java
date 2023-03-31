package com.kreitek.files.file;

import com.kreitek.files.error.InvalidFileFormatException;
import com.kreitek.files.file.File;
import com.kreitek.files.interfaces.AudioConverter;
import com.kreitek.files.interfaces.FileSystemItem;

public class WavToMp3Converter implements AudioConverter {
    @Override
    public FileSystemItem convert(File file) {
        if (!"wav".equalsIgnoreCase(file.getExtension())) {
            throw new InvalidFileFormatException("El fichero debe ser wav");
        }
        int indexOfLastDot = file.getName().lastIndexOf(".");
        String nameWithoutExtension = file.getName();
        if (indexOfLastDot > 0) {
            nameWithoutExtension = file.getName().substring(0, indexOfLastDot);
        }
        String newFileName = nameWithoutExtension + ".mp3";
        FileSystemItem result = new File(file.getParent(), newFileName);
        result.open();
        // Lógica de conversión de wav a mp3. Se lee de este fichero y se escribe en result
        result.close();
        return result;
    }
}
