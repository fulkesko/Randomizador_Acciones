package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TMAccion extends AbstractTableModel {

    private List<Accion> lista;

    public TMAccion(List<Accion> lista) {
        this.lista = lista;
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
    public String getColumnName(int column) {
        if (column == 0) {
            return "ID";
        } else {
            return "Nombre";
        }
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        Accion a = lista.get(fila);

        if (columna == 0) {
            return a.getId();
        } else {
            return a.getAccion();
        }
    }
}
