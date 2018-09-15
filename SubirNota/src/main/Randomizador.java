package main;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import model.Accion;
import model.Lugar;
import model.Persona;
import model.TMAccion;
import model.TMLugar;
import model.TMPersona;

public class Randomizador extends javax.swing.JFrame {

    private List<Persona> ListaPersonas;
    private List<Accion> ListaAcciones;
    private List<Lugar> ListasLugares;

    private int contIdPersona;
    private int contIdAccion;
    private int contIdLugar;

    private TMPersona modelPersona;
    private TMAccion modelAccion;
    private TMLugar modelLugar;
    private Random ranNombre;
    private Random ranLugar;
    private Random ranAccion;

    public Randomizador() {
        initComponents();
        ranNombre = new Random();
        ranAccion = new Random();
        ranLugar = new Random();
        
        ListaPersonas = new ArrayList<>();
        ListaAcciones = new ArrayList<>();
        ListasLugares = new ArrayList<>();

        contIdPersona = 0;
        contIdAccion = 0;
        contIdLugar = 0;

        modelPersona = new TMPersona(ListaPersonas);
        modelAccion = new TMAccion(ListaAcciones);
        modelLugar = new TMLugar(ListasLugares);

        tblNombres.setModel(modelPersona);
        tblAcciones.setModel(modelAccion);
        tblLugares.setModel(modelLugar);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtAccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLugar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAcciones = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLugares = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblNombres = new javax.swing.JTable();
        btnAnadirNombre = new javax.swing.JButton();
        btnAnadirAccion = new javax.swing.JButton();
        btnAnadirLugar = new javax.swing.JButton();
        btnMezclar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblFrase = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setName(""); // NOI18N

        jLabel1.setText("Nombre");

        jLabel2.setText("Accion");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        txtAccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAccionKeyPressed(evt);
            }
        });

        jLabel3.setText("Lugar");

        txtLugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLugarKeyPressed(evt);
            }
        });

        tblAcciones.setBackground(new java.awt.Color(51, 255, 0));
        tblAcciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblAcciones);

        tblLugares.setBackground(new java.awt.Color(51, 255, 0));
        tblLugares.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblLugares);

        tblNombres.setBackground(new java.awt.Color(51, 255, 0));
        tblNombres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblNombres);

        btnAnadirNombre.setText("añadir");
        btnAnadirNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirNombreActionPerformed(evt);
            }
        });

        btnAnadirAccion.setText("añadir");
        btnAnadirAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirAccionActionPerformed(evt);
            }
        });

        btnAnadirLugar.setText("añadir");
        btnAnadirLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirLugarActionPerformed(evt);
            }
        });

        btnMezclar.setText("shuffle!!");
        btnMezclar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMezclarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("RANDOM"));
        jPanel2.setForeground(new java.awt.Color(204, 0, 0));

        lblFrase.setFont(new java.awt.Font("HP Simplified Light", 1, 18)); // NOI18N
        lblFrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrase.setText("Frase Resultado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblFrase, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblFrase, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMezclar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAnadirNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnAnadirAccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(txtLugar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(btnAnadirLugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnadirNombre)
                    .addComponent(btnAnadirAccion)
                    .addComponent(btnAnadirLugar))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMezclar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnadirNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirNombreActionPerformed
        anadirNombre();
     }//GEN-LAST:event_btnAnadirNombreActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            anadirNombre();
        }
    }//GEN-LAST:event_txtNombreKeyPressed

    private void btnAnadirAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirAccionActionPerformed
        anadirAccion();
    }//GEN-LAST:event_btnAnadirAccionActionPerformed

    private void txtAccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            anadirAccion();
        }
    }//GEN-LAST:event_txtAccionKeyPressed

    private void btnAnadirLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirLugarActionPerformed
        anadirLugar();
    }//GEN-LAST:event_btnAnadirLugarActionPerformed

    private void txtLugarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLugarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            anadirLugar();

        }
     }//GEN-LAST:event_txtLugarKeyPressed

    private void btnMezclarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMezclarActionPerformed
        int sizeP = ListaPersonas.size();
        int sizeA = ListaAcciones.size();
        int sizeL = ListasLugares.size();
        
        if(sizeP > 0 && sizeA > 0 && sizeL > 0){
            int numRandomP = ranNombre.nextInt(sizeP);
            int numRandomA = ranAccion.nextInt(sizeA);
            int numRandomL = ranLugar.nextInt(sizeL);
            
            Persona p = ListaPersonas.get(numRandomP);
            Accion a = ListaAcciones.get(numRandomA);
            Lugar l = ListasLugares.get(numRandomL);
            
            lblFrase.setText(p.getNombre() + " " + a.getAccion() + " " + l.getLocacion());
        }
    }//GEN-LAST:event_btnMezclarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Randomizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadirAccion;
    private javax.swing.JButton btnAnadirLugar;
    private javax.swing.JButton btnAnadirNombre;
    private javax.swing.JButton btnMezclar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JTable tblAcciones;
    private javax.swing.JTable tblLugares;
    private javax.swing.JTable tblNombres;
    private javax.swing.JTextField txtAccion;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void setCentered(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void anadirNombre() {
        String nombre = txtNombre.getText();
        if (!nombre.trim().isEmpty()) {

            Persona p = new Persona();

            p.setNombre(nombre);
            p.setId(++contIdPersona);

            ListaPersonas.add(p);

            tblNombres.updateUI();
            txtNombre.setText(null);
            txtNombre.requestFocus();
        }
    }

    private void anadirAccion() {
        String nombre = txtAccion.getText();
        if (!nombre.trim().isEmpty()) {

            Accion a = new Accion();

            a.setAccion(nombre);
            a.setId(++contIdAccion);

            ListaAcciones.add(a);

            tblAcciones.updateUI();
            txtAccion.setText(null);
            txtAccion.requestFocus();
        }
    }

    private void anadirLugar() {
        String nombre = txtLugar.getText();
        if (!nombre.trim().isEmpty()) {

            Lugar l = new Lugar();

            l.setLocacion(nombre);
            l.setId(++contIdLugar);

            ListasLugares.add(l);

            tblLugares.updateUI();
            txtLugar.setText(null);
            txtLugar.requestFocus();
        }
    }
}
