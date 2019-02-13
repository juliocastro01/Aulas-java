
public abstract class pessoas {
    private String nome;
    private String rg;
    private String cpf;
    
public pessoas(String nome, String rg, String cpf){
    this.nome = nome;
    this.rg = rg;
    this.cpf = cpf;
}
public void setnome(String nome){
    this.nome = nome;
}
public void setrg(String rg){
    this.rg = rg;
}    
public void setcpf(String cpf){
    this.cpf = cpf;
}
public String getnome(){
    return nome;
}
public String getrg(){
    return rg;
}
public String getcpf(){
    return cpf;
}
}
