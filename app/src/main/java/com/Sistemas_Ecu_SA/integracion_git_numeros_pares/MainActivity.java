package com.Sistemas_Ecu_SA.integracion_git_numeros_pares;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    /*====================================================*/
        /*DECLARACION DE VARIABLE GLOBALES Y LOCALES*/
        private Button generar;
        private Button EnviarDatos;
        private TextView numero;
        private String NombreUsuario;
        private String ApellidoUsuario;
    /*====================================================*/
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero=findViewById(R.id.txtNumero);
        generar=findViewById(R.id.btn_generar);
        EnviarDatos=findViewById(R.id.btn_enviar_datos);
        NombreUsuario="Oscar Steeven";
        ApellidoUsuario="Aguilar Luzuriaga ";
        generar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                IngresarNumero(numero);
            }
        });
        EnviarDatos.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Retorna_Datos(NombreUsuario,ApellidoUsuario);
            }
        });

    }
    public void IngresarNumero(TextView numero)
        {
            this.EjecutaNmero(numero);
        }
    protected void EjecutaNmero(TextView numero)
        {
                int num=Integer.parseInt(numero.getText().toString());
                if(num==0)
                {
                    this.Verifica_divisible_para_Cero(num);
                }
                else if(num%2==0)
                {
                    Toast.makeText(this, "Numero PAR", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(this, "Numero IMPAR", Toast.LENGTH_SHORT).show();
                }


        }
    protected void Verifica_divisible_para_Cero(int num)
    {
        if(num==0)
        {
            Toast.makeText(this, "Numero Ingresado No ES DIVISIBLE ", Toast.LENGTH_SHORT).show();
        }
    }


    public void Retorna_Datos(String NombreUsuario,String ApellidoUsuario)
    {
        this.Enviar_datos_a_otra_ACTVITY(NombreUsuario, ApellidoUsuario);
    }

    protected void Enviar_datos_a_otra_ACTVITY(String NombreUsuario,String ApellidoUsuario)
    {
        Usuario misdatos= new Usuario();
        misdatos.setNombre(NombreUsuario);
        misdatos.setApellido(ApellidoUsuario);
        //aca se le manda la nueva vista a otra pestaña del usuario logeado como tal
        //IngresarNumero(numero);
        Intent i=new Intent(this, Menu_Usuario.class);
        i.putExtra("Nombre",misdatos.getNombres());
        i.putExtra("Apellido",misdatos.getApellido());
        startActivity(i);

    }
}