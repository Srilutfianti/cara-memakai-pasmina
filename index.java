private void bt_0ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // fungsi untuk tombol 0
        bilangan +="0";        
        txt_hasil.setText(bilangan);
} 
 
private void bt_1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // fungsi untuk tombol 1
        bilangan +="1";        
        txt_hasil.setText(bilangan);
}   
 
private void bt_2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // fungsi untuk tombol 2
        bilangan +="2";        
        txt_hasil.setText(bilangan);
    }
 
private void bt_3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // fungsi untuk tombol 3
        bilangan +="3";        
        txt_hasil.setText(bilangan);
    }                                    
 
    private void bt_4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // fungsi untuk tombol 4
        bilangan +="4";        
        txt_hasil.setText(bilangan);
    }                                    
 
    private void bt_5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // fungsi untuk tombol 5
        bilangan +="5";        
        txt_hasil.setText(bilangan);
    }                                    
 
    private void bt_6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // fungsi untuk tombol 6
        bilangan +="6";        
        txt_hasil.setText(bilangan);
    }                                    
 
    private void bt_7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // fungsi untuk tombol 7
        bilangan +="7";        
        txt_hasil.setText(bilangan);
    }                                    
 
    private void bt_8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // fungsi untuk tombol 8
        bilangan +="8";        
        txt_hasil.setText(bilangan);
    }                                    
 
    private void bt_9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // fungsi untuk tombol 9
        bilangan +="9";        
        txt_hasil.setText(bilangan);
    }
 
private void bt_clearActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // fungsi untuk tombol c
        txt_hasil.setText(null);
        bil1=0.0;
        bil2=0.0;
        jumlah=0.0;
        bilangan="";
    }

private void bt_tambahActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        bil1 =Double.parseDouble(bilangan);
        txt_hasil.setText("+");
        bilangan="";
        pilih=1;       
    }                                         
 
    private void bt_kurangActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        bil1 =Double.parseDouble(bilangan);
        txt_hasil.setText("-");
        bilangan="";
        pilih=2;
    }                                         
 
    private void bt_kaliActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        bil1 =Double.parseDouble(bilangan);
        txt_hasil.setText("*");
        bilangan="";
        pilih=3;
    }                                       
 
    private void bt_bagiActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here: 
        bil1 =Double.parseDouble(bilangan);
        txt_hasil.setText("/");
        bilangan="";
        pilih=4;
    }
