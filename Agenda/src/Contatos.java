public class Contatos {

  private String nome;
  private char sex;
  private String numero;
  private String email;

  public void setContato(String nome, char sex, String numero, String email) {
    this.nome = nome;
    this.sex = sex;
    this.numero = numero;
    this.email = email;

  }
  @Override
  public String toString() {
    return "Dados do contato: \n" +
    "Nome: "+ nome+" / "+ "Sexo:" +sex+" / "+"Numero: "+numero+"/ "+"Email: "+email;
  }
}
