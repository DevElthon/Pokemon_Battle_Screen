
import Classes.BattleController;
import javax.swing.SwingUtilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author eltho
 */
public class Battle extends javax.swing.JFrame {

    BattleController battleController = new BattleController();
    /**
     * Creates new form battle
     */
    public Battle() {
        initComponents();
        setSize(1280, 720);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelMPJogador = new javax.swing.JLabel();
        labelVidaJogador1 = new javax.swing.JLabel();
        labelVidaInimigo = new javax.swing.JLabel();
        labelMPInimigo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaJogador = new javax.swing.JTextArea();
        btnSPAttack = new javax.swing.JButton();
        btnFlee = new javax.swing.JButton();
        btnAttack = new javax.swing.JButton();
        btnDefend = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Jogador");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Inimigo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 140, 82, -1));

        labelMPJogador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelMPJogador.setForeground(new java.awt.Color(0, 0, 0));
        labelMPJogador.setText("Mana: 0");
        getContentPane().add(labelMPJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 160, -1));

        labelVidaJogador1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelVidaJogador1.setForeground(new java.awt.Color(0, 0, 0));
        labelVidaJogador1.setText("Vida: 0");
        getContentPane().add(labelVidaJogador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 160, -1));

        labelVidaInimigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelVidaInimigo.setText("Vida: 0");
        getContentPane().add(labelVidaInimigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 170, 160, -1));

        labelMPInimigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelMPInimigo.setText("Mana: 0");
        getContentPane().add(labelMPInimigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 200, 160, -1));

        txtAreaJogador.setColumns(20);
        txtAreaJogador.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtAreaJogador.setRows(5);
        txtAreaJogador.setText("O que Charmeleon deve fazer ?\n");
        txtAreaJogador.setEnabled(false);
        jScrollPane1.setViewportView(txtAreaJogador);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 480, 805, 234));

        btnSPAttack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSPAttack.setText("Ataque SP");
        btnSPAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSPAttackActionPerformed(evt);
            }
        });
        getContentPane().add(btnSPAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 480, 152, 104));

        btnFlee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFlee.setText("Fugir");
        btnFlee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFleeActionPerformed(evt);
            }
        });
        getContentPane().add(btnFlee, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 602, 152, 104));

        btnAttack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAttack.setText("Ataque");
        btnAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttackActionPerformed(evt);
            }
        });
        getContentPane().add(btnAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(886, 480, 152, 104));

        btnDefend.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDefend.setText("Defender");
        btnDefend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefendActionPerformed(evt);
            }
        });
        getContentPane().add(btnDefend, new org.netbeans.lib.awtextra.AbsoluteConstraints(886, 602, 152, 104));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/charmeleon.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 174, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/noivern.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 220, 267, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/field_1.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttackActionPerformed
        // TODO add your handling code here:
        battleController.playerAttacks();
        battleController.turnControl();
        txtAreaJogador.setText("Vida do inimigo: "+battleController.getEnemy().getHealth()+ "\nVida do jogador: "+battleController.getPlayer().getHealth());
        txtAreaJogador.setText("Usou 'Ataque' contra o Inimigo!");
        waitToNextTurn();
        statusPokemonUpdate();
        checkPokemonLife();
    }//GEN-LAST:event_btnAttackActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        statusPokemonUpdate();
    }//GEN-LAST:event_formComponentShown

    private void btnSPAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSPAttackActionPerformed
        // TODO add your handling code here:
        if(battleController.getPlayer().getMana() >= 25){
            battleController.PlayerSpecial();
            battleController.turnControl();
            txtAreaJogador.setText("Vida do inimigo: "+battleController.getEnemy().getHealth()+ "\nVida do jogador: "+battleController.getPlayer().getHealth());
            txtAreaJogador.setText("Usou 'Ataque SP' contra o Inimigo!");
            waitToNextTurn();
            statusPokemonUpdate();
            checkPokemonLife();
        }
    }//GEN-LAST:event_btnSPAttackActionPerformed

    private void btnDefendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefendActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        battleController.PlayerDefend();
        battleController.turnControl();
        txtAreaJogador.setText("Vida do inimigo: "+battleController.getEnemy().getHealth()+ "\nVida do jogador: "+battleController.getPlayer().getHealth());
        txtAreaJogador.setText("Usou 'Defender'!");
        waitToNextTurn();
        statusPokemonUpdate();
        checkPokemonLife();
    }//GEN-LAST:event_btnDefendActionPerformed

    private void btnFleeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFleeActionPerformed
        // TODO add your handling code here:
        waitToGameOver("Voce optou por fugir dessa vez. Mas não se preocupe, pode sempre tentar de novo!");
    }//GEN-LAST:event_btnFleeActionPerformed
    
    private void checkPokemonLife(){
        if(battleController.getPlayer().getHealth() <= 0 && battleController.getEnemy().getHealth() > 0){
            waitToGameOver("Sinto muito, voce foi derrotado. Nao fique triste, cada derrota e um aprendizado!");
        }
        else if(battleController.getEnemy().getHealth() <= 0 && battleController.getPlayer().getHealth() > 0){
            waitToGameOver("Parabens!!! Voce derrotou seu inimigo. Mantenha-se firme na sua jornada!");
        }
        else if(battleController.getEnemy().getHealth() <= 0 && battleController.getPlayer().getHealth() <= 0){
            waitToGameOver("O inesperado aconteceu...UM EMPATE!!!");
        }
    }
    
    private void waitToGameOver(String message){
        SwingUtilities.invokeLater(() -> {
            btnAttack.setEnabled(false);
            btnSPAttack.setEnabled(false);
            btnDefend.setEnabled(false);
            btnFlee.setEnabled(false);
            txtAreaJogador.setText("A batalha acabou!");
        });
        new Thread(() -> {
            try {
                Thread.sleep(5000); // Aguarda por 2000 milissegundos (2 segundos)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            SwingUtilities.invokeLater(() -> {
                setVisible(false);
                new GameOver(message).setVisible(true);
            });
        }).start();
    }
    
    private void waitToNextTurn(){
        SwingUtilities.invokeLater(() -> {
            btnAttack.setEnabled(false);
            btnSPAttack.setEnabled(false);
            btnDefend.setEnabled(false);
            btnFlee.setEnabled(false);
        });
        
        new Thread(() -> {
            try {
                Thread.sleep(2000); // Aguarda por 2000 milissegundos (2 segundos)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Reabilita os botões na EDT
            SwingUtilities.invokeLater(() -> {
                btnAttack.setEnabled(true);
                btnSPAttack.setEnabled(true);
                btnDefend.setEnabled(true);
                btnFlee.setEnabled(true);
            });
        }).start();
    }
    
    private void statusPokemonUpdate(){
        labelVidaJogador1.setText("Vida: "+battleController.getPlayer().getHealth());
        labelMPJogador.setText("Mana: "+battleController.getPlayer().getMana());
        
        labelVidaInimigo.setText("Vida: "+battleController.getEnemy().getHealth());
        labelMPInimigo.setText("Mana: "+battleController.getEnemy().getMana());
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttack;
    private javax.swing.JButton btnDefend;
    private javax.swing.JButton btnFlee;
    private javax.swing.JButton btnSPAttack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMPInimigo;
    private javax.swing.JLabel labelMPJogador;
    private javax.swing.JLabel labelVidaInimigo;
    private javax.swing.JLabel labelVidaJogador1;
    private javax.swing.JTextArea txtAreaJogador;
    // End of variables declaration//GEN-END:variables
}
