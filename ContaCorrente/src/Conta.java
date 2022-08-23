
public class Conta {
  private long numeroConta = 0;
  private double saldo = 0.0;
  private double limite = -1000.0;


  public void setNumeroConta(long numeroConta) {
    this.numeroConta = numeroConta;
  }

  public void Deposito(double valor){
    saldo +=  valor;
    System.out.println(saldo+" R$");
  }

  public void Saque(double valor){

    if(saldo - valor <= limite){
      System.out.println("Operação indisponivel, voce chegou no limite da sua conta");
    } else if((saldo - valor) <= 0.0){
      System.out.println("Voce está no Cheque Especial,valor: "+saldo+"R$");
      saldo -= valor;
    }else if(saldo - valor >= 0.0){
      saldo -= valor;
      System.out.println("Saque realizado com sucesso/ Valor restante na conta: "+saldo+"R$");
    }


  }

  public String Status(){
    if(saldo >= 0.0){
      return "Sua conta: "+numeroConta +" está com saldo positivo, total:"+saldo+"R$";
    }else{
      return "Sua conta: "+numeroConta +" está com saldo negativo, utilizando o cheque especial, valor: "+saldo+"R$";
    }
  }

  @Override
  public String toString() {
    if (saldo <= 0.0) {
      return "Numero da conta: "+numeroConta+" / "+saldo+"R$"+" Limite da conta:"+limite+"R$"+" // Sua conta está no cheque espcecial";
    }else{
      return "Numero da conta: "+numeroConta+" / "+saldo+"R$"+" Limite da conta:"+limite+"R$"+" // Sua conta está com saldo positivo";
    }
  }


  
}
