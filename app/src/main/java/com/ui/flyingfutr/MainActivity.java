package com.ui.flyingfutr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Dostavljavec d0 = new Dostavljavec(
            0,
            "kolo",
            560,
            510
    );


    Restavracija r0 = new Restavracija(
            0,
            "Gostilna pri Jožetu",
            560,
            510
    );

    Uporabnik u0 = new Uporabnik(
            0,
            "Miha",
            "Novak",
            156,
            377
    );

    //Osnovni tok
    Narocilo n0 = new Narocilo(
            0,
            "Hamburger\nMešana solata\nPingo sok",
            d0,
            u0,
            r0
    );

    //Alternativni tok
    Narocilo n1 = new Narocilo(
            0,
            "Kranjska klobasa z zeljem\nKruh",
            d0,
            u0,
            r0
    );

}