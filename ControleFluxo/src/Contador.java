import java.util.Scanner;
import java.util.Locale;
public class Contador {
    /**
     * @param args
     * @throws ParametrosInvalidosException
     * @throws Exception
     */
    public static void main(String[] args) throws ParametrosInvalidosException  {
        
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite um número");
        int numero1=  scanner.nextInt();
        System.out.println("o numero 1 é " + numero1);
        System.out.println("Digite outro numero");
        int numero2 = scanner.nextInt();
        System.out.println(" o numero 2  é " + numero2);
        scanner.close();

        try{
            int resultado = contar(numero1,numero2);
            for(int indice= 0; indice< resultado; indice++){
                System.out.println("Imprimindo o número" + indice);
            }
        } catch(ParametrosInvalidosException e){
            System.out.println("O segundo número precisa ser maior que o primeiro");
            
        }
       

    

    }
    static int  contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        if(contagem <0){
            throw new ParametrosInvalidosException();
        }
        
        return contagem;
	}
  
}
