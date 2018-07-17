public class TesteChain {
    public static void main(String[] args) {
        SlotChain slot = new SlotUmReal();
        slot.setNext(new SlotCinquentaCentavos());
        slot.setNext(new SlotVinteCincoCentavos());
        slot.setNext(new SlotDezCentavos());
        slot.setNext(new SlotCincoCentavos());
        slot.setNext(new SlotUmCentavo());

        Integer valor = slot.parserDoubleToInteger(1.14);

        try {
            slot.efetuarRetirada(valor);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
