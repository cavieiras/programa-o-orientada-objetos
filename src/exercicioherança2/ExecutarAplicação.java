package exercicioherança2;

public class ExecutarAplicação {
    public static void main(String[] args) {
        
        //
        Funcionário funcionário = new Funcionário(); //criou-se o objeto funcionário e o armazenou na variável funcionário;

        //Aqui ocorreram upcasts
        //todas as variáveis são do tipo funcionário e para cada variável foi criado um novo objeto gerente/vendedor/faxineiro;
        //o upcast é IMPLÍCITO;
        Funcionário gerente = new Gerente();
        Funcionário vendedor = new Vendedor();
        Funcionário faxineiro = new Faxineiro();

        //o bloco acima não apresenta erro de compilação porque existem métodos e atributos iguais
        //presentes em ambas as classes e por isso é possível fazer a transferencia.
        //o que não foi igual, permanecerá exclusivo da classe mãe.

        //Aqui ocorreram downcasts
        //todas as variáveis são de tipo diferentes, mas em todas elas tem o mesmo tipo de objeto (Funcionário)
        //o downcast é EXPLÍCITO; é preciso deixar claro que eu quero transformar a classe mae (Funcionário) em um objeto da classe filha (subclasse)
        Vendedor vendedor2 = (Vendedor) new Funcionário();
    // (classe)   (atributo)   (objeto)    (novo objeto)

        Gerente gerente2 = (Gerente) new Funcionário();
        Faxineiro funcionário2 = (Faxineiro) new Funcionário();

        //o bloco acima apresenta erro () quando o código é compilado.
        //a subclasse pode conter dados que não existem na classe principal 
        //e por isso os erros de compilação, já que não é possível transferir esses dados para a classe principal
    }
}

