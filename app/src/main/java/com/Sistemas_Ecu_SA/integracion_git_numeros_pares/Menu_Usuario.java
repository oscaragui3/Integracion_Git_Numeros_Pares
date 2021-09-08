package com.Sistemas_Ecu_SA.integracion_git_numeros_pares;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
public class Menu_Usuario extends AppCompatActivity
{
    Usuario misdatos= new Usuario(); //se crea la clase usuario como parametro global en donde alojara la informacion
    //del usuario que ingreso al sistema.
    private TextView usuario_autenticado;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_usuario);
        usuario_autenticado=findViewById(R.id.txt_usuarios_logueado);
        MostrarNombres();
    }
    public void MostrarNombres()
    {
        this.retorno_info();
    }
    protected  void retorno_info()
    {
        Bundle retorna=getIntent().getExtras();
        String nombre=retorna.getString("Nombre");
        String apellido=retorna.getString("Apellido");

        usuario_autenticado.setText(" "+nombre+" "+apellido);

    }
}