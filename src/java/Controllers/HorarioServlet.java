package Controllers;

import Dao.DaoHorario;
import Dao.DbConnection;
import Models.Horarios;
import Models.Horas;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LEO
 */
@WebServlet(name = "HorarioServlet", urlPatterns = {"/horario"})
public class HorarioServlet extends HttpServlet {

    //VARIABLES GLOBALES
    private DbConnection conn;
    private Horarios horario;
    private DaoHorario daoHorario;
    private RequestDispatcher rd;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        if ("listarhorario".equals(action)) {
            this.VerHorario(request, response);
        } else if ("eliminaHorario".equals(action)) {
            this.eliminarHorario(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            /*creamos tipos de datos intero y estring con los nombres
            para resivir los valores de las cajas de texto
            */
            Integer codigo = Integer.parseInt(request.getParameter("codigo"));
            String descrip = request.getParameter("descripcion");
            Integer profe = Integer.parseInt(request.getParameter("profesor"));
           
            String tiempoin = request.getParameter("tiempoinicio");
            String tiempofi = request.getParameter("tiempofinal");
            String dia = request.getParameter("dia");
            
            //instanciar metodo de la clase Horarios
            horario = new Horarios();
            
            //seteamos y cargamos todo lo que hemos obtenido
            horario.setIdHorario(codigo);
            horario.setDescription(descrip);
            horario.setIdProfesor(profe);
            horario.setStartTime(tiempoin);
            horario.setDay(dia);
            horario.setEndtime(tiempofi);

            //aqui lo entregamos a nuestro dao para que inserte en la base de datos
            daoHorario = new DaoHorario();

            boolean status = daoHorario.insertHorarios(horario);
            String msg;
            if (status) {
                msg = "Los datos se guardaron correctamente";
                this.VerHorario(request, response);
            } else {
                msg = "Error al guardar los datos";
            }

            //conn.disconect();
            //RequestDispatcher rd;

            //compartir el Msg por Express Lenguaje
            request.setAttribute("mensaje", msg);
            //Enviamos respuesta. Renderizamos la vista mensaje.jsp
            rd = request.getRequestDispatcher("insert.jsp");
            rd.forward(request, response);
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void VerHorario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //conn = new DbConnection();
        daoHorario = new DaoHorario();
        List<Horas> list = daoHorario.listHoras();
        //conn.disconect();

        //Compartir los atributos de objeto modulo
        request.setAttribute("verhorario", list);

        //Enviamos respuesta. Renderizamos la vista ms_Modulos.jsp
        rd = request.getRequestDispatcher("listHorario.jsp");
        rd.forward(request, response);
    }

    private void eliminarHorario(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
