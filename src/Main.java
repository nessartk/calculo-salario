import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] salarios = new double[5];
        for (int i = 0; i < salarios.length; i++) {
            System.out.println("Informe o salário do funcionário: ");
            salarios[i] = Double.parseDouble(entrada.nextLine());
        }
        for (int i = 0; i < salarios.length; i++) {
            double inss;
            double irpf;
            if (salarios[i] <= 1212) {
                inss = salarios[i] * 0.075;
            } else if (salarios[i] <= 2427.35) {
                inss = salarios[i] * 0.09;
            } else if (salarios[i] <= 3641.03) {
                inss = salarios[i] * 0.12;
            } else if (salarios[i] <= 7087.22) {
                inss = salarios[i] * 0.14;
            } else {
                inss = salarios[i] * 0.14;
            }
            if (salarios[i] <= 1903.98) {
                irpf = 0;
            } else if (salarios[i] <= 2826.65) {
                irpf = salarios[i] * 0.075;
            } else if (salarios[i] <= 3751.05) {
                irpf = salarios[i] * 0.15;
            } else if (salarios[i] <= 4664.68) {
                irpf = salarios[i] * 0.225;
            } else {
                irpf = salarios[i] * 0.275;
            }
            double salarioLiquido = salarios[i] - inss - irpf;
            System.out.println("Funcionário " + (i+1));
            System.out.println("Salário Bruto: " + salarios[i]);
            System.out.printf("Salário Líquido: %.2f %n" , salarioLiquido);
            System.out.printf("INSS : %.2f %n"  , inss);
            System.out.printf("IRPF: %.2f %n " , irpf);
            System.out.println("--------------");
        }

    }
}

