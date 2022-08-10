package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.vo.InfoProyectosVo;
import model.vo.LiderVo;
import util.JDBCUtilities;

public class InfoProyectosDao {

    JDBCUtilities conexion;

    public InfoProyectosDao() {
        
        conexion = new JDBCUtilities();
        
    }
    
    public ArrayList<InfoProyectosVo> infoProyectos() {

        ArrayList<InfoProyectosVo> infoProyectosArr = new ArrayList<>();

        try {
            String consulta = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad "
                    + "From Proyecto "
                    + "WHERE Clasificacion = 'Casa Campestre' AND Ciudad IN ('Santa Marta', 'Cartagena', 'Barranquilla')";

            PreparedStatement statement = conexion.getConnection().prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            ResultSet result = statement.executeQuery();

            int j = 0;
            while (result.next()) {
                InfoProyectosVo proyecto = new InfoProyectosVo(
                        Integer.parseInt(result.getString("ID_Proyecto")),
                        result.getString("Constructora"),
                        result.getString("Numero_Habitaciones"),
                        result.getString("Ciudad"));
                infoProyectosArr.add(proyecto);
                j++;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        conexion.closeConnection();
        return infoProyectosArr;
    }

}
