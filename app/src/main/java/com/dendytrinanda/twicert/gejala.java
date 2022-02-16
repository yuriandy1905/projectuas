package com.dendytrinanda.twicert;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class gejala extends Activity  implements OnClickListener {
    Cursor model=null;
    DatabasePenyakit helper=null;
    Button cmdS1,cmdS2,cmdS3,cmdS4,cmdS5,cmdS6,cmdS7,cmdS8,cmdS9;

    int[]arrG=new int[9];
    int []arrN=new int[9];

    int Sakit1=0,Sakit2=0,Sakit3=0,Sakit4=0,Sakit5=0,Sakit6=0,Sakit7=0,Sakit8=0,Sakit9=0;
    String[]arrSakit1=new String[5];
    String[]arrSakit2=new String[5];
    String[]arrSakit3=new String[5];
    String[]arrSakit4=new String[5];
    String[]arrSakit5=new String[5];
    String[]arrSakit6=new String[5];
    String[]arrSakit7=new String[5];
    String[]arrSakit8=new String[5];
    String[]arrSakit9=new String[5];
    String[]arrSakit10=new String[5];
    String[]arrSakit11=new String[5];
    String[]arrSakit12=new String[5];
    String[]arrSakit13=new String[5];
    String[]arrSakit14=new String[5];
    String[]arrSakit15=new String[5];
    int a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a9=0,a10=0,a11=0,a12=0,a13=0,a14=0,a15=0;

    TextView txtHasil;
    RadioGroup RadioGroup01;
    RadioButton RadioButton01,RadioButton02,RadioButton03,RadioButton04,RadioButton05;
    Button cmdPilih;

    CheckBox ckPilih1, ckPilih2,ckPilih3,ckPilih4,ckPilih5,ckPilih6,ckPilih7,ckPilih8;
    CheckBox ckPilih9, ckPilih12,ckPilih13,ckPilih14,ckPilih15,ckPilih10,ckPilih11;

    int Obat, Menular, Tidakmenular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gejala);

        helper=new DatabasePenyakit(this);
        arrG[0]=1;
        arrG[1]=3;
        arrG[2]=4;
        arrG[3]=5;
        arrG[4]=3;
        arrG[5]=5;
        arrG[6]=3;
        arrG[7]=2;
        arrG[8]=2;

        for(int i =0;i<9;i++){arrN[i]=0;}

        txtHasil = (TextView) findViewById (R.id.txtHasil);
        ckPilih1=(CheckBox) findViewById(R.id.gejala1);
        ckPilih2=(CheckBox) findViewById(R.id.gejala2);
        ckPilih3=(CheckBox) findViewById(R.id.gejala3);
        ckPilih4=(CheckBox) findViewById(R.id.gejala4);
        ckPilih5=(CheckBox) findViewById(R.id.gejala5);
        ckPilih6=(CheckBox) findViewById(R.id.gejala6);
        ckPilih7=(CheckBox) findViewById(R.id.gejala7);
        ckPilih8=(CheckBox) findViewById(R.id.gejala8);
        ckPilih9=(CheckBox) findViewById(R.id.gejala9);
        ckPilih10=(CheckBox) findViewById(R.id.gejala10);
        ckPilih11=(CheckBox) findViewById(R.id.gejala11);
        ckPilih12=(CheckBox) findViewById(R.id.gejala12);
        ckPilih13=(CheckBox) findViewById(R.id.gejala13);
        ckPilih14=(CheckBox) findViewById(R.id.gejala14);
        ckPilih15=(CheckBox) findViewById(R.id.gejala15);

        ckPilih1.setText("keluar keringat dari badan/ketiak dan gatal-gatal");
        ckPilih2.setText("Jarangnya berolahraga");
        ckPilih3.setText("Jarangnya mengonsumsi makanan bergizi seperti sayur-sayuran, buah-buahan");
        ckPilih4.setText("Kurangnya minum air putih");
        ckPilih5.setText("Konsultasi ke dokter");
        ckPilih6.setText("Kelain genetik");
        ckPilih7.setText("Sering tidur terlarut malam");
        ckPilih8.setText("sering merokok");
        ckPilih9.setText("Keseringan mengonsumsi makanan junk food dan minuman beralkohol");
        ckPilih10.setText("mengidap penyakit diabetes");
        ckPilih11.setText("Kegemukkan");
        ckPilih12.setText("Toksin");
        ckPilih13.setText("Mengalami masalah hati");
        ckPilih14.setText("Mual");
        ckPilih15.setText("Terlalu banyak mengonsumsi bawang");
        cmdPilih = (Button)findViewById (R.id.btnSakit);
        cmdPilih.setText("Pilih Gejala");
        cmdPilih.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSakit:
                if (ckPilih1.isChecked()){
                    Sakit1=1;arrN[0]=arrN[0]+1;}
                if (ckPilih2.isChecked()){
                    Sakit1=1;arrN[0]=arrN[0]+1;
                    Sakit3=1;arrN[2]=arrN[2]+1;
                    Sakit4=1;arrN[3]=arrN[3]+1;
                    Sakit6=1;arrN[5]=arrN[5]+1;
                    Sakit9=1;arrN[8]=arrN[8]+1;}
                if (ckPilih3.isChecked()){
                    Sakit1=1;arrN[0]=arrN[0]+1;
                    Sakit2=1;arrN[1]=arrN[1]+1;
                    Sakit3=1;arrN[2]=arrN[2]+1;
                    Sakit4=1;arrN[3]=arrN[3]+1;
                    Sakit5=1;arrN[4]=arrN[4]+1;
                    Sakit6=1;arrN[5]=arrN[5]+1;
                    Sakit9=1;arrN[8]=arrN[8]+1;}
                if (ckPilih4.isChecked()){
                    Sakit1=1;arrN[0]=arrN[0]+1;
                    Sakit2=1;arrN[1]=arrN[1]+1;
                    Sakit3=1;arrN[2]=arrN[2]+1;
                    Sakit4=1;arrN[3]=arrN[3]+1;
                    Sakit5=1;arrN[4]=arrN[4]+1;
                    Sakit6=1;arrN[5]=arrN[5]+1;
                    Sakit9=1;}arrN[8]=arrN[8]+1;
                if (ckPilih5.isChecked()){Sakit2=1;arrN[1]=arrN[1]+1;}
                if (ckPilih6.isChecked()){Sakit3=1;arrN[5]=arrN[5]+1;}
                if (ckPilih7.isChecked()){
                    Sakit1=1;arrN[0]=arrN[0]+1;
                    Sakit3=1;arrN[2]=arrN[2]+1;
                    Sakit4=1;arrN[3]=arrN[3]+1;
                    Sakit6=1;arrN[5]=arrN[5]+1;
                    Sakit7=1;arrN[6]=arrN[6]+1;
                    Sakit9=1;arrN[8]=arrN[8]+1;}
                if (ckPilih8.isChecked()){Sakit4=1;arrN[3]=arrN[3]+1;}
                if (ckPilih9.isChecked()){Sakit5=1;arrN[4]=arrN[4]+1;}
                if (ckPilih10.isChecked()){Sakit7=1;arrN[6]=arrN[6]+1;}
                if (ckPilih11.isChecked()){
                    Sakit6=1;arrN[5]=arrN[5]+1;
                    Sakit7=1;arrN[6]=arrN[6]+1;}
                if (ckPilih12.isChecked()){
                    Sakit6=1;arrN[5]=arrN[5]+1;}
                if (ckPilih13.isChecked()){
                    Sakit8=1;arrN[7]=arrN[7]+1;}
                if (ckPilih14.isChecked()){Sakit8=1;arrN[7]=arrN[7]+1;}
                if (ckPilih15.isChecked()){
                    Sakit8=1;arrN[7]=arrN[7]+1;
                    Sakit9=1;arrN[8]=arrN[8]+1;}


                setContentView(R.layout.diagnosa);
                String ket = "(" + arrN[0] + "/" + arrG[0] + ")";
                cmdS1 = (Button) findViewById(R.id.hslBtn1);
                cmdS1.setText("a " + ket);
                cmdS1.setOnClickListener(new gejala1());

                ket="("+arrN[1]+"/"+arrG[1]+")";
                cmdS2= (Button)findViewById (R.id.hslBtn2);
                cmdS2.setText("b "+ket);
                cmdS2.setOnClickListener(new gejala2());

                ket="("+arrN[2]+"/"+arrG[2]+")";
                cmdS3= (Button)findViewById (R.id.hslBtn3);
                cmdS3.setText("c "+ket);
                cmdS3.setOnClickListener(new gejala3());

                ket="("+arrN[3]+"/"+arrG[3]+")";
                cmdS4= (Button)findViewById (R.id.hslBtn4);
                cmdS4.setText("d "+ket);
                cmdS4.setOnClickListener(new gejala4());

                ket="("+arrN[4]+"/"+arrG[4]+")";
                cmdS5= (Button)findViewById (R.id.hslBtn5);
                cmdS5.setText("e"+ket);
                cmdS5.setOnClickListener(new gejala5());

                ket="("+arrN[5]+"/"+arrG[5]+")";
                cmdS6= (Button)findViewById (R.id.hslBtn6);
                cmdS6.setText("f "+ket);
                cmdS6.setOnClickListener(new gejala6());

                ket="("+arrN[6]+"/"+arrG[6]+")";
                cmdS7= (Button)findViewById (R.id.hslBtn7);
                cmdS7.setText("g "+ket);
                cmdS7.setOnClickListener(new gejala7());

                ket="("+arrN[7]+"/"+arrG[7]+")";
                cmdS8= (Button)findViewById (R.id.hslBtn8);
                cmdS8.setText("h "+ket);
                cmdS8.setOnClickListener(new gejala8());

                ket="("+arrN[8]+"/"+arrG[8]+")";
                cmdS9= (Button)findViewById (R.id.hslBtn9);
                cmdS9.setText("i "+ket);
                cmdS9.setOnClickListener(new gejala9());
        }
    }

    class gejala1 implements Button.OnClickListener{
        public void onClick(View v){
            setContentView(R.layout.hasil);
            TextView t1= (TextView)findViewById (R.id.txtNamaPenyakit);
            double val1 = Double.parseDouble(String.valueOf(arrN[0]));
            double val2 = Double.parseDouble(String.valueOf(arrG[0]));
            double pb=(val1/val2) * 100;
            String pbs=Double.toString(pb);
            t1.setText("Keringat Biasa ("+pbs+" %)");
            TextView t2= (TextView)findViewById (R.id.txtGejalaUmum);
            t2.setText("keluar keringat dari badan/ketiak dan gatal-gatal");
            TextView t3= (TextView)findViewById (R.id.txtSifatPenyakit);
            t3.setText("Tidak Menular");
            TextView t4= (TextView)findViewById (R.id.txtPengobatan);
            t4.setText("Mandi min 3kali sehari,menggunakan deodorant");
        }
    }

    class gejala2 implements Button.OnClickListener{
        public void onClick(View v){
            setContentView(R.layout.hasil);
            TextView t1= (TextView)findViewById (R.id.txtNamaPenyakit);
            double val1 = Double.parseDouble(String.valueOf(arrN[0]));
            double val2 = Double.parseDouble(String.valueOf(arrG[0]));
            double pb=(val1/val2) * 100;
            String pbs=Double.toString(pb);
            t1.setText("Amonia ("+pbs+" %)");
            TextView t2= (TextView)findViewById (R.id.txtGejalaUmum);
            t2.setText("jarang konsumsi air putih dan makanan bergizi  seperti sayur-sayuran,buah-buahan,sering tidur terlarut malam\"");
            TextView t3= (TextView)findViewById (R.id.txtSifatPenyakit);
            t3.setText("Dapat menular");
            TextView t4= (TextView)findViewById (R.id.txtPengobatan);
            t4.setText("Menggunakan antiperspirant dan mandi dengan bersih,ganti pakaian secara rutin,rajin minum air putih,dan mengosumsi sayuran hijau");
        }
    }
    class gejala3 implements Button.OnClickListener{
        public void onClick(View v){
            setContentView(R.layout.hasil);
            TextView t1= (TextView)findViewById (R.id.txtNamaPenyakit);
            double val1 = Double.parseDouble(String.valueOf(arrN[0]));
            double val2 = Double.parseDouble(String.valueOf(arrG[0]));
            double pb=(val1/val2) * 100;
            String pbs=Double.toString(pb);
            t1.setText("Bau Menyengat ("+pbs+" %)");
            TextView t2= (TextView)findViewById (R.id.txtGejalaUmum);
            t2.setText("keluar keringat dari badan/ketiak dan gatal-gatal,Jarangnya Berolahraga,Jarangnya mengonsumsi makanan bergizi seperti sayur-sayuran, buah-buahan,Kurangnya minum air putih,Sering tidur terlarut malam");
            TextView t3= (TextView)findViewById (R.id.txtSifatPenyakit);
            t3.setText("Dapat menular");
            TextView t4= (TextView)findViewById (R.id.txtPengobatan);
            t4.setText("mengurangi makanan bawang-bawangan,junkfood,gorengan,lemak,protein,mandi dengan antiseptik ,konsultasi ke dokter");
        }
    }
    class gejala4 implements Button.OnClickListener{
        public void onClick(View v){
            setContentView(R.layout.hasil);
            TextView t1= (TextView)findViewById (R.id.txtNamaPenyakit);
            double val1 = Double.parseDouble(String.valueOf(arrN[0]));
            double val2 = Double.parseDouble(String.valueOf(arrG[0]));
            double pb=(val1/val2) * 100;
            String pbs=Double.toString(pb);
            t1.setText("Bau Asam ("+pbs+" %)");
            TextView t2= (TextView)findViewById (R.id.txtGejalaUmum);
            t2.setText("keluar keringat dari badan/ketiak dan gatal-gatal,Jarangnya berolahraga,Sering merokok,Kurangnya minum air putih,Sering tidur terlarut malam,Keseringan mengonsumsi makanan junk food dan minuman beralkohol");
            TextView t3= (TextView)findViewById (R.id.txtSifatPenyakit);
            t3.setText("Dapat menular");
            TextView t4= (TextView)findViewById (R.id.txtPengobatan);
            t4.setText("mengurangi merokok,rajin minum air putih,ganti pakaian secara rutin,menggunakan tawas,menggunakan cuka apel,tidur min 8 jam");
        }
    }
    class gejala5 implements Button.OnClickListener{
        public void onClick(View v){
            setContentView(R.layout.hasil);
            TextView t1= (TextView)findViewById (R.id.txtNamaPenyakit);
            double val1 = Double.parseDouble(String.valueOf(arrN[0]));
            double val2 = Double.parseDouble(String.valueOf(arrG[0]));
            double pb=(val1/val2) * 100;
            String pbs=Double.toString(pb);
            t1.setText("Trimetilamina ("+pbs+" %)");
            TextView t2= (TextView)findViewById (R.id.txtGejalaUmum);
            t2.setText("Bau Amis seperti ikan,keluar keringat dari badan/ketiak dan gatal-gatal,jarang konsumsi air putih dan makanan bergizi  seperti sayur-sayuran,buah-buahan,Keseringan mengonsumsi makanan junk food dan minuman beralkohol");
            TextView t3= (TextView)findViewById (R.id.txtSifatPenyakit);
            t3.setText("Dapat menular");
            TextView t4= (TextView)findViewById (R.id.txtPengobatan);
            t4.setText(" mengurangi konsumsi makanan yang mengandung lemak dan protein,mandi min 3kali sehari dengan antiseptik,konsultasi ke dokter, konsumsi antibiotik untuk mencegah infeksi usus");
        }
    }
    class gejala6 implements Button.OnClickListener{
        public void onClick(View v){
            setContentView(R.layout.hasil);
            TextView t1= (TextView)findViewById (R.id.txtNamaPenyakit);
            double val1 = Double.parseDouble(String.valueOf(arrN[0]));
            double val2 = Double.parseDouble(String.valueOf(arrG[0]));
            double pb=(val1/val2) * 100;
            String pbs=Double.toString(pb);
            t1.setText("Bau Manis seperti buah("+pbs+" %)");
            TextView t2= (TextView)findViewById (R.id.txtGejalaUmum);
            t2.setText("keluar keringat dari badan/ketiak dan gatal-gatal,Jarangnya berolahraga,mengosumsi gula dengan berlebihan,Kurangnya minum air putih,Kelainan genetik,Sering makan malam");
            TextView t3= (TextView)findViewById (R.id.txtSifatPenyakit);
            t3.setText("Sangat-sangat menular,Berbahaya");
            TextView t4= (TextView)findViewById (R.id.txtPengobatan);
            t4.setText("Mengurangi konsumsi gula,jangan makan malam hari,melakukan program diet,rajin olahraga,konsultasi ke dokter");
        }
    }
    class gejala7 implements Button.OnClickListener{
        public void onClick(View v){
            setContentView(R.layout.hasil);
            TextView t1= (TextView)findViewById (R.id.txtNamaPenyakit);
            double val1 = Double.parseDouble(String.valueOf(arrN[0]));
            double val2 = Double.parseDouble(String.valueOf(arrG[0]));
            double pb=(val1/val2) * 100;
            String pbs=Double.toString(pb);
            t1.setText("Hyperthyroidism ("+pbs+" %)");
            TextView t2= (TextView)findViewById (R.id.txtGejalaUmum);
            t2.setText("eluar keringat dari badan/ketiak dan gatal-gatal,kurangnya berolahraga,jarang konsumsi air putih dan makanan bergizi seperti sayur-sayuran,buah-buahan)");
            TextView t3= (TextView)findViewById (R.id.txtSifatPenyakit);
            t3.setText("Tidak menular");
            TextView t4= (TextView)findViewById (R.id.txtPengobatan);
            t4.setText("Mandi min 3kali sehari,mengurangi setres,menggunakan antiseptik saat mandi,menggunakan jeruk nipis,melakukan program diet,rajin minum air putih,menghindari makanan yang mengandung metionin");
        }
    }
    class gejala8 implements Button.OnClickListener{
        public void onClick(View v){
            setContentView(R.layout.hasil);
            TextView t1= (TextView)findViewById (R.id.txtNamaPenyakit);
            double val1 = Double.parseDouble(String.valueOf(arrN[0]));
            double val2 = Double.parseDouble(String.valueOf(arrG[0]));
            double pb=(val1/val2) * 100;
            String pbs=Double.toString(pb);
            t1.setText("Bau Pahit ("+pbs+" %)");
            TextView t2= (TextView)findViewById (R.id.txtGejalaUmum);
            t2.setText("keluar keringat dari badan/ketiak dan gatal-gatal,mengalami masalah pada hati,sering mual");
            TextView t3= (TextView)findViewById (R.id.txtSifatPenyakit);
            t3.setText("Tidak menular");
            TextView t4= (TextView)findViewById (R.id.txtPengobatan);
            t4.setText("mengosumsi jamu traditional,rajin minum air putih,makan buah buahan,konsultasi ke dokter");
        }
    }
    class gejala9 implements Button.OnClickListener{
        public void onClick(View v){
            setContentView(R.layout.hasil);
            TextView t1= (TextView)findViewById (R.id.txtNamaPenyakit);
            double val1 = Double.parseDouble(String.valueOf(arrN[0]));
            double val2 = Double.parseDouble(String.valueOf(arrG[0]));
            double pb=(val1/val2) * 100;
            String pbs=Double.toString(pb);
            t1.setText("Bau Bawang ("+pbs+" %)");
            TextView t2= (TextView)findViewById (R.id.txtGejalaUmum);
            t2.setText("keluar keringat dari badan/ketiak dan gatal-gatal,Jarangnya berolahraga,Kurangnya minum air putih,Sering tidur terlarut malam,terlalu banyak mengonsumsi bawang");
            TextView t3= (TextView)findViewById (R.id.txtSifatPenyakit);
            t3.setText("Tidak menular");
            TextView t4= (TextView)findViewById (R.id.txtPengobatan);
            t4.setText("kurangin mengonsumsi bawang pada makanan,rajin olahraga,tidur min 8 jam,mengonsumsi daun kemangi,rajin minum air putih");
        }
    }

    public void kembali (View v){
        finish();
    }

}