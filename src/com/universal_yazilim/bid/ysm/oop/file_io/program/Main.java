package com.universal_yazilim.bid.ysm.oop.file_io.program;

import com.universal_yazilim.bid.ysm.utility.Util;

import java.io.*;


public class Main
{
    private static final String OKUNACAK_DOSYA = "employees.txt";
    private static final String YAZILACAK_DOSYA = "first_name.txt";
    private static final String YAZILACAK_DOSYA2 = "middle_name.txt";
    private static final String YAZILACAK_DOSYA3 = "last_name.txt";
    public static void main(String[] args) throws IOException {



        BufferedReader inputStream = null;
        BufferedReader inputStream2 = null;
        BufferedReader inputStream3 = null;
        PrintWriter outputStream = null;
        PrintWriter outputStream2 = null;
        PrintWriter outputStream3 = null;




        try {
            inputStream = new BufferedReader(new FileReader(OKUNACAK_DOSYA));
            inputStream2 = new BufferedReader(new FileReader(OKUNACAK_DOSYA));
            inputStream3 = new BufferedReader(new FileReader(OKUNACAK_DOSYA));
            outputStream = new PrintWriter(new FileWriter(YAZILACAK_DOSYA));
            outputStream2 = new PrintWriter(new FileWriter(YAZILACAK_DOSYA2));
            outputStream3 = new PrintWriter(new FileWriter(YAZILACAK_DOSYA3));

            String satir;

            while ((satir = inputStream.readLine()) != null) {

                System.out.println(splitName(satir,1));

                outputStream.println(splitName(satir,1));


            }

            while ((satir = inputStream2.readLine()) != null) {
                try {


                    System.out.println(splitName(satir, 2));

                    outputStream2.println(splitName(satir, 2));
                }
                catch (NullPointerException e)
                {
                    Util.showGeneralExceptionInfo(e);

                }


            }
            while ((satir = inputStream3.readLine()) != null) {


                System.out.println(splitName(satir,3));

                outputStream3.println(splitName(satir,3));


            }




        }
        catch (NullPointerException e)
        {
            Util.showGeneralExceptionInfo(e);
        }
        finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
            if (inputStream2 != null) {
                inputStream2.close();
            }
            if (outputStream2 != null) {
                outputStream2.close();
            }
            if (inputStream3 != null) {
                inputStream3.close();
            }
            if (outputStream3 != null) {
                outputStream3.close();
            }
        }
    }


    public static String splitName(String yazi, int Type) {

        String result = "";

        String[] yaziParcala = yazi.split(" ");
        String Ad =  yaziParcala[0];
        String soyAd = yaziParcala[yaziParcala.length -1];
        String MiddleName = "";

        for (int i = 0; i < yaziParcala.length; i++){

            if (i != 0 && i != yaziParcala.length -1){
                MiddleName  += yaziParcala[i] + ' ';
            }

        }

        if (Type == 4){ //hepsini göster
            result += "Name : " + Ad+ ' ';
            result += "MiddleName :" + MiddleName+ ' ';
            result += "Surname: " + soyAd;
        }else if(Type == 1){ //adi göster
            result += "Name : " + Ad+ ' ';
        }else if(Type == 2){ //orta isim göster

            {
                result += "MiddleName :" + MiddleName+ ' ';

            }
        }else if(Type == 3){ //soyad göster
            result += "Surname: " + soyAd;
        }

        return result;

    }

}