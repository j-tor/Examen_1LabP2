/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examen_1labp2;

/**
 *
 * @author aleja
 */
public class Social extends javax.swing.JFrame {

    /**
     * Creates new form Social
     */
    public Social() {
        initComponents();
        
        PagregarCuenta.setVisible(false);
        Pagregaramigo.setVisible(false);
        Pagregarcomment.setVisible(false);
        Pagregarpost.setVisible(false);
        Pprofile.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CuentaS = new javax.swing.JButton();
        AmigosS = new javax.swing.JButton();
        PostS = new javax.swing.JButton();
        CommentS = new javax.swing.JButton();
        FormS = new javax.swing.JButton();
        Pagregarpost = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Searchusername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Userfriendname = new javax.swing.JTextField();
        agregaramigo = new javax.swing.JButton();
        PagregarCuenta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Lablel2 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TipoRed = new javax.swing.JComboBox<>();
        agregarcuenta = new javax.swing.JButton();
        Pagregaramigo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Postdata = new javax.swing.JTextField();
        agregarpost = new javax.swing.JButton();
        Searchusernamecoment = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Pprofile = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        SearchProfile = new javax.swing.JTextField();
        mostratprofile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserArea = new javax.swing.JTextArea();
        Pagregarcomment = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        SearchProfilepost = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        SearchIDpost = new javax.swing.JTextField();
        Comentario = new javax.swing.JTextField();
        agregarcomentario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CuentaS.setText("Agregar Cuenta");
        CuentaS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuentaSActionPerformed(evt);
            }
        });

        AmigosS.setText("Agregar Amigo");
        AmigosS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmigosSActionPerformed(evt);
            }
        });

        PostS.setText("Agregar Post ");
        PostS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostSActionPerformed(evt);
            }
        });

        CommentS.setText("Agregar Comment");
        CommentS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommentSActionPerformed(evt);
            }
        });

        FormS.setText("Profile Form");
        FormS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormSActionPerformed(evt);
            }
        });

        Pagregarpost.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User Name");

        Searchusername.setText("User1");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("User Friend");

        Userfriendname.setText("User2");
        Userfriendname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserfriendnameActionPerformed(evt);
            }
        });

        agregaramigo.setText("Agregar");
        agregaramigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregaramigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PagregarpostLayout = new javax.swing.GroupLayout(Pagregarpost);
        Pagregarpost.setLayout(PagregarpostLayout);
        PagregarpostLayout.setHorizontalGroup(
            PagregarpostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PagregarpostLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PagregarpostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PagregarpostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(PagregarpostLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Searchusername, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PagregarpostLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Userfriendname, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PagregarpostLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(agregaramigo)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        PagregarpostLayout.setVerticalGroup(
            PagregarpostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PagregarpostLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(PagregarpostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Searchusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PagregarpostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Userfriendname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregaramigo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PagregarCuenta.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name");

        Lablel2.setForeground(new java.awt.Color(255, 255, 255));
        Lablel2.setText("Password");

        Username.setText("User1");

        Password.setText("admin");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Social");

        TipoRed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TWITTER", "FACEBOOK" }));

        agregarcuenta.setText("Agregar");
        agregarcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarcuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PagregarCuentaLayout = new javax.swing.GroupLayout(PagregarCuenta);
        PagregarCuenta.setLayout(PagregarCuentaLayout);
        PagregarCuentaLayout.setHorizontalGroup(
            PagregarCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PagregarCuentaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PagregarCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(Lablel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PagregarCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TipoRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarcuenta))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        PagregarCuentaLayout.setVerticalGroup(
            PagregarCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PagregarCuentaLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(PagregarCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PagregarCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lablel2)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PagregarCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(TipoRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregarcuenta)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        Pagregaramigo.setBackground(new java.awt.Color(153, 153, 153));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User Name");

        agregarpost.setText("Agregar");
        agregarpost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarpostActionPerformed(evt);
            }
        });

        Searchusernamecoment.setText("User1");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Post:");

        javax.swing.GroupLayout PagregaramigoLayout = new javax.swing.GroupLayout(Pagregaramigo);
        Pagregaramigo.setLayout(PagregaramigoLayout);
        PagregaramigoLayout.setHorizontalGroup(
            PagregaramigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PagregaramigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PagregaramigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PagregaramigoLayout.createSequentialGroup()
                        .addGroup(PagregaramigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Postdata, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PagregaramigoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(agregarpost)))
                        .addGap(16, 16, 16))
                    .addGroup(PagregaramigoLayout.createSequentialGroup()
                        .addGroup(PagregaramigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PagregaramigoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Searchusernamecoment, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(93, Short.MAX_VALUE))))
        );
        PagregaramigoLayout.setVerticalGroup(
            PagregaramigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PagregaramigoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(PagregaramigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Searchusernamecoment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Postdata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agregarpost)
                .addContainerGap())
        );

        Pprofile.setBackground(java.awt.SystemColor.controlDkShadow);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("User Name");

        SearchProfile.setText("User1");

        mostratprofile.setText("Mostrar");
        mostratprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostratprofileActionPerformed(evt);
            }
        });

        UserArea.setColumns(20);
        UserArea.setRows(5);
        jScrollPane1.setViewportView(UserArea);

        javax.swing.GroupLayout PprofileLayout = new javax.swing.GroupLayout(Pprofile);
        Pprofile.setLayout(PprofileLayout);
        PprofileLayout.setHorizontalGroup(
            PprofileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PprofileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PprofileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(PprofileLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PprofileLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(mostratprofile)))
                .addContainerGap())
        );
        PprofileLayout.setVerticalGroup(
            PprofileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PprofileLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(PprofileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(SearchProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostratprofile)
                .addGap(14, 14, 14))
        );

        Pagregarcomment.setBackground(new java.awt.Color(51, 51, 51));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("User Name");

        SearchProfilepost.setText("User1");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Post ID");

        SearchIDpost.setText("1");
        SearchIDpost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchIDpostActionPerformed(evt);
            }
        });

        agregarcomentario.setText("Agregar");
        agregarcomentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarcomentarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PagregarcommentLayout = new javax.swing.GroupLayout(Pagregarcomment);
        Pagregarcomment.setLayout(PagregarcommentLayout);
        PagregarcommentLayout.setHorizontalGroup(
            PagregarcommentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PagregarcommentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PagregarcommentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(agregarcomentario)
                    .addGroup(PagregarcommentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Comentario)
                        .addGroup(PagregarcommentLayout.createSequentialGroup()
                            .addGroup(PagregarcommentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(PagregarcommentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SearchIDpost, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SearchProfilepost, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        PagregarcommentLayout.setVerticalGroup(
            PagregarcommentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PagregarcommentLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(PagregarcommentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(SearchProfilepost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PagregarcommentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(SearchIDpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Comentario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregarcomentario)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(CommentS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FormS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PostS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AmigosS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CuentaS, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PagregarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pagregaramigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pagregarpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pagregarcomment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pprofile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pprofile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pagregarcomment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pagregarpost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CuentaS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AmigosS)
                        .addGap(18, 18, 18)
                        .addComponent(PostS)
                        .addGap(18, 18, 18)
                        .addComponent(CommentS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FormS))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Pagregaramigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PagregarCuenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CuentaSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuentaSActionPerformed
        // TODO add your handling code here:
        PagregarCuenta.setVisible(true);
        Pagregaramigo.setVisible(false);
        Pagregarcomment.setVisible(false);
        Pagregarpost.setVisible(false);
        Pprofile.setVisible(false);
    }//GEN-LAST:event_CuentaSActionPerformed

    private void AmigosSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmigosSActionPerformed
        // TODO add your handling code here:
        PagregarCuenta.setVisible(false);
        Pagregaramigo.setVisible(true);
        Pagregarcomment.setVisible(false);
        Pagregarpost.setVisible(false);
        Pprofile.setVisible(false);
    }//GEN-LAST:event_AmigosSActionPerformed

    private void PostSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostSActionPerformed
        // TODO add your handling code here:
        PagregarCuenta.setVisible(false);
        Pagregaramigo.setVisible(false);
        Pagregarcomment.setVisible(true);
        Pagregarpost.setVisible(false);
        Pprofile.setVisible(false);
    }//GEN-LAST:event_PostSActionPerformed

    private void CommentSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommentSActionPerformed
        // TODO add your handling code here:
        PagregarCuenta.setVisible(false);
        Pagregaramigo.setVisible(false);
        Pagregarcomment.setVisible(false);
        Pagregarpost.setVisible(true);
        Pprofile.setVisible(false);
    }//GEN-LAST:event_CommentSActionPerformed

    private void FormSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormSActionPerformed
        // TODO add your handling code here:
        PagregarCuenta.setVisible(false);
        Pagregaramigo.setVisible(false);
        Pagregarcomment.setVisible(false);
        Pagregarpost.setVisible(false);
        Pprofile.setVisible(true);
    }//GEN-LAST:event_FormSActionPerformed

    private void UserfriendnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserfriendnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserfriendnameActionPerformed

    private void SearchIDpostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchIDpostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchIDpostActionPerformed

    private void agregarcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarcuentaActionPerformed
        // TODO add your handling code here:
        Username.getText();
        Password.getText();
        TipoRed.getSelectedIndex();
        
    }//GEN-LAST:event_agregarcuentaActionPerformed

    private void agregarpostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarpostActionPerformed
        // TODO add your handling code here:
        Searchusernamecoment.getText();
        Postdata.getText();
        
        
        
    }//GEN-LAST:event_agregarpostActionPerformed

    private void agregaramigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregaramigoActionPerformed
        // TODO add your handling code here:
        Searchusername.getText();
        Userfriendname.getText();
        
    }//GEN-LAST:event_agregaramigoActionPerformed

    private void agregarcomentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarcomentarioActionPerformed
        // TODO add your handling code here:
        SearchProfilepost.getText();
        SearchIDpost.getText();
        Comentario.getText();
        
        
        
    }//GEN-LAST:event_agregarcomentarioActionPerformed

    private void mostratprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostratprofileActionPerformed
        // TODO add your handling code here:
        SearchProfile.getText();
        
        
        
    }//GEN-LAST:event_mostratprofileActionPerformed

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
            java.util.logging.Logger.getLogger(Social.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Social.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Social.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Social.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Social().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AmigosS;
    private javax.swing.JTextField Comentario;
    private javax.swing.JButton CommentS;
    private javax.swing.JButton CuentaS;
    private javax.swing.JButton FormS;
    private javax.swing.JLabel Lablel2;
    private javax.swing.JPanel PagregarCuenta;
    private javax.swing.JPanel Pagregaramigo;
    private javax.swing.JPanel Pagregarcomment;
    private javax.swing.JPanel Pagregarpost;
    private javax.swing.JTextField Password;
    private javax.swing.JButton PostS;
    private javax.swing.JTextField Postdata;
    private javax.swing.JPanel Pprofile;
    private javax.swing.JTextField SearchIDpost;
    private javax.swing.JTextField SearchProfile;
    private javax.swing.JTextField SearchProfilepost;
    private javax.swing.JTextField Searchusername;
    private javax.swing.JTextField Searchusernamecoment;
    private javax.swing.JComboBox<String> TipoRed;
    private javax.swing.JTextArea UserArea;
    private javax.swing.JTextField Userfriendname;
    private javax.swing.JTextField Username;
    private javax.swing.JButton agregaramigo;
    private javax.swing.JButton agregarcomentario;
    private javax.swing.JButton agregarcuenta;
    private javax.swing.JButton agregarpost;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mostratprofile;
    // End of variables declaration//GEN-END:variables
}