import java.util.Scanner;

public class AcmeLtda {

    public static void main(String[] args) throws Exception {
        Scanner EntradaDeDados = new Scanner(System.in);
    
        System.out.print("Por favor, digite seu nome: ");
            String nome = EntradaDeDados.nextLine();

        System.out.println("Digite seu peso atual em KG");
            Float peso = EntradaDeDados.nextFloat();
        
        System.out.println("Digite EM LITROS, a quantidade de água ja ingerida hoje");
            Float AguaIngeridaHoje = EntradaDeDados.nextFloat();
            EntradaDeDados.close();

            double QuantidadeIdeal = Math.ceil(peso * 35 / 1000);
            double FaltaIngerir = Math.ceil(QuantidadeIdeal - AguaIngeridaHoje);

            System.out.println(String.format("%s\nVocê pesa: %.0fKg\nHoje você ja ingeriu: %.0fL de água\nA quantidade ideal de água para você beber por dia é: %.0fL", nome, peso, AguaIngeridaHoje, QuantidadeIdeal));

        if (FaltaIngerir<=0) {
            System.out.println("Parabéns, você atingiu a meta de hidratação diária");
        } else {
            System.out.println(String.format("Continue focado em se hidratar por hoje, ainda faltam: %.0fL! Você consegue!",FaltaIngerir));
        }
        
    }
}

