public class ExemploCarro {

        public static void main(String[] args) {

            Carro churros = new Carro();
            churros.cor = "prata";
            churros.velocidadeMaxima = 190;
            churros.ano = 2010;
            churros.altura = 160;
            churros.peso = 1.000;
            churros.modelo = "Strada";
            churros.automatico = false; // true or false.

            //Exibir os valores dos atributos do objeto
            System.out.println("Modelo: " + churros.modelo); //sout
            System.out.println("Cor: " + churros.cor);
            System.out.println("Velocidade Maxima" + churros.velocidadeMaxima);
            System.out.println("Ano " + churros.ano);
            System.out.println("automatico " + churros.automatico);
            System.out.println("Peso " + churros.peso);
            System.out.println("Altura " + churros.altura);

            System.out.println(("-------------------------------------------------"));

            //Criar um novo objeto do tipo carro
            Carro tera = new Carro();
            //Colocar valores para 2 atributos e exibir esses valores
            tera.modelo = "Tera Confortline 1.0 TSI";
            tera.altura = 160;
            tera.peso = 1.000;
            tera.automatico = false;
            tera.cor = "Branco";
            tera.ano = 2026;
            tera.velocidadeMaxima = 220;

            System.out.println("Modelo: " + tera.modelo); //sout
            System.out.println("Cor: " + tera.cor);
            System.out.println("Velocidade Maxima" + tera.velocidadeMaxima);
            System.out.println("Ano " + tera.ano);
            System.out.println("automatico " + tera.automatico);
            System.out.println("Peso " + tera.peso);
            System.out.println("Altura " + tera.altura);






        }

}
