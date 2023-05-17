package com.softtek.presentacion;

import com.softtek.modelo4.AccesoDesarrollo;
import com.softtek.modelo4.AccesoProduccion;
import com.softtek.modelo4.Cliente;
import com.softtek.modelo4.ClienteDAO;

public class MainIDAO {
    public static void main(String[] args) {
        ClienteDAO dao = new ClienteDAO(new AccesoDesarrollo());
        Cliente cliente = new Cliente("ismael", "dwedww");
        System.out.println(dao.insertar(cliente));

        dao.setId(new AccesoProduccion());
        System.out.println(dao.insertar(cliente));
    }
}
