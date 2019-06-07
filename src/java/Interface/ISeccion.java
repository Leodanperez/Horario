/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Modelo.Seccion;
import java.util.ArrayList;

/**
 *
 * @author LEO
 */
public interface ISeccion {
    public abstract ArrayList<Seccion> listSeccion();
    public abstract boolean insertSeccion(Seccion seccion);
    public abstract boolean updateSeccion(Seccion seccion);
    public abstract boolean deleteSeccion(int idSeccion);
}
