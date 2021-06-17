import java.util.Scanner;

public class ExercicioTransporte {

	public static void main(String[] args) {
		// EX 10 – Antes da pandemia, o rodízio na cidade de São Paulo foi motivo de confusão em uma empresa: muitos dos 150 colaboradores estão se atrasando e alegando que o problema foi o horário do rodízio. Cansado disso, um dos diretores da empresa solicitou um programa que receba o NOME de cada um dos funcionários, o SETOR desses profissionais e o meio de transporte usado (CARRO ou ÔNIBUS).
		//Caso o profissional use um CARRO para ir até a empresa, deve ser solicitada a digitação do último dígito numérico da placa do carro e a mensagem exibida deve ser: “Seu dia de rodízio é “ seguida do dia de rodízio.
		//Caso o profissional use um ÔNIBUS para ir até a empresa, deve ser exibida a mensagem “rodízio não se aplica”.
		
		//Final da placa
		//Dia de rodízio
		//1 e 2
		//segunda-feira
		//3 e 4
		//terça-feira
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
            System.out.println("\n\nPor favor, digite o nome do " + (i+1) + "º funcionario");
            nome =  leitor.next();
            System.out.println("Por favor, digite o setor do " + (i+1) + "º funcionario");
            setor =  leitor.next();
            System.out.println("Por favor, digite o meio de transporte do " + (i+1) + "º funcionario. \n 1- CARRO, 2- ÔNIBUS");
            meioTransporte =  leitor.nextInt();
            if (meioTransporte==1) {
                System.out.println("O funcionário " + nome + ", do setor " + setor + ", vem ao trabalho de carro. Informe o último dígito da placa do veículo");
                placa = leitor.nextInt();
                switch(placa) {
                case 1:
                case 2:
                    System.out.println("O rodízio deste veículo é na segunda-feira");
                    break;
                case 3:
                case 4:
                    System.out.println("O rodízio deste veículo é na terça-feira");
                    break;
                case 5:
                case 6:
                    System.out.println("O rodízio deste veículo é na quarta-feira");
                    break;
                case 7:
                case 8:
                    System.out.println("O rodízio deste veículo é na quinta-feira");
                    break;
                case 9:
                case 0:
                    System.out.println("O rodízio deste veículo é na sexta-feira");
                    break;
                default:
                    System.out.println("Não foi digitado apenas o último dígito. Encaminhe o funcionário à supervisão");
                    break;
                }
            }else if(meioTransporte==2) {
                System.out.println("O rodízio não se aplicata para o funcionário, pois ele vem trabalhar de ônibus");
            }else {
                System.out.println("Opção inválida. Encaminhe o funcionário à supervisão");
            }
        }
        leitor.close();
}
}