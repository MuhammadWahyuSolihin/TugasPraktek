/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.welcometokingdom.tugaspraktek;
import java.util.Scanner;
/**
 *
 * @author LUCIFER
 */
public class TugasPraktek {

    public static void main(String[] args) {
        double TYPE1, TYPE2, hasil;
        
        Scanner LORDInput = new Scanner (System.in);
        
        System.out.println("Operator Penugasan ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("1. Plus sama dengan");
        System.out.print("Masukkan Kode Pertama : ");
        TYPE1 = LORDInput.nextDouble();
        System.out.print("Masukkan Kode Kedua : ");
        TYPE2 = LORDInput.nextDouble();
        System.out.println("Hasilnya adalah :" + (TYPE1 += TYPE2));
        System.out.println("2. Minus NO RESPECT sama dengan");
        System.out.print("Masukkan Kode Pertama : ");
        TYPE1 = LORDInput.nextDouble();
        System.out.print("Masukkan Kode Kedua : ");
        TYPE2 = LORDInput.nextDouble();
        System.out.println("Hasilnya adalah :" + (TYPE1 -= TYPE2));
        System.out.println("3. Mengkali sama dengan");
        System.out.print("Masukkan Kode Pertama : ");
        TYPE1 = LORDInput.nextDouble();
        System.out.print("Masukkan Kode Kedua : ");
        TYPE2 = LORDInput.nextDouble();
        System.out.println("Hasilnya adalah :" + (TYPE1 *= TYPE2));
        System.out.println("4. Berbagi sama dengan");
        System.out.print("Masukkan Kode Pertama : ");
        TYPE1 = LORDInput.nextDouble();
        System.out.print("Masukkan Kode Kedua : ");
        TYPE2 = LORDInput.nextDouble();
        System.out.println("Hasilnya adalah :" + (TYPE1 /= TYPE2));
        System.out.println("5. Diskon Ga Ngotak Sama dengan");
        System.out.print("Masukkan Kode Pertama : ");
        TYPE1 = LORDInput.nextDouble();
        System.out.print("Masukkan Kode Kedua : ");
        TYPE2 = LORDInput.nextDouble();
        System.out.println("Hasilnya adalah :" + (TYPE1 %= TYPE2));
        System.out.println("Operator Pembanding");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("1. Guedek");
        System.out.print("Masukkan Kode Pertama : ");
        TYPE1 = LORDInput.nextDouble();
        System.out.print("Masukkan Kode Kedua : ");
        TYPE2 = LORDInput.nextDouble();
        System.out.println("Hasilnya adalah :" + (TYPE1 > TYPE2));
        System.out.println("2. MINI Very MINI");
        System.out.print("Masukkan Kode Pertama : ");
        TYPE1 = LORDInput.nextDouble();
        System.out.print("Masukkan Kode Kedua : ");
        TYPE2 = LORDInput.nextDouble();
        System.out.println("Hasilnya adalah :" + (TYPE1 < TYPE2));
        System.out.println("3. DOUBLE sama dengan");
        System.out.print("Masukkan Kode Pertama : ");
        TYPE1 = LORDInput.nextDouble();
        System.out.print("Masukkan Kode Kedua : ");
        TYPE2 = LORDInput.nextDouble();
        System.out.println("Hasilnya adalah :" + (TYPE1 == TYPE2));
        System.out.println("4. Attention!");
        System.out.print("Masukkan Kode Pertama : ");
        TYPE1 = LORDInput.nextDouble();
        System.out.print("Masukkan Kode Kedua : ");
        TYPE2 = LORDInput.nextDouble();
        System.out.println("Hasilnya adalah :" + (TYPE1 != TYPE2));
        System.out.println("5. Guedek Kali");
        System.out.print("Masukkan Kode Pertama : ");
        TYPE1 = LORDInput.nextDouble();
        System.out.print("Masukkan Kode Kedua : ");
        TYPE2 = LORDInput.nextDouble();
        System.out.println("Hasilnya adalah :" + (TYPE1 >= TYPE2));
        System.out.println("6. Kecik Kali");
        System.out.print("Masukkan Kode Pertama : ");
        TYPE1 = LORDInput.nextDouble();
        System.out.print("Masukkan Kode Kedua : ");
        TYPE2 = LORDInput.nextDouble();
        System.out.println("Hasilnya adalah :" + (TYPE1 <= TYPE2));
        System.out.println("Operator Bitwise");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        int Type1,Type2;
        System.out.println("1. AND");
        System.out.print("Masukkan Kode Pertama : ");
        Type1 = LORDInput.nextInt();
        System.out.print("Masukkan Kode Kedua : ");
        Type2 = LORDInput.nextInt();
        System.out.println("Hasilnya adalah :" + (Type1 & Type2));
        System.out.println("2. truth OR dare");
        System.out.print("Masukkan Kode Pertama : ");
        Type1 = LORDInput.nextInt();
        System.out.print("Masukkan Kode Kedua : ");
        Type2 = LORDInput.nextInt();
        System.out.println("Hasilnya adalah :" + (Type1 | Type2));
        System.out.println("3. Besar Ke Atas");
        System.out.print("Masukkan Kode Pertama : ");
        Type1 = LORDInput.nextInt();
        System.out.print("Masukkan Kode Kedua : ");
        Type2 = LORDInput.nextInt();
        System.out.println("Hasilnya adalah :" + (Type1 ^ Type2));
        System.out.println("4. Melambai");
        System.out.print("Masukkan Kode Pertama : ");
        Type1 = LORDInput.nextInt();
        System.out.print("Masukkan Kode Kedua : ");
        Type2 = LORDInput.nextInt();
        System.out.println("Hasilnya adalah :" + "Negasi Kode Pertama =>" + " " + (~Type1) + ","  + "Negasi Kode Kedua" + " " + (~Type2));
        System.out.println("5. pindah kanan dan pindah kiri");
        System.out.print("Masukkan Kode Pertama : ");
        Type1 = LORDInput.nextInt();
        System.out.print("Masukkan Kode Kedua : ");
        Type2 = LORDInput.nextInt();
        System.out.println("Hasilnya adalah :" + "Kode Pertama =>" + " " + (Type1 >> 1));
        System.out.println("Hasilnya adalah :" + "Kode Pertama =>" + " " + (Type2 >> 1));

    }
}