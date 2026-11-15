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
public class Submarine extends Observer {
    int sliderValue;
    private int soliderCount;
    private int ammoCount;
    
    ControlRoom controlRoom;
    
    public Submarine() {
        initComponents();
        
        
        setTitle("Submarine");
        setSize(750, 385);
        setLocation(395,0);
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
            checkArea3.setText("Area is Clear");
        }else{
            checkArea3.setText("Area is not Clear");
        }
    
    }
    
    public void sliderControl(int value){
        sliderValue = value;
        if(jCheckBox1.isSelected()){
            displayPosition();
        }
    }
    
    public void displayPosition(){
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
         //System.out.println( msg);
         //txtAreaS.setText(msg);
         txtAreaS.setText(txtAreaS.getText() + msg + "\n");

    
    }
    
    public void updateUnitMessages(String msgFromUnit){
        String oldMsg = txtAreaS.getText();
        txtAreaS.setText(oldMsg + msgFromUnit+ "\n");
    }
    
    public void sendMsg() {
        String msgFromUnit = "Submarine : "+txtmsgSubmarine.getText();
        //System.out.println(msgFromUnit);
        txtAreaS.setText(txtAreaS.getText() + msgFromUnit + "\n");
        txtmsgSubmarine.setText("");
        System.out.println(msgFromUnit);
        controlRoom.getMSG(msgFromUnit);
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnShoot = new javax.swing.JButton();
        btnMissile = new javax.swing.JButton();
        btnLaser = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSolider = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jAmmo = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaS = new javax.swing.JTextArea();
        txtmsgSubmarine = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        btnRolateShoot = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        checkArea3 = new javax.swing.JTextField();

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

        txtAreaS.setColumns(20);
        txtAreaS.setRows(5);
        jScrollPane1.setViewportView(txtAreaS);

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnRolateShoot.setText("Rolate Shooting");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SUBMARINE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLaser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMissile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnShoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRolateShoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkArea3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSolider)
                                    .addComponent(jAmmo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtmsgSubmarine, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSend))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkArea3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSolider, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnShoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jAmmo)
                            .addComponent(btnMissile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(btnLaser, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRolateShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmsgSubmarine, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        if(btnSend.isEnabled()){
           sendMsg();            
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        boolean position =jCheckBox1.isSelected();
        if(position){
            displayPosition();
        }
    }//GEN-LAST:event_jCheckBox1StateChanged

    private void jAmmoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jAmmoStateChanged
        
        ammoCount = (int)jAmmo.getValue();
        controlRoom.unitAmmoCount(ammoCount);
    }//GEN-LAST:event_jAmmoStateChanged

    private void jSoliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSoliderStateChanged
        soliderCount = (int)jSolider.getValue();  
        controlRoom.unitSoliderCount(soliderCount);
        
    }//GEN-LAST:event_jSoliderStateChanged

    private void btnShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShootActionPerformed
        jAmmo.setValue(ammoCount-1);
    }//GEN-LAST:event_btnShootActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Submarine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaser;
    private javax.swing.JButton btnMissile;
    private javax.swing.JButton btnRolateShoot;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShoot;
    private javax.swing.JTextField checkArea3;
    private javax.swing.JSpinner jAmmo;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSolider;
    private javax.swing.JTextArea txtAreaS;
    private javax.swing.JTextField txtmsgSubmarine;
    // End of variables declaration//GEN-END:variables
}
