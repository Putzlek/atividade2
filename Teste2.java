class Teste2{
    public static void main(String[] args){
            Teste1 conta;
                conta = new Teste1 ();
                conta.setAgencia ("Kason Bank");
                conta.setNumero (123);
                conta.deposito (100);
                conta.Saque (50);
                conta.rendimento();
               // conta.impressao();
                System.out.println(conta.impressao() + conta.getquantidadec());
            Teste1 conta2;
            conta2 = new Teste1 ();
               // conta.agencia = "Kason Bank2";
             //  System.out.println(conta2.quantidadec);
        
        boolean contaigual;
            if(conta == conta2){
                System.out.println("São iguais.");
            }
            else{
                System.out.println("Não são iguais.");
            }
         System.out.println(conta2.getquantidadec());
            
    }
}