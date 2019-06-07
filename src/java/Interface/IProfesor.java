/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Modelo.Profesor;
import java.util.ArrayList;

/**
 *
 * @author LEO
 */
public interface IProfesor {
    public abstract ArrayList<Profesor> listProfesor();
    public abstract boolean insertProfesor(Profesor profesor);
    public abstract boolean updateProfesor(Profesor profesor);
    public abstract boolean deleteProfesor(int idProfesor);
}
