import java.util.Scanner;

public class ExemploEntradaDados {

    //Criar um programa para ler e calcular a media da FIAP
    public static void main(String [] args) {
        //Criar o objeto para ler o teclado
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String aluno = leitor.next();

        System.out.println("Digite a nota da cp 1");
        double cp1 = leitor.nextDouble();

        System.out.println("Digite a nota da cp 2");
        double cp2 = leitor.nextDouble();

        System.out.println("Digite a nota do 1° Challenge");
        double challenge1 = leitor.nextDouble();

        System.out.println("Digite a nota do 2° Challenge");
        double challenge2 = leitor.nextDouble();

        System.out.println("Digite a nota do GS");
        double GS = leitor.nextDouble();

        //Calcular média
        double mediacp = ((cp1+cp2)/2)*0.2;
        double mediachallenge = ((challenge1+challenge2)/2)*0.2;
        double gs = (GS)*0.6;
        double media = (mediachallenge+mediacp+gs);
        System.out.println(aluno + media);

    }

}
