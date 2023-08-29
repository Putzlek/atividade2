class Teste1{
      private String titular,agencia,abertura="23/08/2023";
      String impressao = " "; //método
       private int numero;
       double saldo,saque; // método
      double deposito,rendimento; //método

     private static int quantidadec;
      
      Teste1(String titular){
        this.titular = titular;
      }
      
      Teste1(){
        Teste1.quantidadec = Teste1.quantidadec +1;
      }


       boolean Saque(double vsacado){
        if(this.saldo<vsacado){
            return false;
            }
        else{
            double saldoatual = this.saldo - vsacado;
            this.saldo = saldoatual;
                return false;
            }
       }


     void deposito(double vdepositado){
        double saldoatual= this.saldo + vdepositado;
        this.saldo = saldoatual;
     }
    void rendimento(){
        double saldoatual= this.saldo * 0.1;
        this.rendimento=saldoatual;
    }
    String impressao(){
        System.out.println("Titular:"+getTitular() + "\n" +"Agencia:"+ getAgencia() + "\n" +"Data de abertura:"+ getAbertura());
        System.out.println( "\n" +"Numero: "+ getNumero() +"\n" +"Saldo: "+ getSaldo() + "\n" + "rendimento: " + rendimento);
            return impressao;
    }
    //getters e os setters:

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo=saldo;
    }

    public String getTitular(){
        return this.titular;
    }

        public String getAgencia(){
        return this.agencia;
    }

    public void setAgencia(String agencia){
        this.agencia=agencia;
    }

            public String getAbertura(){
        return this.abertura;
    }

            public int getNumero(){
        return this.numero;
    }

        public void setNumero(int numero){
        this.numero=numero;
    }

        public static int getquantidadec(){
            return Teste1.quantidadec;
        }
}