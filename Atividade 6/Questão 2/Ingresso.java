public class Ingresso {
    public double valor;
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public void imprimeValor(double valor){
        valor = this.valor;
        System.out.println("Valor do ingresso: " + valor);
    }
}


