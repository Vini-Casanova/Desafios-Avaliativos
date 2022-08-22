
import java.util.ArrayList;

public class Agenda {
    public static void main(String[] args) throws Exception {
        ArrayList<Contatos> totalContatos = new ArrayList<>();

        System.out.println("Adicione um contato");



        char condition = '1';
        while (condition != '4') {
            if(condition == '1') {
                String nome = System.console().readLine("Nome do contato: ");
                String sexString = System.console().readLine("Sexo do contato: Feminino = F //  Masculino = M // Outro = O : ");
                char sex = sexString.charAt(0);
                String numero = System.console().readLine("Coloque o numero do contato: ");
                String email = System.console().readLine("Email do contato: ");

                Contatos contato = new Contatos();
                contato.setContato(nome, sex, numero, email);

                totalContatos.add(contato);

                String conditionString = System.console().readLine("O que deseja realizar agora? \n 1-Adicionar contato \n 2-Remover contato \n 3-Ver agenda \n 4-Sair do programa  \n Digite aqui: ");
                condition = conditionString.charAt(0);
            }else if(condition == '2'){
                for (int i = 0; i < totalContatos.size(); i++) {
                    System.out.println();
                    System.out.println("Contato numero"+(i+1));
                    System.out.println(totalContatos.get(i));
                    System.out.println();

                }
                System.out.println("Qual contato deseja remover?");
                totalContatos.remove(Integer.parseInt(System.console().readLine()) - 1);
                String conditionString = System.console().readLine("O que deseja realizar agora? \n 1-Adicionar contato \n 2-Remover contato \n 3-Ver agenda \n 4-Sair do programa \n Digite aqui:");
                condition = conditionString.charAt(0);
                System.out.println();
            }else if(condition ==  '3'){
                for (int i = 0; i < totalContatos.size(); i++) {
                    System.out.println();
                    System.out.println("Contato numero"+(i+1));
                    System.out.println(totalContatos.get(i));
                    System.out.println();

                }
                String conditionString = System.console().readLine("O que deseja realizar agora? \n 1-Adicionar contato \n 2-Remover contato \n 3-Ver agenda \n 4-Sair do programa \n Digite aqui:");
                condition = conditionString.charAt(0);
                System.out.println();
            }else if(condition == '4'){
                System.out.println("Obrigado por usar o programa :)");
            }else{
                System.out.println(" Escolha não disponínel");
                String conditionString = System.console().readLine("O que deseja realizar agora? \n 1-Adicionar contato \n 2-Remover contato \n 3-Ver agenda \n 4-Sair do programa \n Digite aqui:");
                condition = conditionString.charAt(0);
                System.out.println();
            }

        }
    }
}
