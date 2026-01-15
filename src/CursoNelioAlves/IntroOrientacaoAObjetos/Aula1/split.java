package CursoNelioAlves.IntroOrientacaoAObjetos.Aula1;

import java.util.Arrays;

public class split {
    public static void main(String[] args) {
        String musica = "Seu sorriso é tão resplandecente\n" +
                "Que deixou meu coração alegre\n" +
                "Me dê a mão\n" +
                "Pra fugir desta terrível escuridão\n" +
                "\n" +
                "Desde o dia em que eu te reencontrei\n" +
                "Me lembrei daquele lindo lugar\n" +
                "Que na minha infância era\n" +
                "Especial para mim\n" +
                "\n" +
                "Quero saber\n" +
                "Se comigo você quer vir dançar\n" +
                "Se me der a mão eu te levarei\n" +
                "Por um caminho, cheio de sombras e de luz\n" +
                "\n" +
                "Você pode até não perceber\n" +
                "Mas o meu coração se amarrou em você\n" +
                "Que precisa de alguém\n" +
                "Pra te mostrar o amor que o mundo te dá\n" +
                "\n" +
                "Meu alegre coração palpita\n" +
                "Por um universo de esperança\n" +
                "Me dê a mão\n" +
                "A magia nos espera\n" +
                "\n" +
                "Vou te amar por toda a minha vida\n" +
                "Vem comigo por este caminho\n" +
                "Me dê a mão\n" +
                "Pra fugir desta terrível escuridão\n" +
                "\n" +
                "Haja o que houver, eu te amarei\n" +
                "E quero para sempre ao seu lado estar\n" +
                "Deixe de pensar em tudo, que já ficou para trás\n" +
                "\n" +
                "Quero saber, se é comigo que você vai sonhar\n" +
                "Se não tenho alguém em quem confiar\n" +
                "Já não encontro o caminho que me leve a você\n" +
                "\n" +
                "Quando enfim consegui confessar\n" +
                "Todo o meu sentimento e desejo de amar\n" +
                "Não sei o que me parou\n" +
                "Mas hoje eu vou lutar com tudo o que sou\n" +
                "\n" +
                "Meu alegre coração palpita\n" +
                "Por um universo de esperança\n" +
                "Me dê a mão\n" +
                "A magia nos espera\n" +
                "\n" +
                "Vou te amar por toda a minha vida\n" +
                "Vem comigo por este caminho\n" +
                "Me dê a mão\n" +
                "Pra fugir desta terrível escuridão";

        String[] cortado = musica.split(" ");
        int contador = 0;

        for(int i = 0; i < cortado.length ; i++){
            System.out.println(cortado[i]);
            contador++;
        }

        System.out.println("A musica tem "+contador+" palavras");
        System.out.println(Arrays.toString(cortado));

    }
}
