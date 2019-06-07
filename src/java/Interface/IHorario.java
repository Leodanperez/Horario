
package Interface;

import Models.Horarios;
import Models.Horas;
import java.util.ArrayList;

/**
 *
 * @author LEO
 */
public interface IHorario {
    public abstract ArrayList<Horarios> listHorarios();
    public abstract boolean insertHorarios(Horarios horario);
    public abstract boolean updateHorarios(Horarios horario);
    public abstract boolean deleteHorarios(int idHorario);
    public abstract ArrayList<Horas> listHoras();
}
