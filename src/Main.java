public class Main {
    public static void main(String[] args) {

        // Informações do Will
        String nome = "Will";
        int idade = 21;
        double altura = 1.90;
        boolean estudante = true;

        //Informações do Max
        String nome2 = "Max";
        int idade2 = 27;
        double altura2 = 1.96;
        boolean estudante2 = true;

        // Somas das variaveis
        int somaIdade = idade + idade2;
        double multAltura = altura * 2;


        // Exibição dos resultados
        System.out.println("Oi, sua idade é: " + idade);
        System.out.println("E altura?: " + altura);
        System.out.println("Nome: " + nome);
        System.out.println("É estudante?" + estudante);
        System.out.println("Soma das idades: " + somaIdade);
        System.out.println("Altura somada: " + multAltura);

    }
}
