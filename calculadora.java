// Implemente um programa que receba um linha de comando com 3 argumentos. O primeiro e o segundo argumento são números reais e o terceiro argumento é uma operação. 
//Exemplo: 3 7 + = 10.0

public class Calculadora {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Uso: java Calculadora <num1> <num2> <operação>");
            return;
        }
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        String operacao = args[2];

        double resultado = 0;
        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero!");
                    return;
                }
                break;
            case "X":
                resultado = num1 * num2;
                break;
            default:
                System.out.println("Operação inválida! Use +, -, / ou X.");
                return;
        }
        System.out.println(resultado);
    }
}
