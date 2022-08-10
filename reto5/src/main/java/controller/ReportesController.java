package controller;

import java.util.ArrayList;
import model.dao.InfoProyectosDao;
import model.dao.LiderDao;
import model.dao.ProyectosProveedorDao;
import model.vo.InfoProyectosVo;
import model.vo.LiderVo;
import model.vo.ProyectosProveedorVo;

public class ReportesController {

    LiderDao lider;
    InfoProyectosDao proyectos;
    ProyectosProveedorDao proyectosProveedor;

    public ReportesController() {
        lider = new LiderDao();
        proyectos = new InfoProyectosDao();
        proyectosProveedor = new ProyectosProveedorDao();
    }

    public ArrayList<LiderVo> retornoLider() {
        return this.lider.infoLider();
    }

    public ArrayList<InfoProyectosVo> retornoProyectos() {
        return this.proyectos.infoProyectos();
    }
    
    public ArrayList<ProyectosProveedorVo> retornoProyectosProveedor() {
        return this.proyectosProveedor.infoProyectosProveedor();
    }

}
