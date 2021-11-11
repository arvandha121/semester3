package Percobaan2;

public class StaffHarian extends Staff{
    public int jmlJamKerja;
    
    StaffHarian(){
        
    }
    StaffHarian(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, int jmlJamKerja){
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.jmlJamKerja = jmlJamKerja;
    }
    void tampilStaffHarian(){
        System.out.println("==========Data Staff Harian==========");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja = "+jmlJamKerja);
        System.out.println("Gaji Bersih      = "+(gaji*jmlJamKerja+lembur-potongan));
    }
}