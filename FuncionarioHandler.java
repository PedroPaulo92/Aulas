public class FuncionarioHandler {

	public float calcularSalario(Funcionario funcionario)
	{
		return funcionario.getSalario() * funcionario.getHoras();
	}
	
	public static float calcularBonus(Funcionario funcionario){
		if((funcionario.getHoras() - (4 * 44)> 0)){
			return funcionario.getSalario() * (funcionario.getHoras() - (4 * 44));
			
		}
		return 0f; 
	
	}
}