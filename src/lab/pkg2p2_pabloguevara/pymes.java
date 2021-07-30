package lab.pkg2p2_pabloguevara;

public class pymes {

    private String nombre;
    private String slogan;
    private String rtn;
    private int cantidadEmpleados;
    private String descripcion;
    private int añoFundacion;
    private int cantidadSocios;
    private String nombreGerenteG;
    private String ubicacion;
    private int ventasUltimoAño;
    private String sectorSocial;
    private long capitalSemilla;

    public pymes() {
    }

    public pymes(String nombre, String slogan, String rtn, int cantidadEmpleados, String descripcion, int añoFundacion, int cantidadSocios, String nombreGerenteG, String ubicacion, int ventasUltimoAño, String sectorSocial, long capitalSemilla) {
        this.nombre = nombre;
        this.slogan = slogan;
        this.rtn = rtn;
        this.cantidadEmpleados = cantidadEmpleados;
        this.descripcion = descripcion;
        this.añoFundacion = añoFundacion;
        this.cantidadSocios = cantidadSocios;
        this.nombreGerenteG = nombreGerenteG;
        this.ubicacion = ubicacion;
        this.ventasUltimoAño = ventasUltimoAño;
        this.sectorSocial = sectorSocial;
        this.capitalSemilla = capitalSemilla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getRtn() {
        return rtn;
    }

    public void setRtn(String rtn) {
        this.rtn = rtn;
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAñoFundacion() {
        return añoFundacion;
    }

    public void setAñoFundacion(int añoFundacion) {
        this.añoFundacion = añoFundacion;
    }

    public int getCantidadSocios() {
        return cantidadSocios;
    }

    public void setCantidadSocios(int cantidadSocios) {
        this.cantidadSocios = cantidadSocios;
    }

    public String getNombreGerenteG() {
        return nombreGerenteG;
    }

    public void setNombreGerenteG(String nombreGerenteG) {
        this.nombreGerenteG = nombreGerenteG;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getVentasUltimoAño() {
        return ventasUltimoAño;
    }

    public void setVentasUltimoAño(int ventasUltimoAño) {
        this.ventasUltimoAño = ventasUltimoAño;
    }

    public String getSectorSocial() {
        return sectorSocial;
    }

    public void setSectorSocial(String sectorSocial) {
        this.sectorSocial = sectorSocial;
    }

    public long getCapitalSemilla() {
        return capitalSemilla;
    }

    public void setCapitalSemilla(long capitalSemilla) {
        this.capitalSemilla = capitalSemilla;
    }

    @Override
    public String toString() {
        return "pymes: {" + "Nombre=" + nombre + ", Slogan=" + slogan + ", rtn=" + rtn + ", Cantidad de empleados=" + cantidadEmpleados + ", Descripcion=" + descripcion + ", Año fundacion=" + añoFundacion + ", Cantidad de socios=" + cantidadSocios + ", Nombre del gerente general=" + nombreGerenteG + ", ubicacion=" + ubicacion + ", ventas del ultimo año=" + ventasUltimoAño + ", sector social=" + sectorSocial + ", capital semilla=" + capitalSemilla + '}';
    }
    
    
}
