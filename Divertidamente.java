import java.util.Scanner;

public class Divertidamente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pontosAlegria = 0;
        int pontosTristeza = 0;

        // 1. Amizades na nova cidade
        System.out.print("A Riley fez novas amizades na cidade? (s/n): ");
        char fezAmizades = scanner.next().toLowerCase().charAt(0);

        if (fezAmizades == 's') {
            System.out.print("Quantas amizades ela fez? ");
            int qtdAmizades = scanner.nextInt();
            pontosAlegria += qtdAmizades * 10;
        } else {
            pontosTristeza += 30;
        }

        // 2. Provas na universidade (A1, A2, A3)
        System.out.print("\nDigite a nota da A1 (0 a 10): ");
        double a1 = scanner.nextDouble();

        System.out.print("Digite a nota da A2 (0 a 10): ");
        double a2 = scanner.nextDouble();

        System.out.print("Digite a nota da A3 (0 a 10): ");
        double a3 = scanner.nextDouble();

        double media = (a1 + a2 + a3) / 3.0;

        if (media >= 7.0) {
            pontosAlegria += 50;
        } else {
            pontosTristeza += 50;
        }

        // 3. Algoritmos de programação
        System.out.print("\nQuantos dos 10 exercícios de programação a Riley conseguiu fazer? ");
        int exerciciosFeitos = scanner.nextInt();

        // Validação simples para não passar de 10 ou ser negativo
        if (exerciciosFeitos < 0) exerciciosFeitos = 0;
        if (exerciciosFeitos > 10) exerciciosFeitos = 10;

        int exerciciosNaoFeitos = 10 - exerciciosFeitos;

        pontosAlegria += exerciciosFeitos * 10;
        pontosTristeza += exerciciosNaoFeitos * 10;

        // 4. Comparação final de pontuação
        System.out.println("\n--- Pontuação Final ---");
        System.out.println("Alegria: " + pontosAlegria + " pontos");
        System.out.println("Tristeza: " + pontosTristeza + " pontos\n");

        if (pontosAlegria > pontosTristeza) {
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
        } else {
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        }

        scanner.close();
    }
}
