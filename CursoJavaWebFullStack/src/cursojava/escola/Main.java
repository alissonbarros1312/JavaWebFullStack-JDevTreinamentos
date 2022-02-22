package cursojava.escola;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
	
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
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
		String nota1 = JOptionPane.showInputDialog("Digite a nota 1: ");
		String nota2 = JOptionPane.showInputDialog("Digite a nota 2: ");
		String nota3 = JOptionPane.showInputDialog("Digite a nota 3: ");
		String nota4 = JOptionPane.showInputDialog("Digite a nota 4: ");
		
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
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		
		System.out.println("Nome: "+ aluno1.getNome());
		System.out.println("Idade: "+ aluno1.getIdade());
		System.out.println("Data da Matricula: "+ aluno1.getDataMatricula());
		System.out.println("Media: " + aluno1.getMedia());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado": "Reprovado"));
		
		System.out.println("\n======== toString ========\n");
		System.out.println(aluno1.toString());
		System.out.println("Media do aluno: " + aluno1.getMedia());
		System.out.println("Resultado: " + aluno1.getAlunoAprovado2());
		System.out.println("==============================================");
		
		aluno2.setNome("Maria");
		aluno2.setIdade(32);
		aluno2.setNomeMae("Yasmin");
		aluno2.setNomePai("Pedro");
		aluno2.setNumeroCpf("534.263.287-76");
		aluno2.setRegistroGeral("25.187.765-6");
		aluno2.setDataNascimento("13/05/1988");
		aluno2.setNomeEscola("EMEF JDev Treinamentos");
		aluno2.setDataMatricula("05/01/2021");
		aluno2.setSerieMatriculado("Java Web Full Stack");
		
		System.out.println("Nome: "+ aluno2.getNome());
		System.out.println("Idade: "+ aluno2.getIdade());
		System.out.println("Data da Matricula: "+ aluno2.getDataMatricula());
		
		// equals and hasCode servem para comparar e diferenciar objetos
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Alisson");
		aluno3.setNumeroCpf("554");
		
		Aluno aluno4 = new Aluno();
		aluno4.setNome("Aluno");
		aluno4.setNumeroCpf("554");
		
		if(aluno3.equals(aluno4)) {
			System.out.println("Os alunos são iguais");
		} else {
			System.out.println("Os alunos são diferentes");
		}
		
	}
}
