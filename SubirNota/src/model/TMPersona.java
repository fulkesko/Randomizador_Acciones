package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TMPersona extends AbstractTableModel {

    private List<Persona> lista;

    public TMPersona(List<Persona> lista) {

    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        Persona p = lista.get(fila);
        if (columna == 0) {
            return p.getId();
        } else {
            return p.getNombre();
        }
    }

    public void setLista(List<Persona> lista) {
        this.lista = lista;
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "ID";
        } else {
            return "Nombre";
        }
    }

}
