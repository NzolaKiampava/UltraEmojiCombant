package ultraemojicombat;
public class Lutador {
    private String nome;
    private String nacionalidade;
    private String categoria;
    private float peso, altura;
    private int idade, vitorias, derrotas, empates;
    
    //METODOS PUBLICOS
    public void apresentar(){
        System.out.println("----------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o Lutador "+this.getNome());
        System.out.println("Directamente de "+this.getNacionalidade());
        System.out.println("Com "+this.getIdade() +" anos e "+this.getAltura() + "m");
        System.out.println("Pesando "+this.getPeso() +"kg");
        System.out.println(this.getVitorias()+" Vitórias");
        System.out.println(this.getDerrotas()+" Derrotas");
        System.out.println(this.getEmpates()+" Empates");
    }
    public void status(){
        System.out.println(this.getNome()+" é um peso "+this.getCategoria());
        System.out.println("Ganhou "+this.getVitorias()+" vesez");
        System.out.println("Perdeu "+this.getDerrotas()+" vesez");
        System.out.println("Empatou "+this.getEmpates()+" vesez");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    //METODOS ESPECIAIS

    public Lutador(String nome, String nacionalidade, float peso, float altura, int idade, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.setPeso(peso);
        this.altura = altura;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso <= 52.2)
            this.categoria = "INVÁLIDO";
        else if(this.peso <= 70.3)
                this.categoria = "LEVE";
        else if(this.peso <= 83.9)
                this.categoria = "MÉDIO";
        else if(this.peso <= 120.2)
                this.categoria = "PESADO";  
        else
            this.categoria = "INVÁLIDO";
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
