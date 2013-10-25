
package kata3;

import kata3.control.CalculateEmailDomainHistogramControl;
//import kata3.control.CalculateHistogramControl;

public class Kata3 {

    public static void main(String[] args) {
        //Integer array = {1,2,1,5,1,2,3};
        //CalculateHistogramControl ejecutable = new CalculateHistogramControl(array);
        //ejecutable.execute();
        
        String filename = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\kata3\\src\\lista.txt";
        CalculateEmailDomainHistogramControl control2 = new CalculateEmailDomainHistogramControl(filename);
        control2.execute();
    }
}
