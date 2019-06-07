
package Interface;

import Models.Carrera;
import java.util.ArrayList;

/**
 *
 * @author LEO
 */
public interface ICarrera {
    public abstract ArrayList<Carrera> listCarrera();
    public abstract boolean insertCarrera(Carrera carrera);
    public abstract boolean updateCarrera(Carrera carrera);
    public abstract boolean deleteCarrera(int idCarrera);
}
