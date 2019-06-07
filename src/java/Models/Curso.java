/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


public class Curso {
    private int idCurso;
    private String description;
    private String state;
    private String Cursocol;

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCursocol() {
        return Cursocol;
    }

    public void setCursocol(String Cursocol) {
        this.Cursocol = Cursocol;
    }

    @Override
    public String toString() {
        return "Curso{" + "idCurso=" + idCurso + ", description=" + description + ", state=" + state + ", Cursocol=" + Cursocol + '}';
    }
    
    
    
}
