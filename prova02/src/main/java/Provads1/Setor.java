
package Provads1;


public enum Setor {
    
    ENGENHARIA ("Engenharia"),
    SAUDE ("Saude"),
    JURIDICO ("Juridico"),
    RECURSOS_HUMANOS ("Recuros Humanos"),
    MARKETING ("Marketing"),
    OPERACOES("Operacoes");
    
    protected String texto;

    private Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
   

}
