import java.util.ArrayList;
import java.util.Stack; 
import java.math.*;
public class CalculatorEmilioSara implements IPostfixCalculator{

    private Stack<Integer> pila; 
    @Override
    public int Calculate(ArrayList postfix_expression) throws Exception {
        Integer resultadoFinal = 0; 
        for (int i = 0; i<postfix_expression.size(); i++){
            
            String cadena = postfix_expression.get(i).toString(); 
            char[] expresion = cadena.toCharArray();
            if(expresion.length < 5){
                throw new Exception("Valores insuficientes para realizar la operacion."); 
            }

            pila = new Stack<Integer>(); 
            for (int j = 0; j<expresion.length; j++){

                if(expresion[j] == '+'){
                    if(pila.size() < 2){
                        throw new Exception("Valores insuficientes para realizar la operacion."); 
                    }
                    Integer operandoB = pila.pop();
                    Integer operandoA = pila.pop();
                    Integer resultadoDeSuma = operandoA+operandoB; 
                    System.out.println("El resultado de la suma es " + resultadoDeSuma);
                    pila.push(resultadoDeSuma);
                }
                else if(expresion[j] == '-'){
                    if(pila.size() < 2){
                        throw new Exception("Valores insuficientes para realizar la operacion."); 
                    }
                    Integer operandoB = pila.pop();
                    Integer operandoA = pila.pop();
                    Integer resultadoDeResta = operandoA-operandoB; 
                    System.out.println("El resultado de la resta es " + resultadoDeResta);
                    pila.push(resultadoDeResta);
                }
                else if(expresion[j] == '*'){
                    if(pila.size() < 2){
                        throw new Exception("Valores insuficientes para realizar la operacion."); 
                    }
                    Integer operandoB = pila.pop();
                    Integer operandoA = pila.pop();
                    pila.push(operandoA*operandoB);
                    Integer resultadoDeMultiplicacion = operandoA*operandoB; 
                    System.out.println("El resultado de la multiplicacion es " + resultadoDeMultiplicacion);
                    pila.push(resultadoDeMultiplicacion);
                }

            }
            resultadoFinal = pila.pop(); 
            System.out.println("El resultado de la operacion completa es  " + resultadoFinal);


        }
    return resultadoFinal; 
}
}
