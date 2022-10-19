public class CamaroteInferior {
    public String localizacaoIng;
    
    public void setLocalizacaoIng (String localizacaoIng) {
        this.localizacaoIng = localizacaoIng;
    }
    
    public String getLocalizacaoIng () {
        return this.localizacaoIng;
    }
    
    public String acessarLocalizacao() {
        return this.localizacaoIng;
    }
    
    public void imprimeLocalizacaoIng(String localizacaoIng) {
        localizacaoIng = this.localizacaoIng;
        
        System.out.println("Localizacao do ingresso: " + localizacaoIng);

    }
}