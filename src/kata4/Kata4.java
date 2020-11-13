package kata4;

import kata4.model.Histogram;
import kata4.model.Mail;
import java.util.List;

/**
 *
 * @author FernandoSanfielReyes
 */
public class Kata4 {

    public static void main(String[] args) {
        String fileName = new String("email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram<String> mailHistogram = MailHistogramBuilder.build(mailList);
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM...", mailHistogram);
        histogramDisplay.execute();
        
    }

}
