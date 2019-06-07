/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Models.Horarios;
import java.util.ArrayList;
import Interface.IHorario;
import Models.Horas;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author LEO
 */
public class DaoHorario implements IHorario {

    private Horarios horarios;
    private Horas horas;
    private CallableStatement object;
    private ResultSet rs;
    private String query;
    private Connection cn;
    private DbConnection conn;
    private PreparedStatement pst;

    @Override
    public ArrayList<Horarios> listHorarios() {
        ArrayList<Horarios> list = new ArrayList<>();

        conn = new DbConnection();
        cn = conn.getConnection();

        query = "{CALL sp_listar()}";

        if (cn != null) {
            try {
                object = conn.getConnection().prepareCall(query);
                rs = object.executeQuery();

                while (rs.next()) {
                    horarios = new Horarios();
                    horarios.setIdHorario(rs.getInt("idHorario"));
                    horarios.setDescription(rs.getString("description"));
                    horarios.setState(rs.getString("state"));
                    horarios.setIdProfesor(rs.getInt("idProfesor"));
                    horarios.setEndtime(rs.getString("endTime"));
                    horarios.setDay(rs.getString("day"));
                    horarios.setStartTime(rs.getString("starTime"));
                    list.add(horarios);
                }

            } catch (SQLException e) {
                System.out.println("Error al listar " + e.getMessage());
            } finally {
                try {
                    cn.close();
                } catch (SQLException e) {
                    System.out.println("Error " + e.getMessage());
                }
            }
        }

        return list;
    }

    @Override
    public boolean insertHorarios(Horarios horario) {
        boolean insert = false;
        int res;

        conn = new DbConnection();
        cn = conn.getConnection();

        if (cn != null) {
            try {
                object = cn.prepareCall("CALL sp_inserhorario(?,?,?,?,?,?,?)");
                object.setInt(1, horario.getIdHorario());
                object.setString(2, horario.getDescription());
                object.setString(3, "A");
                object.setInt(4, horario.getIdProfesor());
                object.setString(5, horario.getEndtime());
                object.setString(6, horario.getDay());
                object.setString(7, horario.getStartTime());
                res = object.executeUpdate();
                if (res == 1) {
                    insert = true;
                }
            } catch (SQLException ex) {
                System.out.println("Error alinsertar " + ex.getMessage());
            } finally {
                try {
                    cn.close();
                } catch (SQLException e) {
                    System.out.println("Error" + e.getMessage());
                }
            }
        }

        return insert;
    }

    @Override
    public boolean updateHorarios(Horarios horario) {
        boolean update = false;
        int res;
        conn = new DbConnection();
        cn = conn.getConnection();

        if (cn != null) {
            try {
                object = cn.prepareCall("CALL sp_updatecategoria(?,?,?)");

                res = object.executeUpdate();
                if (res == 1) {
                    update = true;
                }
            } catch (SQLException ex) {
                System.out.println("Error actualizar " + ex.getMessage());
            } finally {
                try {
                    cn.close();
                } catch (SQLException e) {
                    System.out.println("Error" + e.getMessage());
                }
            }
        }
        return update;
    }

    @Override
    public boolean deleteHorarios(int idHorario) {
        boolean delete = false;

        conn = new DbConnection();
        cn = conn.getConnection();

        if (cn != null) {
            try {
                object = cn.prepareCall("CALL sp_eliminarcategoria(?)");
                object.setInt(1, idHorario);
                object.executeUpdate();

                delete = true;
            } catch (SQLException ex) {
                System.out.println("Error al eliminar " + ex.getMessage());
            } finally {
                try {
                    cn.close();
                } catch (SQLException e) {
                    System.out.println("Error" + e.getMessage());
                }
            }
        }

        return delete;
    }

    @Override
    public ArrayList<Horas> listHoras() {
        ArrayList<Horas> list = new ArrayList<>();

        conn = new DbConnection();
        cn = conn.getConnection();

        query = "SELECT CONCAT(h.hora_inicio,\" - \",h.hora_fin) AS Hora,\n" +
                            "	MAX(CASE WHEN h.dia = 'Lunes' THEN h.nombre ELSE '' END) Lunes,\n" +
                            "	MAX(CASE WHEN h.dia = 'Martes' THEN h.nombre ELSE '' END) Martes,\n" +
                            "	MAX(CASE WHEN h.dia = 'Miercoles' THEN h.nombre ELSE '' END) Miercoles,\n" +
                            "	MAX(CASE WHEN h.dia = 'Jueves' THEN h.nombre ELSE '' END) Jueves,\n" +
                            "	MAX(CASE WHEN h.dia = 'Viernes' THEN h.nombre ELSE '' END) Viernes,\n" +
                            "	MAX(CASE WHEN h.dia = 'Sabado' THEN h.nombre ELSE '' END) Sabado\n" +
                            "\n" +
                            "	FROM horario hs\n" +
                            "	INNER JOIN hora h ON h.idHora = hs.idHora\n" +
                            "	INNER JOIN curso c ON c.idCurso = hs.idCurso\n" +
                            "	GROUP BY hora\n" +
                            "	ORDER BY hora ASC;";

        if (cn != null) {
            try {
                pst = conn.getConnection().prepareStatement(query);
                rs = pst.executeQuery();

                while (rs.next()) {
                    horas = new Horas();
                    horas.setHora(rs.getString("Hora"));
                    horas.setLunes(rs.getString("Lunes"));
                    horas.setMartes(rs.getString("Martes"));
                    horas.setMiercoles(rs.getString("Miercoles"));
                    horas.setJueves(rs.getString("Jueves"));
                    horas.setViernes(rs.getString("Viernes"));
                    horas.setSabado(rs.getString("Sabado"));
                    list.add(horas);
                }

            } catch (SQLException e) {
                System.out.println("Error al listar horas" + e.getMessage());
            } finally {
                try {
                    cn.close();
                } catch (SQLException e) {
                    System.out.println("Error " + e.getMessage());
                }
            }
        }

        return list;
    }

}
