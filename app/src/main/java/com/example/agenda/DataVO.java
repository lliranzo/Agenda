package com.example.agenda;

public class DataVO{

    private String name;
    private String sex;
    private String fnaciomiento;
    private String carrera;
    private int foto;

    public  DataVO(){

    }

    public DataVO(String name, String sex, String fnaciomiento, String carrera, int foto) {
        this.name = name;
        this.sex = sex;
        this.fnaciomiento = fnaciomiento;
        this.carrera = carrera;
        this.foto = foto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFnaciomiento() {
        return fnaciomiento;
    }

    public void setFnaciomiento(String fnaciomiento) {
        this.fnaciomiento = fnaciomiento;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
