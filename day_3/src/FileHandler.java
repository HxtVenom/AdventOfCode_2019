import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FileHandler {

    public HashMap<Integer, Character> getSet(Path dataFile) throws IOException{
        HashMap<Integer, Character> set = new LinkedHashMap<Integer, Character>();
        File file = new File(dataFile.toString());
        FileInputStream fileInputStream = null;

        String currWord;

        try{

            if(!file.exists()){
                throw new Exception("ERROR: File does not exist.");
            }

            System.out.println("OPENING File: " + dataFile);
            fileInputStream = new FileInputStream(file);
            Scanner fileScanner = new Scanner(fileInputStream);

            String[] tempString;
            char instruction;
            int tempInt;

            while(fileScanner.hasNext()) {
                tempString = fileScanner.nextLine().split(",");

                for (int i = 0; i <= tempString.length; i++) {
                    instruction = tempString[i].charAt(0);
                    String temp = tempString[i].substring(1, tempString[i].length());
                    tempInt = Integer.parseInt(temp);

                    set.put(tempInt, instruction);
                }
            }
        } catch(Exception e){
           System.out.println(e.getMessage());
        } finally{
            System.out.println("CLOSING File: " + dataFile);
            fileInputStream.close();
        }

        return set;
    }
}
