package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
public class Cliente {
    private String Cpf;
    private String Nome;
    private String Ende;
    private String Nume;
    private String Cida;
    private String Esta;
    private String Tele1;
    private String Tele2;
    private String Data_Nasc;
    private String Cep;
    private String Emai;

    public Cliente() {
        this.Cpf = "";
        this.Nome = "";
        this.Ende = "";
        this.Nume = "";
        this.Esta = "";
        this.Cida = "";
        this.Tele1 = "";
        this.Tele2 = "";
        this.Data_Nasc = "";
        this.Cep = "";
        this.Emai = "";
    }

    public Cliente(String Cpf, String Nome, String Ende, String Nume, String Esta, String Cida, String Tele1, String Tele2, String Data_Nasc, String Cep, String Emai) {
        this.Cpf = Cpf;
        this.Nome = Nome;
        this.Ende = Ende;
        this.Nume = Nume;
        this.Esta = Esta;
        this.Cida = Cida;
        this.Tele1 = Tele1;
        this.Tele2 = Tele2;
        this.Data_Nasc = Data_Nasc;
        this.Cep = Cep;
        this.Emai = Emai;
    }
    
    

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEnde() {
        return Ende;
    }

    public void setEnde(String Ende) {
        this.Ende = Ende;
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String Nume) {
        this.Nume = Nume;
    }
    
    public String getEsta(){
        return Esta;
    }
    
    public void setEsta(String Esta){
       this.Esta = Esta;
    }

    public String getCida() {
        return Cida;
    }

    public void setCida(String Cida) {
        this.Cida = Cida;
    }

    public String getTele1() {
        return Tele1;
    }

    public void setTele1(String Tele1) {
        this.Tele1 = Tele1;
    }

    public String getTele2() {
        return Tele2;
    }

    public void setTele2(String Tele2) {
        this.Tele2 = Tele2;
    }

    public String getData_Nasc() {
        return Data_Nasc;
    }

    public void setData_Nasc(String Data_Nasc) {
        this.Data_Nasc = Data_Nasc;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    public String getEmai() {
        return Emai;
    }

    public void setEmai(String Emai) {
        this.Emai = Emai;
    }
    
    
    
    
}
