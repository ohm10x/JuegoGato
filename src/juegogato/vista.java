/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegogato;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Omar
 */
public class vista extends javax.swing.JFrame {

 //  FondoPanel fondo = new FondoPanel();
    
    
    /**
     * Creates new form vista
     */
    boolean estado=true; // si es true se puede escribir donde tirar
    String siguienteJuego="O"; // para que en cada partida, inicie un jugador distinto la primera tirada
    String turno="X";    //se inicializa en x
    JLabel lbs[]= new JLabel[9];   //array de jlabels
    
                //array bidimensinal de todaa las posibles victorias

    int victorias[][]={
        {1,2,3},
        {4,5,6},
        {7,8,9},
        {1,4,7},
        {2,5,8},
        {3,6,9},
        {1,5,9},
        {3,5,7}       
    };
    
    
    public vista() {
        initComponents();
        
   //     this.setContentPane(fondo);
        
        this.setLocationRelativeTo(null);  //para que elo jFrame aparezca en el centro de la pantalla
        
    
        
            lbs[0] = jLabeln1;
            lbs[1] = jLabeln2;
            lbs[2] = jLabeln3;
            lbs[3] = jLabeln4;
            lbs[4] = jLabeln5;
            lbs[5] = jLabeln6;
            lbs[6] = jLabeln7;
            lbs[7] = jLabeln8;
            lbs[8] = jLabeln9;


            
            
            
            
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabeln2 = new javax.swing.JLabel();
        jLabeln3 = new javax.swing.JLabel();
        jLabeln8 = new javax.swing.JLabel();
        jLabeln5 = new javax.swing.JLabel();
        jLabeln6 = new javax.swing.JLabel();
        jLabeln1 = new javax.swing.JLabel();
        jLabeln4 = new javax.swing.JLabel();
        jLabeln7 = new javax.swing.JLabel();
        jLabeln9 = new javax.swing.JLabel();
        Button_Reiniciar = new javax.swing.JButton();
        Label_Turno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbPuntuajeX = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbPuntuajeO = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel7.setText("Jugador 1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gato");
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));

        jLabeln2.setBackground(new java.awt.Color(255, 255, 255));
        jLabeln2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabeln2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeln2.setOpaque(true);
        jLabeln2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabeln2MousePressed(evt);
            }
        });

        jLabeln3.setBackground(new java.awt.Color(255, 255, 255));
        jLabeln3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabeln3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeln3.setOpaque(true);
        jLabeln3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabeln3MousePressed(evt);
            }
        });

        jLabeln8.setBackground(new java.awt.Color(255, 255, 255));
        jLabeln8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabeln8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeln8.setOpaque(true);
        jLabeln8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabeln8MousePressed(evt);
            }
        });

        jLabeln5.setBackground(new java.awt.Color(255, 255, 255));
        jLabeln5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabeln5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeln5.setOpaque(true);
        jLabeln5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabeln5MousePressed(evt);
            }
        });

        jLabeln6.setBackground(new java.awt.Color(255, 255, 255));
        jLabeln6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabeln6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeln6.setOpaque(true);
        jLabeln6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabeln6MousePressed(evt);
            }
        });

        jLabeln1.setBackground(new java.awt.Color(255, 255, 255));
        jLabeln1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabeln1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeln1.setOpaque(true);
        jLabeln1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabeln1MousePressed(evt);
            }
        });

        jLabeln4.setBackground(new java.awt.Color(255, 255, 255));
        jLabeln4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabeln4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeln4.setOpaque(true);
        jLabeln4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabeln4MousePressed(evt);
            }
        });

        jLabeln7.setBackground(new java.awt.Color(255, 255, 255));
        jLabeln7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabeln7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeln7.setOpaque(true);
        jLabeln7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabeln7MousePressed(evt);
            }
        });

        jLabeln9.setBackground(new java.awt.Color(255, 255, 255));
        jLabeln9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabeln9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeln9.setOpaque(true);
        jLabeln9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabeln9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabeln1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabeln2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabeln3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabeln4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabeln7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabeln5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabeln6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabeln8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabeln9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeln2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeln3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeln1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeln4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeln5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeln6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeln7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeln8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeln9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(107, 48, 345, 323);

        Button_Reiniciar.setText("Reiniciar");
        Button_Reiniciar.setPreferredSize(new java.awt.Dimension(85, 23));
        Button_Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Reiniciar);
        Button_Reiniciar.setBounds(399, 14, 85, 23);

        Label_Turno.setText("Turno de X");
        Label_Turno.setPreferredSize(new java.awt.Dimension(80, 14));
        getContentPane().add(Label_Turno);
        Label_Turno.setBounds(81, 18, 80, 14);

        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("X=");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(93, 389, 62, 29);

        lbPuntuajeX.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        lbPuntuajeX.setText("0");
        getContentPane().add(lbPuntuajeX);
        lbPuntuajeX.setBounds(161, 389, 62, 29);

        jLabel3.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("O=");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(329, 389, 62, 29);

        lbPuntuajeO.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        lbPuntuajeO.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbPuntuajeO.setText("0");
        getContentPane().add(lbPuntuajeO);
        lbPuntuajeO.setBounds(397, 389, 62, 29);

        jButton1.setText("Menú");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 380, 59, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/jugador2Java.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(470, 190, 61, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/jugador1Java.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 180, 60, 80);

        jLabel6.setText("Jugador 2");
        jLabel6.setPreferredSize(new java.awt.Dimension(150, 14));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(480, 290, 150, 10);

        jLabel8.setText("Jugador 1");
        jLabel8.setPreferredSize(new java.awt.Dimension(150, 14));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 280, 150, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/playa.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -80, 550, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   /*
    
    class FondoPanel extends JPanel
    {
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
         imagen = new ImageIcon(getClass().getResource("/imagenes/playa.jpg")).getImage();
            
           
            g.drawImage(imagen,0, 0, getWidth(), getHeight(),this);
            
            setOpaque(false);
            
          super.paint(g);
            
        }
                
        
    }
   
   
    */
    
    
    private void jLabeln4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeln4MousePressed
        // TODO add your handling code here:
                presionar(4);

    }//GEN-LAST:event_jLabeln4MousePressed

    private void jLabeln2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeln2MousePressed
        // TODO add your handling code here:
                presionar(2);

    }//GEN-LAST:event_jLabeln2MousePressed

    private void jLabeln3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeln3MousePressed
        // TODO add your handling code here:
                presionar(3);

    }//GEN-LAST:event_jLabeln3MousePressed

    private void jLabeln9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeln9MousePressed
        // TODO add your handling code here:
                presionar(9);

    }//GEN-LAST:event_jLabeln9MousePressed

    private void jLabeln8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeln8MousePressed
        // TODO add your handling code here:
                presionar(8);

    }//GEN-LAST:event_jLabeln8MousePressed

    private void jLabeln1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeln1MousePressed
        // TODO add your handling code here:
        
        presionar(1);
    }//GEN-LAST:event_jLabeln1MousePressed

    private void jLabeln5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeln5MousePressed
        // TODO add your handling code here:
                presionar(5);

    }//GEN-LAST:event_jLabeln5MousePressed

    private void jLabeln6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeln6MousePressed
        // TODO add your handling code here:
                presionar(6);
    }//GEN-LAST:event_jLabeln6MousePressed

    private void jLabeln7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeln7MousePressed
        // TODO add your handling code here:
                presionar(7);

    }//GEN-LAST:event_jLabeln7MousePressed

    private void Button_ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ReiniciarActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < lbs.length; i++) {
            lbs[i].setText("");
            lbs[i].setBackground(Color.white);
        }
        
        turno = siguienteJuego;
        if(siguienteJuego.equals("O")){
            siguienteJuego="X";
        }else{
            siguienteJuego="O";
        }
            
         Label_Turno.setText("Turno de "+turno); 
         estado=true;
    }//GEN-LAST:event_Button_ReiniciarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Bienvenida bienvenida = new Bienvenida();
        bienvenida.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void presionar(int casilla){
        if (lbs[casilla-1].getText().equals("") && estado){
            lbs[casilla-1].setText(turno);
            cambiarTurno();
                    comprobarGanador();

        }
        
        
    }
    
    
    public void cambiarTurno(){
        if(turno.equals("X")){
            turno="O";
        }else{
            turno="X";
        }
        
        
        Label_Turno.setText("Turno de "+turno);
    }
    
    
    public void comprobarGanador(){
        
        for(int i=0; i<victorias.length;i++){
            if(lbs[victorias[i][0]-1].getText().equals("X") &&
                    lbs[victorias[i][1]-1].getText().equals("X") &&
                        lbs[victorias[i][2]-1].getText().equals("X")){
                
                
                lbs[victorias[i][0]-1].setBackground(Color.green);
                lbs[victorias[i][1]-1].setBackground(Color.green);
                lbs[victorias[i][2]-1].setBackground(Color.green);
                
               lbPuntuajeX.setText(Integer.toString(Integer.parseInt(lbPuntuajeX.getText())+1));

                Label_Turno.setText("Ha ganado X");   
                estado=false; //para que una vez que X gano, Y ya no pueda escribir
            }
            if(lbs[victorias[i][0]-1].getText().equals("O") &&
                    lbs[victorias[i][1]-1].getText().equals("O") &&
                        lbs[victorias[i][2]-1].getText().equals("O")){
                
                lbs[victorias[i][0]-1].setBackground(Color.red);
                lbs[victorias[i][1]-1].setBackground(Color.red);
                lbs[victorias[i][2]-1].setBackground(Color.red);                
                
              lbPuntuajeO.setText(Integer.toString(Integer.parseInt(lbPuntuajeO.getText())+1));
                Label_Turno.setText("Ha ganado O");        
                estado=false; //para que una vez que Y gano, X ya no pueda escribir 
            }
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Reiniciar;
    private javax.swing.JLabel Label_Turno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabeln1;
    private javax.swing.JLabel jLabeln2;
    private javax.swing.JLabel jLabeln3;
    private javax.swing.JLabel jLabeln4;
    private javax.swing.JLabel jLabeln5;
    private javax.swing.JLabel jLabeln6;
    private javax.swing.JLabel jLabeln7;
    private javax.swing.JLabel jLabeln8;
    private javax.swing.JLabel jLabeln9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbPuntuajeO;
    private javax.swing.JLabel lbPuntuajeX;
    // End of variables declaration//GEN-END:variables
}
