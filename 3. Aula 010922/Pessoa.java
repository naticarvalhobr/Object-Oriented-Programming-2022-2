// Juntar elementos do mundo real com *as mesmas características*

public class Pessoa {
    // Atributos ou características
    
    private String nome;
    int idade;
    int dataN;
    // Se não determinar que são públicos, estarão normalmente protegidos. 
    // Atributos protegidos podem ser acessados por métodos do mesmo pacote. 
    // Atributos privados podem ser acessados apenas por métodos da mesma classe.
    // Atributos públicos podem ser acessados por qualquer classe.
    
    // Métodos, funções ou comportamentos. Devem ser relacionados apenas a esse objeto
    
    int calc(int anoN){ // Não pode ser static porque, a partir da classe Pessoa, chama o método. Se fosse static, não poderia associar a nenhum método
        int idade = 2022 - anoN;
        return idade;
    }
    
    public void setNome(String nome){ // inserir informações dentro do atributo. Sempre vai ser público, porque será chamado da principal.
        this.nome = nome; // atributo recebendo o parâmetro
    }
    
    public String getNome (){ // têm retorno. Pega o dado dentro do atributo para mostrar
        return nome;
    }
}
    
  

