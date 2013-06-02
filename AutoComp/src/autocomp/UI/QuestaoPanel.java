/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autocomp.UI;

import autocomp.entidades.Disciplina;
import autocomp.entidades.Grupo;
import autocomp.entidades.Usuario;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import logica.ImportacaoProf;
import logica.Login;
import logica.Questoes;

/**
 *
 * @author adriano
 */
public class QuestaoPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuestaoPanel
     */
    public QuestaoPanel(Grupo g) {
        grupo = g;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AltCorretaGroup = new javax.swing.ButtonGroup();
        IdBox = new javax.swing.JTextField();
        AltABox = new javax.swing.JTextField();
        AltALabel = new javax.swing.JLabel();
        AltBLabel = new javax.swing.JLabel();
        AltBBox = new javax.swing.JTextField();
        AltCLabel = new javax.swing.JLabel();
        AltCBox = new javax.swing.JTextField();
        AltDLabel = new javax.swing.JLabel();
        AltDBox = new javax.swing.JTextField();
        AltELabel = new javax.swing.JLabel();
        AltEBox = new javax.swing.JTextField();
        AltARadio = new javax.swing.JRadioButton();
        AltBRadio = new javax.swing.JRadioButton();
        AltCRadio = new javax.swing.JRadioButton();
        AltDRadio = new javax.swing.JRadioButton();
        AltERadio = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        EnunciadoPane = new javax.swing.JTextPane();
        QuestaoLabel = new javax.swing.JLabel();
        SalvarButton = new javax.swing.JButton();
        DIficuldadeBox = new javax.swing.JComboBox();
        DificuldadeLabel = new javax.swing.JLabel();
        CancelarButton = new javax.swing.JButton();

        Questoes questoes = new Questoes();
        int id = questoes.novaQuestao();
        IdBox.setText(String.valueOf(id));

        AltALabel.setText("A)");

        AltBLabel.setText("B)");

        AltCLabel.setText("C)");

        AltDLabel.setText("D)");

        AltELabel.setText("E)");

        AltCorretaGroup.add(AltARadio);

        AltCorretaGroup.add(AltBRadio);

        AltCorretaGroup.add(AltCRadio);

        AltCorretaGroup.add(AltDRadio);

        AltCorretaGroup.add(AltERadio);

        String[] nomes = ImportacaoProf.getNomeDisciplinas();
        if(nomes == null){
            nomes = new String[1];
            nomes[0] = "";
            jComboBox1.setEnabled(false);
            SalvarButton.setEnabled(false);
        }
        DefaultComboBoxModel combo = new DefaultComboBoxModel(nomes);
        jComboBox1.setModel(combo);
        jComboBox1.setActionCommand("");

        jScrollPane1.setViewportView(EnunciadoPane);

        QuestaoLabel.setText("Questão:");

        SalvarButton.setText("Salvar");
        SalvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarButtonActionPerformed(evt);
            }
        });

        DIficuldadeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fácil", "Médio", "Difícil" }));

        DificuldadeLabel.setText("Dificuldade");

        CancelarButton.setText("Cancelar");
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QuestaoLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(AltALabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AltABox, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AltARadio))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(AltBLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AltBBox, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AltBRadio))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(AltDLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AltDBox, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AltDRadio))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(AltCLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AltCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AltCRadio))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(AltELabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AltEBox, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AltERadio))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(IdBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DificuldadeLabel)
                            .addGap(18, 18, 18)
                            .addComponent(DIficuldadeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CancelarButton)
                .addGap(18, 18, 18)
                .addComponent(SalvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DIficuldadeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DificuldadeLabel))
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(QuestaoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AltABox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AltALabel)
                    .addComponent(AltARadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AltBBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AltBLabel))
                    .addComponent(AltBRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AltCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AltCLabel))
                    .addComponent(AltCRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AltDBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AltDLabel))
                    .addComponent(AltDRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AltEBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AltELabel))
                    .addComponent(AltERadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalvarButton)
                    .addComponent(CancelarButton))
                .addGap(30, 30, 30))
        );

        IdBox.setEnabled(false);
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        MenuPanel menuPanel = new MenuPanel(grupo);
        JFrame jf = (JFrame) this.getTopLevelAncestor();
        jf.getContentPane().removeAll();
        jf.getContentPane().add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, menuPanel.getPreferredSize().height));
        jf.setMinimumSize(menuPanel.getPreferredSize());
        jf.pack();
    }//GEN-LAST:event_CancelarButtonActionPerformed

    private void SalvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarButtonActionPerformed
        int id;
        String enunciado, alternativa1, alternativa2, alternativa3,
            alternativa4, alternativa5;
        int alternativaCorreta, dificuldade;
        Usuario responsavel;
        Disciplina disciplina;
        Login login = new Login();
        id = Integer.parseInt(IdBox.getText());
        enunciado = EnunciadoPane.getText();
        alternativa1 = AltABox.getText();
        alternativa2 = AltBBox.getText();
        alternativa3 = AltCBox.getText();
        alternativa4 = AltDBox.getText();
        alternativa5 = AltEBox.getText();
        if(AltARadio.isSelected())
            alternativaCorreta = 1;
        else if(AltBRadio.isSelected())
            alternativaCorreta = 2;
        else if(AltCRadio.isSelected())
            alternativaCorreta = 3;
        else if(AltDRadio.isSelected())
            alternativaCorreta = 4;
        else 
            alternativaCorreta = 5;
        dificuldade = DIficuldadeBox.getSelectedIndex();
        responsavel = login.atualUsuario();
        disciplina = ImportacaoProf.getDisciplina(jComboBox1.getSelectedIndex());
        Questoes questoes = new Questoes();
        if(enunciado.equals("") || alternativa1.equals("") || alternativa2.equals("") || 
                alternativa3.equals("") ||alternativa4.equals("") || alternativa5.equals("") || 
                alternativaCorreta == -1)
                JOptionPane.showMessageDialog(this, "Ocorreu um erro durante o cadastro!", "Erro", JOptionPane.ERROR_MESSAGE);
        else if(questoes.adicionar(id, enunciado, alternativa1, alternativa2, alternativa3, 
                alternativa4, alternativa5, alternativaCorreta, dificuldade, responsavel, disciplina)){
            JOptionPane.showMessageDialog(this, "Nova questão adicionada com sucesso!", "Sucesso", JOptionPane.DEFAULT_OPTION);      
            MenuPanel menuPanel = new MenuPanel(grupo);
            JFrame jf = (JFrame) this.getTopLevelAncestor();
            jf.getContentPane().removeAll();
            jf.getContentPane().add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, menuPanel.getPreferredSize().height));
            jf.setMinimumSize(menuPanel.getPreferredSize());
            jf.pack();   
        }
        else
            JOptionPane.showMessageDialog(this, "Ocorreu um erro durante o cadastro!", "Erro", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_SalvarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AltABox;
    private javax.swing.JLabel AltALabel;
    private javax.swing.JRadioButton AltARadio;
    private javax.swing.JTextField AltBBox;
    private javax.swing.JLabel AltBLabel;
    private javax.swing.JRadioButton AltBRadio;
    private javax.swing.JTextField AltCBox;
    private javax.swing.JLabel AltCLabel;
    private javax.swing.JRadioButton AltCRadio;
    private javax.swing.ButtonGroup AltCorretaGroup;
    private javax.swing.JTextField AltDBox;
    private javax.swing.JLabel AltDLabel;
    private javax.swing.JRadioButton AltDRadio;
    private javax.swing.JTextField AltEBox;
    private javax.swing.JLabel AltELabel;
    private javax.swing.JRadioButton AltERadio;
    private javax.swing.JButton CancelarButton;
    private javax.swing.JComboBox DIficuldadeBox;
    private javax.swing.JLabel DificuldadeLabel;
    private javax.swing.JTextPane EnunciadoPane;
    private javax.swing.JTextField IdBox;
    private javax.swing.JLabel QuestaoLabel;
    private javax.swing.JButton SalvarButton;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    Grupo grupo;
}
