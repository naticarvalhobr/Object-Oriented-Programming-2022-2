public class Trabalhador {
    
    private int totalHoras;
    private int salarioHora;
    int salarioTotal, salarioBase, extra, salarioExtra;
    
    
    if (totalHoras == 160){
        salarioBase = salarioHora * 160;
        salarioTotal = salarioBase;
    } else {
        salarioBase = salarioHora * 160;
        extra = totalHoras - 160;
        salarioExtra = extra * 1.5;
        salarioTotal = salarioBase + salarioExtra;
    }
    
    public void settotalHoras(int totalHoras){ 
        this.totalHoras = totalHoras; 
    }
    
    public int gettotalHoras (){
        return totalHoras;
    }
    
    public void setsalarioHora(int salarioHora){ 
        this.salarioHora = salarioHora; 
    }
    
    public int getsalarioHora (){
        return salarioHora;
    }
    
    public int getsalarioTotal () {
        return salarioTotal;
    }
}
