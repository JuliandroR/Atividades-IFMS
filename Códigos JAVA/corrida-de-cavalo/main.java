
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws InterruptedException, IOException {

        Scanner cap = new Scanner(System.in);
        Personagem p = new Personagem(5);
        limpar l = new limpar();
        Random r = new Random();

        Cavalo c1 = new Cavalo("Alface");
        Cavalo c2 = new Cavalo("Beterraba");
        Cavalo c3 = new Cavalo("Cenoura");
        Cavalo c4 = new Cavalo("Damasco");
        Cavalo c5 = new Cavalo("Espinafre");

        System.out.println("BEM-VINDO AO CAÇA-NÍQUEL DE CORRIDA EQUESTRE");
        System.out.println("Você não terá muitas chances, mas tente!");
        System.out.println("Boa sorte...vai que!");
        String aposta = "";
        Integer dist = 0;

        while (!aposta.equals("desisto")) {
            if (p.getMoedas() <= 0) {
                aposta = "desisto";
            } else {
                System.out.println("Você possui " + p.getMoedas() + " moedas");
                System.out.println("Quantas moedas apostar?");
                aposta = cap.next();
                Integer apos = Integer.parseInt(aposta);
                p.setMoedas(p.getMoedas() - apos);

                if (aposta.equals("desisto")) {

                } else {

                    System.out.println("Em qual cavalo será feita a aposta?");
                    System.out.println("1 - " + c1.getNome());
                    System.out.println("2 - " + c2.getNome());
                    System.out.println("3 - " + c3.getNome());
                    System.out.println("4 - " + c4.getNome());
                    System.out.println("5 - " + c5.getNome());
                    Integer horse = cap.nextInt();

                    c1.setDist(0);
                    c2.setDist(0);
                    c3.setDist(0);
                    c4.setDist(0);
                    c5.setDist(0);

                    int d = 0;
                    while (d < 100) {
                        if (c1.getDist() > 99) {
                            d = 100;
                        } else {
                            c1.setDist(c1.getDist() + dist);
                            dist = r.nextInt(5);
                            System.out.println(c1.getNome() + " : " + c1.getDist()
                                    + "/100");
                        }

                        if (c2.getDist() > 99) {
                            d = 100;
                        } else {
                            c2.setDist(c2.getDist() + dist);
                            dist = r.nextInt(5);
                            System.out.println(c2.getNome() + " : " + c2.getDist()
                                    + "/100");
                        }

                        if (c3.getDist() > 99) {
                            d = 100;
                        } else {
                            c3.setDist(c3.getDist() + dist);
                            dist = r.nextInt(5);
                            System.out.println(c3.getNome() + " : " + c3.getDist()
                                    + "/100");
                        }

                        if (c4.getDist() > 99) {
                            d = 100;
                        } else {
                            c4.setDist(c4.getDist() + dist);
                            dist = r.nextInt(5);
                            System.out.println(c4.getNome() + " : " + c4.getDist()
                                    + "/100");
                        }

                        if (c5.getDist() > 99) {
                            d = 100;
                        } else {
                            c5.setDist(c5.getDist() + dist);
                            dist = r.nextInt(5);
                            System.out.println(c5.getNome() + " : " + c5.getDist()
                                    + "/100");
                        }

                        Thread.sleep(500);
			l.limpar();
                    }

                    if (c1.getDist() > 99) {
                        System.out.println(c1.getNome() + " ganhou!");

                        if(horse == 1){
                            if (c2.getDist() > 99 || c3.getDist() > 99 || c4.getDist() > 99 || c5.getDist() > 99) {
                            p.setMoedas(p.getMoedas() + apos);
                        } else {
                            p.setMoedas(p.getMoedas() + (apos * 2));
                        }
                        }else{
                        }
                    }
                    if (c2.getDist() > 99) {
                        System.out.println(c2.getNome() + " ganhou!");

                        if(horse == 2){
                            if (c1.getDist() > 99 || c3.getDist() > 99 || c4.getDist() > 99 || c5.getDist() > 99) {
                            p.setMoedas(p.getMoedas() + apos);
                        } else {
                            p.setMoedas(p.getMoedas() + (apos * 2));
                        }
                        }else{
                        }
                    }
                    if (c3.getDist() > 99) {
                        System.out.println(c3.getNome() + " ganhou!");

                        if(horse == 3){
                            if (c1.getDist() > 99 || c2.getDist() > 99 || c4.getDist() > 99 || c5.getDist() > 99) {
                            p.setMoedas(p.getMoedas() + apos);
                        } else {
                            p.setMoedas(p.getMoedas() + (apos * 2));
                        }
                        }else{
                        }
                    }
                    if (c4.getDist() > 99) {
                        System.out.println(c4.getNome() + " ganhou!");

                        if(horse == 4){
                            if (c1.getDist() > 99 || c2.getDist() > 99 || c3.getDist() > 99 || c5.getDist() > 99) {
                            p.setMoedas(p.getMoedas() + apos);
                        } else {
                            p.setMoedas(p.getMoedas() + (apos * 2));
                        }
                        }else{
                        }
                    }
                    if (c5.getDist() > 99) {
                        System.out.println(c5.getNome() + " ganhou!");

                        if(horse == 5){
                            if (c1.getDist() > 99 || c2.getDist() > 99 || c3.getDist() > 99 || c4.getDist() > 99) {
                            p.setMoedas(p.getMoedas() + apos);
                        } else {
                            p.setMoedas(p.getMoedas() + (apos * 2));
                        }
                        }else{
                        }
                    }

                }
            }

        }
        System.out.println("Vá embora logo!");
    }
}
