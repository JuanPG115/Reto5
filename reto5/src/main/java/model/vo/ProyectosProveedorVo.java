package model.vo;

public class ProyectosProveedorVo {

    private int ID_Compra;
    private String Constructora;
    private String Banco;

    public ProyectosProveedorVo(int ID_Compra, String Constructora, String Banco) {
        this.ID_Compra = ID_Compra;
        this.Constructora = Constructora;
        this.Banco = Banco;
    }

    public int getID_Compra() {
        return ID_Compra;
    }

    public void setID_Compra(int ID_Compra) {
        this.ID_Compra = ID_Compra;
    }

    public String getConstructora() {
        return Constructora;
    }

    public void setConstructora(String Constructora) {
        this.Constructora = Constructora;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

}
