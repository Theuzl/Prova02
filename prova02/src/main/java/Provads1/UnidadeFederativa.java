package Provads1;


public enum UnidadeFederativa {
    BAHIA ("Bahia"),
    SAO_PAULO ("São_Paulo"),
    RIO_DE_JANEIRO ("Rio De Janeiro");
    
    protected String sigla;

    private UnidadeFederativa(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
    
}
