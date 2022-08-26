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
public class Ropa extends Objeto{
    String Talla;
    String TipoTela;
    String Pais;

    public Ropa(String Talla, String TipoTela, String Pais) {
        this.Talla = Talla;
        this.TipoTela = TipoTela;
        this.Pais = Pais;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String Talla) {
        this.Talla = Talla;
    }

    public String getTipoTela() {
        return TipoTela;
    }

    public void setTipoTela(String TipoTela) {
        this.TipoTela = TipoTela;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public Persona getUsuario() {
        return Usuario;
    }

    public void setUsuario(Persona Usuario) {
        this.Usuario = Usuario;
    }

    public java.awt.Color getColor() {
        return Color;
    }

    public void setColor(java.awt.Color Color) {
        this.Color = Color;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    public String getCalidad() {
        return Calidad;
    }

    public void setCalidad(String Calidad) {
        this.Calidad = Calidad;
    }

    @Override
    public String toString() {
        return "Ropa{" + "Talla=" + Talla + ", TipoTela=" + TipoTela + ", Pais=" + Pais + '}';
    }
    
}
