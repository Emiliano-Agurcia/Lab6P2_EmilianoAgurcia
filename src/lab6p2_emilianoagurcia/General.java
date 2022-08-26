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
public class General extends Persona{
    String Ocupacion;
    String Horario;
    int SemanasTrabajando;
    double Sueldo;

    public General(String Ocupacion, String Horario, int SemanasTrabajando, double Sueldo) {
        this.Ocupacion = Ocupacion;
        this.Horario = Horario;
        this.SemanasTrabajando = SemanasTrabajando;
        this.Sueldo = Sueldo;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public int getSemanasTrabajando() {
        return SemanasTrabajando;
    }

    public void setSemanasTrabajando(int SemanasTrabajando) {
        this.SemanasTrabajando = SemanasTrabajando;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
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

    @Override
    public String toString() {
        return "General{" + "Ocupacion=" + Ocupacion + ", Horario=" + Horario + ", SemanasTrabajando=" + SemanasTrabajando + ", Sueldo=" + Sueldo + '}';
    }
    
    
    
}
