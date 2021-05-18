/***********************************************************************
 * Module:  Uporabnik.java
 * Author:  Jaz
 * Purpose: Defines the Class Uporabnik
 ***********************************************************************/
package com.ui.flyingfutr;
import java.util.*;

/** @pdOid 5174c020-31e8-41cf-821c-da8b45515c39 */
public class Uporabnik {
   /** @pdOid 0a4c4ea3-fd54-415b-909d-0508bade8e7e */
   private int id;
   /** @pdOid f9ee30f2-fc13-44bc-9ad1-5b57bf37ab3b */
   private String firstName;
   /** @pdOid 81cc9278-cab2-4670-af31-8f9a5b99494c */
   private String lastName;
   /** @pdOid df412324-eb4e-4656-9347-3e40e97e86e8 */
   private double koordinataX;
   /** @pdOid 7c9692c6-d25c-4721-adbf-f488faf3d9f4 */
   private double koordinataY;
   /** @pdOid 7109816d-4de9-49e3-a80f-afd1e77262d1 */
   private String phoneNo;
   /** @pdOid ddaa3204-bbcf-4148-8817-d076279fad42 */
   private List<Narocilo> aktivnaNarocila;
   /** @pdOid b22677fb-6336-415e-9625-3e1e7abe05a8 */
   private List<Narocilo> preteklaNarocila;
   /** @pdOid e8374ee5-0d0e-4179-ad6c-4968c13d636d */
   private boolean student;

   Uporabnik(int id, String firstName, String lastName, double koordinataX, double koordinataY) {
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.koordinataX = koordinataX;
      this.koordinataY = koordinataY;
      aktivnaNarocila = new ArrayList<Narocilo>();
      preteklaNarocila = new ArrayList<Narocilo>();
   }
   
   /** @pdOid 62136d5c-3182-4c37-9f27-a9438406c9a2 */
   public double getUporabnikKoordinataX() {
      return koordinataX;
   }
   
   /** @pdOid a2c39bc8-ca16-4fd6-b04a-2d9a87c0f965 */
   public double getUporabnikKoordinataY() {
      return koordinataY;
   }
   
   /** @pdOid 9897d892-6904-4152-a250-b8635a2453c2 */
   public List<Narocilo> getAktivnaNarocila() {
      return aktivnaNarocila;
   }
   
   /** @pdOid 72c75c38-f32c-4195-8dc3-f5ce25949af9 */
   public List<Narocilo> getPreteklaNarocila() {
      return preteklaNarocila;
   }

   public void addAktivnoNarocilo(Narocilo narocilo) {
      aktivnaNarocila.add(narocilo);
   }

   public void addPretekloNarocilo(Narocilo narocilo) {
      preteklaNarocila.add(narocilo);
   }


}