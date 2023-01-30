/*package FinalExamPrep.GUI;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileWriting {
    private File read_file;
    Scanner reader = null;

    public FileWriting(){};

    public ArrayList<String> read(String file){
        this.read_file = new File(file);
        ArrayList<String> list = new ArrayList<String>();
        try {
            reader = new Scanner(read_file);
        } catch (Exception e){
            System.out.println("We could not read the file. Error.");
        }
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            list.add(line);
        }
        return list;
    }

    public void save(String fileName, String text) throws Exception {
        try {
            FileWriting writer = new FileWriting(fileName);
            writer.write(text);
            writer.close();
        } catch (Exception e){
            System.out.println("No file.");
        }
        System.out.println("All done.");
    }

    public void saveList(String fileName, ArrayList<String> texts) throws Exception{
        try{
            FileWriting writer = new FileWriting(fileName);
            for(String line : texts){
                writer.write(line + "\n");
            }
            writer.close();
        } catch (Exception e){
            System.out.println("Could not write.");
        }
        System.out.println("All done.");
    }


}*/
