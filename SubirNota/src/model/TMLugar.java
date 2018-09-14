package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TMLugar extends AbstractTableModel {

    private List<Lugar> lista;

    public TMLugar(List<Lugar> lista) {
        this.lista = lista;
    }

    public void setLista(List<Lugar> lista) {
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
    public Object getValueAt(int row, int column) {
        Lugar l = lista.get(row);
        if (column == 0) {
            return l.getId();
        } else {
            return l.getLocacion();
        }
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
