public FuncionarioHandler {

	public float calcularSalario(Funcionario funcionario)
	{
		return funcionario.getSalario() * funcionario.getHorasTrabalhadas();
	}
	
	public static float calcularBonus(Funcionario funcionario){
	
	return this.salario * this.calcularHorasExtras();
	
	}
}