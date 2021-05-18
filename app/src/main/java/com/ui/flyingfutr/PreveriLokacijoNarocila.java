/***********************************************************************
 * Module:  PreveriLokacijoNarocila.java
 * Author:  Jaz
 * Purpose: Defines the Class PreveriLokacijoNarocila
 ***********************************************************************/

package com.ui.flyingfutr;

import java.util.List;

/** @pdOid 862ddf8b-41cf-44b8-be1d-0eb3aef344f6 */
public class PreveriLokacijoNarocila {
   /**
    * 
    * @param n
    * @pdOid 7d8cda83-5564-4248-a061-ec0743ebd855 */
   public static double[] getPodatkiNarocila(Narocilo n) {
      double[] koordinate = new double[4];
      koordinate[0] = n.getUporabnik().getUporabnikKoordinataX();
      koordinate[1] = n.getUporabnik().getUporabnikKoordinataY();
      Dostavljavec dostavljavec = n.getDostavljalec();

      if (dostavljavec != null) {
         koordinate[2] = dostavljavec.getDostavljalecKoordinateX();
         koordinate[3] = dostavljavec.getDostavljalecKoordinataY();
      }
      else {
         koordinate[2] = n.getRestavracija().getRestavracijaKoordinataX();
         koordinate[3] = n.getRestavracija().getRestavracijaKoordinataY();
      }

      return koordinate;
   }
}