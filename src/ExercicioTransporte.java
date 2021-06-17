import java.util.Scanner;

public class ExercicioTransporte {

	public static void main(String[] args) {
		// EX 10 � Antes da pandemia, o rod�zio na cidade de S�o Paulo foi motivo de confus�o em uma empresa: muitos dos 150 colaboradores est�o se atrasando e alegando que o problema foi o hor�rio do rod�zio. Cansado disso, um dos diretores da empresa solicitou um programa que receba o NOME de cada um dos funcion�rios, o SETOR desses profissionais e o meio de transporte usado (CARRO ou �NIBUS).
		//Caso o profissional use um CARRO para ir at� a empresa, deve ser solicitada a digita��o do �ltimo d�gito num�rico da placa do carro e a mensagem exibida deve ser: �Seu dia de rod�zio � � seguida do dia de rod�zio.
		//Caso o profissional use um �NIBUS para ir at� a empresa, deve ser exibida a mensagem �rod�zio n�o se aplica�.
		
		//Final da placa
		//Dia de rod�zio
		//1 e 2
		//segunda-feira
		//3 e 4
		//ter�a-feira
		//5 e 6
		//quarta-feira
		//7 e 8
		//quinta-feira
		//9 e 0
		//sexta-feira

		Scanner leitor = new Scanner(System.in);
        String nome, setor;
        int meioTransporte, placa, qtde;
        System.out.println("Informe quantos colaboradores existem na empresa");
        qtde = leitor.nextInt();
        for(int i=0;i<qtde;i++) {
            System.out.println("\n\nPor favor, digite o nome do " + (i+1) + "� funcionario");
            nome =  leitor.next();
            System.out.println("Por favor, digite o setor do " + (i+1) + "� funcionario");
            setor =  leitor.next();
            System.out.println("Por favor, digite o meio de transporte do " + (i+1) + "� funcionario. \n 1- CARRO, 2- �NIBUS");
            meioTransporte =  leitor.nextInt();
            if (meioTransporte==1) {
                System.out.println("O funcion�rio " + nome + ", do setor " + setor + ", vem ao trabalho de carro. Informe o �ltimo d�gito da placa do ve�culo");
                placa = leitor.nextInt();
                switch(placa) {
                case 1:
                case 2:
                    System.out.println("O rod�zio deste ve�culo � na segunda-feira");
                    break;
                case 3:
                case 4:
                    System.out.println("O rod�zio deste ve�culo � na ter�a-feira");
                    break;
                case 5:
                case 6:
                    System.out.println("O rod�zio deste ve�culo � na quarta-feira");
                    break;
                case 7:
                case 8:
                    System.out.println("O rod�zio deste ve�culo � na quinta-feira");
                    break;
                case 9:
                case 0:
                    System.out.println("O rod�zio deste ve�culo � na sexta-feira");
                    break;
                default:
                    System.out.println("N�o foi digitado apenas o �ltimo d�gito. Encaminhe o funcion�rio � supervis�o");
                    break;
                }
            }else if(meioTransporte==2) {
                System.out.println("O rod�zio n�o se aplicata para o funcion�rio, pois ele vem trabalhar de �nibus");
            }else {
                System.out.println("Op��o inv�lida. Encaminhe o funcion�rio � supervis�o");
            }
        }
        leitor.close();
}
}