package kata3.control;

import java.io.FileNotFoundException;
import kata3.model.HistogramBuilder;
import kata3.persistance.MailReader;
import kata3.ui.HistogramViewer;

public class CalculateEmailDomainHistogramControl {
    
    private String filename;

    public CalculateEmailDomainHistogramControl(String filename) {
        this.filename = filename;
    }
    
    public void execute(){

        HistogramBuilder<String> builder = new HistogramBuilder<>();
        builder.calculate(readDomains());
        HistogramViewer<String> viewer = new HistogramViewer <>(builder.getHistogram());
        viewer.show();
    }
    
    private String[] readDomains(){
        MailReader reader = new MailReader();
        try{
            return reader.readDomains(filename);
        }
        catch (FileNotFoundException ex){
            System.out.println("No se encuentra el archivo " + filename);
            return new String[0];
        }
    }
    
}
    
