import javax.swing.JOptionPane;

public class TesteAtribuicao {

   // cadastrar uma nova atribuicao no metodo main
   public static void main(String[] args) {
   // coletando os dados da atribuicao a ser cadastrada
   Professor = JOptionPane.showInputDialog("Digite o nome do professor:");
   Disciplina = JOptionPane.showInputDialog("Digite o nome da disciplina:");
   //cria um objeto professor
   Professor professor = new Professor(nome, idade);
   
   // cria um objeto disciplina
   Disciplina disciplina = new Disciplina(nome, pratica);
   
   // cria um objeto atribuicao
   Atribuicao atribuicao = new Atribuicao(professor, disciplina);
  
   
   // nao precisa mais montar a string de saida, e so chamar o metodo getDados
   
   // mostra a atribuicao
   JOptionPane.showMessageDialog(null, atribuicao.getDados());
   
   // altera informacoes; nao precisa criar todas as variaveis novamente
   professor = JOptionPane.showInputDialog("Professor");
   disciplina = JOptionPane.showInputDialog("Disciplina");
   
   // muda usando os metodo modificadores
   atribuicao.setProfessor(professor);
   atribuicao.setDisciplina(disciplina);
   
   // mostra novamente o cadastro da atribuicao
   
   // mostra a atribuicao
   JOptionPane.showMessageDialog(null, atribuicao.getDados());
   }
}