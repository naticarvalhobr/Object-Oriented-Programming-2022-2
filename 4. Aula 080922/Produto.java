public class Produto {

    // ** Atributos
    public String nome;
    public String marca;
    public int qtd;
    public double preco;
    public String codigo_barras;
    public double desconto;
    // Quando está ligado a banco de dados, os atributos sempre são privados
    
    // Métodos construtores
    // Construtor com valores padrão
    Produto() { // Nesse caso, todo objeto Produto criado será inicializado com esses valores abaixo
        nome = "Celular";
        marca = "Apple";
        qtd = 10;
    }
    
    // Construtor com parâmetros
    Produto(String nome, String marca, int qtd) {
        this.nome = nome; // variável nome (linha 4) recebe o dado que vier no parâmetro "nome"
        this.marca = marca;
        this.qtd = qtd;
    }
    
    // ** Métodos: sempre nomeados representando uma ação
    
    // Sem retorno: void.
    void mostrarDados() {
        System.out.println("Nome: " + nome);
    }
   
    // Com retorno sem parâmetro: precisa do tipo do retorno (ex. abaixo: double). Não passa dados para dentro da função.
    double calcularDesconto() {
        double resultado = preco - (preco * desconto);
        
        return resultado;
    }
    
    // Com retorno e com parâmetro
    double calcularDesconto2(double preco, double desconto) {
        double resultado = preco - (preco * desconto);
        
        return resultado;
    }
}
