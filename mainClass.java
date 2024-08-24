/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author bachtiar
 */
public class mainClass {
    public static void main(String[] args) {
        pisces mujaer = new pisces();
        mujaer.setNama("mujaer");
        System.out.println("nama saya "+mujaer.getNama());
        mujaer.bernafas();
        mujaer.tumbuh();
        mujaer.setSisik("saya memiliki sisik");
        System.out.println(mujaer.getSisik());
        mujaer.airTawar();
        mujaer.setAlatPernafasan("bernafas dengan insang");
        System.out.println("aku "+mujaer.getAlatPernafasan());
        mujaer.setBeranak("bertelur");
        System.out.println("saya "+mujaer.getBeranak());
        mujaer.setBergerak("berenang");
        System.out.println("saya "+mujaer.getBergerak());
        mujaer.setDaunTelinga("tidak memiliki daun telinga");
        System.out.println("saya "+mujaer.getDaunTelinga());
        mujaer.setJumlahKaki(0);
        System.out.println("saya memiliki jumlah kaki "+mujaer.getJumlahKaki());
        mujaer.setTempatTinggal("air");
        System.out.println("saya tinggal di "+mujaer.getTempatTinggal());
       
        System.out.println("");
        
        reptil komodo = new reptil();
        komodo.setNama("komodo");
        System.out.println("nama saya "+komodo.getNama());
        komodo.bernafas();
        komodo.tumbuh();
        komodo.setAlatPernafasan("paru paru");
        System.out.println("saya bernafas dengan "+komodo.getAlatPernafasan());
        komodo.setBeranak("melahirkan");
        System.out.println("saya "+komodo.getBeranak());
        komodo.setBergerak("merayap");
        System.out.println("saya "+komodo.getBergerak());
        komodo.setDaunTelinga("tidak memiliki daun telinga");
        System.out.println("saya "+komodo.getDaunTelinga());
        komodo.setJumlahKaki(4);
        System.out.println("saya memiliki jumlah kaki sebanyak "+komodo.getJumlahKaki());
        komodo.setTempatTinggal("darat");
        System.out.println("saya hidup di "+komodo.getTempatTinggal());
        komodo.bersisik();
        
        System.out.println("");
        
        aves merpati = new aves();
        merpati.setNama("merpati");
        System.out.println("nama saya "+merpati.getNama());
        merpati.bernafas();
        merpati.tumbuh();
        merpati.setAlatPernafasan("paru paru");
        System.out.println("saya bernafas menggunakan "+merpati.getAlatPernafasan());
        merpati.setBeranak("bertelur");
        System.out.println("saya "+merpati.getBeranak());
        merpati.setBergerak("terbang");
        System.out.println("saya "+merpati.getBergerak());
        merpati.setDaunTelinga("tidak memiliki daun telinga");
        System.out.println("saya "+merpati.getDaunTelinga());
        merpati.setJumlahKaki(2);
        System.out.println("saya memiliki jumlah kaki sebanyak "+merpati.getJumlahKaki());
        merpati.setTempatTinggal("darat");
        System.out.println("saya hidup di "+merpati.getTempatTinggal());
        merpati.berbulu();
        merpati.berparuh();
        merpati.bersayap();
        
        System.out.println("");
        
        mamalia kucing = new mamalia();
        kucing.setNama("kucing");
        System.out.println("nama saya "+kucing.getNama());
        kucing.bernafas();
        kucing.tumbuh();
        kucing.setAlatPernafasan("paru paru");
        System.out.println("saya bernafas menggunakan "+kucing.getAlatPernafasan());
        kucing.setBeranak("melahirkan");
        System.out.println("saya "+kucing.getBeranak());
        kucing.setBergerak("berjalan");
        System.out.println("saya "+kucing.getBergerak());
        kucing.setDaunTelinga("memiliki daun telinga");
        System.out.println("saya "+kucing.getDaunTelinga());
        kucing.setJumlahKaki(4);
        System.out.println("saya memiliki jumlah kaki sebanyak "+kucing.getJumlahKaki());
        kucing.setTempatTinggal("darat");
        System.out.println("saya hidup di "+kucing.getTempatTinggal());
        kucing.setKuku("memiliki kuku");
        System.out.println("saya "+kucing.getKuku());
        kucing.kelenjarSusu();
        
        System.out.println("");
        
        amfibi katak = new amfibi();
        katak.setNama("katak");
        System.out.println("nama saya "+katak.getNama());
        katak.bernafas();
        katak.tumbuh();
        katak.setAlatPernafasan("paru paru");
        System.out.println("saya bernafas menggunakan "+katak.getAlatPernafasan());
        katak.setBeranak("bertelur");
        System.out.println("saya "+katak.getBeranak());
        katak.setBergerak("melompat");
        System.out.println("saya "+katak.getBergerak());
        katak.setDaunTelinga("tidak memiliki daun telinga");
        System.out.println("saya "+katak.getDaunTelinga());
        katak.setJumlahKaki(4);
        System.out.println("saya memiliki jumlah kaki sebanyak "+katak.getJumlahKaki());
        katak.setTempatTinggal("darat dan di air");
        System.out.println("saya hidup di "+katak.getTempatTinggal());
        katak.setSelaput("berselaput");
        System.out.println("saya "+katak.getselaput());
        
        System.out.println("");
        
        monokotil mawar = new monokotil();
        mawar.setNama("mawar");
        System.out.println("nama saya "+mawar.getNama());
        mawar.bernafas();
        mawar.tumbuh();
        mawar.setAkar("tunggang");
        System.out.println("saya memiliki akar"+mawar.getAkar());
        mawar.setBatang("berkambium");
        System.out.println("saya memiliki batang "+mawar.getBatang());
        mawar.setBentukDaun("majemuk menyirip");
        System.out.println("saya memiliki bentuk daun "+mawar.getBentukDaun());
        mawar.setKelopakBunga("biasanya memiliki 5 kelopak bunga");
        System.out.println("saya "+mawar.getKelopakBunga());
        mawar.bijiBerkepingSatu();
        
        System.out.println("");
        
        dikotil jagung = new dikotil();
        jagung.setNama("jagung");
        System.out.println("nama saya "+jagung.getNama());
        jagung.bernafas();
        jagung.tumbuh();
        jagung.setAkar("serabut");
        System.out.println("saya memiliki akar"+jagung.getAkar());
        jagung.setBatang("tidak berkambium");
        System.out.println("saya memiliki batang "+jagung.getBatang());
        jagung.setBentukDaun("sejajar");
        System.out.println("saya memiliki bentuk daun "+jagung.getBentukDaun());
        jagung.setKelopakBunga("bunga berkelamin satu");
        System.out.println("saya "+jagung.getKelopakBunga());
        jagung.bijiBerkepingDua();
        
    }
    
}
