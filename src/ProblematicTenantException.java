public class ProblematicTenantException extends Exception {
    public ProblematicTenantException(Osoba osoba) {
        super(osoba.imie + " posiadla juz najem pomieszczen: pomieszczenie 1 ID = " + osoba.listaZaleglychUmow.get(0).numerID +" pomieszczenie 2 ID = "+osoba.listaZaleglychUmow.get(1).numerID +" pomieszczenie 3 ID = "+osoba.listaZaleglychUmow.get(2).numerID );
    }
}
