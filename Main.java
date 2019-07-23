import java.util.Scanner;
import java.util.ArrayList;
import java.uitl.List;
public class Main{
List <Funcionario>funcionarios = new ArrayList<Funcionario>();
public static void main(String[] args){
	Main rotina = new Main();
	//Scanner scanner = new Scanner(System.in);
	
	rotina.addFuncionario( new Programador("pedro"));
	rotina.addFuncionario(  new Programador("maria"));
	rotina.addFuncionario(  new Programador("joao"));
	rotina.addFuncionario( new Programador("erik"));
	rotina.addFuncionario( new Gerente("jean"));
	
	rotina.calcular();

	}
	
}
	public void addFuncionario(String input){}
	public void addFuncionario(Funcionario f){
		this.funcionarios.add(f);		
	}
	
	public void calcular(){
		for(Funcionario funcionario in this.funcionarios){
			FuncionarioHandler.
		}
	}
	
	}

