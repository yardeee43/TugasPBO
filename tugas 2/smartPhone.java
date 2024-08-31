/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author bachtiar
 */
public class smartPhone extends phone {
    private String os;
    
    public smartPhone(String os,String brand, String model){
        this.os = os;
        super.setBrand(brand);
        super.setModel(model);
        System.out.printf("nama smartphone ini adalah %s dengan model %s dari os %s\n",brand,model,os );
    }
    
    public void touchscreen(){
        System.out.println("device ini sudah menggunakan touchsreen");
    }

    /**
     * @return the os
     */
    public String getOs() {
        return os;
    }

    /**
     * @param os the os to set
     */
    public void setOs(String os) {
        this.os = os;
    }
}
