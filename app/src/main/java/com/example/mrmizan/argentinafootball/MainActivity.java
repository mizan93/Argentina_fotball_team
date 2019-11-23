package com.example.mrmizan.argentinafootball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private MyListAdapter adapter;
    String[]name={
            "Lionel Messi","Sergia Aguero",
            "Cristian Ansaldi","Federico Fezio"
            ,"Gabriel Mercado","Marcos Rojo",
            "Nicolas Otamendi","Nicolas Tagliafico",
            "Cristian Pavon","Gonzalo Higuain",
            "Franco Armani","Nahuel Guzman",
            "Angel Di Maria","Eduardo Salvio",
            "Enzo Perez","Ever Benega",
            "Giovani Lo Celso","Javier Mascherano",
            "Lucas Biglia","Marcos Acuna",
            "Maximiliano Meza"
    };
    Integer[]image={
            R.drawable.messi, R.drawable.sargio,
            R.drawable.cristian_ansalid, R.drawable.federoco,
            R.drawable.gabriel, R.drawable.marcos,
            R.drawable.nicolus, R.drawable.nicolus_tagliafico,
            R.drawable.cristian_pavon, R.drawable.gonzalo,
            R.drawable.franco, R.drawable.nahuel,
            R.drawable.di_mariya, R.drawable.eduardo,
            R.drawable.enzo, R.drawable.ever_benega,
            R.drawable.giovanel, R.drawable.javiar,
            R.drawable.locus, R.drawable.marcos,
            R.drawable.messi

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListAdapter adapter=new MyListAdapter(this,name,image,)
        listView=findViewById(R.id.listID);

    }
}
