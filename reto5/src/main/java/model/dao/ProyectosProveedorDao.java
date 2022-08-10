package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.vo.LiderVo;
import model.vo.ProyectosProveedorVo;
import util.JDBCUtilities;

public class ProyectosProveedorDao {

    JDBCUtilities conexion;

    public ProyectosProveedorDao() {

        conexion = new JDBCUtilities();

    }

    public ArrayList<ProyectosProveedorVo> infoProyectosProveedor() {

        ArrayList<ProyectosProveedorVo> proyectosProveedorArr = new ArrayList<>();

        try {
            String consulta = "SELECT ID_Compra, Constructora, Proyecto.Banco_Vinculado AS Banco_Vinculado FROM Compra "
                    + "INNER JOIN Proyecto ON Proyecto.ID_Proyecto = Compra.ID_Proyecto "
                    + "WHERE Compra.Proveedor = 'Homecenter' AND Proyecto.Ciudad = 'Salento'";

            PreparedStatement statement = conexion.getConnection().prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            ResultSet result = statement.executeQuery();

            int j = 0;
            while (result.next()) {
                ProyectosProveedorVo proyecto = new ProyectosProveedorVo(
                        Integer.parseInt(result.getString("ID_Compra")),
                        result.getString("Constructora"),
                        result.getString("Banco_Vinculado"));
                proyectosProveedorArr.add(proyecto);
                j++;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        conexion.closeConnection();
        return proyectosProveedorArr;
    }

}
