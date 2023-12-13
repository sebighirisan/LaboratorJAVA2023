package Model;

public class Produs {
     private int IdProdus;
     private String denumire;
     private float pret;
     private String ingrediente;

     public Produs(){
          super();
     }

     public Produs(int idProdus, String denumire, float pret, String ingrediente) {
          IdProdus = idProdus;
          this.denumire = denumire;
          this.pret = pret;
          this.ingrediente = ingrediente;
     }

     public int getIdProdus() {
          return IdProdus;
     }

     public void setIdProdus(int idProdus) {
          IdProdus = idProdus;
     }

     public String getDenumire() {
          return denumire;
     }

     public void setDenumire(String denumire) {
          this.denumire = denumire;
     }

     public float getPret() {
          return pret;
     }

     public void setPret(float pret) {
          this.pret = pret;
     }

     public String getIngrediente() {
          return ingrediente;
     }

     public void setIngrediente(String ingrediente) {
          this.ingrediente = ingrediente;
     }

     @Override
     public String toString() {
          return "Produs{" +
                  "IdProdus=" + IdProdus +
                  ", denumire='" + denumire + '\'' +
                  ", pret=" + pret +
                  ", ingrediente='" + ingrediente + '\'' +
                  '}';
     }
}
