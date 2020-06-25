
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {
    
    
    public List<String> read(String file) throws FileNotFoundException {
        List<String> lines = new ArrayList<String>();
        File x = new File(file);
        Scanner reader = new Scanner(x);
        while(reader.hasNextLine()){
            lines.add(reader.nextLine());
        }
        return lines;
        
    }
    

    public void save(String file, String text) throws IOException {
        File x = new File(file);
        FileWriter writer = new FileWriter(x);
        writer.append(text);
        writer.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        File x = new File(file);
        FileWriter writer = new FileWriter(x, true);
        for(String line : texts){
            writer.append(line +"\n");
        }
        writer.close();
        
    }
}
