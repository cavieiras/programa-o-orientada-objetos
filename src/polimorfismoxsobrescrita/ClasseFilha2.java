package polimorfismoxsobrescrita;

class ClasseFilha2 extends ClasseMae{

    @Override
    void método1 (){
        System.out.println("Método1 da ClasseFilha2");
    }

    @Override //sempre precisa ser chamado para que execute o processo requerido
    void método2 (){
        System.out.println("Método2 da ClasseFilha2");
    }
}
