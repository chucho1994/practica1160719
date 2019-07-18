package com.example.primerospasosandroidscooll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2,et3;
    TextView  tv1,tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.editText1);
        et2=(EditText)findViewById(R.id.editText2);
        et3=(EditText)findViewById(R.id.editText3);

        tv1=(TextView)findViewById(R.id.mos_rres_1);
        tv2=(TextView)findViewById(R.id.mos_res_2);
        tv3=(TextView)findViewById(R.id.mos_res_3);
    }

    public void ordenar(View view){//preguntar que si si esta restornando los tvs;

        int numero1=0,numero2=0,numero3=0,a=0,b=0,c=0;
        String ingreso1=" ",ingreso2=" ",ingreso3=" ";



        numero1=Integer.parseInt(et1.getText().toString());
        numero2=Integer.parseInt(et2.getText().toString());
        numero3=Integer.parseInt(et3.getText().toString());

        do{
            a=numero1;
            numero1=numero2;
            numero2=a;
            while (numero2>numero3){
                b=numero2;
                numero2=numero3;
                numero3=b;

            }

        }while(numero1>numero2);

if (numero1==numero2)
    Toast.makeText(this,"Hay dos valores respetidos",Toast.LENGTH_LONG).show();
if(numero2==numero3)
    Toast.makeText(this,"Hay dos valores respetidos",Toast.LENGTH_LONG).show();
if (numero1==numero3)
    Toast.makeText(this,"Hay dos valores respetidos",Toast.LENGTH_LONG).show();

if ((numero1==numero2)&&(numero2==numero3)&&(numero1==numero3)) {
    Toast.makeText(this, "Hay tres valores repetidos ", Toast.LENGTH_LONG).show();
    Toast.makeText(this, "Ya se encuentran ordenados ", Toast.LENGTH_LONG).show();
}
        tv1.setText(numero1);
        tv2.setText(numero2);
        tv3.setText(numero3);
    }
}
