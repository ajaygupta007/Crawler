package tech.codingclub.database;
import tech.codingclub.entity.Coders;

public class TestCodersTable {

    public static void main(String[] args) {

        Coders akshat = new Coders("Ajay", 21L );
        Coders harsh = new Coders("Harsh", 17L );
        Coders spammer = new Coders("SPAMMER", 50L );

        //Insert this object into DB !

//           < ENTITY CLASS>
        new GenericDB<Coders>().addRow(tech.codingclub.tables.Coders.CODERS, akshat);
        new GenericDB<Coders>().addRow(tech.codingclub.tables.Coders.CODERS, harsh);
        new GenericDB<Coders>().addRow(tech.codingclub.tables.Coders.CODERS, spammer);

    }
}
