/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uas;

/**
 *
 * @author HP
 */
public final class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        getWaktuA();
        getFilmA();
        getWaktuB();
        getWaktuC();
        
    }
    public static String waktuA;
    
    public void setWaktuA(String input){
    waktuA = input;
    }
    public String getWaktuA(){
    return home.waktuA;
    }
    public static String waktuB;
    
    public String setWaktuB(String x){
    waktuB = x;
    return waktuB;
    }
    public String getWaktuB(){
    return home.waktuB;
    }
    public static String waktuC;
    
    public void setWaktuC(String y){
    waktuC = y;
    }
    public String getWaktuC(){
    return home.waktuC;
    }
    public static String filmA;
    
    public void setFilmA(String input){
    filmA = input;
    }
    public String getFilmA(){
    return home.filmA;
    }
    private StringBuffer jamA;
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        film1 = new javax.swing.JLabel();
        jam12 = new javax.swing.JCheckBox();
        jam2 = new javax.swing.JCheckBox();
        jam4 = new javax.swing.JCheckBox();
        jam_set11 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        film2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jam_11_40 = new javax.swing.JCheckBox();
        jam10 = new javax.swing.JCheckBox();
        jam1 = new javax.swing.JCheckBox();
        jam2_20 = new javax.swing.JCheckBox();
        film3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jam_11 = new javax.swing.JCheckBox();
        jam_set1 = new javax.swing.JCheckBox();
        jam1_20 = new javax.swing.JCheckBox();
        jam_set4 = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        film1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        film1.setForeground(new java.awt.Color(255, 255, 255));
        film1.setText("Oppenheimer");
        film1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                film1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        film1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                film1MouseClicked(evt);
            }
        });
        jPanel2.add(film1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jam12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam12ActionPerformed(evt);
            }
        });
        jPanel2.add(jam12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam2ActionPerformed(evt);
            }
        });
        jPanel2.add(jam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        jam4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam4ActionPerformed(evt);
            }
        });
        jPanel2.add(jam4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jam_set11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam_set11ActionPerformed(evt);
            }
        });
        jPanel2.add(jam_set11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("JAM TAYANG");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("10:30");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("12:00");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("14:00");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("16:00");
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        film2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        film2.setForeground(new java.awt.Color(255, 255, 255));
        film2.setText("Mission impossible");
        film2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                film2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        film2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                film2MouseClicked(evt);
            }
        });
        jPanel2.add(film2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("JAM TAYANG");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("11:40");
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel13.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel13AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("10:00");
        jLabel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel15.setForeground(java.awt.Color.white);
        jLabel15.setText("13:00");
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel16.setForeground(java.awt.Color.white);
        jLabel16.setText("14:20");
        jLabel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        jam_11_40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam_11_40ActionPerformed(evt);
            }
        });
        jPanel2.add(jam_11_40, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jam10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam10ActionPerformed(evt);
            }
        });
        jPanel2.add(jam10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        jam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam1ActionPerformed(evt);
            }
        });
        jPanel2.add(jam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        jam2_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam2_20ActionPerformed(evt);
            }
        });
        jPanel2.add(jam2_20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        film3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        film3.setForeground(new java.awt.Color(255, 255, 255));
        film3.setText("The nun");
        film3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                film3MouseClicked(evt);
            }
        });
        jPanel2.add(film3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("JAM TAYANG");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("11:00");
        jLabel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("12:30");
        jLabel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("13:20");
        jLabel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("15:30");
        jLabel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Logo (1)_1.jpg"))); // NOI18N
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/1.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 102, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/2.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/3_1.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, 150));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("HOME");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 60, -1));

        jam_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam_11ActionPerformed(evt);
            }
        });
        jPanel2.add(jam_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, -1));

        jam_set1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam_set1ActionPerformed(evt);
            }
        });
        jPanel2.add(jam_set1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, -1, -1));

        jam1_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam1_20ActionPerformed(evt);
            }
        });
        jPanel2.add(jam1_20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, -1));

        jam_set4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam_set4ActionPerformed(evt);
            }
        });
        jPanel2.add(jam_set4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Background_1.jpg"))); // NOI18N
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jam12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam12ActionPerformed
      
    }//GEN-LAST:event_jam12ActionPerformed

    private void jam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam2ActionPerformed
     
    }//GEN-LAST:event_jam2ActionPerformed

    private void jam4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam4ActionPerformed
        
    }//GEN-LAST:event_jam4ActionPerformed

    private void jam_set11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam_set11ActionPerformed
      
    }//GEN-LAST:event_jam_set11ActionPerformed

    private void jam_11_40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam_11_40ActionPerformed
       
    }//GEN-LAST:event_jam_11_40ActionPerformed

    private void jam10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam10ActionPerformed
        
    }//GEN-LAST:event_jam10ActionPerformed

    private void jam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam1ActionPerformed
       
    }//GEN-LAST:event_jam1ActionPerformed

    private void jam2_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam2_20ActionPerformed
       
    }//GEN-LAST:event_jam2_20ActionPerformed
    
    private void film2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_film2MouseClicked
       film2.setText("Mission impossible");
       setFilmA(film2.getText());
       
         StringBuilder jamA = new StringBuilder();
       
       if(jam_11_40.isSelected()){
           jam_11_40.setText("11:40");
           jamA.append(jam_11_40.getText()).append("\n");
           
       }
       if(jam10.isSelected()){
           jam10.setText("10:00");
           jamA.append(jam10.getText()).append("\n");
       }
       if(jam1.isSelected()){
           jam1.setText("13:00");
           jamA.append(jam1.getText()).append("\n");
       }
       if(jam2_20.isSelected()){
           jam2_20.setText("14:20");
           jamA.append(jam2_20.getText()).append("\n");
       }
       
       String waktu3 = jamA.toString();
       
       pembayaran film2 = new pembayaran();
      
       film2.setVisible(true);       
       setWaktuA(waktu3);

       dispose();
    }//GEN-LAST:event_film2MouseClicked

    private void jam_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam_11ActionPerformed
        
    }//GEN-LAST:event_jam_11ActionPerformed

    private void jam_set1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam_set1ActionPerformed
      
    }//GEN-LAST:event_jam_set1ActionPerformed

    private void jam1_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam1_20ActionPerformed
        
    }//GEN-LAST:event_jam1_20ActionPerformed

    private void jam_set4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam_set4ActionPerformed
       
    }//GEN-LAST:event_jam_set4ActionPerformed

        
    private void film3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_film3MouseClicked
        film3.setText("The Nun");
       setFilmA(film3.getText());
       
        var jamB = new StringBuilder();
       
        if(jam_set11.isSelected()){
           jam_set11.setText("10:30");
           jamB.append(jam_set11.getText()).append("\n");
           String waktu1 = jam1.toString();
       
       
       }
       if(jam12.isSelected()){
           jam12.setText("12:00");
           jamB.append(jam12.getText()).append("\n");
       }
       if(jam2.isSelected()){
           jam2.setText("14:00");
           jamB.append(jam2.getText()).append("\n");
       }
       if(jam4.isSelected()){
           jam4.setText("16:00");
           jamB.append(jam4.getText()).append("\n");
       }
       String waktu1 = jamB.toString();
       
       setWaktuB(waktu1);
       pembayaran film3 = new pembayaran();
       
       film3.setVisible(true);
       dispose();
    }//GEN-LAST:event_film3MouseClicked

    private void film1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_film1MouseClicked
       film1.setText("Oppenheimer");
       setFilmA(film1.getText());
        
       StringBuilder jamC = new StringBuilder();
       
       if(jam_11.isSelected()){
           jam_11.setText("11:00");
           jamC.append(jam_11.getText()).append("\n");
       }
       if(jam_set1.isSelected()){
           jam_set1.setText("13:30");
           jamC.append(jam_set1.getText()).append("\n");
       }
       if(jam1_20.isSelected()){
           jam1_20.setText("13:20");
           jamC.append(jam1_20.getText()).append("\n");
       }
       if(jam_set4.isSelected()){
           jam_set4.setText("16:00");
           jamC.append(jam_set4.getText()).append("\n");
       }
        
       String waktu2 = jamC.toString();
       
       setWaktuC(waktu2);
       
       pembayaran film1 = new pembayaran(); 
       
       film1.setVisible(true);
       dispose();
      
    }//GEN-LAST:event_film1MouseClicked

    private void film1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_film1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_film1AncestorAdded

    private void film2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_film2AncestorAdded
       
    }//GEN-LAST:event_film2AncestorAdded

    private void jLabel13AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel13AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13AncestorAdded

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel film1;
    private javax.swing.JLabel film2;
    private javax.swing.JLabel film3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JCheckBox jam1;
    private javax.swing.JCheckBox jam10;
    private javax.swing.JCheckBox jam12;
    private javax.swing.JCheckBox jam1_20;
    private javax.swing.JCheckBox jam2;
    private javax.swing.JCheckBox jam2_20;
    private javax.swing.JCheckBox jam4;
    private javax.swing.JCheckBox jam_11;
    private javax.swing.JCheckBox jam_11_40;
    private javax.swing.JCheckBox jam_set1;
    private javax.swing.JCheckBox jam_set11;
    private javax.swing.JCheckBox jam_set4;
    // End of variables declaration//GEN-END:variables

    
   
    
}

