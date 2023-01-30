package polimorfismoxsobrescrita;

class ClasseFilha1 extends ClasseMae{
   @Override //comando para sobrescrever o método escolhido
   void método1() {
    System.out.println("Método1 da ClasseFilha1");
   } 
}
