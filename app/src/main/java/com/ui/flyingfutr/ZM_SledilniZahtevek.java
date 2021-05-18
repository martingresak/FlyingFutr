/***********************************************************************
 * Module:  ZmSledilniZahtevek.java
 * Author:  Jaz
 * Purpose: Defines the Class ZmSledilniZahtevek
 ***********************************************************************/
package com.ui.flyingfutr;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** @pdOid 8b5ca5cc-781f-4718-b454-cdc9ab32336a */
public class ZM_SledilniZahtevek extends AppCompatActivity {

   private Spinner narocilaSpinner;
   private List<Narocilo> narociloList;
   private TextView restavracijaTextView, casDostaveTextView, vsebinaTextView;
   private double[] koordinate;
   private ImageView zemljevidImageView;
   private ImageView userImageView;

   Dostavljavec d0 = new Dostavljavec(
           0,
           "kolo",
           12,
           5
   );

   Dostavljavec d1 = new Dostavljavec(
           1,
           "kolo",
           -9,
           -8
   );

   Restavracija r0 = new Restavracija(
           0,
           "Gostilna pri Jožetu",
           20,
           10
   );

   Restavracija r1 = new Restavracija(
           1,
           "Picerija Špica",
           -10,
           -4
   );

   Uporabnik u0 = new Uporabnik(
           0,
           "Miha",
           "Novak",
           0,
           0
   );

   //Osnovni tok
   Narocilo n0 = new Narocilo(
           0,
           "Hamburger\nMešana solata\nPingo sok",
           d0,
           u0,
           r0
   );

   Narocilo n1 = new Narocilo(
           1,
           "Kranjska klobasa z zeljem\nKruh",
           d0,
           u0,
           r0
   );

   //Alternativni tok
   Narocilo n2 = new Narocilo(
           2,
           "Pica klasika\nPivo Laško",
           null,
           u0,
           r1
   );


   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      narocilaSpinner = (Spinner) findViewById(R.id.narocilaSpinner);
      restavracijaTextView = (TextView) findViewById(R.id.restavracijaTextView);
      casDostaveTextView = (TextView) findViewById(R.id.casDostaveText);
      vsebinaTextView = (TextView) findViewById(R.id.vsebinaTextView);
      zemljevidImageView = (ImageView) findViewById(R.id.zemljevidImageView);
      userImageView = (ImageView) findViewById(R.id.userImageView);

      u0.addAktivnoNarocilo(n0);
      u0.addPretekloNarocilo(n1);
      u0.addAktivnoNarocilo(n2);

      zacniIzbiro();
   }

   /** @pdRoleInfo migr=no name=PreveriLokacijoNarocila assc=association1 mult=1..1 */
   
   /** @param narocilo
    * @pdOid e2c8ea13-2d12-4b1f-ba28-b0d1413dec7a */
   public void izberiNarocilo(Narocilo narocilo) {

      vsebinaTextView.setText(narocilo.getVsebina());
      restavracijaTextView.setText(narocilo.getRestavracija().toString());
      koordinate = PreveriLokacijoNarocila.getPodatkiNarocila(narocilo);

      prikaziZemljevid(koordinate, izracunajCasDostave(koordinate));



   }
   
   /** @pdOid e59af67f-356e-43b6-b36b-0b979464510f */
   public void prikaziNarocila(List<Narocilo> narocila) {
      narociloList = narocila;

      ArrayAdapter<Narocilo> adapter = new ArrayAdapter<Narocilo>(this,
              android.R.layout.simple_spinner_item, narociloList);
      adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

      narocilaSpinner.setAdapter(adapter);

      narocilaSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            izberiNarocilo((Narocilo) parent.getItemAtPosition(position));
         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {

         }


      });

   }
   
   /** @param koordinate
    * @pdOid 2b0c988f-7caa-4e1c-a298-8bb01e3d35ce */
   public int izracunajCasDostave(double[] koordinate) {
      double distance = Math.sqrt((koordinate[0] - koordinate[2])* (koordinate[0] - koordinate[2]) + (koordinate[2] - koordinate[3]) * (koordinate[2] - koordinate[3]));
      return (int) (distance * 1.2);
   }
   
   /** @param koordinate 
    * @param cas
    * @pdOid ea7b48c7-13c8-4b3c-800a-a4226882fee7 */
   public void prikaziZemljevid(double[] koordinate, int cas) {
      String text = cas + "min";
      casDostaveTextView.setText(text);

      RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);


      double width = zemljevidImageView.getWidth();
      double height = zemljevidImageView.getHeight();

      double centreX = width  / 2;
      double centreY = height / 2;

      RelativeLayout.LayoutParams params1 =new RelativeLayout.LayoutParams(100, 100);

      params1.leftMargin = zemljevidImageView.getWidth()/2 -160;
      params1.topMargin = zemljevidImageView.getHeight() / 2 -100;

      userImageView.setLayoutParams(params1);

   }
   
   /** @pdOid 82e3272a-8269-41d3-96f3-9fe20a26270a */
   public void zacniIzbiro() {
      List<Narocilo> narocila = u0.getAktivnaNarocila();
      if (narocila.size() < 1){
         narocila = u0.getPreteklaNarocila();
      }

      prikaziNarocila(narocila);
   }

}