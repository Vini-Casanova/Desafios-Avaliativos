import java.util.ArrayList;
import java.util.List;
 class Temperaturas {
  private double celsius;
  private double fahrenheit;
  private double kelvin;
  private double reaumur;
  private double rankine;
  private List<String> tempsOps = new ArrayList<String>(5);

  Temperaturas(){
    tempsOps.add("Celcius");
    tempsOps.add("Fahrenheit");
    tempsOps.add("Kelvin");
    tempsOps.add("Reaumur");
    tempsOps.add("Rankine");
  }

  public void getTempsOps(int primeiraEscolha) {
    tempsOps.remove(primeiraEscolha-1);
    for (int i = 0; i < tempsOps.size(); i++) {
      System.out.println((i+1)+"-"+tempsOps.get(i));
    }
  }

  public void Celsius(double temperatura, int escolha){
    this.celsius = temperatura;
    switch (escolha) {
      case 1:
        System.out.println("Igual a "+((9 * celsius/5) + 32)+" Fahrenheit"); 
        break;
      case 2:
        System.out.println("Igual a "+(celsius + 273.15)+" Kelvin");
        break;
      case 3:
        System.out.println("Igual a "+(celsius * 0.8)+" Reáumur");
        break;
      case 4:
        System.out.println("Igual a "+((celsius + 273.15)*(9/5))+" Rankine");
        break;
    }
  }

  public void Fahrenheit(double temperatura, int escolha){
    this.fahrenheit = temperatura;
    switch (escolha) {
      case 1:
        System.out.println("Igual a "+((fahrenheit-32)/1.8)+" Celsius");
        break;
      case 2:
        System.out.println("Igual a "+(((fahrenheit-32)*1.8)+273.15)+" Kelvin");
        break;
      case 3:
        System.out.println("Igual a "+((fahrenheit*2.25)+32)+" Reáumur");
        break;
      case 4:
        System.out.println("Igual a "+(fahrenheit + 459.67)+" Rankine");
        break;
    }
  }

  public void Kelvin(double temperatura, int escolha){
    this.kelvin = temperatura;
    switch (escolha) {
      case 1:
        System.out.println("Igual a "+(kelvin - 273.15)+" Celsius");
        break;
      case 2:
        System.out.println("Igual a "+(( kelvin - 273.15) * (9/5) + 32)+" Fahrenheit");
        break;
      case 3:
        System.out.println("Igual a "+((kelvin-273.15)*0.8)+" Reáumur");
        break;
      case 4:
        System.out.println("Igual a "+(kelvin * 1.8)+" Rankine");
        break;
    }
  }

  public void Rankine(double temperatura, int escolha){
    this.rankine = temperatura;
    switch (escolha) {
      case 1:
        System.out.println("Igual a "+((rankine - 491.67) * (5/9))+" Celsius");
        break;
      case 2:
        System.out.println("Igual a "+(rankine- 459.67)+" Fahrenheit");
        break;
      case 3:
        System.out.println("Igual a "+(rankine /  1.8)+" Kelvin");
        break;
      case 4:
        System.out.println("Igual a "+((rankine/2.25)-491.67)+" Reáumur");
        break;
    }
  }

  public void Reaumur(double temperatura, int escolha){
    this.reaumur = temperatura;
    switch (escolha) {
      case 1:
        System.out.println("Igual a "+(reaumur / 1.8)+" Celsius");
        break;
      case 2:
        System.out.println("Igual a "+((reaumur/2.25)-32)+" Fahrenheit");
        break;
      case 3:
        System.out.println("Igual a "+((reaumur+273.15)/0.8)+" Kelvin");
        break;
      case 4:
        System.out.println("Igual a "+((rankine*2.25)+491.67)+" Rankine");
        break;
    }
  }
}