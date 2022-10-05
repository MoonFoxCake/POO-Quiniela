// Importing required classes
import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SaveLoad {


    //Files.writeString(path, string, options)
    Path path
            = Paths.get("D:\\Documents");

    String str
            = "Geeks for Geeks \nWelcome to computer science portal \nHello Geek";

    try {
        // Now calling Files.writeString() method
        // with path , content & standard charsets
        Files.writeString(path, str,
                StandardCharsets.UTF_8);
    }

    catch (IOException ex) {
        // Print messqage exception occurred as
        // invalid. directory local path is passed
        System.out.print("Invalid Path");
    }

//experimental build, must refine

}
