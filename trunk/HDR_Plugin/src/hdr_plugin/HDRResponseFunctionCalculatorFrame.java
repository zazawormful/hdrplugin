/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * HDRResponseFunctionCalculatorFrame.java
 *
 * Created on 27.11.2008, 08:37:45
 */

package hdr_plugin;

import hdr_plugin.calibration.ResponseFunctionCalculator;

/**
 *
 * @author Alex
 */
public class HDRResponseFunctionCalculatorFrame extends java.awt.Frame {

    /** Creates new form HDRResponseFunctionCalculatorFrame */
    public HDRResponseFunctionCalculatorFrame(ResponseFunctionCalculator calculator) {
        this.responseFunctionCalculatorSettings = calculator.getResponseFunctionCalculatorSettings();
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        responseFunctionCalculatorSettings = new hdr_plugin.calibration.ResponseFunctionCalculatorSettings();
        button1 = new java.awt.Button();
        textField1 = new java.awt.TextField();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(new java.awt.GridBagLayout());

        button1.setLabel("button1");
        add(button1, new java.awt.GridBagConstraints());

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, responseFunctionCalculatorSettings, org.jdesktop.beansbinding.ELProperty.create("${noOfPixelsN}"), textField1, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        add(textField1, new java.awt.GridBagConstraints());

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        this.dispose();
    }//GEN-LAST:event_exitForm

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private hdr_plugin.calibration.ResponseFunctionCalculatorSettings responseFunctionCalculatorSettings;
    private java.awt.TextField textField1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}