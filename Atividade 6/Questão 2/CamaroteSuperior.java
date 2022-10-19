public class CamaroteSuperior {
    double TaxaAdicional;
    
    public void setTaxaAdicional(double valorAdd2) {
        this.TaxaAdicional = valorAdd2;
    }
    
    public double getTaxaAdicional() {
        return this.TaxaAdicional;
    }
    
    public double valorIngressoCamSup(double valor) {
        valor = this.TaxaAdicional;
        double valorIngressoCamSup = (this.TaxaAdicional * valor) * 2 + valor;
        
        return valorIngressoCamSup;
    }
}