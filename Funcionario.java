class Funcionario implements IFunionario{

	Funcionario(String nome,float horasTrabalhadas){
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
	}
public void setSalario(float salario){

		
		this.salario =  salario;
	}
	
public void setNome(string nome){
	
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
	return this.horas;
}
public float getBonus(){
	return this.bonus;
}
@Overhide
public String toString(){
	return "Nome: "+ this.nome +" Horas Trabalhadas: "
}

}