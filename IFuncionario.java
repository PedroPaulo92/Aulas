Interface IFuncionario {

private float salario;
private float horasTrabalhadas;
private float bonus;
private String nome;

public void setNome(String nome);
public void setHorasTrabalhadas(float horasTrabalhadas);
public void setSalario(float salario);

public String getNome():
public float getSalario():
public float getHoras();
public float getBonus();
}