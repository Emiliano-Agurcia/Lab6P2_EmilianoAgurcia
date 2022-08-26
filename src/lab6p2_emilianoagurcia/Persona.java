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
    
}
