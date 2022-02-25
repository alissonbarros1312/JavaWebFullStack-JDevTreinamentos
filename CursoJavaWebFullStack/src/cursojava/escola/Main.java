package cursojava.escola;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();

		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		String idade = JOptionPane.showInputDialog("Digite sua idade: ");
		String mae = JOptionPane.showInputDialog("Digite o nome da mãe: ");
		String pai = JOptionPane.showInputDialog("Digite o nome do pai: ");
		String cpf = JOptionPane.showInputDialog("Digite o n° do CPF: ");
		String rg = JOptionPane.showInputDialog("Digite o n° do RG: ");
		String dataNasc = JOptionPane.showInputDialog("Digite a data de nascimento: ");
		String escola = JOptionPane.showInputDialog("Digite o nome da escola: ");
		String dataMatr = JOptionPane.showInputDialog("Digite a data de matricula: ");
		String serie = JOptionPane.showInputDialog("Digite a série matriculada: ");

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setNumeroCpf(cpf);
		aluno1.setRegistroGeral(rg);
		aluno1.setDataNascimento(dataNasc);
		aluno1.setNomeEscola(escola);
		aluno1.setDataMatricula(dataMatr);
		aluno1.setSerieMatriculado(serie);

		for (int i = 1; i <= 4; i++) {

			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + i);
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + i);

			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));

			aluno1.getDisciplina().add(disciplina);

		}

		int num = JOptionPane.showConfirmDialog(null, "Deseja remover algumas materia? ");

		if (num == 0) {

			String matRemove = JOptionPane.showInputDialog("Qual matéria? 1, 2, 3 ou 4");
			aluno1.getDisciplina().remove(Integer.valueOf(matRemove).intValue() - 1);

		}

		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Data da Matricula: " + aluno1.getDataMatricula());
		System.out.println("Media: " + aluno1.getMedia());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));

		System.out.println("\n======== toString ========\n");
		System.out.println(aluno1.toString());
		System.out.println("Media do aluno: " + aluno1.getMedia());
		System.out.println("Resultado: " + aluno1.getAlunoAprovado2());
		System.out.println("==============================================");

		/*
		 * equals and hasCode servem para comparar e diferenciar objetos Aluno aluno3 =
		 * new Aluno(); aluno3.setNome("Alisson"); aluno3.setNumeroCpf("554");
		 * 
		 * Aluno aluno4 = new Aluno(); aluno4.setNome("Aluno");
		 * aluno4.setNumeroCpf("554");
		 * 
		 * if (aluno3.equals(aluno4)) { System.out.println("Os alunos são iguais"); }
		 * else { System.out.println("Os alunos são diferentes"); }
		 */

	}
}
