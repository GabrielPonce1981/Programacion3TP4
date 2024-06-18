package GUI;

import logica.Tarea;

import javax.swing.*;
import java.awt.*;

public class PersonaRenderer extends JLabel implements ListCellRenderer<Tarea>{

    @Override
    public Component getListCellRendererComponent(JList<? extends Tarea> list,
                                                  Tarea persona,
                                                  int index,
                                                  boolean isSelected,
                                                  boolean cellHasFocus) {
                setText(persona.getNombre());
                actualizarTexto(persona.isTachado());

        //Estilos a la hora de seleccionar una elemento de la lista
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        setOpaque(true);

        return this;
    }

    private void actualizarTexto(boolean tachado) {
        if (tachado) {
            setText("<html><s>" + getText() + "</s></html>");
        } else {
            setText(getText().replaceAll("<html><s>|</s></html>", ""));
        }
    }

}
