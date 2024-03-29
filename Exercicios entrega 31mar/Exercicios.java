import java.util.Scanner;

public class Exercicios{
    public static void main(String[] args) {
        // exercicioUm();
        // exercicioDois();
        // exercicioTres();
        // exercicioQuatro();
        // exercicioCinco();
        // exercicioSeis();
        // exercicioSeisMelhorado();
        // exercicioSete();
        exercicioOito();
        
    }

    //imprimir a soma do quadrado de 3 valores:
    public static void exercicioUm(){ 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor:\n");
        int valorUm = scanner.nextInt();
        System.out.print("Digite o segundo valor:\n");
        int valorDois = scanner.nextInt();
        System.out.print("Digite o terceiro valor:\n");
        int valorTres = scanner.nextInt();
        scanner.close();

        double somaDosQuadrados = Math.pow(valorUm, 2) + Math.pow(valorDois, 2) + Math.pow(valorTres, 2);
        System.out.print("A soma dos quadrados é: " + Math.round(somaDosQuadrados));
    }

    //imprimir a soma do sucessor do triplo com o antecessor do dobro
    public static void exercicioDois(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor:\n");
        int valor = scanner.nextInt();
        scanner.close();

        int resultado = (valor * 3 + 1) + (valor * 2 - 1);
        System.out.print("A soma do sucessor do triplo com o antecessor do dobro é: " + resultado);
    }

    //imprimir o valor recebido por um trabalhador
    // valores: R$30,00 por dia. Remover 8% do desconto salarial
    public static void exercicioTres(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de dias trabalhados no mês:\n");
        int qntdDias = scanner.nextInt();
        scanner.close();

        if(qntdDias < 31){
            double resultado = ((30.00 * qntdDias)/100) * 92;
            System.out.print("O valor recebido será de: R$" + String.format("%.2f", resultado).replace(".", ","));
        } else {
            System.out.print("Quantidade de dias inválida.");
        }
    }

    // Faça um programa que leia quanto cada apostador investiu, o valor do premio, e imprima quanto cada um ganharia do premio com base no valor investido.
    public static void exercicioQuatro(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor investido pelo primeiro jogador:\n");
        double valorUm = scanner.nextDouble();
        System.out.print("Digite o valor investido pelo segundo jogador:\n");
        double valorDois = scanner.nextDouble();
        System.out.print("Digite o valor investido pelo terceiro jogador:\n");
        double valorTres = scanner.nextDouble();
        System.out.print("Digite o valor do prêmio:\n");
        double valorPremio = scanner.nextDouble();
        scanner.close();

        double totalInvestido = valorUm + valorDois + valorTres;
        double porcentagemUm = valorUm / totalInvestido;
        double porcentagemDois = valorDois / totalInvestido;
        double porcentagemTres = valorTres / totalInvestido;

        double premioUm = porcentagemUm * valorPremio;
        double premioDois = porcentagemDois * valorPremio;
        double premioTres = porcentagemTres * valorPremio;

        System.out.print(
            "O primeiro jogador recebe: R$" +  String.format("%.2f", premioUm).replace(".", ",") +
            "\nO segundo jogador recebe: R$" +  String.format("%.2f", premioDois).replace(".", ",") +
            "\nO terceiro jogador recebe: R$" +  String.format("%.2f", premioTres).replace(".", ",")
        );
    }

    public static void exercicioCinco(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota do trabalho de laboratório:\n");
        double notaLab = scanner.nextDouble();
        System.out.print("Digite a nota da avaliação semestral:\n");
        double avalSem = scanner.nextDouble();
        System.out.print("Digite a nota do exame final:\n");
        double exameFinal = scanner.nextDouble();
        scanner.close();

        double media = (notaLab*2 + avalSem*3 + exameFinal*5) / 10;
        
        String status;
        if(media < 3){
            status = "reprovado";
        } else if (media >= 3 && media < 5){
            status = "em recuperação";
        } else {
            status = "aprovado";
        };

        System.out.print("A média final é de: " + media + "\n O aluno está " + status);
    }

