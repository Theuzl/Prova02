
package Provads1;


public enum Genero {
    MASCULINO ('M' , "Masculino"),
    FEMININO ('F' , "Feminino");
    
protected char cactere;
protected String texto;

    private Genero(char cactere, String texto) {
        this.cactere = cactere;
        this.texto = texto;
    }

    public char getCactere() {
        return cactere;
    }

    public void setCactere(char cactere) {
        this.cactere = cactere;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

 
 
    
}
