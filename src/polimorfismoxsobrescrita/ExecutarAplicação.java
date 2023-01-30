package polimorfismoxsobrescrita;

public class ExecutarAplicação {
    public static void main(String[] args) {
        
        // criação de array com as classes; criou-se um novo objeto para classe o array e o preencheu com as classes existentes
        //caso de polimorfismo e sobrescrita
        ClasseMae[] classes = new ClasseMae[] {new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        //o polimorfismo ocorre quando se tem divergencia entre os objetos.
        for (ClasseMae classe : classes) { //trabalha com o tipo de dado da classemae, mas como ele analisa o ClasseFilha1 e ClasseFilha2, então ele muda o comportamento, ou seja, imprime o método de cada classe
            classe.método1(); 
        }
        System.out.println("");

        for (ClasseMae classe : classes) { //no caso do ClasseFilha1, não vai ter polimorfismo pois não há método2 ali. então ele irá imprimir o método2 da classemãe e vai sobrescrever o método2 da classe mae pelo classefilha2
            classe.método2();
        }
        System.out.println("");

        //caso de sobrescrita pura. chamou o método.
        ClasseFilha2 classefilha2 = new ClasseFilha2();
        classefilha2.método2();
    }
}
