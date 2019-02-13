
public class professores extends pessoas {
  private String formaçao;
  private String nivel;

    public professores(String nome, String rg, String cpf, String formaçao, String nivel) {
        super(nome, rg, cpf);
        this.formaçao = formaçao;
        this.nivel = nivel;
    }
    public void setformaçao(String formaçao){
        this.formaçao = formaçao;
    }
    public void setnivel(String nivel){
        this.nivel = nivel;
    }
    public String getformaçao(){
        return formaçao;
    }
    public String getnivel(){
        return nivel;
    }
}
