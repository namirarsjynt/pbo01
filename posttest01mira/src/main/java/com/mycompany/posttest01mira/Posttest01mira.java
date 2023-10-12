/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest01mira;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Posttest01mira {

    public static void main(String[] args) {
        ArrayList<Karpet> karpet1 = new ArrayList();
        
        karpet1.add(new Karpet ("ukuran 100x150" , "eropa style","premium", 2500000));;
        karpet1.add(new Karpet ("ukuran 120x150", "Turkey", "wool", 15000000));
        karpet1.add(new Karpet ("ukuran 100x150", "savieh models", "woll star premium", 2100000000));
        karpet1.add(new Karpet ("ukuran 120x150", "karpet bulu", "bulu bulu",500000));
        
        for (Karpet Karpet : karpet1){
            String pernyataan = " karpet dengan  " + Karpet.ukuran + " bermotif " + Karpet.motif+ " dengan bahan " + Karpet.bahan+ "dengan harga " + Karpet.harga;
            System.out.println(pernyataan);
        }
    }
    }

