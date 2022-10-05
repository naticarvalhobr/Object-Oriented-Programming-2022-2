public class ContaPoupanca {
    private double dinheiroNaConta, jurosMensais, taxaJurosAnual;
    
    public void setDinheiroNaConta(double dinheiroNaConta){ 
        this.dinheiroNaConta = dinheiroNaConta; 
    }
    
    public double getDinheiroNaConta (){ 
        return dinheiroNaConta;
    }
    
    public void setTaxaJurosAnual(double taxaJurosAnual){ 
        this.taxaJurosAnual = taxaJurosAnual; 
    }
    
    public double getTaxaJurosAnual (){ 
        return taxaJurosAnual;
    }
    
    public void atualizarJurosAnual (double taxaJurosAnual) {
        this.taxaJurosAnual = taxaJurosAnual;
    }
    
    public double calcJurosMensais (double dinheiroNaConta, double taxaJurosAnual) {
        jurosMensais = (dinheiroNaConta * (taxaJurosAnual/100)) / 12;
        dinheiroNaConta = dinheiroNaConta + jurosMensais;
        return jurosMensais;
    }
    
    public double atualizarSaldo (double dinheiroNaConta, double jurosMensais) {
        dinheiroNaConta = dinheiroNaConta + jurosMensais;
        return dinheiroNaConta;
    }
}
