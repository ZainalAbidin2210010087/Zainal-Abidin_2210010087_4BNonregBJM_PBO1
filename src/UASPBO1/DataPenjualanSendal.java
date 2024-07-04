package UASPBO1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataPenjualanSendal {

    public static void main(String[] args) {
        //Array
        try ( //Input (I) / Output (O) Sederhana
                Scanner input = new Scanner(System.in)) {
            //Array
            Sendal[] daftarSendal = new Sendal[2];
            
            //Perulangan (Looping)
            for (int i = 0; i < daftarSendal.length; i++) {
                System.out.println("Data Sendal " + (i + 1));
                System.out.println("Merk = ");
                String merk = input.next();
                
                int ukuran = 0;
                boolean ukuranValid = false;
                while (!ukuranValid) {
                    
                    //Eror Handling
                    try {
                        System.out.println("Ukuran =");
                        ukuran = input.nextInt();
                        if (ukuran <= 10) {
                            throw new IllegalArgumentException("Ukuran sendal harus lebih dari 0.");
                        }
                        ukuranValid = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Masukan Ukuran Sendal Dalam Bentuk Angka.");
                        input.nextLine();
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        input.nextLine();
                    }
                }
                
                double harga = 0;
                boolean hargaValid = false;
                while (!hargaValid) {
                    try {
                        System.out.println("Harga");
                        harga = input.nextDouble();
                        if (harga <= 0) {
                            throw new IllegalArgumentException("Harga Sendal harus lebih dari 100000");
                        }
                        hargaValid = true;
                        
                    } catch (InputMismatchException e) {
                        System.out.println("Masukan Harga Sendal Dalam Bentuk Angka");
                        input.nextLine();
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        input.nextLine();
                    }
                }
                
                System.out.println("Apakah Sendal Ini Brand Lokal? (YA/TIDAK): ");
                String jenisBrandLokal = input.next();
                
                //Seleksi
                if (jenisBrandLokal.equalsIgnoreCase("Ya")) {
                    System.out.println("Jenis Brand lokal / Jenis Brand Import= ");
                    jenisBrandLokal = input.next();
                    
                    //Object
                    daftarSendal[i] = new SendalBrandLokal(merk, ukuran, harga, jenisBrandLokal);
                } else {
                    daftarSendal[i] = new Sendal(merk, ukuran, harga);
                }
            }
            
            System.out.println("Daftar Sendal:");
            for (Sendal sendal : daftarSendal) {
                sendal.displayInfo();
                System.out.println();
            }
        }

    }

}
 class Sendal {

    //Atribut dan Encapsulation
    protected String merk;
    protected int ukuran;
    protected double harga;

    //Method Constructor
    public Sendal(String merk, int ukuran, double harga) {
        this.merk = merk;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    //Method Accessor
    public String getMerk() {
        return merk;
    }

    public int getUkuran() {
        return ukuran;
    }

    public double getHarga() {
        return ukuran;
    }

    //Method Mutathor
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void displayInfo(){
        System.out.println("Merk ="+merk);
        System.out.println("Ukuran ="+ukuran);
        System.out.println("Harga="+harga);
        } 
    }



//Inheritance
 class SendalBrandLokal extends Sendal {

    private String SendalBrandLokal;

//Method Constructor
    public SendalBrandLokal(String merk, int ukuran, double harga, String jenisBrandLokal) {
        super(merk, ukuran, harga);
        this.SendalBrandLokal = jenisBrandLokal;
    }

    public String getJenisBrandLokal() {
        return SendalBrandLokal;
    }

    //Polymorphism (Overriding)
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sendal ini di pakai untuk=" + SendalBrandLokal);
    }

}
