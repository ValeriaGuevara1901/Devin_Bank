
package conta;

import java.util.Scanner;

public class Conta 
{
	Scanner Leitor = new Scanner(System.in);
	//Atributos que todas as contas terão
	private String Nome;
	private int  CPF;
	private float Renda_Mensal;
	private String Tipo_de_Conta;
	private int  Agencia;
	private float Saldo;
	private int ChequeEspecial;
	private float Rend_Pou;
	private float Rend_Inv;
	private int Tem_inv_and_pou;
	
	public String getNome() 
	{
		return Nome;
	}

	public void setNome(String nome) 
	{
		Nome = nome;
	}

	public int getCPF() 
	{
		return CPF;
	}

	public void setCPF(int cPF) 
	{
		CPF = cPF;
	}

	public double getRenda_Mensal() 
	{
		return Renda_Mensal;
	}

	public void setRenda_Mensal(float renda_Mensal) 
	{
		Renda_Mensal = renda_Mensal;
	}

	public String getTipo_de_Conta() 
	{
		return Tipo_de_Conta;
	}

	public void setTipo_de_Conta(String tipo_de_Conta) 
	{
		Tipo_de_Conta = tipo_de_Conta;
	}

	public int getAgencia() 
	{
		return Agencia;
	}

	public void setAgencia(int agencia)
	{
		Agencia = agencia;
	}

	public double getSaldo()
	{
		return Saldo;
	}

	public void setSaldo(float saldo) 
	{
		Saldo = saldo;
	}

	
	public int getChequeEspecial() 
	{
		return ChequeEspecial;
	}

	public void setChequeEspecial(int chequeEspecial) 
	{
		ChequeEspecial = chequeEspecial;
	}

	public float getRend_Pou() 
	{
		return Rend_Pou;
	}

	public void setRend_Pou(float rend_Pou) 
	{
		Rend_Pou = rend_Pou;
	}

	public float getRend_Inv() 
	{
		return Rend_Inv;
	}

	public void setRend_Inv(float rend_Inv) 
	{
		Rend_Inv = rend_Inv;
	}
	
	public int getTem_inv_and_pou() 
	{
		return Tem_inv_and_pou;
	}

	public void setTem_inv_and_pou(int tem_inv_and_pou) 
	{
		Tem_inv_and_pou = tem_inv_and_pou;
	}
	//delegar responsabilidades as funçoes


	public String Saque (float valor)
	{
		if(valor<Saldo) 
		{
			Saldo = (Saldo - valor);
			return"Saque realizado com sucesso";
		}
		else
		{
			return"Saldo Insuficiente!";
		}
	}
	
	public float Depositar (float valor)
	{
		Saldo = Saldo + valor;
		System.out.printf("O valor atual de sua conta é: ");
		return Saldo;
	}
	
	public float Saldo (float valor)
	{
		System.out.printf("O valor atual de seu saldo na sua conta é: ");
		return Saldo;
	}
	
	public void  Extrato (String Nome, String Tipo_de_Conta, Float Saldo)
	{
	     this.Nome = Nome;
	     this.Tipo_de_Conta = Tipo_de_Conta;
	     this.Saldo = Saldo;
	     System.out.printf(this.Nome + this.Tipo_de_Conta + this.Saldo);
	}
	
	public void Transferencia (String Nome, String Tipo_de_Conta, float valor) 
	{
		if (Saldo < valor) 
		{
			System.out.println("Saldo insuficiente para a operação");
		} 
		else
		{
			Saldo = Saldo - valor;
			System.out.println("Saldo suficiente para a operação");
		}
	 }
	
	public void Altera_Dados_Cadastrais (String Nome, Float Renda_Mensal) 
	{
		System.out.println("O que deseja mudar no seu cadastro?\n");
		System.out.println("Lembrando que você não pode mudar o seu CPF\n");
		System.out.println("1._ Nome\n 2._Renda Mensal\n");
		int option = Leitor.nextInt();
		
		switch(option)
		{     
		   case 1: 
			   System.out.printf("Digite o novo nome\n");
			   String novo_nome = Leitor.next();
			   this.Nome  = novo_nome;
		      break;  //opcional  
		   case 2:     
			   System.out.printf("Digite a nova renda mensal\n");   
			   float nova_renda = Leitor.nextFloat();
			   this.Renda_Mensal  = nova_renda;
		      break;  //opcional
		}
	}
	
	public Float ChequeEspecial (Float valor, Float Saldo) 
	{
		 System.out.printf("Seu valor de cheque especial e : 100\n");
		 System.out.printf("Seu saldo da conta + cheque especial e :\n");
		 return Saldo + 100;
	}
	
	public Float Rend_Pou (Float valor, int  Tem_inv_and_pou) 
	{
		 System.out.printf("O valor poupado de retorno por mes padrão é de 1 real\n");		
		 System.out.printf("Seu valor que deseja poupar\n");
		 valor = Leitor.nextFloat();
		 System.out.printf("Digite quanto tempo deseja poupar\n");
		 Tem_inv_and_pou = Leitor.nextInt();
		 System.out.printf("O valor poupado pelo tempo digitado é de:\n");	
		 return(valor*Tem_inv_and_pou);
	}
	
	public Float Rend_Inv (Float valor, int  Tem_inv_and_pou) 
	{
		 System.out.printf("O valor investido de retorno do investimento por mes padrão é de 2 real\n");		
		 System.out.printf("Seu valor que deseja investir\n");
		 valor = Leitor.nextFloat();
		 System.out.printf("Digite quanto tempo deseja investir\n");
		 Tem_inv_and_pou = Leitor.nextInt();
		 System.out.printf("O valor investido pelo tempo digitado é de:\n");	
		 return(valor*Tem_inv_and_pou);
	}
	
	}