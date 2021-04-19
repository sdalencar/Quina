package com.sdainfo.quina;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> lista1 = new ArrayList<Integer>();
    private TextView a, b, c, d, e, f, g, h, i, j;
    private int jogo;
    private Button bt;
    private String retorno = "";
    private int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = findViewById(R.id.text1);
        b = findViewById(R.id.text2);
        c = findViewById(R.id.text3);
        d = findViewById(R.id.text4);
        e = findViewById(R.id.text5);
        f = findViewById(R.id.text6);
        g = findViewById(R.id.text7);
        h = findViewById(R.id.text8);
        i = findViewById(R.id.text9);
        j = findViewById(R.id.text10);

        bt = findViewById(R.id.bt_sortear);
        contador = 0;


        lista1.add(11);
        lista1.add(22);
        lista1.add(24);
        lista1.add(44);
        lista1.add(23);
        lista1.add(18);
        lista1.add(32);
        lista1.add(62);
        lista1.add(80);
        lista1.add(47);
        lista1.add(58);
        lista1.add(67);
        lista1.add(73);
        lista1.add(71);
        lista1.add(27);
        lista1.add(60);
        lista1.add(39);
        lista1.add(44);
        lista1.add(55);
        lista1.add(75);
        lista1.add(68);
        lista1.add(25);
        lista1.add(3);
        lista1.add(79);
        lista1.add(33);
        lista1.add(66);
        lista1.add(4);
        lista1.add(38);
        lista1.add(52);
        lista1.add(14);
        lista1.add(36);
        lista1.add(43);
        lista1.add(5);
        lista1.add(30);
        lista1.add(57);
        lista1.add(51);
        lista1.add(1);
        lista1.add(41);
        lista1.add(35);
        lista1.add(76);
        lista1.add(10);
        lista1.add(15);
        lista1.add(56);
        lista1.add(78);

        //Antes de embaralhar
        //System.out.println(lista1);
        //a.setText(String.valueOf(lista1));

        //Collections.shuffle(lista1);
        //b.setText(String.valueOf(lista1));

        //Depois de embaralhar
        //System.out.println(lista1);
        //c.setText(String.valueOf(lista1));

        Collections.shuffle(lista1);
        //d.setText(String.valueOf(lista1));

        //Depois de embaralhar novamente
        //System.out.println(lista1);

        bt.setOnClickListener(view -> setarDezenas());


    }


    public void setarDezenas() {
           contador = 0;
        for (int m = 0; m <= 10; m++) {
            criarDezenas();
            if (contador == 1) {
                a.setText(String.valueOf(retorno));
            } else if (contador == 2) {
                b.setText(String.valueOf(retorno));
            } else if (contador == 3) {
                c.setText(String.valueOf(retorno));
            } else if (contador == 4) {
                d.setText(String.valueOf(retorno));
            } else if (contador == 5) {
                e.setText(String.valueOf(retorno));
            } else if (contador == 6) {
                f.setText(String.valueOf(retorno));
            } else if (contador == 7) {
                g.setText(String.valueOf(retorno));
            } else if (contador == 8) {
                h.setText(String.valueOf(retorno));
            } else if (contador == 9) {
                i.setText(String.valueOf(retorno));
            } else if (contador == 10) {
                j.setText(String.valueOf(retorno));
            }

            else{
                limparCampos();
            }
            retorno = "";
            contador ++;
        }

    }

    private void limparCampos() {
        a.setText("");
        b.setText("");
        c.setText("");
        d.setText("");
        e.setText("");
        f.setText("");
        g.setText("");
        h.setText("");
        i.setText("");
        j.setText("");
    }




/*
    public void setarDezenas() {

        for (int m = 0; m < 10; m++) {
            criarDezenas();
            if (contador == 1) {
                a.setText(String.valueOf(retorno));
            } else if (contador == 2) {
                b.setText(String.valueOf(retorno));
            } else if (contador == 3) {
                c.setText(String.valueOf(retorno));
            } else if (contador == 4) {
                d.setText(String.valueOf(retorno));
            } else if (contador == 5) {
                e.setText(String.valueOf(retorno));
            } else if (contador == 6) {
                f.setText(String.valueOf(retorno));
            } else if (contador == 7) {
                g.setText(String.valueOf(retorno));
            } else if (contador == 8) {
                h.setText(String.valueOf(retorno));
            } else if (contador == 9) {
                i.setText(String.valueOf(retorno));
            } else if (contador == 10) {
                j.setText(String.valueOf(retorno));
            } else if(contador > 10){
                a.setText("");
                b.setText("");
                c.setText("");
                d.setText("");
                e.setText("");
                f.setText("");
                g.setText("");
                h.setText("");
                i.setText("");
                j.setText("");
                contador = 0;
            }
            retorno = "";
        }

    }


 */

    public void criarDezenas() {
        Collections.shuffle(lista1);
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                jogo = lista1.get(i);
            }
            retorno += " - " + String.valueOf(jogo);
        }
    }

}