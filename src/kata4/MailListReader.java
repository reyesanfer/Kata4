
package kata4;

import kata4.model.Mail;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author FernandoSanfielReyes
 */
public class MailListReader {

    public static List<Mail> read (String fileName) {
        List<Mail> list = new ArrayList<>();
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            
            while (true) {
                String line = reader.readLine();
                if(line == null) break;
                if (Mail.isMail(line)){
                    list.add(new Mail(line));
                }
            }
            
        } catch (FileNotFoundException exception){
            System.out.println("ERROR MailListReader::read (File not Found)" + exception.getMessage());
        } catch (IOException exception) {
            System.out.println("ERROR MailListReader::read (IO)" + exception.getMessage());
        }
        
        return list;
    }
    
}
