package defence_system;
import javax.swing.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author wwwpa
 */
public class MainController extends JFrame{
    ControlRoom controlRoom;
    Helicopters helicopters;
    Tank tank;
    Submarine submarine;
    
     boolean area;  
     /**
     * Creates new form MainController
     */
    public MainController() {
        initComponents();
        
       
        helicopters = new Helicopters();
        tank = new Tank();
        submarine = new Submarine();
        controlRoom = new ControlRoom();
        
        
        controlRoom.helicopters = helicopters;
        controlRoom.tank = tank;
        controlRoom.submarine =  submarine;
        
        helicopters.controlRoom = controlRoom;
        tank.controlRoom = controlRoom;
        submarine.controlRoom = controlRoom;

        controlRoom.observer = new Observer() {
            @Override
            public void updateMessage(String msg) {

                    helicopters.updateMessage(msg);
                    tank.updateMessage(msg);
                    submarine.updateMessage(msg);
            }
            
        };
        
        controlRoom.mainController = this;
       
        helicopters.setVisible(true);
        tank.setVisible(true);
        submarine.setVisible(true);
        
        setSize(750, 440);
        setLocation(395,385);
    }
       
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        cmbUnit = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        checkAreaMain = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mainSlider = new javax.swing.JSlider();
        lblSolider = new javax.swing.JTextField();
        lblAmmo = new javax.swing.JTextField();
        publicMsg = new javax.swing.JCheckBox();
        btnSend = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        unitMessage = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        mainMsgArea = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Defence", "Helicopter", "Tank", "Submarine" }));
        cmbUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUnitActionPerformed(evt);
            }
        });

        jButton1.setText("Collect Information");

        checkAreaMain.setText("Area Clear");
        checkAreaMain.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                checkAreaMainStateChanged(evt);
            }
        });

        jLabel1.setText("Soilder Count");

        jLabel3.setText("Ammo Amount");

        jLabel4.setText("Position");

        mainSlider.setMinorTickSpacing(5);
        mainSlider.setPaintLabels(true);
        mainSlider.setPaintTicks(true);
        mainSlider.setSnapToTicks(true);
        mainSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mainSliderStateChanged(evt);
            }
        });

        publicMsg.setText("share with units");

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        unitMessage.setColumns(20);
        unitMessage.setRows(5);
        jScrollPane1.setViewportView(unitMessage);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SYSTEM CONTROLLER");

        mainMsgArea.setColumns(20);
        mainMsgArea.setRows(5);
        jScrollPane4.setViewportView(mainMsgArea);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("UNIT masseges");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAmmo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSolider, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mainSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(checkAreaMain)
                                    .addGap(128, 128, 128))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(publicMsg)
                                    .addGap(29, 29, 29)
                                    .addComponent(btnSend)
                                    .addGap(14, 14, 14)))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkAreaMain)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSolider))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblAmmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mainSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(publicMsg)
                    .addComponent(btnSend)
                    .addComponent(jLabel9))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void displayUnitMsg(String msgFromUnit){
            
        
        unitMessage.setText(unitMessage.getText()+ msgFromUnit + "\n");
        
         if(publicMsg.isSelected()){
            if (msgFromUnit.charAt(0) == 'H') {
                
                System.out.println("H");
                submarine.updateUnitMessages(msgFromUnit);
                tank.updateUnitMessages(msgFromUnit);
                
            }else if(msgFromUnit.charAt(0) == 'S'){
                 System.out.println("S");
                 helicopters.updateUnitMessages(msgFromUnit);
                 tank.updateUnitMessages(msgFromUnit);
                 
            }else if(msgFromUnit.charAt(0) == 'T'){
                 System.out.println("S");
                 submarine.updateUnitMessages(msgFromUnit);
                 helicopters.updateUnitMessages(msgFromUnit);
                 
            }
             
            
         }
    }
    
    public void mainMsg(){
        String msg = mainMsgArea.getText();
        controlRoom.notifyMessage("ControlRoom : "+ msg);
              
    }
    
    public void UnitSoliderCount(int soliderCount){
        System.out.println(soliderCount);
    }
    public void UnitAmmoCount(int ammoCount){
        System.out.println(ammoCount);
    }
    
    private void checkAreaMainStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_checkAreaMainStateChanged
       area = checkAreaMain.isSelected();
       controlRoom.setArea(area);
       
    }//GEN-LAST:event_checkAreaMainStateChanged

    private void mainSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mainSliderStateChanged
       int value = mainSlider.getValue();
       helicopters.sliderControl(value);
       tank.sliderControl(value);
       submarine.sliderControl(value);
       
    }//GEN-LAST:event_mainSliderStateChanged

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        if(btnSend.isEnabled()){
           mainMsg();            
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void cmbUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUnitActionPerformed
        String selected = cmbUnit.getSelectedItem().toString();
        
        if(selected.equals("Helicopter")){
           
            lblSolider.setText(String.valueOf(helicopters.soliderCount()));
            lblAmmo.setText(String.valueOf(helicopters.ammoCount()));
                    
            
        }else if(selected.equals("Submarine")){
            lblSolider.setText(String.valueOf(submarine.soliderCount()));
            lblAmmo.setText(String.valueOf(submarine.ammoCount()));
            
        }else if(selected.equals("Tank")){
            lblSolider.setText(String.valueOf(tank.soliderCount()));
            lblAmmo.setText(String.valueOf(tank.ammoCount()));
        }
    }//GEN-LAST:event_cmbUnitActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainController().setVisible(true);
            }
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JCheckBox checkAreaMain;
    private javax.swing.JComboBox<String> cmbUnit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField lblAmmo;
    private javax.swing.JTextField lblSolider;
    private javax.swing.JTextArea mainMsgArea;
    private javax.swing.JSlider mainSlider;
    private javax.swing.JCheckBox publicMsg;
    private javax.swing.JTextArea unitMessage;
    // End of variables declaration//GEN-END:variables
}
