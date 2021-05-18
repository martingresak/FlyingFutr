/***********************************************************************
 * Module:  Restavracija.java
 * Author:  we
 * Purpose: Defines the Class Restavracija
 ***********************************************************************/
package com.ui.flyingfutr;
import java.util.*;

/** @pdOid 5cbbbbee-ba9e-4d81-8c65-eafc1147dc50 */
public class Restavracija {
   /** @pdOid 4d619e40-f923-4d5b-96aa-b8f14a09f7d7 */
   private int id;
   /** @pdOid ae26c93c-07d2-4695-be7f-fbd83deb7b38 */
   private String ime;
   /** @pdOid f78f541a-152b-45a5-8442-8b0478df61bb */
   private double koordinataX;
   /** @pdOid 05103bca-d8c9-4f00-b9ed-ccab1552945c */
   private double koordinataY;

   Restavracija(int id, String ime, double koordinataX, double koordinataY){
      this.id = id;
      this.ime = ime;
      this.koordinataX = koordinataX;
      this.koordinataY = koordinataY;
   }
   
   /** @pdOid 36163640-16bc-4aee-8dd1-f4eb864a0f28 */
   public double getRestavracijaKoordinataX() {
      return koordinataX;
   }
   
   /** @pdOid f37d9565-a93e-446d-8ecc-5d904422f02f */
   public double getRestavracijaKoordinataY() {
      return koordinataY;
   }

   @Override
   public String toString() {
      return ime;
   }
}