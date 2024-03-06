package Corpo;

public class Corpo_humano{
    private String sexo;
    private double altura;
    private double massa;
    private String nome;

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getMassa() {
        return massa;
    }
    public void setMassa(double massa) {
        this.massa = massa;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String andar(int passos){
        
        return("andando " + passos);

    }
    public void falar(String oque){
        System.out.println("Estou falando " + oque);
    }
    public boolean ouvir(int i){
        boolean r=true;
        if(i%2==0){
            r=false;
        }
        return r;
    }
    public void sorrir(){
        System.out.println("Sorrindo");
    }
    public double comer(){
        return(1.5);
    }
}