package controle;

import entidade.Aluno;
import java.util.ArrayList;

/**
 *
 * @author Matheus Silva
 */
public class GerenciaAluno {
	ArrayList<Aluno> alunos = new ArrayList<>();
	
	public boolean salvar (Aluno a){
		if(a != null){
			alunos.add(a);
			return true;
		}
		
		else{
			return false;
		}
	}
	
	public ArrayList<Aluno> retornarTodos(){
		return alunos;
	}
}
