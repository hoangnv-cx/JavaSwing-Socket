/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_mini_chat.Server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import project_mini_chat.Util.FormatDate;
import project_mini_chat.Model.Setting;



public class FMiniChatServer extends javax.swing.JFrame {
    List<String> l=new ArrayList<>();
    static  Setting setting;
    DefaultListModel<String> defaultListModel=new DefaultListModel<>();
    static DatagramSocket serverSocket;
    static int port;
    static int portClient ;
    static FormatDate date;
    static boolean test=false;
    public FMiniChatServer() {
        
        initComponents();
        JP_test.setVisible(test);
        txt_port.setEnabled(false);
        txt_ipReceiver.setEnabled(false);
        txt_userName.setEnabled(false);
        messagea.start();       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_save = new javax.swing.JButton();
        txt_ipReceiver = new javax.swing.JTextField();
        txt_userName = new javax.swing.JTextField();
        txt_port = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listMess = new javax.swing.JList<>();
        txt_sendChat = new javax.swing.JTextField();
        btn_send = new javax.swing.JButton();
        JP_test = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini Chat Server");
        setLocation(new java.awt.Point(500, 150));
        setName("f_MiniChat"); // NOI18N
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Setting"));
        jPanel1.setName("Config"); // NOI18N

        btn_save.setText("Save Setting");
        btn_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_save.setName("btn_save"); // NOI18N
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        txt_ipReceiver.setName("txt_IPreceiver"); // NOI18N

        txt_userName.setToolTipText("");
        txt_userName.setName("txt_userName"); // NOI18N

        txt_port.setName("txt_port"); // NOI18N

        jLabel2.setText("IP From Receiver");

        jLabel3.setText("User Name");

        jLabel4.setText("PORT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_userName, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(txt_ipReceiver))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txt_port, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btn_save)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ipReceiver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txt_port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        listMess.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(listMess);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addContainerGap())
        );

        txt_sendChat.setName("txt_send"); // NOI18N

        btn_send.setText("Send");
        btn_send.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_send.setName("btn_send"); // NOI18N
        btn_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendActionPerformed(evt);
            }
        });

        jButton7.setText("🤣");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton2.setText("😀");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("😄");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("😆");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("😅");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("😂");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setText("😊");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("😌");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("😍");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("😳");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("🙃");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("😎");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("🤑");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("😨");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("😠");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("😑");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP_testLayout = new javax.swing.GroupLayout(JP_test);
        JP_test.setLayout(JP_testLayout);
        JP_testLayout.setHorizontalGroup(
            JP_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_testLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton10)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_testLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9))
                    .addGroup(JP_testLayout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JP_testLayout.setVerticalGroup(
            JP_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_testLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JP_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton10)
                        .addComponent(jButton11)
                        .addComponent(jButton12)
                        .addComponent(jButton13)
                        .addComponent(jButton14)
                        .addComponent(jButton16)
                        .addComponent(jButton17)))
                .addGap(9, 9, 9)
                .addGroup(JP_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addContainerGap())
        );

        jButton1.setText("🙂");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(JP_test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_sendChat)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_send, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sendChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_send))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JP_test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btn_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendActionPerformed
        if(txt_sendChat.getText().trim().equals("")||txt_sendChat.getText().trim()==null){
            JOptionPane.showMessageDialog(null, "Please input messages");
        }else{
            if(setting.getIp()!=null&&setting.getName()!=null&&setting.getPort()!=0){
                setting.setDateMess(new Timestamp(System.currentTimeMillis()));
                System.out.println(portClient);
                String mess=txt_sendChat.getText().trim();
                String message="<"+date.getDate(setting.getDateMess())+">  -"+txt_userName.getText().trim()+" : "+mess;
                try {
                        String capitalizedSentence =message;
                        InetAddress IPAddress = InetAddress.getByName(setting.getIp());
                        byte[] sendData = new byte[1024];
                        sendData = capitalizedSentence.getBytes();
                        DatagramPacket sendPacket =
                        new DatagramPacket(sendData, sendData.length, IPAddress, portClient);
                        serverSocket.send(sendPacket);

                        System.out.println("send : "+capitalizedSentence);
                        l.add(message);  
                        defaultListModel.addElement(l.get(l.size()-1));
                        listMess.setModel(defaultListModel);
                } catch (Exception e) {
                }
                txt_sendChat.setText("");
                JP_test.setVisible(false);
                test=false;
            }else{
                JOptionPane.showMessageDialog(null, "Lưu lại cài đặt");
            }    
        }
    }//GEN-LAST:event_btn_sendActionPerformed
    
    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
       if(txt_ipReceiver.getText().trim().equals("")||txt_ipReceiver.getText().trim()==null){
            JOptionPane.showMessageDialog(null, "IP bị trống");
        }else if(txt_userName.getText().trim().equals("")||txt_userName.getText().trim()==null){
            JOptionPane.showMessageDialog(null, "Name bị trống");
        }else if(txt_port.getText().trim().equals("")||txt_port.getText().trim()==null){
            JOptionPane.showMessageDialog(null, "Port bị trống");
        }else{
            setting.setIp(txt_ipReceiver.getText().trim());
            setting.setName(txt_userName.getText().trim());
            int port=Integer.parseInt(txt_port.getText().trim());
            setting.setPort(port);
        }  
    }//GEN-LAST:event_btn_saveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(test){
           test=false;
           JP_test.setVisible(test);
           
       }else{
           test=true;
           JP_test.setVisible(test);
           
       }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       txt_sendChat.setText(txt_sendChat.getText().trim()+"😍");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        txt_sendChat.setText(txt_sendChat.getText().trim()+"😳");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        txt_sendChat.setText(txt_sendChat.getText().trim()+"🙃");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        txt_sendChat.setText(txt_sendChat.getText().trim()+"😎");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        txt_sendChat.setText(txt_sendChat.getText().trim()+"🤑");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        txt_sendChat.setText(txt_sendChat.getText().trim()+"😨");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        txt_sendChat.setText(txt_sendChat.getText().trim()+"😠");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        txt_sendChat.setText(txt_sendChat.getText().trim()+"😑");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txt_sendChat.setText(txt_sendChat.getText().trim()+"😀");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txt_sendChat.setText(txt_sendChat.getText().trim()+"😄");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         txt_sendChat.setText(txt_sendChat.getText().trim()+"😆");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        txt_sendChat.setText(txt_sendChat.getText().trim()+"😅");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        txt_sendChat.setText(txt_sendChat.getText().trim()+"😂");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        txt_sendChat.setText(txt_sendChat.getText().trim()+"🤣");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         txt_sendChat.setText(txt_sendChat.getText().trim()+"😊");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        txt_sendChat.setText(txt_sendChat.getText().trim()+"😌");
    }//GEN-LAST:event_jButton9ActionPerformed
 final Thread messagea = new Thread() {
                @Override
                public void run() {         
                        try {
                            while(true){              
                                byte[] receiveData = new byte[1024]; 
                                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);                                
                               // IPAddress = receivePacket.getAddress();
                                serverSocket.receive(receivePacket);
                                String sentence = new String( receivePacket.getData());
                                System.out.println("RECEIVED: " + sentence);   
                                portClient = receivePacket.getPort();
                                System.out.println(portClient);
                                setting.setPort(portClient);
                                setting.setIp(receivePacket.getAddress().getHostAddress());
                                txt_port.setText(String.valueOf(portClient));
                                txt_ipReceiver.setText(receivePacket.getAddress().getHostAddress());
                                l.add(sentence.trim());  
                                defaultListModel.addElement(l.get(l.size()-1));
                                listMess.setModel(defaultListModel);
                                txt_userName.setText(setting.getName().trim());
                                              
                            }
                        }  catch (IOException ex) {
                            
                        }
                    }
                };
    public static void main(String args[]) throws Exception {        
        setting=new Setting();
        date=new FormatDate();
        String name = JOptionPane.showInputDialog("Enter Your Name");
        if (name == null || name.equals("")) { JOptionPane.showMessageDialog(null, "Name cannot be blank"); return; }
        setting.setName(name);
        String portSoket = JOptionPane.showInputDialog("Enter Port");
        if (portSoket == null || portSoket.equals("")) { JOptionPane.showMessageDialog(null, "Name cannot be blank"); return; }
        int portSokett=Integer.parseInt(portSoket);
        serverSocket = new DatagramSocket(portSokett);
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMiniChatServer().setVisible(true);    
            }
                
        });     
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JP_test;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_send;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listMess;
    private javax.swing.JTextField txt_ipReceiver;
    private javax.swing.JTextField txt_port;
    private javax.swing.JTextField txt_sendChat;
    private javax.swing.JTextField txt_userName;
    // End of variables declaration//GEN-END:variables
}
