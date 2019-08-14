import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main{
private List <Funcionario>funcionarios = new ArrayList<Funcionario>();
public static void main(String[] args){
	Main rotina = new Main();
	//Scanner scanner = new Scanner(System.in);
	
	rotina.addFuncionario( new Programador("pedro", 180f));
	rotina.addFuncionario(  new Programador("maria", 160f ));
	rotina.addFuncionario(  new Programador("joao", 200f));
	rotina.addFuncionario( new Programador("erik", 140f));
	rotina.addFuncionario( new Gerente("jean", 190f));
	
	rotina.calcular();

	}
	
	
	public void addFuncionario(Funcionario f){
		this.funcionarios.add(f);		
	}
	
	public void calcular(){
		FuncionarioHandler handler = new FuncionarioHandler();
		
		for(Funcionario funcionario: this.funcionarios){
			String output = "Funcionario:"+ funcionario.getNome() + 	
			" Salário: "+handler.calcularSalario(funcionario) +
			" Bonus: "+handler.calcularBonus(funcionario);
			System.out.println(output);
			
		}
	}
	
}
	


