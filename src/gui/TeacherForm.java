package gui;

import pojo.Users;

import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TeacherForm extends javax.swing.JFrame {

    /**
     * Creates new form TeacherForm
     */
    private Users user;
    public TeacherForm(Users usersAccount) {
        this.user=usersAccount;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        rootPanel = new javax.swing.JPanel();
        nameSchoolPanel = new javax.swing.JPanel();
        nameSchoolLabel = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        studentBtn = new javax.swing.JButton();
        teacherBtn = new javax.swing.JButton();
        classBtn = new javax.swing.JButton();
        subjectBtn = new javax.swing.JButton();
        courseBtn = new javax.swing.JButton();
        semesterBtn = new javax.swing.JButton();
        accountBtn = new javax.swing.JButton();
        sessionLabel = new javax.swing.JButton();
        registrationBtn = new javax.swing.JButton();
        signOutLabel = new javax.swing.JLabel();
        managementPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rootPanel.setToolTipText("rootPanel");

        nameSchoolPanel.setBackground(new java.awt.Color(117, 86, 253));
        nameSchoolPanel.setPreferredSize(new java.awt.Dimension(1000, 70));

        nameSchoolLabel.setBackground(new java.awt.Color(51, 186, 240));
        nameSchoolLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        nameSchoolLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameSchoolLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameSchoolLabel.setText("Trường đại học khoa học tự nhiên");
        nameSchoolLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout nameSchoolPanelLayout = new javax.swing.GroupLayout(nameSchoolPanel);
        nameSchoolPanel.setLayout(nameSchoolPanelLayout);
        nameSchoolPanelLayout.setHorizontalGroup(
                nameSchoolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nameSchoolPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nameSchoolLabel)
                                .addGap(275, 275, 275))
        );
        nameSchoolPanelLayout.setVerticalGroup(
                nameSchoolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(nameSchoolPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(nameSchoolLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuPanel.setBackground(new java.awt.Color(173, 240, 249));

        studentBtn.setBackground(new java.awt.Color(117, 86, 253));
        studentBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        studentBtn.setForeground(new java.awt.Color(255, 255, 255));
        studentBtn.setText("Student Management");
        studentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentBtnActionPerformed(evt);
            }
        });

        teacherBtn.setBackground(new java.awt.Color(117, 86, 253));
        teacherBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        teacherBtn.setForeground(new java.awt.Color(255, 255, 255));
        teacherBtn.setText("Teacher Management");

        classBtn.setBackground(new java.awt.Color(117, 86, 253));
        classBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        classBtn.setForeground(new java.awt.Color(255, 255, 255));
        classBtn.setText("Class Management");

        subjectBtn.setBackground(new java.awt.Color(117, 86, 253));
        subjectBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subjectBtn.setForeground(new java.awt.Color(255, 255, 255));
        subjectBtn.setText("Subject Management");
        subjectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectBtnActionPerformed(evt);
            }
        });

        courseBtn.setBackground(new java.awt.Color(117, 86, 253));
        courseBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        courseBtn.setForeground(new java.awt.Color(255, 255, 255));
        courseBtn.setText("Course Management");
        courseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseBtnActionPerformed(evt);
            }
        });

        semesterBtn.setBackground(new java.awt.Color(117, 86, 253));
        semesterBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        semesterBtn.setForeground(new java.awt.Color(255, 255, 255));
        semesterBtn.setText("Semester Management");
        semesterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterBtnActionPerformed(evt);
            }
        });

        accountBtn.setBackground(new java.awt.Color(117, 86, 253));
        accountBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        accountBtn.setForeground(new java.awt.Color(255, 255, 255));
        accountBtn.setText("My Account");
        accountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountBtnActionPerformed(evt);
            }
        });

        sessionLabel.setBackground(new java.awt.Color(117, 86, 253));
        sessionLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sessionLabel.setForeground(new java.awt.Color(255, 255, 255));
        sessionLabel.setText("Session Management");
        sessionLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sessionLabelActionPerformed(evt);
            }
        });

        registrationBtn.setBackground(new java.awt.Color(117, 86, 253));
        registrationBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registrationBtn.setForeground(new java.awt.Color(255, 255, 255));
        registrationBtn.setText("Registration Management");
        registrationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationBtnActionPerformed(evt);
            }
        });

        signOutLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        signOutLabel.setText("Sign Out");
        signOutLabel.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {

            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {
                System.out.println("sign out");

            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menuPanelLayout.createSequentialGroup()
                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(menuPanelLayout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(accountBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(studentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(teacherBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(classBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(subjectBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(semesterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(sessionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(courseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(registrationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(menuPanelLayout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addComponent(signOutLabel)))
                                .addContainerGap(25, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menuPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(accountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(studentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(teacherBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(classBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(subjectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(semesterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sessionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(courseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(registrationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(signOutLabel)
                                .addGap(26, 26, 26))
        );

        managementPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(2, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout managementPanelLayout = new javax.swing.GroupLayout(managementPanel);
        managementPanel.setLayout(managementPanelLayout);
        managementPanelLayout.setHorizontalGroup(
                managementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 912, Short.MAX_VALUE)
        );
        managementPanelLayout.setVerticalGroup(
                managementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
                rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nameSchoolPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1205, Short.MAX_VALUE)
                        .addGroup(rootPanelLayout.createSequentialGroup()
                                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(managementPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        rootPanelLayout.setVerticalGroup(
                rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rootPanelLayout.createSequentialGroup()
                                .addComponent(nameSchoolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(managementPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rootPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>

    private void studentBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void subjectBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void courseBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void semesterBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void accountBtnActionPerformed(java.awt.event.ActionEvent evt) {
        JPanel panel=new AccountPanel(user);
        managementPanel.removeAll();
        managementPanel.setLayout(new BorderLayout());
        managementPanel.add(panel);
        managementPanel.validate();
        managementPanel.repaint();
    }

    private void sessionLabelActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void registrationBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify
    private javax.swing.JButton accountBtn;
    private javax.swing.JButton classBtn;
    private javax.swing.JButton courseBtn;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JPanel managementPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel nameSchoolLabel;
    private javax.swing.JPanel nameSchoolPanel;
    private javax.swing.JButton registrationBtn;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JButton semesterBtn;
    private javax.swing.JButton sessionLabel;
    private javax.swing.JLabel signOutLabel;
    private javax.swing.JButton studentBtn;
    private javax.swing.JButton subjectBtn;
    private javax.swing.JButton teacherBtn;
    // End of variables declaration
}