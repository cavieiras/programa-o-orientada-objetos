package exerciointerface;

public class Calculadora implements OperaçõesMatematicas { //a calculadora implementa a interface de operações matemáticas
   
    //essas variáveis são opcionais. coloquei porque fica mais organizado. 
    double número1;
    double número2;
    double resultado;

    @Override //precisa estar antes de cada método para que seja possível mostrar o resultado obtido da operação
    public void soma( double número1, double número2) { //o método precisa ser o mesmo da interface para que ocorra a sobrescrita
        resultado = número1 + número2;
    System.out.println("Som: " + resultado);
    }

    @Override
    public void subtração (double número1, double número2){
        resultado = número1 - número2;
        System.out.println("Subtração: " + resultado);
    
    }

    @Override
    public void multiplicação (double número1, double número2) {
        resultado = número1 * número2;
        System.out.println("Multiplicação: " + resultado);
    
    }

    @Override
    public void divisão (double número1, double número2) {
        resultado = número1 / número2;
        System.out.println("Divisão: " + resultado);
    
    }
}
