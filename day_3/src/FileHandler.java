import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class FileHandler {

    public ArrayList<Instruction> getSet(Path dataFile) throws IOException{
        ArrayList<Instruction> set = new ArrayList<>();
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

            while(fileScanner.hasNext()) {
                tempString = fileScanner.nextLine().split(",");

                for (int i = 0; i < tempString.length; i++) {
                    Instruction tempObj = new Instruction();
                    tempObj.setInst(tempString[i].charAt(0));
                    String temp = tempString[i].substring(1, tempString[i].length());
                    tempObj.setMove(Integer.parseInt(temp));

                    //System.out.println(tempObj.getInst() + "" + tempObj.getMove());

                    set.add(tempObj);
                }
            }
        } catch(Exception e){
           System.out.println(e.getMessage());
        } finally{
            System.out.println("CLOSING File: " + dataFile);
            fileInputStream.close();
        }

        /*set.forEach((temp) -> {
            System.out.println(temp.getInst() + "" + temp.getMove());
        });*/

        return set;
    }
}
