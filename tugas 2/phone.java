/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author bachtiar
 */
public class phone implements fungsi{
    private String brand;
    private String model;
    /**
     * @return the brand
     */
    
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void telpon(String nomor) {
        System.out.println(" sedang menelpon nomor "+nomor);
    }

    @Override
    public void sms(String pesan, String nomor) {
        System.out.println(" Sedang mengirim pesan __"+pesan+"__ ke nomor "+nomor);
    }
}
