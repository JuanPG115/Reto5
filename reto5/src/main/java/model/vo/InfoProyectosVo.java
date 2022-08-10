package model.vo;

public class InfoProyectosVo {

    private int ID_Proyecto;
    private String Constructora;
    private String Numero_Habitaciones;
    private String Ciudad;

    public InfoProyectosVo(int ID_Proyecto, String Constructora, String Numero_Habitaciones, String Ciudad) {
        this.ID_Proyecto = ID_Proyecto;
        this.Constructora = Constructora;
        this.Numero_Habitaciones = Numero_Habitaciones;
        this.Ciudad = Ciudad;
    }

    public int getID_Proyecto() {
        return ID_Proyecto;
    }

    public void setID_Proyecto(int ID_Proyecto) {
        this.ID_Proyecto = ID_Proyecto;
    }

    public String getConstructora() {
        return Constructora;
    }

    public void setConstructora(String Constructora) {
        this.Constructora = Constructora;
    }

    public String getNumero_Habitaciones() {
        return Numero_Habitaciones;
    }

    public void setNumero_Habitaciones(String Numero_Habitaciones) {
        this.Numero_Habitaciones = Numero_Habitaciones;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

}
