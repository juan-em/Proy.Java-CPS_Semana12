
package es;

public class Biblioteca {
    private String codigo_libro;
    private int codigo_usuario;
    private String codigo_plan;
    private String password;
    private String prestamo;

    public Biblioteca(String codigo_libro, int codigo_usuario, String codigo_plan, String password, String prestamo) {
        this.codigo_libro = codigo_libro;
        this.codigo_usuario = codigo_usuario;
        this.codigo_plan = codigo_plan;
        this.password = password;
        this.prestamo = prestamo;
    }
    
    public boolean cl_valido(){
        return codigo_libro.length() == 5;
    }
    
    public boolean cu_valido(){
        return codigo_usuario >= 100000 && codigo_usuario<= 999999; 
    }
    
    public boolean cp_plan(){
        boolean val = true;
        if (codigo_plan.length() == 0||codigo_plan.length()!=4) {val = false;}
        for (int x = 0; x < codigo_plan.length(); x++) {
            char c = codigo_plan.charAt(x);
            if (!(c >= '0' && c <= '9')) {val = false;break;}
        }
        return val;
    }
    
    public boolean password_valida(){
        return password.length() == 5;
    }
    
    public boolean prestamos_valido(){
        return prestamo.equals("General") || prestamo.equals("Reserva");
    }
    
}
