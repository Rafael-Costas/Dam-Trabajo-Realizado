package controlador;

import Vista.añadir;
import modelo.añadirDao;
import modelo.gatos;

public class Coordinador {
private añadir añadir;
private añadirDao dao;

public añadir getAñadir() {
	return añadir;
}

public añadirDao getDao() {
	return dao;
}

public void setDao(añadirDao dao) {
	this.dao = dao;
}

public void setAñadir(añadir añadir) {
	this.añadir = añadir;
}

public void mostrarAñadir() {
	añadir.setVisible(true);
}

public void subir(gatos gato) {
	dao.registrarPersona(gato);
}


}
