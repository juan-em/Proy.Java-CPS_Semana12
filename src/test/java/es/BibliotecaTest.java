
package es;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {
    
    @Test
    public void test1(){
        Biblioteca b = new Biblioteca("00000",100000,"0000","00000","General");
        assertTrue(b.cl_valido()&&b.cu_valido()&&b.cp_plan()&&b.password_valida()&&b.prestamos_valido());
        if (b.cl_valido()&&b.cu_valido()&&b.cp_plan()&&b.password_valida()&&b.prestamos_valido()){
            System.out.println("Éxito de la operación");
        }
    }
    @Test
    public void test2(){
        Biblioteca b = new Biblioteca("Zzzzz",999999,"9999","Zzzzz","Reserva");
        assertTrue(b.cl_valido()&&b.cu_valido()&&b.cp_plan()&&b.password_valida()&&b.prestamos_valido());
        if (b.cl_valido()&&b.cu_valido()&&b.cp_plan()&&b.password_valida()&&b.prestamos_valido()){
            System.out.println("Éxito de la operación");
        }
    }
    
    @Test
    public void test3(){
        Biblioteca b = new Biblioteca("Aaaa",100001,"0001","Aaaaa","General");
        assertFalse(b.cl_valido()&&b.cu_valido()&&b.cp_plan()&&b.password_valida()&&b.prestamos_valido());
        if (!b.cl_valido()){
            System.out.println("Código de libro erróneo");
        }
    }
    @Test
    public void test4(){
        Biblioteca b = new Biblioteca("999999",999998,"9998","99999","Reserva");
        assertFalse(b.cl_valido()&&b.cu_valido()&&b.cp_plan()&&b.password_valida()&&b.prestamos_valido());
        if (!b.cl_valido()){
            System.out.println("Código de libro erróneo");
        }
    }
    @Test
    public void test5(){
        Biblioteca b = new Biblioteca("1aaa1",99999,"0000","z999z","General");
        assertFalse(b.cl_valido()&&b.cu_valido()&&b.cp_plan()&&b.password_valida()&&b.prestamos_valido());
        if (!b.cu_valido()){
            System.out.println("Código de usuario erróneo");
        }
    }
    @Test
    public void test6(){
        Biblioteca b = new Biblioteca("a111a",1000000,"9999","9zzz9","Reserva");
        assertFalse(b.cl_valido()&&b.cu_valido()&&b.cp_plan()&&b.password_valida()&&b.prestamos_valido());
        if (!b.cu_valido()){
            System.out.println("Código de usuario erróneo");
        }
    }
    @Test
    public void test7(){
        Biblioteca b = new Biblioteca("d1ad8",555555,"000","5d7x4","General");
        assertFalse(b.cl_valido()&&b.cu_valido()&&b.cp_plan()&&b.password_valida()&&b.prestamos_valido());
        if (!b.cp_plan()){
            System.out.println("Código de plan erróneo");
        }
    }
    @Test
    public void test8(){
        Biblioteca b = new Biblioteca("e55sq",777777,"10000","00000","Reserva");
        assertFalse(b.cl_valido()&&b.cu_valido()&&b.cp_plan()&&b.password_valida()&&b.prestamos_valido());
        if (!b.cp_plan()){
            System.out.println("Código de plan erróneo");
        }
    }
    @Test
    public void test9(){
        Biblioteca b = new Biblioteca("E4e17",222222,"1234","0000","General");
        assertFalse(b.cl_valido()&&b.cu_valido()&&b.cp_plan()&&b.password_valida()&&b.prestamos_valido());
        if (!b.password_valida()){
            System.out.println("Contraseña errónea");
        }
    }
    @Test
    public void test10(){
        Biblioteca b = new Biblioteca("9sg0F",123456,"9876","zzzzzz","Reserva");
        assertFalse(b.cl_valido()&&b.cu_valido()&&b.cp_plan()&&b.password_valida()&&b.prestamos_valido());
        if (!b.password_valida()){
            System.out.println("Contraseña errónea");
        }
    }
    @Test
    public void test11(){
        Biblioteca b = new Biblioteca("8fedR",987654,"3743","4wD6f","Generar");
        assertFalse(b.cl_valido()&&b.cu_valido()&&b.cp_plan()&&b.password_valida()&&b.prestamos_valido());
        if (!b.prestamos_valido()){
            System.out.println("Tipo de préstamo erróneo");
        }
    }
    @Test
    public void test12(){
        Biblioteca b = new Biblioteca("34ggY",246801,"3743","Rr341","Reservas");
        assertFalse(b.cl_valido()&&b.cu_valido()&&b.cp_plan()&&b.password_valida()&&b.prestamos_valido());
        if (!b.prestamos_valido()){
            System.out.println("Tipo de préstamo erróneo");
        }
    }
    
}
