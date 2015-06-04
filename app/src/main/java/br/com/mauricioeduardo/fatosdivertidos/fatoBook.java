package br.com.mauricioeduardo.fatosdivertidos;

import java.util.Random;

/**
 * Created by mauricioedu on 17/02/2015.Ok
 */
public class fatoBook {
    public String[] facts ={
        "Maçâs são mas eficientes em acordas você de manhã do que o café.",
        "A cor que mais acalma é o azul",
        "Cães podem ser mais inteligentes do que os gatos pois eles sabem como fazer amigos.",
        "Os japoneses elegeram o miojo como sua maior invenção do século XX.Pokémon foi a 8ª.",
         "Hypnagogia-é o estado entre estar dormindo e acordado.",
         "Pessoas muito inteligentes são mais propensas à ansiedade do que aqueles com inteligência moderada.",
         "A NAZA paga cerca de US$ 15,000 para pacientes ficarem deitados por 90 dias, e analisarem os efeitos da gravidade zero em seus corpos.",
         "A Apple tem dinheiro suficiente para comprar a Disney à vista.",
         "Os figurantes zumbis de The Walking Dead têm que passar por uma escola de zumbis para aprender a andar e mover-se como eles.",
         "Cerca de 68% das pessoas já expereimentarm a Sindrome do Toque Fantasma, quando têm a sensação de que o celular esta vibrando."};
    public String getFatos(){
        String fact = "";
        //Random da seleção do fatos
        Random randomGeneretion = new Random();
        int randomNumber = randomGeneretion.nextInt(facts.length);
        fact = facts[randomNumber];

        return fact;
    }
}
