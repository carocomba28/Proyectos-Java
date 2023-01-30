/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_comba;

/**
 *
 * @author Usuario
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private String cargo;
    private float antiguedad;
    private int cantidadhijos;
    private float sueldobruto;
    
    public Empleado()
    {
        nombre="";
        apellido="";
        cargo="";
        antiguedad=0;
        cantidadhijos=0;
        sueldobruto=0.0f;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getCantidadhijos() {
        return cantidadhijos;
    }

    public void setCantidadhijos(int cantidadhijos) {
        this.cantidadhijos = cantidadhijos;
    }

    public float getSueldobruto() {
        return sueldobruto;
    }

    public void setSueldobruto(float sueldobruto) {
        this.sueldobruto = sueldobruto;
    }
    
    public float calcularDescuentos()
    {
        float descuento;
        descuento=sueldobruto+(sueldobruto*0.18f);
        return descuento;
    }
    public float calcularAsignacionesFamiliares()
    {
        float hijos;
        if (cantidadhijos>=7)
        {
            hijos=2600*7;
        }
        else
        {
            hijos=cantidadhijos*2600;
        }
        return hijos;
    }
    public float calcularPlusAntiguedad()
    {
       float años;
       años=0.01f*antiguedad;
       float plus;
       if (cargo=="Gerente")
       {
           plus=sueldobruto+(sueldobruto*años)+10000;
       }
       else
       {
        plus=sueldobruto+(sueldobruto*años);
       }
       return plus;
    }
    
    public float calcularSueldoNeto()
    {
        float sueldoneto;
        sueldoneto=sueldobruto+calcularAsignacionesFamiliares()+calcularPlusAntiguedad()-calcularDescuentos();
        return sueldoneto;
    }
}
