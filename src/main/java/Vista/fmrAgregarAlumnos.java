package Vista;


import Clases.Alumno;
import Clases.Apoderado;
import Controlador.*;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class fmrAgregarAlumnos extends JDialog {
    // ========== ATRIBUTOS ==========
    private Alumno nuevoAlumno;


    // ----- PANEL -----
    private JPanel AgregarAlumno;
    private JPanel AgregarAlumnos;
    private JPanel AgregarApoderados;
    private JPanel Apoderado;
    private JPanel Alumno;


    // ----- TABBED PANE -----
    private JTabbedPane tabbedPane1;


    // ----- JTABLE -----
    private JTable tblListado;


    // ----- TXT -----
    private JTextField txtRut;
    private JTextField txtNombres;
    private JTextField txtApellidos;
    private JTextField txtEdad;
    private JTextField txtFechaNacimiento;
    private JTextField txtDireccion;
    private JTextField txtEmail;
    private JTextField txtNacionalidad;
    private JTextField txtTelefono;
    private JTextField txtCiudad;
    private JTextField txtDatosAdicionales;
    private JTextField txtFechaMatricula;
    private JTextField txtCurso;
    private JTextField txtLetra;
    private JTextField txtElectivo;
    private JTextField txtEnfermedades;
    private JTextField txtCiudadApoderado;
    private JTextField txtRutApoderado;
    private JTextField txtNombresApoderado;
    private JTextField txtApellidosApoderado;
    private JTextField txtParentescoApoderado;
    private JTextField txtTelefonoApoderado;
    private JTextField txtDireccionApoderado;
    private JTextField txtObservacionesApoderado;


    // ----- RDO -----
    private JRadioButton rdoMasculino;
    private JRadioButton rdoFemenino;
    private JRadioButton rdoOtro;
    private JButton btnGrabar;
    private JButton btnLimpiar;
    private JButton btnSalir;
    private ButtonGroup grupoBotonesGenero;
    private JButton btnBorrar;
    private JButton btnModificar;
    private JButton btnListar;
    private JButton btnBuscar;
    private JButton btnLimpiarApoderado;
    private JRadioButton rdoMasculinoApoderado;
    private JRadioButton rdoFemeninoApoderado;
    private JRadioButton rdoOtroApoderado;


    // ----- LBL -----
    private JLabel lblDatos;
    private JLabel lblRut;
    private JLabel lblNombres;
    private JLabel lblApellidos;
    private JLabel lblEdad;
    private JLabel lblFechaNacimiento;
    private JLabel lblDireccion;
    private JLabel lblCiudad;
    private JLabel lblTelefono;
    private JLabel lblEmail;
    private JLabel lblNacionalidad;
    private JLabel lblDatosAdicionales;
    private JLabel lblFechaMatricula;
    private JLabel lblGenero;
    private JLabel lblEnfermedades;
    private JLabel lblCurso;
    private JLabel lblLetra;
    private JLabel lblElectivo;
    private JLabel lblAgregarAlumno;
    private JLabel lblAgregarApoderado;
    private JLabel lblRutApoderado;
    private JLabel lblNombresApoderado;
    private JLabel lblApellidosApoderado;
    private JLabel lblParentescoApoderado;
    private JLabel lblTelefonoApoderado;
    private JLabel lblCiudadApoderado;
    private JLabel lblDireccionApoderado;
    private JLabel lblGeneroApoderado;
    private JLabel lblObservacionesApoderado;


    // ========== CONSTRUCTOR ==========
    public fmrAgregarAlumnos() {


        // ----- GRUPO DE BOTONES -----
        grupoBotonesGenero = new ButtonGroup();


        // GÉNERO
        ButtonGroup grupoBotonesGenero = new ButtonGroup();
        grupoBotonesGenero.add(rdoFemenino);
        grupoBotonesGenero.add(rdoMasculino);
        grupoBotonesGenero.add(rdoOtro);


        ButtonGroup grupoBotonesGeneroApoderado = new ButtonGroup();
        grupoBotonesGeneroApoderado.add(rdoFemeninoApoderado);
        grupoBotonesGeneroApoderado.add(rdoMasculinoApoderado);
        grupoBotonesGeneroApoderado.add(rdoOtroApoderado);


        // ----- APARIENCIA WINDOWS -----
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        // ------------------------------


        // VENTANA PRIORIDAD
        setModal(true);
        // TÍTULO
        setTitle("Agregar Alumno");
        // TAMAÑO
        setSize(1000, 700);
        // CENTRAR
        setLocationRelativeTo(null);
        // DISEÑO DEL PANEL "AGREGAR ALUMNO"
        setContentPane(AgregarAlumno);
        // CARGAR TABLA DE ALUMNOS
        cargarListadoAlumnos(null);


        // ----- BOTÓN LIMPIAR ALUMNO-----
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });


        // ----- BOTÓN SALIR -----
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        // ----- BOTÓN BUSCAR ALUMNO POR RUT -----
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarAlumnoPorRut();
            }
        });


        // ----- BOTÓN LISTAR -----
        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
                cargarListadoAlumnos(null);
            }
        });


        // ----- BOTÓN GRABAR -----
        btnGrabar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarCampos()) {
                    Alumno nuevoAlumno = grabar();
                    setNuevoAlumno(nuevoAlumno);
                    grabarApoderado();
                    Controlador.agregarAlumnoCSV(nuevoAlumno);
                    JOptionPane.showMessageDialog(null, "Alumno y apoderado agregados correctamente");
                    limpiar();
                    limpiarApoderado();
                    cargarListadoAlumnos(null);
                }
            }
        });


        // ----- BOTÓN LIMPIAR APODERADO -----
        btnLimpiarApoderado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarEstudiante();
            }
        });
    }


    //========== GRABAR ALUMNO ==========
    Alumno grabar() {
        String rut = txtRut.getText();
        String nombres = txtNombres.getText();
        String apellidos = txtApellidos.getText();
        String edad = txtEdad.getText();
        String fechaNacimiento = txtFechaNacimiento.getText();
        String direccion = txtDireccion.getText();
        String ciudad = txtCiudad.getText();
        String telefono = txtTelefono.getText();
        String email = txtEmail.getText();
        String nacionalidad = txtNacionalidad.getText();
        String datosAdicionales = txtDatosAdicionales.getText();
        String fechaMatricula = txtFechaMatricula.getText();
        String enfermedades = txtEnfermedades.getText();

        String genero = "";
        if (rdoMasculino.isSelected()) {
            genero = "Masculino";
        }
        if (rdoFemenino.isSelected()) {
            genero = "Femenino";
        }
        if (rdoOtro.isSelected()) {
            genero = "Otro";
        }

        String curso = txtCurso.getText();
        String letra = txtLetra.getText();
        String electivo = txtElectivo.getText();

        Alumno nuevoAlumno = new Alumno(rut, nombres, apellidos, edad,
                fechaNacimiento, email, ciudad, telefono,
                nacionalidad, fechaMatricula, direccion, curso,
                letra, electivo, enfermedades, datosAdicionales,
                genero);
        return nuevoAlumno;
    }


    // ========== GRABAR APODERADO ==========
    public void grabarApoderado() {
        String rutApoderado = txtRutApoderado.getText();
        String nombresApoderado = txtNombresApoderado.getText();
        String apellidosApoderado = txtApellidosApoderado.getText();
        String parentescoApoderado = txtParentescoApoderado.getText();
        String telefonoApoderado = txtTelefonoApoderado.getText();
        String ciudadApoderado = txtCiudadApoderado.getText();
        String direccionApoderado = txtDireccionApoderado.getText();
        String observacionesApoderado = txtObservacionesApoderado.getText();

        String generoApoderado = "";
        if (rdoMasculino.isSelected()) {
            generoApoderado = "Masculino";
        }
        if (rdoFemenino.isSelected()) {
            generoApoderado = "Femenino";
        }
        if (rdoOtro.isSelected()) {
            generoApoderado = "Otro";
        }

        Clases.Apoderado nuevoApoderado = new Apoderado(rutApoderado, nombresApoderado, apellidosApoderado,
                parentescoApoderado, telefonoApoderado, ciudadApoderado,
                direccionApoderado, observacionesApoderado, generoApoderado);

        nuevoAlumno.setNuevoApoderado(nuevoApoderado);
    }


    // ========== LIMPIAR ALUMNO ==========
    public void limpiar() {
        txtRut.setText(null);
        txtNombres.setText(null);
        txtApellidos.setText(null);
        txtEdad.setText(null);
        txtFechaNacimiento.setText(null);
        txtDireccion.setText(null);
        txtDireccion.setText(null);
        txtCiudad.setText(null);
        txtTelefono.setText(null);
        txtEmail.setText(null);
        txtNacionalidad.setText(null);
        txtDatosAdicionales.setText(null);
        txtFechaMatricula.setText(null);
        txtEnfermedades.setText(null);
        txtCurso.setText(null);
        txtLetra.setText(null);
        txtElectivo.setText(null);
        grupoBotonesGenero.clearSelection();
    }


    // ========== LIMPIAR APODERADO ==========
    public void limpiarApoderado() {
        txtRutApoderado.setText(null);
        txtNombresApoderado.setText(null);
        txtApellidosApoderado.setText(null);
        txtParentescoApoderado.setText(null);
        txtTelefonoApoderado.setText(null);
        txtCiudadApoderado.setText(null);
        txtDireccionApoderado.setText(null);
        txtObservacionesApoderado.setText(null);
        rdoMasculinoApoderado.setSelected(false);
        rdoFemeninoApoderado.setSelected(false);
        rdoOtroApoderado.setSelected(false);
    }



    // ========== SET NUEVO ALUMNO ==========
    public void setNuevoAlumno(Alumno nuevoAlumno) {
        this.nuevoAlumno = nuevoAlumno;
    }



    // ========== VALIDAR CAMPOS ==========
    private boolean validarCampos() {
        if (    txtRut                  .getText().isEmpty() ||
                txtNombres              .getText().isEmpty() ||
                txtApellidos            .getText().isEmpty() ||
                txtEdad                 .getText().isEmpty() ||
                txtFechaNacimiento      .getText().isEmpty() ||
                txtDireccion            .getText().isEmpty() ||
                txtCiudad               .getText().isEmpty() ||
                txtTelefono             .getText().isEmpty() ||
                txtNacionalidad         .getText().isEmpty() ||
                txtDatosAdicionales     .getText().isEmpty() ||
                txtFechaMatricula       .getText().isEmpty() ||
                txtDireccion            .getText().isEmpty() ||
                txtCurso                .getText().isEmpty() ||
                txtLetra                .getText().isEmpty() ||
                txtElectivo             .getText().isEmpty() ||

                txtRutApoderado         .getText().isEmpty() ||
                txtNombresApoderado     .getText().isEmpty() ||
                txtApellidosApoderado   .getText().isEmpty() ||
                txtParentescoApoderado  .getText().isEmpty() ||
                txtTelefonoApoderado    .getText().isEmpty() ||
                txtDireccionApoderado   .getText().isEmpty() ||
                txtCiudadApoderado      .getText().isEmpty()
        ) {
            JOptionPane.showMessageDialog(this, "Faltan campos por rellenar", "Error de Validación", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }


}