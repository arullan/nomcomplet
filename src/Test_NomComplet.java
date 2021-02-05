import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_NomComplet {

    NomComplet ElMeuNomComplet;
    NomComplet ElMeuNom1Cognom;
    NomComplet ElMeuNom0Cognoms;

    @BeforeEach
    public void setup(){
        ElMeuNomComplet = new NomComplet("Antoni", "Rullan", "Pomar");
        ElMeuNom1Cognom = new NomComplet("Antoni", "Rullan", "");
        ElMeuNom0Cognoms = new NomComplet("Antoni","","");
    }

    @AfterEach
    public void destroy(){
        ElMeuNomComplet = null;
        ElMeuNom1Cognom = null;
        ElMeuNom0Cognoms = null;
    }

    @Test
    public void test_inicials_complet(){
        String resultatEsperat = "ARP";
        String resultatObtingut = ElMeuNomComplet.inicials();
        assertEquals(resultatEsperat,resultatObtingut);
    }

    @Test
    public void test_inicials_1cognom(){
        String resultatEsperat = "AR";
        String resultatObtingut = ElMeuNom1Cognom.inicials();
        assertEquals(resultatEsperat,resultatObtingut);
    }

    @Test
    public void test_inicials_0cognoms(){
        String resultatEsperat = "A";
        String resultatObtingut = ElMeuNom0Cognoms.inicials();
        assertEquals(resultatEsperat,resultatObtingut);
    }

    @Test
    public void test_nomComplet_complet(){
        String resultatEsperat = "Antoni Rullan Pomar";
        String resultatObtingut = ElMeuNomComplet.nomComplet();
        assertEquals(resultatEsperat,resultatObtingut);
    }

    @Test
    public void test_nomComplet_1Cognom(){
        String resultatEsperat = "Antoni Rullan";
        String resultatObtingut = ElMeuNom1Cognom.nomComplet();
        assertEquals(resultatEsperat,resultatObtingut);
    }

    @Test
    public void test_nomComplet_0Cognoms(){
        String resultatEsperat = "Antoni";
        String resultatObtingut = ElMeuNom0Cognoms.nomComplet();
        assertEquals(resultatEsperat,resultatObtingut);
    }

    @Test
    public void test_xifrat(){
        String resultatEsperat = "Boupoj";
        String resultatObtingut = ElMeuNomComplet.nomXifrat();
        assertEquals(resultatEsperat,resultatObtingut);
    }
}