    //Usando switch, escreva um programa que leia um inteiro entre 1 e 12 e imprima o mes
    public static void exercicioSeis(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Descubra qual mês é correspondente ao número escolhido de 1 a 12:\n");
        int numero = scanner.nextInt();
        scanner.close();

        String mes;
        switch (numero) {
            case 1:
                mes = "janeiro";
                break;
            case 2: 
                mes = "fevereiro";
                break;
            case 3:
                mes = "março";
                break;
            case 4:
                mes = "abril";
                break;
            case 5:
                mes = "maio";
                break;
            case 6:
                mes = "junho";
                break;
            case 7:
                mes = "julho";
                break;
            case 8:
                mes = "agosto";
                break;
            case 9:
                mes = "setembro";
                break;
            case 10:
                mes = "outubro";
                break;
            case 11:
                mes = "novembro";
                break;
            case 12:
                mes = "dezembro";
                break;
            default:
                mes = "inválido";
                System.out.print("Número invalido, tente novamente:");
        }

        if(mes != "inválido"){
            System.out.print("O número escolhido foi o " + "'" + numero + "' que corresponde ao mês de " + mes + ".");
        }
    }

    public static void exercicioSeisMelhorado(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Descubra qual mês é correspondente ao número escolhido de 1 a 12:\n");
        int numero = scanner.nextInt();
        scanner.close();

        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        
        if(numero>0 && numero < 12){
            System.out.print("O número escolhido foi o " + "'" + numero + "', que corresponde ao mês de " + meses[numero - 1] + ".");
        } else {
            System.out.print("Número invalido, tente novamente:");
        }
    }

    //Escreva o menu de opcoes abaixo. Leia a opcão do usuario e execute a operacão ao escolhida. Escreva uma mensagem de erro se a opcçao for invalida.
    public static void exercicioSete(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("CACULADORA\nDigite o número operaçao desejada:\n1- Soma de 2 números.\n2- Diferença entre 2 números (maior pelo menor)\n3- Produto entre 2 números.\n4- Divisao entre 2 números (o denominador nao pode ser zero).\nOPÇAO:");
        int opc = scanner.nextInt();
        if(opc > 4){
            scanner.close();
            System.out.print("Opçao inválida, tente novamente.");
            return;
        }
        System.out.print("Digite o primeiro valor:");
        double valor1 = scanner.nextDouble();
        System.out.print("Digite o segundo valor:");
        double valor2 = scanner.nextDouble();
        scanner.close();

        double result = 0;
        if(opc == 1){
            result = valor1 + valor2;
        } else if (opc == 2){
            double valorMenor, valorMaior;
            valorMaior = (valor1 >= valor2 ? valor1 : valor2);
            valorMenor = (valor1 >= valor2 ? valor2 : valor1);
            result = valorMaior - valorMenor;
        } else if (opc == 3){
            result = valor1 * valor2;
        } else if (opc == 4 && valor2 != 0){
            result = valor1 / valor2;
        } else if (opc == 4 && valor2 == 0){
            System.out.print("O denominador deve ser diferente de zero.");
            return;
        }

        System.out.print("O resultado da operaçao é: " +  result);
    }

    //calcule o consumo em Km/l
    public static void exercicioOito(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de km rodados:");
        int km = scanner.nextInt();
        System.out.print("Digite a quantidade de gasolina consumida:");
        double l = scanner.nextDouble();
        scanner.close();

        double consumo = km/l;
        String mensagem;

        if(consumo < 8){
            mensagem = "Venda o carro!";
        } else if(consumo >= 8 && consumo <= 12){
            mensagem = "Econômico!";
        } else {
            mensagem = "Super econômico!";
        }

        System.out.print(mensagem);
    }
}