package com.spring_boot.fileupload;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/files")
public class FileUploadController {

    @PostMapping("/upload")
    public ResponseEntity<Map<String, String>> handleFileUpload(@RequestPart("file") MultipartFile file) {
        if (file.isEmpty()) {
            throw new RuntimeException("File is empty");
        }

        String uploadDir = "C:/uploads/";
        try {
            File directory = new File(uploadDir);
            if (!directory.exists()) {
                directory.mkdirs();
            }

            String fileName = file.getOriginalFilename();
            String filePath = uploadDir + fileName;
            File destinationFile = new File(filePath);

            int counter = 1;
            while (destinationFile.exists()) {
                assert fileName != null;
                String newFileName = appendCounterToFileName(fileName, counter);
                filePath = uploadDir + newFileName;
                destinationFile = new File(filePath);
                counter++;
            }

            Path destinationPath = Paths.get(filePath);
            file.transferTo(destinationPath);

            Map<String, String> response = new HashMap<>();
            response.put("filePath", filePath);

            return ResponseEntity.ok(response);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("File upload failed: " + e.getMessage());
        }
    }

    private String appendCounterToFileName(String fileName, int counter) {
        int dotIndex = fileName.lastIndexOf(".");
        if (dotIndex > 0) {
            String name = fileName.substring(0, dotIndex);
            String extension = fileName.substring(dotIndex);
            return name + "_" + counter + extension;
        } else {
            return fileName + "_" + counter;
        }
    }
}
