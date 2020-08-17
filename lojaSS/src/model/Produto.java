/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Pichau
 */
public class Produto {
    private String tipo;
    private String desc;
    private String marca;
    private double valor;
    private int esto_atua;
    private int esto_min;
    private int esto_max;
    private String tama;
    
    public Produto(){
        this.marca = "";
        this.desc = "";
        this.tipo = "";
        this.valor = 0.0;
        this.esto_atua = 0;
        this.esto_max = 0;
        this.esto_min = 0;
        this.tama = "";
    }

    public Produto(String tipo, String desc, String marca, double valor, int esto_atua, int esto_min, int esto_max, String tama) {
        this.tipo = tipo;
        this.desc = desc;
        this.marca = marca;
        this.valor = valor;
        this.esto_atua = esto_atua;
        this.esto_min = esto_min;
        this.esto_max = esto_max;
        this.tama = tama;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEsto_atua() {
        return esto_atua;
    }

    public void setEsto_atua(int esto_atua) {
        this.esto_atua = esto_atua;
    }

    public int getEsto_min() {
        return esto_min;
    }

    public void setEsto_min(int esto_min) {
        this.esto_min = esto_min;
    }

    public int getEsto_max() {
        return esto_max;
    }

    public void setEsto_max(int esto_max) {
        this.esto_max = esto_max;
    }
    
    public String getTama() {
        return tama;
    }

    public void setTama(String tama) {
        this.tama = tama;
    }
    
    
}
