package doug.devdoug.maratonajava.javacore.Bintroducaometodos.domino;

public class Pessoa {
    public String nome;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int idade;

    public void setNome(String nome){
        this.nome = nome;
    }

}
