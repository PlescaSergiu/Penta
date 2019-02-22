package test1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFromFile {

    private List<String> text = new ArrayList<>();

    public void read(String path){

        try (Stream<String> str = Files.lines(Paths.get(path))){

            text = str
                    .collect(Collectors.toList());

        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public List<String> getText() {
        return text;
    }
}
