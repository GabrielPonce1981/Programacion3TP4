package GUI;

import logica.ListaTareasLogica;
import logica.Tarea;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaPrincipal extends JFrame{
    //Atributos
    private JLabel Titulo;
    private JTextField campoNombre;
    private JButton BotonAniadir;
    private JList listaComponente;
    private JPanel panel;
    private JButton BotonEliminar;
    private JButton BotonTachar;
    private JButton BotonEditar;
    private DefaultListModel<Tarea> listModel;

    ListaTareasLogica listaTareasLogica = new ListaTareasLogica();

    //Constructor
    public PantallaPrincipal() {
        setContentPane(this.panel);
        setTitle("Lista de Tareas");
        setSize(500, 500);

        //Configuracion lista de nombres
        listModel = new DefaultListModel<>();
        listaComponente.setModel(listModel);
        listaComponente.setCellRenderer(new PersonaRenderer());


        //Logica boton añadir tarea
        BotonAniadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreIngresado = campoNombre.getText();
                Tarea personaNueva = new Tarea(nombreIngresado);
                listaTareasLogica.crearTarea(personaNueva);

                listModel.addElement(personaNueva);

                campoNombre.setText("");


            }
        });

        //Logica boton eliminar
        BotonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int personaSeleccionadaIndex = listaComponente.getSelectedIndex();
                if (personaSeleccionadaIndex != -1) {
                    Tarea personaSeleccionada = listModel.getElementAt(personaSeleccionadaIndex);
                    listaTareasLogica.eliminarTarea(personaSeleccionada);
                    listModel.remove(personaSeleccionadaIndex);
                }
            }
        });

        //Logica boton tachar
        BotonTachar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int personaSeleccionadaIndex = listaComponente.getSelectedIndex();
                if (personaSeleccionadaIndex != -1) {
                    Tarea personaSeleccionada = listModel.getElementAt(personaSeleccionadaIndex);
                    personaSeleccionada.setTachado();
                    listModel.setElementAt(personaSeleccionada, personaSeleccionadaIndex);
                    listaComponente.repaint();
                }
            }
        });

        //Logica boton editar
        BotonEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int personaSeleccionadaIndex = listaComponente.getSelectedIndex();
                if (personaSeleccionadaIndex != -1) {
                    Tarea personaSeleccionada = listModel.getElementAt(personaSeleccionadaIndex);
                    String nombreIngresado = campoNombre.getText();
                    if (!nombreIngresado.isEmpty()) {
                        listaTareasLogica.editarTarea(personaSeleccionada, nombreIngresado);
                        personaSeleccionada.setNombre(nombreIngresado);
                        listModel.setElementAt(personaSeleccionada, personaSeleccionadaIndex);
                        campoNombre.setText("");
                    } else {
                        campoNombre.setText(personaSeleccionada.getNombre());
                    }
                    listaComponente.repaint();
                }
            }
        });
    }
}