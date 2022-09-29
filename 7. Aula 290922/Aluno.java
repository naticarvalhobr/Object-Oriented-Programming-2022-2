public class Aluno extends Pessoa { // A classe Aluno herda da classe Pessoa
    private String matricula, curso;

    public Aluno(String matricula, String curso, String nome, String telefone) {
        super(nome, telefone);
        this.matricula = matricula;
        this.curso = curso;
    }
    
    public void teste() {
        super.setNome("Pedro");  
        /* Enquanto o this faz referência a atributos e metodos da propria classe, 
        o super faz referencia aos atributos e metodos da superclasse.*/
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
