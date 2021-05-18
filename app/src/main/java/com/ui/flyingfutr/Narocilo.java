package com.ui.flyingfutr;
/***********************************************************************
 * Module:  Narocilo.java
 * Author:  Jaz
 * Purpose: Defines the Class Narocilo
 ***********************************************************************/


/** @pdOid 9166ed6d-5ead-422a-9f53-c995579c45d6 */
public class Narocilo {
   /** @pdOid 4e5c0f9a-5d73-4dd0-a64f-ea71be5d656d */
   private int id;
   /** @pdOid c64b81d4-32df-49b0-9a70-174d01be9e25 */
   private String vsebina;
   /** @pdOid 89cdc254-70e3-446a-bbd6-fe22b543a343 */
   private Dostavljavec dostavljavec;
   /** @pdOid 300f716f-ac74-48f6-a198-bc232236959f */
   private Uporabnik uporabnik;
   /** @pdOid ec6c2073-ad1a-4474-a932-02eb208fa9b8 */
   private Restavracija restavracija;

   Narocilo(int id, String vsebina, Dostavljavec dostavljavec, Uporabnik uporabnik, Restavracija restavracija){
      this.id = id;
      this.vsebina = vsebina;
      this.dostavljavec = dostavljavec;
      this.uporabnik = uporabnik;
      this.restavracija = restavracija;
   }
   
   /** @pdOid 64b5abfc-65a7-4367-9fc8-539251c92a10 */
   public Dostavljavec getDostavljalec() {
      return dostavljavec;
   }

}