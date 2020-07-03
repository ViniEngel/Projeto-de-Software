public class FinancasBanco {
    private int codigo;
    private String movimento;
    private String descricao;
    private float entrada;
    private float saida;
    
    public FinancasBanco(int codigo, String movimento, String descricao, float entrada, float saida) {
        this.codigo = codigo;
        this.movimento = movimento;
        this.descricao = descricao;
        this.entrada = entrada;
        this.saida = saida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMovimento() {
        return movimento;
    }

    public void setMovimento(String movimento) {
        this.movimento = movimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getEntrada() {
        return entrada;
    }

    public void setEntrada(float entrada) {
        this.entrada = entrada;
    }

    public float getSaida() {
        return saida;
    }

    public void setSaida(float saida) {
        this.saida = saida;
    }
}