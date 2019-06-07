/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Models.Curso;
import java.util.ArrayList;

/**
 *
 * @author LEO
 */
public interface ICurso {
    public abstract ArrayList<Curso> listCurso();
    public abstract boolean insertCurso(Curso curso);
    public abstract boolean updateCurso(Curso curso);
    public abstract boolean deleteCurso(int idCurso);
}
