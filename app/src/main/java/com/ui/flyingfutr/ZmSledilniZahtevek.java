/***********************************************************************
 * Module:  ZmSledilniZahtevek.java
 * Author:  Jaz
 * Purpose: Defines the Class ZmSledilniZahtevek
 ***********************************************************************/
package com.ui.flyingfutr;
import java.util.*;

/** @pdOid 8b5ca5cc-781f-4718-b454-cdc9ab32336a */
public class ZmSledilniZahtevek {
   /** @pdRoleInfo migr=no name=PreveriLokacijoNarocila assc=association1 mult=1..1 */
   public PreveriLokacijoNarocila preveriLokacijoNarocila;
   
   /** @param narocilo
    * @pdOid e2c8ea13-2d12-4b1f-ba28-b0d1413dec7a */
   public void izberiNarocilo(Narocilo narocilo) {
      // TODO: implement
   }
   
   /** @pdOid e59af67f-356e-43b6-b36b-0b979464510f */
   public void prikaziNarocila() {
      // TODO: implement
   }
   
   /** @param koordinate
    * @pdOid 2b0c988f-7caa-4e1c-a298-8bb01e3d35ce */
   public int izracunajCasDostave(double[] koordinate) {
      // TODO: implement
      return 0;
   }
   
   /** @param koordinate 
    * @param cas
    * @pdOid ea7b48c7-13c8-4b3c-800a-a4226882fee7 */
   public void prikaziZemljevid(double[] koordinate, int cas) {
      // TODO: implement
   }
   
   /** @pdOid 82e3272a-8269-41d3-96f3-9fe20a26270a */
   public void zacniIzbiro() {
      // TODO: implement
   }

}