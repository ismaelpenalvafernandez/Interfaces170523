package com.softtek.modelo4;

import com.softtek.modelo3.Coche;
import com.softtek.modelo3.Taller;

public class ClienteDAO {
    IDAO id;

    public IDAO getId() {
        return id;
    }
    public void setId(IDAO id) {
        this.id = id;
    }
    public ClienteDAO(IDAO id) {
        this.id = id;
    }
    public String insertar(Cliente c){
        return id.insertar(c);
    }
}
