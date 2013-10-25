package kata3.control;

import kata3.model.HistogramBuilder;
import kata3.ui.HistogramViewer;

public class CalculateHistogramControl {
    private Integer[] array;
    

    public CalculateHistogramControl(Integer[] array) {
        this.array = array;
    }
    public void execute(){
        HistogramBuilder<Integer> builder = new HistogramBuilder<>();
        builder.calculate(array);
        HistogramViewer<Integer> viewer = new HistogramViewer<>(builder.getHistogram());
        viewer.show();
    }
    
}
