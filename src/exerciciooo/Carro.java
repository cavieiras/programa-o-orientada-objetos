package exerciciooo;
public class Carro {
    String cor;
    String modelo;
    int volumeTanque;
    /**
     * Este pedaço de código a seguir mostra o 
     * construtor da classe Carro
     */
    Carro (){
        
    }

    //esse pedaço de código é a sobrecarga do construtor
    Carro (String cor,String modelo, int volumeTanque){
        this.cor = cor; //o this está mais relacionado com o objeto. forma de diferenciação. tira a ambiguidade
        this.modelo = modelo;
        this.volumeTanque = volumeTanque;
    }

    /**
     * Caracteristicas que precisam ser a
     * passadas com o comando setNome(tipo parâmetro)
     * e "recolhidas" com getNome(tipo parametro)
     */
    void setCor(String cor){
        this.cor = cor; //esta linha coloca o valor no atributo
    }

    String getCor(){ //retorna o valor que foi atribuído ao atributo selecionado
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setVolumeTaque(int volumeTanque){
        this.volumeTanque = volumeTanque;
    }

    int getVolumeTanque (){
        return volumeTanque;
    }

    /**
    * Método para o cálculo do gasto total para
    * encher o tanque de gasolina
    */
    double valorTotalTanque(double valorCombustível) {
        return volumeTanque*valorCombustível;
    }

    
}

