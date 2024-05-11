/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.zam.interfaz;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Calculadora extends javax.swing.JFrame {

    ArrayList<Integer> lista_numeros;

    public Calculadora() {
        this.lista_numeros = new ArrayList<>();
        initComponents();
        txtOperacion.setText("0");
        txtOperacion.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        btnResetear = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setBackground(new java.awt.Color(0, 153, 153));
        txtOperacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        btn1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        btn2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        btnResetear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnResetear.setText("r");
        btnResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetearActionPerformed(evt);
            }
        });
        jPanel2.add(btnResetear, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 40, 30));

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 40, 30));

        btnPunto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPunto.setText(".");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        jPanel2.add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 40, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 210, 260));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSuma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSuma.setText("+");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        jPanel3.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, -1));

        btnResta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnResta.setText("-");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        jPanel3.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 50, -1));

        btnMultiplicacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMultiplicacion.setText("X");
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });
        jPanel3.add(btnMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 50, -1));

        btnDivision.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDivision.setText("÷");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        jPanel3.add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 50, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 90, 260));

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete_icon.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 40, 30));

        btnCalcular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCalcular.setText("=");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        String numero = txtOperacion.getText();
        if (numero.equals("0")) {
            txtOperacion.setText("1");
        } else {
            String numero_final = numero.concat("1");
            txtOperacion.setText(numero_final);
        }

    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String numero = txtOperacion.getText();
        if (numero.equals("0")) {
            txtOperacion.setText("2");
        } else {
            String numero_final = numero.concat("2");
            txtOperacion.setText(numero_final);
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String numero = txtOperacion.getText();
        if (numero.equals("0")) {
            txtOperacion.setText("3");
        } else {
            String numero_final = numero.concat("3");
            txtOperacion.setText(numero_final);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String numero = txtOperacion.getText();
        if (numero.equals("0")) {
            txtOperacion.setText("4");
        } else {
            String numero_final = numero.concat("4");
            txtOperacion.setText(numero_final);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String numero = txtOperacion.getText();
        if (numero.equals("0")) {
            txtOperacion.setText("5");
        } else {
            String numero_final = numero.concat("5");
            txtOperacion.setText(numero_final);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String numero = txtOperacion.getText();
        if (numero.equals("0")) {
            txtOperacion.setText("6");
        } else {
            String numero_final = numero.concat("6");
            txtOperacion.setText(numero_final);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String numero = txtOperacion.getText();
        if (numero.equals("0")) {
            txtOperacion.setText("7");
        } else {
            String numero_final = numero.concat("7");
            txtOperacion.setText(numero_final);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String numero = txtOperacion.getText();
        if (numero.equals("0")) {
            txtOperacion.setText("8");
        } else {
            String numero_final = numero.concat("8");
            txtOperacion.setText(numero_final);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String numero = txtOperacion.getText();
        if (numero.equals("0")) {
            txtOperacion.setText("9");
        } else {
            String numero_final = numero.concat("9");
            txtOperacion.setText(numero_final);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        String numero = txtOperacion.getText();
        if (numero.equals("0")) {
            txtOperacion.setText("0");
        } else {
            String numero_final = numero.concat("0");
            txtOperacion.setText(numero_final);
        }
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (txtOperacion.getText().isBlank()) {
            txtOperacion.setText("0");
        } else {
            String numero = txtOperacion.getText();
            if (numero.endsWith("1") || numero.endsWith("2") || numero.endsWith("3") || numero.endsWith("4") || numero.endsWith("5")
                    || numero.endsWith("6") || numero.endsWith("7") || numero.endsWith("8") || numero.endsWith("9")
                    || numero.endsWith("0") || numero.endsWith("-") || numero.endsWith(".")) {
                char result1 = numero.charAt(numero.length() - 1);
                String result = "";
                for (int i = 0; i < numero.length(); i++) {
                    if (numero.length() - 1 != i) {
                        result += numero.charAt(i);
                    }
                }
                numero = result;
                txtOperacion.setText(numero);
                if (txtOperacion.getText().isBlank() || txtOperacion.getText().equals("-")) {
                    txtOperacion.setText("0");
                }
            } else {
                for (int i = 0; i < 3; i++) {
                    char result1 = numero.charAt(numero.length() - 1);
                    String result = "";
                    for (int j = 0; j < numero.length(); j++) {
                        if (numero.length() - 1 != j) {
                            result += numero.charAt(j);
                        }
                    }
                    numero = result;
                    txtOperacion.setText(numero);
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        String muestra = txtOperacion.getText();
        if (muestra.contains("*") || muestra.contains("/") || muestra.contains("+") || muestra.contains("-")) {
            if (muestra.endsWith(" + ") || muestra.endsWith(" - ") || muestra.endsWith(" * ") || muestra.endsWith(" / ")) {
                JOptionPane.showMessageDialog(null, "Ya introdujo un operador!!");
            } else {
                if (muestra.contains("+")) {
                    //Eliminar los espacios en blanco
                    muestra = muestra.replaceAll("\\s", "");

                    //Separar los datos
                    String datos[] = muestra.split("\\+");
                    String part1 = datos[0];
                    String part2 = datos[1];
                    double num1 = Double.parseDouble(part1);
                    double num2 = Double.parseDouble(part2);
                    Double suma = num1 + num2;
                    if (suma.toString().endsWith("0")) {
                        String suma1 = suma.toString();
                        double suma2 = Double.parseDouble(suma1);
                        int suma_final = (int) suma2;
                        txtOperacion.setText(String.valueOf(suma_final).concat(" + "));
                    } else {
                        double aproximacion = Math.round(suma * 100.0) / 100.0;
                        txtOperacion.setText(String.valueOf(aproximacion).concat(" + "));
                    }
                }
            }
        } else {
            String numero = txtOperacion.getText();
            String numero_final = numero.concat(" + ");
            txtOperacion.setText(numero_final);

        }
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        String muestra = txtOperacion.getText();
        if (muestra.contains("*") || muestra.contains("/") || muestra.contains("+") || muestra.contains("-")) {
            if (muestra.endsWith(" + ") || muestra.endsWith(" - ") || muestra.endsWith(" * ") || muestra.endsWith(" / ")) {
                JOptionPane.showMessageDialog(null, "Ya introdujo un operador!!");
            } else {
                if (muestra.contains("-")) {
                    //Separar los datos
                    String datos[] = muestra.split("\\ - ");
                    String part1 = datos[0];
                    String part2 = datos[1];
                    double num1 = Double.parseDouble(part1);
                    double num2 = Double.parseDouble(part2);
                    Double suma = num1 - num2;
                    if (suma.toString().endsWith("0")) {
                        String suma1 = suma.toString();
                        double suma2 = Double.parseDouble(suma1);
                        int suma_final = (int) suma2;
                        txtOperacion.setText(String.valueOf(suma_final).concat(" - "));
                    } else {
                        double aproximacion = Math.round(suma * 100.0) / 100.0;
                        txtOperacion.setText(String.valueOf(aproximacion).concat(" - "));
                    }
                }
            }
        } else {
            String numero = txtOperacion.getText();
            String numero_final = numero.concat(" - ");
            txtOperacion.setText(numero_final);

        }
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        String muestra = txtOperacion.getText();
        if (muestra.contains("*") || muestra.contains("/") || muestra.contains("+") || muestra.contains("-")) {
            if (muestra.endsWith(" + ") || muestra.endsWith(" - ") || muestra.endsWith(" * ") || muestra.endsWith(" / ")) {
                JOptionPane.showMessageDialog(null, "Ya introdujo un operador!!");
            } else {
                if (muestra.contains("*")) {
                    //Eliminar los espacios en blanco
                    muestra = muestra.replaceAll("\\s", "");

                    //Separar los datos
                    String datos[] = muestra.split("\\*");
                    String part1 = datos[0];
                    String part2 = datos[1];
                    double num1 = Double.parseDouble(part1);
                    double num2 = Double.parseDouble(part2);
                    Double suma = num1 * num2;
                    if (suma.toString().endsWith("0")) {
                        String suma1 = suma.toString();
                        double suma2 = Double.parseDouble(suma1);
                        int suma_final = (int) suma2;
                        txtOperacion.setText(String.valueOf(suma_final).concat(" * "));
                    } else {
                        double aproximacion = Math.round(suma * 100.0) / 100.0;
                        txtOperacion.setText(String.valueOf(aproximacion).concat(" * "));
                    }

                }
            }
        } else {
            String numero = txtOperacion.getText();
            String numero_final = numero.concat(" * ");
            txtOperacion.setText(numero_final);

        }
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        String muestra = txtOperacion.getText();
        if (muestra.contains("*") || muestra.contains("/") || muestra.contains("+") || muestra.contains("-")) {
            if (muestra.endsWith(" + ") || muestra.endsWith(" - ") || muestra.endsWith(" * ") || muestra.endsWith(" / ")) {
                JOptionPane.showMessageDialog(null, "Ya introdujo un operador!!");
            } else {
                if (muestra.contains("/")) {
                    //Eliminar los espacios en blanco
                    muestra = muestra.replaceAll("\\s", "");

                    //Separar los datos
                    String datos[] = muestra.split("\\/");
                    String part1 = datos[0];
                    String part2 = datos[1];
                    double num1 = Double.parseDouble(part1);
                    double num2 = Double.parseDouble(part2);
                    Double suma = num1 / num2;
                    if (suma.toString().endsWith("0")) {
                        String suma1 = suma.toString();
                        double suma2 = Double.parseDouble(suma1);
                        int suma_final = (int) suma2;
                        txtOperacion.setText(String.valueOf(suma_final).concat(" / "));
                    } else {
                        double aproximacion = Math.round(suma * 100.0) / 100.0;
                        txtOperacion.setText(String.valueOf(aproximacion).concat(" / "));
                    }
                }
            }
        } else {
            String numero = txtOperacion.getText();
            String numero_final = numero.concat(" / ");
            txtOperacion.setText(numero_final);

        }
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        String operacion = txtOperacion.getText();
        if (operacion.equals("0")) {
            JOptionPane.showMessageDialog(null, "El casillero esta vacio!!");
        } else {
            //Eliminar los espacios en blanco
            operacion = operacion.replaceAll("\\s", "");
            String datos[] = null;
            
            if (operacion.contains("+")) {
                datos = operacion.split("\\+");
            } else if (operacion.contains("-")) {
                datos = operacion.split("\\-");
            } else if (operacion.contains("*")) {
                datos = operacion.split("\\*");
            } else if (operacion.contains("/")) {
                datos = operacion.split("\\/");
            }
            
            String part1 = datos[0];
            String part2 = datos[1];

            double num1 = Double.parseDouble(part1);
            double num2 = Double.parseDouble(part2);
            Double resultado = 0.0;
            
            if (operacion.contains("+")) {
                resultado = num1 + num2;
            } else if (operacion.contains("-")) {
                resultado = num1 - num2;
            } else if (operacion.contains("*")) {
                resultado = num1 * num2;
            } else if (operacion.contains("/")) {
                resultado = num1 / num2;
            }

            if (resultado.toString().endsWith("0")) {
                String suma1 = resultado.toString();
                double suma2 = Double.parseDouble(suma1);
                int suma_final = (int) suma2;
                txtOperacion.setText(String.valueOf(suma_final));
            } else {
                double aproximacion = Math.round(resultado * 100.0) / 100.0;
                txtOperacion.setText(String.valueOf(aproximacion));
            }

        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetearActionPerformed
        txtOperacion.setText("0");
    }//GEN-LAST:event_btnResetearActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        String numero = txtOperacion.getText();
        String numero_final = numero.concat(".");
        txtOperacion.setText(numero_final);
    }//GEN-LAST:event_btnPuntoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResetear;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtOperacion;
    // End of variables declaration//GEN-END:variables
}
