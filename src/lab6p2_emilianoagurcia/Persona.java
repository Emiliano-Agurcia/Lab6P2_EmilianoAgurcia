/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_emilianoagurcia;

/**
 *
 * @author emili
 */
public class Persona {
    String ID;
    String Nombre;
    int Edad;
    char Sexo;
    String EstadoCivil;
    double Altura;
    double Peso;

    public Persona(String ID, String Nombre, int Edad, char Sexo, String EstadoCivil, double Altura, double Peso) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.EstadoCivil = EstadoCivil;
        this.Altura = Altura;
        this.Peso = Peso;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }
    
}
