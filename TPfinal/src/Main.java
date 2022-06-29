//Autores: Rodrigo Rebelo e Breno Santos

public class Main {

    public static void main(String[] args) {
        AmostraTemperatura t1 = new AmostraTemperatura(24, 1, 2003, 12, 20, 30, 26.3f);

        System.out.println("data: " + t1.getData());
        System.out.println("hora: " + t1.getHora());
        System.out.println("valor: " + t1.getValor());
        System.out.println("");

        AmostraTemperatura t2 = new AmostraTemperatura();

        System.out.println("data: " + t2.getData());
        System.out.println("hora: " + t2.getHora());
        System.out.println("valor: " + t2.getValor());
        System.out.println("");

        t1.setData();
        t1.setHora();
        t1.setValor();

        System.out.println("data: " + t1.getData());
        System.out.println("hora: " + t1.getHora());
        System.out.println("valor: " + t1.getValor());

    }
}
