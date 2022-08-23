public class App {
    public static void main(String[] args) throws Exception {
        boolean conditions= true;
        while (conditions!=false) {
            try {
                Temperaturas temperaturas = new Temperaturas();
                System.out.println("Escolha a temperatura para entrada do dado");
                System.out.println(" 1-Celcius\n 2-Fahrenheit\n 3-Kelvin\n 4-Reaumur\n 5-Rankine\n 6-Sair do aplicativo");
                int primeiraEscolha = Integer.parseInt(System.console().readLine("Digite aqui qual voce deseja: "));
                Double numeroTemperaturas;
                int segundaEscolha;
                switch (primeiraEscolha) {
                    case 1:
                        numeroTemperaturas = Double.parseDouble(System.console().readLine("Valor da temperatura: "));
                        temperaturas.getTempsOps(primeiraEscolha);
                        segundaEscolha = Integer.parseInt(System.console().readLine("Para qual deseja transformar?"));
                        temperaturas.Celsius(numeroTemperaturas, segundaEscolha);
                        System.out.println();
                        break;
                    case 2:
                        numeroTemperaturas = Double.parseDouble(System.console().readLine("Valor da temperatura: "));
                        temperaturas.getTempsOps(primeiraEscolha);
                        segundaEscolha = Integer.parseInt(System.console().readLine("Para qual deseja transformar?"));
                        temperaturas.Fahrenheit(numeroTemperaturas, segundaEscolha);
                        System.out.println();
                        break;
                    case 3:
                        numeroTemperaturas = Double.parseDouble(System.console().readLine("Valor da temperatura: "));
                        temperaturas.getTempsOps(primeiraEscolha);
                        segundaEscolha = Integer.parseInt(System.console().readLine("Para qual deseja transformar?"));
                        temperaturas.Kelvin(numeroTemperaturas, segundaEscolha);
                        System.out.println();
                        break;
                    case 4:
                        numeroTemperaturas = Double.parseDouble(System.console().readLine("Valor da temperatura: "));
                        temperaturas.getTempsOps(primeiraEscolha);
                        segundaEscolha = Integer.parseInt(System.console().readLine("Para qual deseja transformar?"));
                        temperaturas.Reaumur(numeroTemperaturas, segundaEscolha);
                        System.out.println();
                        break;
                    case 5:
                        numeroTemperaturas = Double.parseDouble(System.console().readLine("Valor da temperatura: "));
                        temperaturas.getTempsOps(primeiraEscolha);
                        segundaEscolha = Integer.parseInt(System.console().readLine("Para qual deseja transformar?"));
                        temperaturas.Rankine(numeroTemperaturas, segundaEscolha);
                        System.out.println();
                        break;
                    case 6:
                        System.out.println("Obrigado por usar o programa");
                        conditions = false;
                        break;
                    default:
                        System.out.println("Operação Inválida");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Operação Inválida");
            }
        }
    }
}
