package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.vo.LiderVo;
import util.JDBCUtilities;

public class LiderDao {

    JDBCUtilities conexion;

    public LiderDao() {

        conexion = new JDBCUtilities();

    }

    public ArrayList<LiderVo> infoLider() {

        ArrayList<LiderVo> liderArr = new ArrayList<>();

        try {
            String consulta = "SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia "
                    + "From Lider "
                    + "ORDER BY Ciudad_Residencia";

            PreparedStatement statement = conexion.getConnection().prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            ResultSet result = statement.executeQuery();

            int j = 0;
            while (result.next()) {
                LiderVo lider = new LiderVo(
                        Integer.parseInt(result.getString("ID_Lider")),
                        result.getString("Nombre"),
                        result.getString("Primer_Apellido"),
                        result.getString("Ciudad_Residencia"));
                liderArr.add(lider);
                j++;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        conexion.closeConnection();
        return liderArr;
    }

}
