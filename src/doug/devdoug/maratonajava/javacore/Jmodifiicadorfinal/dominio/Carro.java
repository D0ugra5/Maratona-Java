package doug.devdoug.maratonajava.javacore.Jmodifiicadorfinal.dominio;

public   class Carro {
    private String nome;
    public static  final Comprador COMPRADOR = new Comprador();
    public static final  double VELOCIDADE_LIMITE= 250;
    public final  void  imprime(){
        System.out.println(this.nome);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
