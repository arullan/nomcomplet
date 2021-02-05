
public class NomComplet {
    private String nom;
    private String cognom1;
    private String cognom2;

    public NomComplet(String n,String c1,String c2) {
        nom = n;
        cognom1 = c1;
        cognom2 = c2;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom1() {
        return cognom1;
    }

    public void setCognom1(String cognom1) {
        this.cognom1 = cognom1;
    }

    public String getCognom2() {
        return cognom2;
    }

    public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }

    public String inicials() {
        String ini = "";

        if (nom!=null)
            ini = ini + nom.charAt(0);
        if (!cognom1.isEmpty())
            ini = ini + cognom1.charAt(0);
        if (!cognom2.isEmpty())
            ini = ini + cognom2.charAt(0);
        return ini;
    }

    public String nomComplet() {
        if(!cognom2.isEmpty())
            return nom+" "+cognom1+" "+cognom2;
        else if(!cognom1.isEmpty())
            return nom+" "+cognom1;
        else
            return nom;
    }

    public String nomXifrat() {
        String xifrat = "";
        for (int i=0; i<nom.length(); i++) {
            int ascii = nom.charAt(i);
            char lletra = (char)(ascii+1);
            xifrat = xifrat +lletra;
        }
        return xifrat;
    }

    public static void main(String[] args) {
        NomComplet elmeunom = new NomComplet("Alícia","Rosselló","Ximenes");
        System.out.println("Jo som "+elmeunom.nomComplet());
        System.out.println("Les meves inicials són "+elmeunom.inicials());
        System.out.println("El meu nom xifrat és "+elmeunom.nomXifrat());
    }

}
