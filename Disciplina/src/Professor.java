public class Professor {
  private String nomeProfessor = "Isaac";
  private String departamento = "Tecnologia e Automação de testes";
  private String email = "isaac@cesupa.com.br";

  @Override
  public String toString() {
    return "Professor que ministrará a aula:"+ nomeProfessor +"/ Departamento: "+ departamento +"/ Contato: "+ email;
  }
}
