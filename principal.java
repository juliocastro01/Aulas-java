
public class principal {
    public static void main(String[] args) {
        professores p1 = new professores("julio", 
                                        "22222222", 
                                        "6262626262", 
                                        "pedreiro", 
                                        "mestrado");
        System.out.println(p1.getnome());
        System.out.println(p1.getrg());
        System.out.println(p1.getcpf());
        System.out.println(p1.getformaçao());
        System.out.println(p1.getnivel());
    } 
}
