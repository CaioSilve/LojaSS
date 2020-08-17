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
public class Funcionario {
    private String nome;
    private String ende;
    private String nume;
    private String cida;
    private String cpf;
    private String cep;
    private String emai;
    private String data_nasc;
    private String data_admi;
    private String cargo;
    
    public Funcionario(){
        this.nome = "";
        this.ende = "";
        this.nume = "";
        this.cida = "";
        this.cpf = "";
        this.cep = "";
        this.emai = "";
        this.data_nasc = "";
        this.data_admi = "";
        this.cargo = "";
    }

    public Funcionario(String nome, String ende, String nume, String cida, String cpf, String cep, String emai, String data_nasc, String data_admi, String cargo) {
        this.nome = nome;
        this.ende = ende;
        this.nume = nume;
        this.cida = cida;
        this.cpf = cpf;
        this.cep = cep;
        this.emai = emai;
        this.data_nasc = data_nasc;
        this.data_admi = data_admi;
        this.cargo = cargo;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnde() {
        return ende;
    }

    public void setEnde(String ende) {
        this.ende = ende;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCida() {
        return cida;
    }

    public void setCida(String cida) {
        this.cida = cida;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getData_admi() {
        return data_admi;
    }

    public void setData_admi(String data_admi) {
        this.data_admi = data_admi;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
