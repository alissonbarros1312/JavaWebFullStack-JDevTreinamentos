package cursojava.escola;

public class Main {
	public static void main(String[] args) {
	
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno1.setNome("João");
		aluno1.setIdade(50);
		aluno1.setNomeMae("Maria");
		aluno1.setNomePai("Jose");
		aluno1.setNumeroCpf("987.765.654-76");
		aluno1.setRegistroGeral("23.654.765-0");
		aluno1.setDataNascimento("15/06/1968");
		aluno1.setNomeEscola("JDEV treinamento");
		aluno1.setDataMatricula("30/02/2021");
		aluno1.setSerieMatriculado("Java Web");
		aluno1.setNota1(90);
		aluno1.setNota2(89.2);
		aluno1.setNota3(82.8);
		aluno1.setNota4(76.5);
		
		System.out.println("Nome: "+ aluno1.getNome());
		System.out.println("Idade: "+ aluno1.getIdade());
		System.out.println("Data da Matricula: "+ aluno1.getDataMatricula());
		System.out.println("Media: " + aluno1.getMedia());
		
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
		
	}
}
