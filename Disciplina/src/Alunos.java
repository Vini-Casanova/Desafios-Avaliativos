public class Alunos {
  private String nome;
  private String matricula;
  private Double[] nota = {0.0,0.0,0.0,0.0};
  private String resultado;
  private int chamada;
  private double media;

  public Alunos(String nome, String matricula) {
    this.nome = nome;
    this.matricula = matricula;
  }

  public void setNota(Double[] nota) {
    this.nota = nota;
  }

  

  @Override
  public String toString() {
    if(chamada ==2){
      for (int i = 0; i < 4; i++) {
        media += nota[i];
      }
      if(media/4 >= 7){
        resultado  = "Aprovado";
      }else{
        resultado = "Reprovado";
      }
      return "Aluno: " + nome + ", matricula: " + matricula + ", nota: " + nota[0] +","+ nota[1] +","+ nota[2] +","+ nota[3] +","+", média: " + (media/4) + ", resultado: " + resultado;
    }
    else{
      chamada +=1;
      return "Aluno: " + nome + ", matricula: " + matricula;
    }

  }

}
