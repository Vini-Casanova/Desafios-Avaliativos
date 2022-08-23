public class App {
    public static void main(String[] args) throws Exception {
        boolean choice = true;
        Conta conta = new Conta();
        conta.setNumeroConta(Long.parseLong(System.console().readLine("Coloque o numero da sua conta:  ")));
        while(choice == true){
            System.out.println("1- Depositar //  2- Saque // 3-Consultar // 4-Status da conta // 5-Finalizar o programa \n");
            int escolha  = Integer.parseInt(System.console().readLine("Digite aqui: "));
            switch (escolha) {
                case 1:
                    conta.Deposito(Double.parseDouble(System.console().readLine("Valor a ser depositado: ")));
                    break;
                case 2:
                    conta.Saque(Double.parseDouble(System.console().readLine("Valor a ser sacado: ")));
                    break;
                case 3:
                    System.out.println(conta);
                    break;
                case 4:
                    System.out.println(conta.Status());
                    break;
                case 5:
                    choice=false;
                    break;
                default:
                    System.out.println("Operação Invalida");
                    break;
            }
        }
    }
}
