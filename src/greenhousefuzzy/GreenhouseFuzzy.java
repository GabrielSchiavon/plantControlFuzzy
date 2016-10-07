package greenhousefuzzy;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;
import net.sourceforge.jFuzzyLogic.*;

public class GreenhouseFuzzy {

    public static void main(String[] args) throws Exception{
        //nome do arquivo que deseja ler.
        String fileName = "plantControl.fcl";
        FIS fis = FIS.load(fileName, true);
        if (fis == null){
            System.err.println("Can't load file: '" + fileName + "'");
            return;
        }
                
        FunctionBlock functionBlock = fis.getFunctionBlock(null);
        //JFuzzyChart.get().chart(functionBlock);
        
        //Define os valores das entradas
        fis.setVariable("time", 12);
        fis.setVariable("humidity", 50);
        fis.setVariable("sensation", 50);
        fis.setVariable("absorptance", 50);
        fis.setVariable("soilHumidity", 50);
        
        fis.evaluate();
        
        //Variable health = functionBlock.getVariable("health");
        //JFuzzyChart.get().chart(health, health.getDefuzzifier(), true);
        
        //Variable cooler = functionBlock.getVariable("cooler");
        //JFuzzyChart.get().chart(cooler, cooler.getDefuzzifier(), true);
        
        //Variable solenoid = functionBlock.getVariable("solenoid");
        //JFuzzyChart.get().chart(solenoid, solenoid.getDefuzzifier(), true);
        
        //Variable light = functionBlock.getVariable("light");
        //JFuzzyChart.get().chart(light, light.getDefuzzifier(), true);
        
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
        /*
        System.out.println(fis);
        System.out.println("Health:" + functionBlock.getVariable("health").getValue());
        System.out.println("cooler:" + functionBlock.getVariable("cooler").getValue());
        System.out.println("solenoid:" + functionBlock.getVariable("solenoid").getValue());
        System.out.println("light:" + functionBlock.getVariable("light").getValue());
*/
    }
    
}
