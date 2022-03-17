/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuegos_10am;

import java.util.Arrays;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import interfaces.*;
import implementaciones.*;
import entidades.*;
import enumeradores.Sexo;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author lv1013
 */
public class Videojuegos_10am {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IJugadoresDAO jugadoresDAO = DAOSFactory.crearJugadoresDAO();
        Jugador jugador = new Jugador("juan", 32, new GregorianCalendar(), Sexo.FEMENINO);
        jugadoresDAO.agregar(jugador);
        String prueba;
        System.out.println(jugadoresDAO.consultarTodos());
    }
    
}
