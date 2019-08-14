public class Funcionario implements IFuncionario {
	
	protected float salario;
	protected float horasTrabalhadas;
	protected float bonus;
	protected String nome;

Funcionario(String nome,float horasTrabalhadas){
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
}
public void setSalario(float salario){

		
		this.salario =  salario;
}
	
public void setNome(String nome){
	
	this.nome = nome;
}

public void setHorasTrabalhadas(float horasTrabalhadas){
	
	this.horasTrabalhadas = horasTrabalhadas;
}
public String getNome() {
	return this.nome;
}
public float getSalario(){
	return this.salario;

}
public float getHoras(){
	return this.horasTrabalhadas;
}
public float getBonus(){
	return this.bonus;
}
}