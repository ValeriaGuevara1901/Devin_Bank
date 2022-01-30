package conta;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Conta_Poupanca cp;
		Conta_Investimento ci;
		Conta_corrente cc;
		
			System.out.printf("Menu de opções\n");
			System.out.printf("1._Saque\n");
			System.out.printf("2._Depositar\n");
			System.out.printf("3._Saldo\n");
			System.out.printf("4._Transferir\n");
			System.out.printf("5._Extrato\n");
			System.out.printf("6._Relatorio\n");
			System.out.printf("7._Historico\n");
			System.out.printf("6._Alterar um dado dentro do cadastro\n");
			
			int option = input.nextInt();
	
			switch(option)
			{     
			   case 1:     
				   System.out.printf("Menu de opções\n"); 
				   System.out.printf("Qual tipo de conta você deseja abrir?\n");
				   System.out.printf("1._Conta Corrente\n");
				   System.out.printf("2._Conta Poupança\n");
				   System.out.printf("3._Conta Investimento\n");
				   int optionconta = input.nextInt();
				   
				   if(optionconta == 1) 
				   {
					    cc = new Conta_corrente();
				   }
				   
				   if(optionconta == 2) 
				   {
					   cp = new Conta_Poupanca();
				   }
				   
				   if(optionconta == 3) 
				   {
					    ci = new Conta_Investimento();  
				   }
				   
				   System.out.printf("Conta criada com sucesso\n");
			      break;  //opcional  
			   case 2:     
				   System.out.printf("Menu de opções\n");    
			      break;  //opcional
			   case 3:     
				   System.out.printf("Menu de opções\n");   
				      break;  //opcional
			   case 4:     
				   System.out.printf("Menu de opções\n");  
				      break;  //opcional
			   case 5:     
				   System.out.printf("Menu de opções\n"); 
				      break;  //opcional
			   case 6:     
				   System.out.printf("Menu de opções\n"); 
				      break;  //opcional      
			}
		input.close();
	}

}
