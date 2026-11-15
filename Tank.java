package defence_system;

import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author wwwpa
 */
public class Tank extends Observer {
    int sliderValue;
    private int soliderCount;
    private int ammoCount;
    private Strength strength;
    ControlRoom controlRoom;
    
    public Tank() {
        initComponents();
        setTitle("Tank");
        setSize(400, 600);
        setLocation(1140,0);
    }
    
    //setters
    public void setSoliderCount(int soliderCount){
        this.soliderCount = soliderCount;
    }
    public void setammoCount(int ammoCount){
        this.ammoCount = ammoCount;
    }
   
    //getters
    public int soliderCount(){
        return soliderCount;
    }
    public int ammoCount(){
        return ammoCount;
    }
   
    
    
    @Override
    public void update(boolean area){
          System.out.println("Update called: " + area);
             
             
        if(area == true){
            checkArea2.setText("Area is Clear");
        }else{
            checkArea2.setText("Area is not Clear");
        }
    
    }
    
    public void sliderControl(int value){
        sliderValue = value;
        System.out.println("tankslider");
        if(jCheckBox1.isSelected()){
             displayPosition();
        }
    }
    
    public void  displayPosition(){
        btnShoot.setEnabled(false);
        btnLaser.setEnabled(false);
        btnMissile.setEnabled(false);
        btnRolateShoot.setEnabled(false);
        
        if(sliderValue >= 25 && sliderValue <= 45){
            btnShoot.setEnabled(true);
            System.out.println(ammoCount); 
            
        }else if(sliderValue >= 45 && sliderValue <= 64){
           btnMissile.setEnabled(true);
            System.out.println("Missile Operation");      
            
        }else if(sliderValue >= 65 && sliderValue <= 84){
            btnLaser.setEnabled(true);
            System.out.println("Laser Operation");
            
        }else if(sliderValue >= 85){
            btnRolateShoot.setEnabled(true);
            System.out.println("Laser Operation");
            
        }
    }
    
    @Override
    public void updateMessage(String  msg){
         txtAreaT.setText(txtAreaT.getText() + msg + "\n");

    }
    
     public void updateUnitMessages(String msgFromUnit){
        String oldMsg = txtAreaT.getText();
        txtAreaT.setText(oldMsg + msgFromUnit+ "\n");
    }
    
    public void sendMsg() {
        String msgFromUnit = "Tank : "+txtmsgTank.getText();
        txtAreaT.setText(txtAreaT.getText() + msgFromUnit + "\n");
        txtmsgTank.setText("");
        System.out.println(msgFromUnit);
        controlRoom.getMSG(msgFromUnit);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollbar1 = new java.awt.Scrollbar();
        btnShoot = new javax.swing.JButton();
        btnMissile = new javax.swing.JButton();
        btnLaser = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSolider = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jAmmo = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaT = new javax.swing.JTextArea();
        txtmsgTank = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        btnRolateShoot = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        checkArea2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnShoot.setText("Shoot");
        btnShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShootActionPerformed(evt);
            }
        });

        btnMissile.setText("Missile Operation");

        btnLaser.setText("Laser Operation");

        jLabel2.setText("Solider Count");

        jSolider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSoliderStateChanged(evt);
            }
        });

        jLabel3.setText("Ammo Count");

        jAmmo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jAmmoStateChanged(evt);
            }
        });

        jCheckBox1.setText("Position");
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });

        txtAreaT.setColumns(20);
        txtAreaT.setRows(5);
        jScrollPane1.setViewportView(txtAreaT);

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnRolateShoot.setText("Rolate Shooting");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WAR TANK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtmsgTank, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(checkArea2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLaser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMissile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnShoot, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRolateShoot, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSolider, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                            .addComponent(jAmmo)))
                                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(checkArea2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSolider)
                    .addComponent(btnShoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jAmmo)
                    .addComponent(btnMissile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLaser, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRolateShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmsgTank, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
         if(btnSend.isEnabled()){
           sendMsg();            
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        boolean position = jCheckBox1.isSelected();
        if(position){
            displayPosition();
        }
    }//GEN-LAST:event_jCheckBox1StateChanged

    private void btnShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShootActionPerformed
        jAmmo.setValue(ammoCount-1);
    }//GEN-LAST:event_btnShootActionPerformed

    private void jSoliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSoliderStateChanged
       soliderCount = (int)jSolider.getValue();      
       controlRoom.unitSoliderCount(soliderCount);  

    }//GEN-LAST:event_jSoliderStateChanged

    private void jAmmoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jAmmoStateChanged
        ammoCount = (int)jAmmo.getValue();
        controlRoom.unitAmmoCount(ammoCount);
        
    }//GEN-LAST:event_jAmmoStateChanged

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaser;
    private javax.swing.JButton btnMissile;
    private javax.swing.JButton btnRolateShoot;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShoot;
    private javax.swing.JTextField checkArea2;
    private javax.swing.JSpinner jAmmo;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSolider;
    private java.awt.Scrollbar scrollbar1;
    private javax.swing.JTextArea txtAreaT;
    private javax.swing.JTextField txtmsgTank;
    // End of variables declaration//GEN-END:variables
}
