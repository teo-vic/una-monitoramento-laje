import java.util.Scanner;

public class MonitoramentoLaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Definição de limítes técnicos (em kN/m²)
        double cargaProjeto = 15.0;
        double limiteSeguranca = cargaProjeto * 0.8; // 80% da carga máxima

        System.out.println("---Sistema SafeBuild: Monitoramento de Carga ---");
        System.out.print("Digite a leitura atual do sensor (kN/m²): ");
        double cargaAtual = sc.nextDouble();

        //Algoritimo de tomada de decisão
        if(cargaAtual < limiteSeguranca){
            System.out.println("Status: VERDE");
            System.out.println("Decisão: Operação normal. Carga dentro dos parâmetros de segurança.");
        }else if (cargaAtual >= limiteSeguranca && cargaAtual <= cargaProjeto){
            System.out.println("Status: AMARELO (ALERTA)");
            System.out.println("Decisão: Reduzir velocidade de concretagem e evacuar pessoal não presencial");
        }else {
            //caso a carga ultrapasse o limite de projeto
            System.out.println("Status: VERMELHO (crítico)");
            System.out.println("Decisão: INTERROMPER IMEDIATAMENTE: Risco de colapso das escoras");
        } 
         //Verificação adicional de segurança

         if(cargaAtual > (cargaProjeto * 1.2)){
            System.out.println("ALERTA ADICIONAL: Possível falha catastrófica eminente, evacuar área total");
         }

         sc.close();


    }

    
}
