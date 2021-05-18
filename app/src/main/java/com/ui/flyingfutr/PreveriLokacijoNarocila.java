/***********************************************************************
 * Module:  PreveriLokacijoNarocila.java
 * Author:  Jaz
 * Purpose: Defines the Class PreveriLokacijoNarocila
 ***********************************************************************/

package com.ui.flyingfutr;
import java.util.*;

/** @pdOid 862ddf8b-41cf-44b8-be1d-0eb3aef344f6 */
public class PreveriLokacijoNarocila {
   /** @pdRoleInfo migr=no name=Narocilo assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection narocilo;
   /** @pdRoleInfo migr=no name=Restavracija assc=association3 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection restavracija;
   /** @pdRoleInfo migr=no name=Uporabnik assc=association4 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection uporabnik;
   /** @pdRoleInfo migr=no name=Dostavljalec assc=association5 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection dostavljalec;

   /**
    * 
    * @param idNarocila
    * @pdOid 7d8cda83-5564-4248-a061-ec0743ebd855 */
   public double[] getPodatkiNarocila(int idNarocila) {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 0a38bd2c-88aa-484c-85f6-934c348b66fb */
   public Narocilo[] getAktivnaNarocila() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 4ed92a9e-7610-4a6c-b10f-3b9dedc2bef5 */
   public Narocilo[] getPreteklaNarocila() {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection getNarocilo() {
      if (narocilo == null)
         narocilo = new java.util.HashSet();
      return narocilo;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorNarocilo() {
      if (narocilo == null)
         narocilo = new java.util.HashSet();
      return narocilo.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newNarocilo */
   public void setNarocilo(java.util.Collection newNarocilo) {
      removeAllNarocilo();
      for (java.util.Iterator iter = newNarocilo.iterator(); iter.hasNext();)
         addNarocilo((Narocilo)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newNarocilo */
   public void addNarocilo(Narocilo newNarocilo) {
      if (newNarocilo == null)
         return;
      if (this.narocilo == null)
         this.narocilo = new java.util.HashSet();
      if (!this.narocilo.contains(newNarocilo))
         this.narocilo.add(newNarocilo);
   }
   
   /** @pdGenerated default remove
     * @param oldNarocilo */
   public void removeNarocilo(Narocilo oldNarocilo) {
      if (oldNarocilo == null)
         return;
      if (this.narocilo != null)
         if (this.narocilo.contains(oldNarocilo))
            this.narocilo.remove(oldNarocilo);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllNarocilo() {
      if (narocilo != null)
         narocilo.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection getRestavracija() {
      if (restavracija == null)
         restavracija = new java.util.HashSet();
      return restavracija;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRestavracija() {
      if (restavracija == null)
         restavracija = new java.util.HashSet();
      return restavracija.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRestavracija */
   public void setRestavracija(java.util.Collection newRestavracija) {
      removeAllRestavracija();
      for (java.util.Iterator iter = newRestavracija.iterator(); iter.hasNext();)
         addRestavracija((Restavracija)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRestavracija */
   public void addRestavracija(Restavracija newRestavracija) {
      if (newRestavracija == null)
         return;
      if (this.restavracija == null)
         this.restavracija = new java.util.HashSet();
      if (!this.restavracija.contains(newRestavracija))
         this.restavracija.add(newRestavracija);
   }
   
   /** @pdGenerated default remove
     * @param oldRestavracija */
   public void removeRestavracija(Restavracija oldRestavracija) {
      if (oldRestavracija == null)
         return;
      if (this.restavracija != null)
         if (this.restavracija.contains(oldRestavracija))
            this.restavracija.remove(oldRestavracija);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRestavracija() {
      if (restavracija != null)
         restavracija.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection getUporabnik() {
      if (uporabnik == null)
         uporabnik = new java.util.HashSet();
      return uporabnik;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorUporabnik() {
      if (uporabnik == null)
         uporabnik = new java.util.HashSet();
      return uporabnik.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newUporabnik */
   public void setUporabnik(java.util.Collection newUporabnik) {
      removeAllUporabnik();
      for (java.util.Iterator iter = newUporabnik.iterator(); iter.hasNext();)
         addUporabnik((Uporabnik)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newUporabnik */
   public void addUporabnik(Uporabnik newUporabnik) {
      if (newUporabnik == null)
         return;
      if (this.uporabnik == null)
         this.uporabnik = new java.util.HashSet();
      if (!this.uporabnik.contains(newUporabnik))
         this.uporabnik.add(newUporabnik);
   }
   
   /** @pdGenerated default remove
     * @param oldUporabnik */
   public void removeUporabnik(Uporabnik oldUporabnik) {
      if (oldUporabnik == null)
         return;
      if (this.uporabnik != null)
         if (this.uporabnik.contains(oldUporabnik))
            this.uporabnik.remove(oldUporabnik);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllUporabnik() {
      if (uporabnik != null)
         uporabnik.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection getDostavljalec() {
      if (dostavljalec == null)
         dostavljalec = new java.util.HashSet();
      return dostavljalec;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorDostavljalec() {
      if (dostavljalec == null)
         dostavljalec = new java.util.HashSet();
      return dostavljalec.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDostavljalec */
   public void setDostavljalec(java.util.Collection newDostavljalec) {
      removeAllDostavljalec();
      for (java.util.Iterator iter = newDostavljalec.iterator(); iter.hasNext();)
         addDostavljalec((Dostavljalec)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newDostavljalec */
   public void addDostavljalec(Dostavljalec newDostavljalec) {
      if (newDostavljalec == null)
         return;
      if (this.dostavljalec == null)
         this.dostavljalec = new java.util.HashSet();
      if (!this.dostavljalec.contains(newDostavljalec))
         this.dostavljalec.add(newDostavljalec);
   }
   
   /** @pdGenerated default remove
     * @param oldDostavljalec */
   public void removeDostavljalec(Dostavljalec oldDostavljalec) {
      if (oldDostavljalec == null)
         return;
      if (this.dostavljalec != null)
         if (this.dostavljalec.contains(oldDostavljalec))
            this.dostavljalec.remove(oldDostavljalec);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllDostavljalec() {
      if (dostavljalec != null)
         dostavljalec.clear();
   }

}