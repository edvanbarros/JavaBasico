
public class Calculadora {
	int codigo;
	
	public Calculadora()
	{
		
	}
	
	public Calculadora(int codigo)
	{
		this.codigo = codigo;
	}
	
	private double somar(double v1, double v2)
	{
		return v1 + v2;
	}
	
	private double subtrair(double v1, double v2)
	{
		return v1 - v2;
	}
	
	private double multiplicar(double v1, double v2)
	{
		return v1 * v2;
	}
	
	private double dividir(double v1, double v2)
	{
		return v1 / v2;
	}
	
	public double calcular (double v1, char operacao, double v2)
	{
		double resultado = 0;
		
		switch( operacao )
		{
		case '+':
			resultado = somar(v1, v2);
			break;
			
		case '-':
			resultado = subtrair(v1, v2);
			break;
			
		case '*':
			resultado = multiplicar(v1, v2);
			break;
			
		case '/':
			resultado = dividir(v1, v2);
			break;
		
		default:
			resultado = 0;
			break;
		}
		
		return resultado;
	}

}
