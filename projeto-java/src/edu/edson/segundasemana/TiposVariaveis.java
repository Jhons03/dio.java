package edu.edson.segundasemana;

public class TiposVariaveis {
    public static void main(String [] args) {
        
        String PrimeiroNome = "Edson";
        String SegundoNome = "Silva";
        String NomeCompleto = PrimeiroNome + " " + SegundoNome;
        System.out.println(NomeCompleto);

        //operador ternario (sempre uma expressão booleana)
        //usar equals quando for comparar objeto
        String nome1 = "Shirley";
        String nome2 = new String("Shirley");
        int a, b;
        a = 5;
        b = 6;
        String resultado = a==b ?"verdade" : "mentira";
        System.out.println(resultado);
        System.out.println(nome1.equals(nome2));


        Tv tv = new Tv();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.diminuirVolume();
        tv.mudarCanal(12);
        tv.aumentarCanal();
        System.out.println("Estado da tv ligada?" + tv.ligada);
        System.out.println("volume do canal:" + tv.volume);
        System.out.println("canal atual:" + tv.canal);

    }

    

}
