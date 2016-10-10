package com.example.pablo.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    boolean decimal = false;
    boolean suma = false;
    boolean resta = false;
    boolean mult = false;
    boolean div = false;
    boolean sen = false;
    boolean cos = false;
    boolean tan = false;
    boolean exp = false;
    boolean raid = false;
    Double[] numero = new Double [20];
    Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button n0 = (Button)findViewById(R.id.btn0);
        n0.setOnClickListener(this);
        Button n1 = (Button)findViewById(R.id.btn1);
        n1.setOnClickListener(this);
        Button n2 = (Button)findViewById(R.id.btn2);
        n2.setOnClickListener(this);
        Button n3 = (Button)findViewById(R.id.btn3);
        n3.setOnClickListener(this);
        Button n4 = (Button)findViewById(R.id.btn4);
        n4.setOnClickListener(this);
        Button n5 = (Button)findViewById(R.id.btn5);
        n5.setOnClickListener(this);
        Button n6 = (Button)findViewById(R.id.btn6);
        n6.setOnClickListener(this);
        Button n7 = (Button)findViewById(R.id.btn7);
        n7.setOnClickListener(this);
        Button n8 = (Button)findViewById(R.id.btn8);
        n8.setOnClickListener(this);
        Button n9 = (Button)findViewById(R.id.btn9);
        n9.setOnClickListener(this);

        Button punto = (Button)findViewById(R.id.btnpunto);
        punto.setOnClickListener(this);
        Button mas = (Button)findViewById(R.id.btnmas);
        mas.setOnClickListener(this);
        Button menos = (Button)findViewById(R.id.btnmenos);
        menos.setOnClickListener(this);
        Button mul = (Button)findViewById(R.id.btnmul);
        mul.setOnClickListener(this);
        Button div = (Button)findViewById(R.id.btndiv);
        div.setOnClickListener(this);
        Button igual = (Button)findViewById(R.id.btnigual);
        igual.setOnClickListener(this);

        Button raid = (Button)findViewById(R.id.btnraid);
        raid.setOnClickListener(this);
        Button exp = (Button)findViewById(R.id.btnexp);
        exp.setOnClickListener(this);

        Button borrar = (Button)findViewById(R.id.btnborrar);
        borrar.setOnClickListener(this);
        Button limpiar = (Button)findViewById(R.id.btnlimpiar);
        limpiar.setOnClickListener(this);

        Button sen = (Button)findViewById(R.id.btnsen);
        sen.setOnClickListener(this);
        Button cos = (Button)findViewById(R.id.btncos);
        cos.setOnClickListener(this);
        Button tan = (Button)findViewById(R.id.btntan);
        tan.setOnClickListener(this);

        Button btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView pantalla = (TextView)findViewById(R.id.texto);
        int seleccion = v.getId();

        String a = pantalla.getText().toString();

        try {
            switch (seleccion) {
                case R.id.btn0:
                    pantalla.setText(a+"0");
                    break;
                case R.id.btn1:
                    pantalla.setText(a+"1");
                    break;
                case R.id.btn2:
                    pantalla.setText(a+"2");
                    break;
                case R.id.btn3:
                    pantalla.setText(a+"3");
                    break;
                case R.id.btn4:
                    pantalla.setText(a+"4");
                    break;
                case R.id.btn5:
                    pantalla.setText(a+"5");
                    break;
                case R.id.btn6:
                    pantalla.setText(a+"6");
                    break;
                case R.id.btn7:
                    pantalla.setText(a+"7");
                    break;
                case R.id.btn8:
                    pantalla.setText(a+"8");
                    break;
                case R.id.btn9:
                    pantalla.setText(a+"9");
                    break;
                case R.id.btnpunto:
                    if(decimal == false) {
                        pantalla.setText(a + ".");
                        decimal = true;
                    }else{return;}
                    break;
                case R.id.btnmas:
                    suma = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnmenos:
                    resta = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnmul:
                    mult = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btndiv:
                    div = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnigual:
                    numero[1] = Double.parseDouble(a);
                    if(suma == true){
                        resultado = numero[0] + numero[1];
                        pantalla.setText(String.valueOf(resultado));
                    }else if(resta == true){
                        resultado = numero[0] - numero[1];
                        pantalla.setText(String.valueOf(resultado));
                    }else if(mult == true){
                        resultado = numero[0] * numero[1];
                        pantalla.setText(String.valueOf(resultado));
                    }else if(div == true){
                        resultado = numero[0] / numero[1];
                        pantalla.setText(String.valueOf(resultado));
                    }else if(exp == true){
                        resultado = Math.pow(numero[0], numero[1]);
                        pantalla.setText(String.valueOf(resultado));
                    }

                    decimal = false;
                    suma = false;
                    resta = false;
                    mult = false;
                    div = false;
                    sen = false;
                    exp = false;
                    break;
                case R.id.btnborrar:
                    pantalla.getText();
                    if(pantalla.length()>0){
                            pantalla.setText(pantalla.getText().subSequence(0, pantalla.length()-1));
                            pantalla.setText(String.valueOf(pantalla));
                        }
                    break;
                case R.id.btnlimpiar:
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnsen:
                    numero[0] = Double.parseDouble(a);
                    decimal = false;
                    sen = true;
                    resultado = (Math.sin(numero[0] * 2.0 * Math.PI / 360.0));
                    pantalla.setText(String.valueOf(resultado));
                    break;
                case R.id.btncos:
                    numero[0] = Double.parseDouble(a);
                    decimal = false;
                    cos = true;
                    resultado = (Math.cos(numero[0] * Math.PI / 360.0));
                    pantalla.setText(String.valueOf(resultado));
                    break;
                case R.id.btntan:
                    numero[0] = Double.parseDouble(a);
                    decimal = false;
                    tan = true;
                    resultado = (Math.tan(numero[0] * 2.0 * Math.PI / 360.0));
                    pantalla.setText(String.valueOf(resultado));
                    break;
                case R.id.btnexp:
                    exp = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnraid:
                    numero[0] = Double.parseDouble(a);
                    decimal = false;
                    raid = true;
                    resultado = Math.sqrt(numero[0]);
                    pantalla.setText(String.valueOf(resultado));
                    break;
            }
        }catch(Exception e){
            pantalla.setText("error");
        }
    }
}
