package com.example.abril.customlistview;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Persona> listapersonas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listapersonas = new ArrayList<Persona>();
        listapersonas.add(new Persona("ABREGO DELGADO ALEXIA ARIANA", 'f', "13400378", "ISC"));
        listapersonas.add(new Persona("CARO LOPEZ LUIS RICARDO", 'm', "13400395", "ISC"));
        listapersonas.add(new Persona("CARVAJAL GUTIERREZ RAUL RAFAEL", 'm', "13400396", "ISC"));
        listapersonas.add(new Persona("CASILLAS UREÑA FERMIN MICHET", 'm', " 12400256", "ISC"));
        listapersonas.add(new Persona("CRESPO DURAN PABLO ARTURO", 'm', "13400397", "ISC"));
        listapersonas.add(new Persona("ESPINO SERRANO CESAR RAMSES", 'm', "13400402", "ISC"));
        listapersonas.add(new Persona("ESPINOZA ORONIA CARLOS EDUARDO", 'm', "12401119", "ISC"));
        listapersonas.add(new Persona("FREGOSO CORONA JESÚS EDUARDO", 'm', "13400405", "ISC"));
        listapersonas.add(new Persona("GALAVIZ ARROYO OLIVER JASIEL", 'm', "13400406", "ISC"));
        listapersonas.add(new Persona("GALINDO DELGADO DONADONY DONAJI", 'm', "13400408", "ISC"));
        listapersonas.add(new Persona("HERNANDEZ SANDOVAL ABRIL YARELI", 'f', "13400395", "ISC"));
        listapersonas.add(new Persona("GONZALEZ CASTELLANOS EDGAR FABRIZIO", 'm', "13400419", "ISC"));
        listapersonas.add(new Persona("JIMENEZ ORTIZ JUAN DANIEL", 'm', "13400395", "ISC"));
        listapersonas.add(new Persona("LIZOLA CHAVARÍN LUIS FERNANDO", 'm', "13400395", "ISC"));
        listapersonas.add(new Persona("MEDRANO BARAJAS JUAN DANIEL", 'm', "13400395", "ISC"));
        listapersonas.add(new Persona("RAMIREZ GARCIA JUAN RAMON", 'm', "13400395", "ISC"));
        listapersonas.add(new Persona("RODRIGUEZ ADAME OLIVER GIOVANNY", 'm', "13400395", "ISC"));
        listapersonas.add(new Persona("SANCHEZ JIMENEZ ANA PATRICIA", 'f', "13400395", "ISC"));
        listapersonas.add(new Persona(" SÁNCHEZ PARTIDA HÉCTOR OMAR", 'm', "13400395", "ISC"));
        listapersonas.add(new Persona(" VALDEZ CORREA CARLOS GERMAN", 'm', "13400395", "ISC"));
        listapersonas.add(new Persona(" HERNANDEZ BAEZA JAVIER", 'm', "13400395", "ISC"));
        listapersonas.add(new Persona(" IBARRA MARAVILLAS JONATHAN GUADALUPE", 'm', "13400395", "ISC"));
        listapersonas.add(new Persona("  MARIN BAUTISTA IRVING ALDAHYR", 'm', "13400395", "ISC"));
        listapersonas.add(new Persona("SALAZAR NAVARRO IRAN JAIR", 'm', "13400395", "ISC"));
        listapersonas.add(new Persona(" TEJEDA MORA CESAR", 'm', "13400395", "ISC"));



        AdaptadorPersonas adaptador = new AdaptadorPersonas(this);
        ListView lv1 = (ListView) findViewById(R.id.list1);
        lv1.setAdapter(adaptador);


    }

    class AdaptadorPersonas extends ArrayAdapter<Persona> {

        AppCompatActivity appCompatActivity;

        AdaptadorPersonas(AppCompatActivity context) {
            super(context, R.layout.persona, listapersonas);
            appCompatActivity = context;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.persona, null);

            TextView textView1 = (TextView) item.findViewById(R.id.textView);
            //TextView txtview2 = (TextView)item.findViewById(R.id.textView2);
            textView1.setText(listapersonas.get(position).getNombre()+"\n"+listapersonas.get(position).getNocontrol()+"-"+listapersonas.get(position).getCarrera());


            ImageView imageView1 = (ImageView) item.findViewById(R.id.imageView);
            if (listapersonas.get(position).getGenero()=='m')
                imageView1.setImageResource(R.mipmap.hombre);
            else
                imageView1.setImageResource(R.mipmap.mujer);
            return(item);
        }
    }
}