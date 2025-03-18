//Crie um programa "Nome" que leia o nome completo na linha do comando e imprima-o ao contrário. Por exemplo: a linha de comando java Nome Amanda Cristina deve imprimir:
//Cristina 
//Amanda

public class Nome{
    public static void main(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }
    }
} 
