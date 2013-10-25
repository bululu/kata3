package kata3.model;

public class HistogramBuilder<Key> {
    private Histogram<Key> histogram;

    public Histogram getHistogram() {
        return histogram;
    }
    
    public void calculate (Key[] array){
        histogram= new Histogram<>();
        for (Key item : array) {
            Integer count = histogram.get(item);
            if (count == null)
                count=0;
            histogram.put(item, count+1);            
        }
        
    }
}