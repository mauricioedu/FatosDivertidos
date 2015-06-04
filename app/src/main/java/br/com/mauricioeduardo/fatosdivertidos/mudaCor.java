package br.com.mauricioeduardo.fatosdivertidos;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by mauricioedu on 17/02/2015.ok
 */
public class mudaCor {
    public String[] mColor ={
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7"
    };
    public int getColor(){
        String color = "";
        //Random da seleção do fatos
        Random randomGeneretion = new Random();
        int randomNumber = randomGeneretion.nextInt(mColor.length);
        color = mColor[randomNumber];
        int colorInt = Color.parseColor(color);

        return colorInt;
}
}
