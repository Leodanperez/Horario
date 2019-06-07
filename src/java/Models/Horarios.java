package Models;

import java.sql.Date;

/**
 *
 * @author LEO
 */
public class Horarios {

    //modelar nuestra base datos
    //creamos tipo de datos privados
    private int idHorario;
    private String description;
    private String startTime;
    private String endtime;
    private String state;
    private String day;
    private int idProfesor;
    private int idCurso;
    private int idHora;

    //creamos un constructor vacio
    public Horarios() {
    }

    //asignamos un valor al constructor el idhorario
    public Horarios(int idHorario) {
        this.idHorario = idHorario;
    }

    //creamos sus metodos geter and seter
    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdHora() {
        return idHora;
    }

    public void setIdHora(int idHora) {
        this.idHora = idHora;
    }
    
}
