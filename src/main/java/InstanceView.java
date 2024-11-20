
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jenyf
 */
public class InstanceView {
   
    /**
     *
     * @throws java.io.IOException */
    public InstanceView() throws IOException {
        ArrayList<InstanceControl.InstanceMode> valores = new InstanceControl().loader("API.csv");
        System.out.println("Total de valores carregados: " + valores.size());
        
       
        for (InstanceControl.InstanceMode n : valores) {
            System.out.println(n.getDocente() + " : " + n.getDisciplina());
        }
        
      
        System.out.println("Reimprimindo valores:");
        for (int i = 0; i < valores.size(); i++) {
            System.out.println(valores.get(i).getDocente() + " . " + valores.get(i).getDisciplina());
        }
    }
    
}