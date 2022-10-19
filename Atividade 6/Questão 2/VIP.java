public class VIP extends Ingresso{
    public double valorAdd, j;
    
    public void setValorAdd(double valorAdd) {
        this.valorAdd = valorAdd;
    }
    
    public double getValorAdd() {
        return this.valorAdd;
    }
    
    public double valorVip (double valor) {
        
        this.valor = valor;
        
        j = valor + (this.valorAdd * this.valor);
        
        return j; 
    }
}