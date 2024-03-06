package Corpo;

    public class App {
        public static void main(String[] args){
            Corpo_humano c1;
            c1 = new Corpo_humano();
            c1.setAltura(1.85);
            c1.setMassa(85);
            c1.sorrir();
            c1.setNome("Vinicius");
    
            Corpo_humano c2;
            c2 = new Corpo_humano();
            c2.setNome("Medino");
            c2.falar("ontem foi o meu aniversario");
        }
    }
