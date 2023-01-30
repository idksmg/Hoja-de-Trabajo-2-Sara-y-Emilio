
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Assert;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestCalculatorEmilioSara {
    @Test
    public void seEsperaResultadoDe65CuandoEs567SUMARyMULTIPLICAR() {
        //arrange
        final Integer esperoUnValorde65 = 65; 
        IPostfixCalculator myCalculator = new CalculatorEmilio(); 
        ArrayList<String> cadenaOperar = new ArrayList<String>(); 
        cadenaOperar.add("5 6 7 + *");
        Integer resultado = 0;  
        //action
        try{
            resultado = myCalculator.Calculate(cadenaOperar); 
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
        //assert
        Assert.assertEquals(esperoUnValorde65,resultado);
    }


    @Test
    public void seEsperaResultadoDe3CuandoEs12SUMAR() {
        //arrange
        final Integer esperoUnValorde = 3; 
        IPostfixCalculator myCalculator = new CalculatorEmilio(); 
        ArrayList<String> cadenaOperar = new ArrayList<String>(); 
        cadenaOperar.add("1 2 +");
        Integer resultado = 0;  
        //action
        try{
            resultado = myCalculator.Calculate(cadenaOperar); 
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
        //assert
        Assert.assertEquals(esperoUnValorde,resultado);
    }
    
    @Test
    public void seEsperaUnErrorPorDivisionPorCero() {
        //arrange
        String seEsperaUnMensajeDeError = "No se puede ejecutar la division entre 0."; 
        IPostfixCalculator myCalculator = new CalculatorEmilio(); 
        ArrayList<String> cadenaOperar = new ArrayList<String>(); 
        String mensajeDeError = ""; 
        cadenaOperar.add("1 0 /");
        //action
        try{
            Integer resultado = myCalculator.Calculate(cadenaOperar); 
        }
        catch(Exception e){
            mensajeDeError = e.getMessage(); 
        }
        //assert
        Assert.assertEquals(seEsperaUnMensajeDeError,mensajeDeError);
    }


    @Test
    public void seEsperaUnErrorDeValoresInsuficientes() {
        //arrange
        String seEsperaUnMensajeDeError = "Valores insuficientes para realizar la operacion."; 
        IPostfixCalculator myCalculator = new CalculatorEmilio(); 
        ArrayList<String> cadenaOperar = new ArrayList<String>(); 
        String mensajeDeError = ""; 
        cadenaOperar.add("1 - 2");
        //action
        try{
            Integer resultado = myCalculator.Calculate(cadenaOperar); 
        }
        catch(Exception e){
            mensajeDeError = e.getMessage(); 
        }
        //assert
        Assert.assertEquals(seEsperaUnMensajeDeError,mensajeDeError);
    }
}


