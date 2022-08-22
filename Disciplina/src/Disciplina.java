import java.util.ArrayList;

public class Disciplina {
  private String nomeDisciplina = "Programacao Orientada a Objetos";
  private String horario = "7:10";
  private String sala = "Sala 11";
  private Professor professor = new Professor();
  ArrayList<Alunos> listAlunos = new ArrayList<Alunos>();
  

 Disciplina(){
  listAlunos.add(new Alunos("Vinicius", "11110011"));
  listAlunos.add(new Alunos("Ryan", "21210022"));
  listAlunos.add(new Alunos("Alex", "31310033"));
  listAlunos.add(new Alunos("James", "41410044"));
  listAlunos.add(new Alunos("William", "51510055"));
  listAlunos.add(new Alunos("Eduardo", "61610066"));

  System.out.println("Nome da disciplina:"+nomeDisciplina+"/ Horário da disciplina: "+ horario+"/ Sala: "+sala+"\n"); 
  System.out.println(professor+"\n");

  for (int i = 0; i < listAlunos.size(); i++) {
    System.out.println(listAlunos.get(i));
  }

  System.out.println("\n Diga as notas dos alunos e saiba o resultado da média e se passaram ou não");

  for (int i = 0; i < listAlunos.size(); i++) {
    Double[] notas = new Double[4];
    System.out.println(listAlunos.get(i));
    for (int j = 0; j < 4; j++) {
      notas[j] = Double.parseDouble(System.console().readLine("Nota da " + (j+1)+" avaliação: "));
    }
    listAlunos.get(i).setNota(notas);
    System.out.println();
  }

  for (int i = 0; i < listAlunos.size(); i++) {
    System.out.println(listAlunos.get(i)+"\n");
  }
 }
}
