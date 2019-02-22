package test1;

public class Proces{


    public void listConsole(){
        ReadFromFile readFromFile = new ReadFromFile();
        readFromFile.read("File.txt");
        readFromFile.getText().forEach(System.out::println);

    }
}
