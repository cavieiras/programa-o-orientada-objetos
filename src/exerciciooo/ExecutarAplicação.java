package exerciciooo;
public class ExecutarAplicação {
    public static void main(String[] args) { //linha que tona no código executável
        Carro carro1 = new Carro(); //criação de um novo objeto Carro

        //chamada para conseguir atribuir valores aos atributos da classe Carro
        carro1.setCor("Preto");
        carro1.setModelo("Cherry");
        carro1.setVolumeTaque(50);

        
        //chamada para retornar os valores dos atributos da classe Carro
        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getVolumeTanque());
        System.out.println(carro1.valorTotalTanque(5.56));
        
        //Criação de um novo objeto carro, agora com os parametros definidos (sobrecarga)
        //método mais rápido
        Carro carro2 = new Carro("Vermelho", "Gol", 60);

        //chamada para retornar os valores dos atributos da classe Carro
        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getVolumeTanque());
        System.out.println(carro2.valorTotalTanque(7.25));
    }
}
