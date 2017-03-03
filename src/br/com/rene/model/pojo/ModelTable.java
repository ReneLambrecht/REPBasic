package br.com.rene.model.pojo;

import antlr.collections.impl.Vector;
import java.util.ArrayList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

//Site para trabalhar com tabelas   http://docs.oracle.com/javase/tutorial/uiswing/components/table.html#eg
/**
 *
 * @author Rene
 */

/**
 *
 * @author Rene
 * @param <T>
 */
public class ModelTable<T> extends AbstractTableModel implements TableModelListener{
   
    private String[] nomeColunas = null;
    private Object[][] todosDados = null;

    
    
     public ModelTable(Object[][] dados, String[] colunas) {
         setDados(dados);
         setColunas(colunas);
    }

    public Object[][] getDados() {
        return todosDados;
    }

    public void setDados(Object[][] dados) {
        this.todosDados = (Object[][]) dados;
    }

    public String[] getColunas() {
        return nomeColunas;
    }

    public void setColunas(String[] colunas) {
        nomeColunas = colunas;
    }

    public int getColumnCount() {
        return nomeColunas.length;
    }

    public int getRowCount() {
            return todosDados.length;
    }

    public String getColumnName(int col) {
        return nomeColunas[col];
    }

    public Object getValueAt(int row, int col) {
        if (row >-1 && row < todosDados.length) {
            return todosDados[row][col];
        }
        return null;
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
  }

    /*
     Não precisa implementar este método a não ser que a tabela seja 
     * editável. 
     */
    public boolean isCellEditable(int row, int col) {
        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen.
        if (col < 2) {
            return false;
        } else {
            return true;
        }
    }

    /*
     * Não é necessário implementar este método a menos que os dados da tabela 
     * possam mudar. 
     */
    public void setValueAt(Object value, int row, int col) {
        todosDados[row][col] = value;
        fireTableCellUpdated(row, col);
    }
   
    
   


    @Override
    public void tableChanged(TableModelEvent e) {
       /* int row = e.getFirstRow();
        int column = e.getColumn();
        TableModel model = (TableModel)e.getSource();
        String columnName = model.getColumnName(column);
        Object data = model.getValueAt(row, column);
        */
       //JTable.getSelectedColumns // recupera indice de coluans celecioandas
    }
}
