package com.example.pain_composite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        PreparationComposée  pain = new PreparationComposée("Pain",5.50); //racine
        PreparationComposée levain = new PreparationComposée("Levain",3.00);
        PreparationSimple eau = new PreparationSimple("Eau",0.50);
        PreparationSimple sel = new PreparationSimple("Sel",3.50);
        PreparationSimple farine = new PreparationSimple("Farine",2.50);



        levain.ajouterComposant(eau);
        levain.ajouterComposant(sel);
        levain.ajouterComposant(farine);

        pain.ajouterComposant(levain);

        //Création de 4 objets TextView correspond au 4 id text_view
        TextView textView = (TextView) findViewById(R.id.text_view);
        TextView textView2 = (TextView) findViewById(R.id.text_view2);
        TextView textView3 = (TextView) findViewById(R.id.text_view3);
        TextView textView4 = (TextView) findViewById(R.id.text_view4);


        textView.setText(new StringBuilder()
                .append("Prix des différents ingrédients du : "+pain.getLibelle())
                .toString());


        textView2.setText(new StringBuilder()
                .append("1-Le prix du "+levain.getLibelle()+" est "+levain.getPrix()+" euros")
                .toString());


        textView4.setText(new StringBuilder()
                .append("Le prix total du pain est : "+pain.getPrix()+"euros")
                .toString());


    }
}
