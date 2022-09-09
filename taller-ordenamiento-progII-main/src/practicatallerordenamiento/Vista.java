/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practicatallerordenamiento;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Augusto
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    Alumnado alumnos;
    Cafeteria algOrd = new Cafeteria();
    int cantAlumnos;
    int contador = 0;
    DefaultTableModel modelo;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoModoLlenado = new javax.swing.ButtonGroup();
        grupoMetodoOrdenamiento = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel4 = new javax.swing.JPanel();
        panelGuardadoManual = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tbxPromedio = new javax.swing.JTextField();
        tbxDocumento = new javax.swing.JTextField();
        btnGuardarAlumno = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        tbxCantidadAlumnos = new javax.swing.JTextField();
        panelMetodosOrdenamiento = new javax.swing.JPanel();
        rbtMetodoBurbuja = new javax.swing.JRadioButton();
        rbtMetodoIntercambio = new javax.swing.JRadioButton();
        rbtMetodoQuicksort = new javax.swing.JRadioButton();
        btnOrdenar = new javax.swing.JButton();
        rbtMetodoSeleccion = new javax.swing.JRadioButton();
        btnGuardarAlumnos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rbtLlenadoAutomatico = new javax.swing.JRadioButton();
        rbtLlenadoManual = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnReiniciar = new javax.swing.JButton();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        panelGuardadoManual.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Promedio");

        tbxPromedio.setEnabled(false);

        tbxDocumento.setEnabled(false);

        btnGuardarAlumno.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardarAlumno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardarAlumno.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardarAlumno.setText("Guardar alumno");
        btnGuardarAlumno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnGuardarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAlumnoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Documento");

        javax.swing.GroupLayout panelGuardadoManualLayout = new javax.swing.GroupLayout(panelGuardadoManual);
        panelGuardadoManual.setLayout(panelGuardadoManualLayout);
        panelGuardadoManualLayout.setHorizontalGroup(
            panelGuardadoManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuardadoManualLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGuardadoManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnGuardarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbxDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbxPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        panelGuardadoManualLayout.setVerticalGroup(
            panelGuardadoManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuardadoManualLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbxDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbxPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnGuardarAlumno)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Documento", "Promedio", "Tiquetes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        panelMetodosOrdenamiento.setBackground(new java.awt.Color(51, 51, 51));

        grupoMetodoOrdenamiento.add(rbtMetodoBurbuja);
        rbtMetodoBurbuja.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtMetodoBurbuja.setForeground(new java.awt.Color(255, 255, 255));
        rbtMetodoBurbuja.setText("BURBUJA");
        rbtMetodoBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMetodoBurbujaActionPerformed(evt);
            }
        });
        rbtMetodoBurbuja.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rbtMetodoBurbujaPropertyChange(evt);
            }
        });

        grupoMetodoOrdenamiento.add(rbtMetodoIntercambio);
        rbtMetodoIntercambio.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtMetodoIntercambio.setForeground(new java.awt.Color(255, 255, 255));
        rbtMetodoIntercambio.setText("INTERCAMBIO");
        rbtMetodoIntercambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMetodoIntercambioActionPerformed(evt);
            }
        });
        rbtMetodoIntercambio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rbtMetodoIntercambioPropertyChange(evt);
            }
        });

        grupoMetodoOrdenamiento.add(rbtMetodoQuicksort);
        rbtMetodoQuicksort.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtMetodoQuicksort.setForeground(new java.awt.Color(255, 255, 255));
        rbtMetodoQuicksort.setText("QUICKSORT");
        rbtMetodoQuicksort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMetodoQuicksortActionPerformed(evt);
            }
        });
        rbtMetodoQuicksort.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rbtMetodoQuicksortPropertyChange(evt);
            }
        });

        btnOrdenar.setBackground(new java.awt.Color(153, 153, 153));
        btnOrdenar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOrdenar.setForeground(new java.awt.Color(0, 0, 0));
        btnOrdenar.setText("ORDENAR");
        btnOrdenar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        grupoMetodoOrdenamiento.add(rbtMetodoSeleccion);
        rbtMetodoSeleccion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtMetodoSeleccion.setForeground(new java.awt.Color(255, 255, 255));
        rbtMetodoSeleccion.setText("SELECCION");
        rbtMetodoSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMetodoSeleccionActionPerformed(evt);
            }
        });
        rbtMetodoSeleccion.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rbtMetodoSeleccionPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout panelMetodosOrdenamientoLayout = new javax.swing.GroupLayout(panelMetodosOrdenamiento);
        panelMetodosOrdenamiento.setLayout(panelMetodosOrdenamientoLayout);
        panelMetodosOrdenamientoLayout.setHorizontalGroup(
            panelMetodosOrdenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMetodosOrdenamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMetodosOrdenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtMetodoSeleccion)
                    .addComponent(rbtMetodoBurbuja)
                    .addComponent(rbtMetodoIntercambio)
                    .addGroup(panelMetodosOrdenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbtMetodoQuicksort, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMetodosOrdenamientoLayout.setVerticalGroup(
            panelMetodosOrdenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMetodosOrdenamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtMetodoBurbuja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtMetodoSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtMetodoIntercambio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtMetodoQuicksort, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOrdenar)
                .addContainerGap())
        );

        rbtMetodoQuicksort.setActionCommand("QUICKSORT");

        panelMetodosOrdenamiento.setVisible(false);

        btnGuardarAlumnos.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardarAlumnos.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardarAlumnos.setText("GUARDAR DATOS");
        btnGuardarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAlumnosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cantidad de Alumnos");

        grupoModoLlenado.add(rbtLlenadoAutomatico);
        rbtLlenadoAutomatico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbtLlenadoAutomatico.setForeground(new java.awt.Color(0, 0, 0));
        rbtLlenadoAutomatico.setText("PROBAR PROGRAMA");
        rbtLlenadoAutomatico.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rbtLlenadoAutomaticoPropertyChange(evt);
            }
        });

        grupoModoLlenado.add(rbtLlenadoManual);
        rbtLlenadoManual.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbtLlenadoManual.setForeground(new java.awt.Color(0, 0, 0));
        rbtLlenadoManual.setText("LLENAR MANUAL");
        rbtLlenadoManual.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rbtLlenadoManualPropertyChange(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(btnGuardarAlumnos))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(tbxCantidadAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtLlenadoManual)
                    .addComponent(rbtLlenadoAutomatico))
                .addGap(88, 88, 88)
                .addComponent(panelMetodosOrdenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tbxCantidadAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardarAlumnos))
                    .addComponent(panelMetodosOrdenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbtLlenadoManual)
                        .addGap(18, 18, 18)
                        .addComponent(rbtLlenadoAutomatico)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));
        jPanel3.setForeground(new java.awt.Color(0, 102, 102));

        btnReiniciar.setBackground(new java.awt.Color(153, 153, 153));
        btnReiniciar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(0, 0, 0));
        btnReiniciar.setText("REINICIAR");
        btnReiniciar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReiniciar)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelGuardadoManual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelGuardadoManual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAlumnosActionPerformed
        cantAlumnos = Integer.parseInt(tbxCantidadAlumnos.getText());
        alumnos = new Alumnado(cantAlumnos);
        if(rbtLlenadoManual.isSelected()) {
            cambiarPanelIngreso(true);
        }
        else {
            for (int i = 0; i<alumnos.getCantAlumnos();i++) {
                alumnos.setDocumento(i, Generador.generarDocumento());
                alumnos.setPromedio(i, Generador.generarPromedio());
            }
            panelMetodosOrdenamiento.setVisible(true);
            guardarAlumnos();
            mostrarTabla();
        }
        btnGuardarAlumnos.setEnabled(false);
    }//GEN-LAST:event_btnGuardarAlumnosActionPerformed

    /**
     *Método que recibe un parámetro de tipo booleano, cambia la usabilidad de los componentes dentro del panel
     * al estado que sea ingresado
     * @param estado 
     */
    private void cambiarPanelIngreso(boolean estado) {
        for (int i = 0; i < panelGuardadoManual.getComponentCount(); i++) {
            panelGuardadoManual.getComponent(i).setEnabled(estado);
        }
    }

    private void btnGuardarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAlumnoActionPerformed
       try {
           final float promedio = Float.parseFloat(tbxPromedio.getText());
            if (contador < cantAlumnos && (promedio <= 5 && promedio >= 3)) { //Condición que previene ingresar un promedio erróneo
                alumnos.setDocumento(contador, tbxDocumento.getText());
                alumnos.setPromedio(contador, new BigDecimal(promedio).setScale(2, RoundingMode.HALF_UP));
                contador++;
            }
            else {
                throw new Exception();
            }
       } catch(Exception e) {
           JOptionPane.showMessageDialog(null, "REVISE LOS DATOS INTRODUCIDOS E INTENTE NUEVAMENTE", "ERROR", 0);
       }
       
       if (contador == cantAlumnos) {
           cambiarPanelIngreso(false);
            guardarAlumnos();
            mostrarTabla();
            panelMetodosOrdenamiento.setVisible(true);
       }
       
        tbxDocumento.setText("");
        tbxPromedio.setText("");
    }//GEN-LAST:event_btnGuardarAlumnoActionPerformed

    private void guardarAlumnos() {
        alumnos.calcularNroTiquetes();
        algOrd.setAlumn(alumnos);
        alumnos = null; // se libera la memoria utilizada después de la asignación al objeto de la clase controlador
    }
    
    /**
     * método que muestra los datos de los arreglos en forma secuencial en el elemento jTable de la interfaz
     */
    private void mostrarTabla() {
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[] {"Documento", "Promedio", "Tiquetes"});
        for (int i = 0; i < algOrd.getAlumn().getCantAlumnos(); i++) {
            modelo.addRow(new Object[] {algOrd.getAlumn().getDocumento(i), String.format("%.1f", algOrd.getAlumn().getPromedio(i)), algOrd.getAlumn().getNroTiquetes(i)});
        }
        tabla.setModel(modelo);
    }

    private void rbtMetodoSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtMetodoSeleccionActionPerformed
        rbtMetodoSeleccion.setActionCommand("SELECCION");
    }//GEN-LAST:event_rbtMetodoSeleccionActionPerformed

    private void rbtMetodoBurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtMetodoBurbujaActionPerformed
        rbtMetodoBurbuja.setActionCommand("BURBUJA");
    }//GEN-LAST:event_rbtMetodoBurbujaActionPerformed

    private void rbtMetodoIntercambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtMetodoIntercambioActionPerformed
        rbtMetodoIntercambio.setActionCommand("INTERCAMBIO");
    }//GEN-LAST:event_rbtMetodoIntercambioActionPerformed

    private void rbtMetodoQuicksortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtMetodoQuicksortActionPerformed
        rbtMetodoQuicksort.setActionCommand("QUICKSORT");
    }//GEN-LAST:event_rbtMetodoQuicksortActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        this.setVisible(false);
        new Vista().setVisible(true);
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void rbtLlenadoAutomaticoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rbtLlenadoAutomaticoPropertyChange
        rbtLlenadoAutomatico.setContentAreaFilled(false);
    }//GEN-LAST:event_rbtLlenadoAutomaticoPropertyChange

    private void rbtLlenadoManualPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rbtLlenadoManualPropertyChange
        rbtLlenadoManual.setContentAreaFilled(false);
    }//GEN-LAST:event_rbtLlenadoManualPropertyChange

    private void rbtMetodoBurbujaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rbtMetodoBurbujaPropertyChange
        rbtMetodoBurbuja.setContentAreaFilled(false);
    }//GEN-LAST:event_rbtMetodoBurbujaPropertyChange

    private void rbtMetodoSeleccionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rbtMetodoSeleccionPropertyChange
        rbtMetodoSeleccion.setContentAreaFilled(false);
    }//GEN-LAST:event_rbtMetodoSeleccionPropertyChange

    private void rbtMetodoIntercambioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rbtMetodoIntercambioPropertyChange
        rbtMetodoIntercambio.setContentAreaFilled(false);
    }//GEN-LAST:event_rbtMetodoIntercambioPropertyChange

    private void rbtMetodoQuicksortPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rbtMetodoQuicksortPropertyChange
        rbtMetodoQuicksort.setContentAreaFilled(false);
    }//GEN-LAST:event_rbtMetodoQuicksortPropertyChange

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
                String seleccion = grupoMetodoOrdenamiento.getSelection().getActionCommand();
        switch(seleccion) {
            
            case "BURBUJA" -> {
                algOrd.ordenarBurbuja();
            }
                
            case "SELECCION" -> {
                algOrd.ordenarSeleccion();
            }
            
            case "INTERCAMBIO" -> {
                algOrd.ordenarIntercambio();
            }
                
            case "QUICKSORT" -> {
                algOrd.ordenarQuickSort(0, algOrd.getAlumn().getCantAlumnos()-1);
            }
        }
        mostrarTabla();
        btnOrdenar.setEnabled(false);
        btnReiniciar.setEnabled(true);
    }//GEN-LAST:event_btnOrdenarActionPerformed



    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarAlumno;
    private javax.swing.JButton btnGuardarAlumnos;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.ButtonGroup grupoMetodoOrdenamiento;
    private javax.swing.ButtonGroup grupoModoLlenado;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelGuardadoManual;
    private javax.swing.JPanel panelMetodosOrdenamiento;
    private javax.swing.JRadioButton rbtLlenadoAutomatico;
    private javax.swing.JRadioButton rbtLlenadoManual;
    private javax.swing.JRadioButton rbtMetodoBurbuja;
    private javax.swing.JRadioButton rbtMetodoIntercambio;
    private javax.swing.JRadioButton rbtMetodoQuicksort;
    private javax.swing.JRadioButton rbtMetodoSeleccion;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tbxCantidadAlumnos;
    private javax.swing.JTextField tbxDocumento;
    private javax.swing.JTextField tbxPromedio;
    // End of variables declaration//GEN-END:variables
}
