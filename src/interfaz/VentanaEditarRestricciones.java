package interfaz;

import dominio.Sistema;
import dominio.Usuario;
import java.util.ArrayList;

public class VentanaEditarRestricciones extends javax.swing.JDialog {

    private Sistema sistema;
    private Usuario usuarioActual;

    public VentanaEditarRestricciones(Sistema unSistema, Usuario unUsuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sistema = unSistema;
        this.usuarioActual = unUsuario;
        cargarListaRestricciones();
        this.panelListo.setVisible(false);
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema unSistema) {
        this.sistema = unSistema;
    }

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public void setUsuarioActual(Usuario unUsuarioActual) {
        this.usuarioActual = unUsuarioActual;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEditarRestricciones = new javax.swing.JPanel();
        btnEditarPreferencias = new javax.swing.JButton();
        lblEditar = new javax.swing.JLabel();
        lblTxtRestricciones = new javax.swing.JLabel();
        rdBtnCeliaco = new javax.swing.JRadioButton();
        rdBtnDiabetes = new javax.swing.JRadioButton();
        rdBtnVegano = new javax.swing.JRadioButton();
        rdBtnIntoleranteLactosa = new javax.swing.JRadioButton();
        lblEditarRestricciones = new javax.swing.JLabel();
        panelListo = new javax.swing.JPanel();
        lblIconoListo = new javax.swing.JLabel();
        lblListo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(508, 390));
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelEditarRestricciones.setBackground(new java.awt.Color(51, 51, 51));
        panelEditarRestricciones.setMaximumSize(new java.awt.Dimension(508, 390));
        panelEditarRestricciones.setMinimumSize(new java.awt.Dimension(508, 390));
        panelEditarRestricciones.setName(""); // NOI18N
        panelEditarRestricciones.setLayout(null);

        btnEditarPreferencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoOkEditar.png"))); // NOI18N
        btnEditarPreferencias.setBorderPainted(false);
        btnEditarPreferencias.setContentAreaFilled(false);
        btnEditarPreferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPreferenciasActionPerformed(evt);
            }
        });
        panelEditarRestricciones.add(btnEditarPreferencias);
        btnEditarPreferencias.setBounds(320, 280, 93, 69);

        lblEditar.setFont(new java.awt.Font("Levenim MT", 0, 36)); // NOI18N
        lblEditar.setForeground(new java.awt.Color(255, 255, 255));
        lblEditar.setText("Editar");
        panelEditarRestricciones.add(lblEditar);
        lblEditar.setBounds(110, 20, 93, 47);

        lblTxtRestricciones.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblTxtRestricciones.setForeground(new java.awt.Color(255, 255, 255));
        lblTxtRestricciones.setText("Restricciones");
        panelEditarRestricciones.add(lblTxtRestricciones);
        lblTxtRestricciones.setBounds(60, 100, 208, 31);

        rdBtnCeliaco.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnCeliaco.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rdBtnCeliaco.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnCeliaco.setText("Restriccion 4");
        panelEditarRestricciones.add(rdBtnCeliaco);
        rdBtnCeliaco.setBounds(80, 270, 210, 31);

        rdBtnDiabetes.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnDiabetes.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rdBtnDiabetes.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnDiabetes.setText("Restriccion 1");
        panelEditarRestricciones.add(rdBtnDiabetes);
        rdBtnDiabetes.setBounds(80, 150, 230, 31);

        rdBtnVegano.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnVegano.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rdBtnVegano.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnVegano.setText("Restriccion 2");
        panelEditarRestricciones.add(rdBtnVegano);
        rdBtnVegano.setBounds(80, 190, 250, 31);

        rdBtnIntoleranteLactosa.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnIntoleranteLactosa.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rdBtnIntoleranteLactosa.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnIntoleranteLactosa.setText("Restriccion 3");
        rdBtnIntoleranteLactosa.setActionCommand("");
        panelEditarRestricciones.add(rdBtnIntoleranteLactosa);
        rdBtnIntoleranteLactosa.setBounds(80, 230, 290, 31);

        lblEditarRestricciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEditarRestricciones.png"))); // NOI18N
        panelEditarRestricciones.add(lblEditarRestricciones);
        lblEditarRestricciones.setBounds(40, 20, 60, 60);

        panelListo.setBackground(new java.awt.Color(51, 51, 51));
        panelListo.setMaximumSize(new java.awt.Dimension(508, 390));
        panelListo.setMinimumSize(new java.awt.Dimension(508, 390));
        panelListo.setPreferredSize(new java.awt.Dimension(508, 390));

        lblIconoListo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoOK.png"))); // NOI18N

        lblListo1.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblListo1.setForeground(new java.awt.Color(255, 255, 255));
        lblListo1.setText("Listo!");

        javax.swing.GroupLayout panelListoLayout = new javax.swing.GroupLayout(panelListo);
        panelListo.setLayout(panelListoLayout);
        panelListoLayout.setHorizontalGroup(
            panelListoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListoLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addGroup(panelListoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIconoListo)
                    .addComponent(lblListo1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        panelListoLayout.setVerticalGroup(
            panelListoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListoLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(lblIconoListo)
                .addGap(18, 18, 18)
                .addComponent(lblListo1)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEditarRestricciones, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelListo, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEditarRestricciones, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelListo, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.sistema.guardarDatosSistema();
    }//GEN-LAST:event_formWindowClosing

    private void btnEditarPreferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPreferenciasActionPerformed
        ArrayList<String> restricciones = new ArrayList<>();
        agregarRestriccionesUsuario(restricciones);
        this.usuarioActual.actualizarRestriccionesUsuario(usuarioActual, restricciones);
        this.panelListo.setVisible(true);
        this.panelEditarRestricciones.setVisible(false);
    }//GEN-LAST:event_btnEditarPreferenciasActionPerformed

    void agregarRestriccionesUsuario(ArrayList<String> restricciones) {
        if (this.rdBtnCeliaco.isSelected()) {
            restricciones.add("Celíaco");
        }
        if (this.rdBtnDiabetes.isSelected()) {
            restricciones.add("Diabético");
        }
        if (this.rdBtnVegano.isSelected()) {
            restricciones.add("Veganismo");
        }
        if (this.rdBtnIntoleranteLactosa.isSelected()) {
            restricciones.add("Intolerancia a la lactosa");
        }
    }

    private void cargarListaRestricciones() {
        Sistema.Restricciones[] listaRestricciones = new Sistema.Restricciones[4];
        listaRestricciones[0] = Sistema.Restricciones.CELIAQUIA;
        listaRestricciones[1] = Sistema.Restricciones.DIABETES;
        listaRestricciones[2] = Sistema.Restricciones.INTOLERANCIALACTOSA;
        listaRestricciones[3] = Sistema.Restricciones.VEGANISMO;
        for (int i = 0; i < listaRestricciones.length; i++) {
            if (i == 0) {
                this.rdBtnCeliaco.setText("Celiaquía");
            }
            if (i == 1) {
                this.rdBtnDiabetes.setText("Diabetes");
            }
            if (i == 2) {
                this.rdBtnIntoleranteLactosa.setText("Intolerante a la lactosa");
            }
            if (i == 3) {
                this.rdBtnVegano.setText("Veganismo");
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarPreferencias;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEditarRestricciones;
    private javax.swing.JLabel lblIconoListo;
    private javax.swing.JLabel lblListo1;
    private javax.swing.JLabel lblTxtRestricciones;
    private javax.swing.JPanel panelEditarRestricciones;
    private javax.swing.JPanel panelListo;
    private javax.swing.JRadioButton rdBtnCeliaco;
    private javax.swing.JRadioButton rdBtnDiabetes;
    private javax.swing.JRadioButton rdBtnIntoleranteLactosa;
    private javax.swing.JRadioButton rdBtnVegano;
    // End of variables declaration//GEN-END:variables
}
