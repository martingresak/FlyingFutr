package com.ui.flyingfutr; /***********************************************************************
 * Module:  Dostavljalec.java
 * Author:  we
 * Purpose: Defines the Class Dostavljalec
 ***********************************************************************/

import java.util.*;

/** @pdOid 62bfb41f-85ba-4572-973c-14fe26871ead */
public class Dostavljavec {
   /** @pdOid fbea5bfa-9631-4c69-91ba-0aed99faca4b */
   private int id;
   /** @pdOid b388813b-192d-470e-861d-5bfebf853085 */
   private String tipVozila;
   /** @pdOid 75a8b682-1b9c-40b7-9b00-6e8bce936008 */
   private double koordinataX;
   /** @pdOid b8d10a65-f684-4115-bd1a-b13fc7dd7329 */
   private double koordinataY;

   Dostavljavec(int id, String tipVozila, double koordinataX, double koordinataY){
      this.id = id;
      this.tipVozila = tipVozila;
      this.koordinataX = koordinataX;
      this.koordinataY = koordinataY;
   }
   
   /** @pdOid 49bdd42c-ade5-48e1-a1dc-871f70037c4c */
   public double getDostavljalecKoordinateX() {
      return koordinataX;
   }
   
   /** @pdOid 1e39e279-2535-430a-87f4-80f3375eacd1 */
   public double getDostavljalecKoordinataY() {
      return koordinataY;
   }

}