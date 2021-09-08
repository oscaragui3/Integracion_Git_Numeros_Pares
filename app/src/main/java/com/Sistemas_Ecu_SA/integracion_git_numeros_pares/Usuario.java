package com.Sistemas_Ecu_SA.integracion_git_numeros_pares;

public class Usuario
{
    public String nombre;
    public String Apellido;

    /*----------------------------------------------------*/
    public String getNombres()
    {
        return nombre;
    }
    public void setNombre(String Nombre)
    {
        nombre = Nombre;
    }
    protected void retornaNOmbre(String Nombre)
    {
        this.nombre = Nombre;
    }

    /*----------------------------------------------------*/
    public String getApellido()
    {
        return Apellido;
    }
    public void setApellido(String apellido)
    {
        Apellido = apellido;
    }
    protected void retornaApellido(String Apellido)
    {
        this.Apellido = Apellido;
    }
    /*----------------------------------------------------*/
}
