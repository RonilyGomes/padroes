public abstract class SlotChain {
    private SlotChain next;
//    private IDMoedas idMoeda;
    private Integer valorMoeda;

    public SlotChain(Integer valorMoeda) {
        this.next = null;
//        this.idMoeda = id;
        this.valorMoeda = valorMoeda;
    }

    public void setNext(SlotChain next) {
        if(this.next == null) {
            this.next = next;
        }
        else{
            this.next.setNext(next);
        }
    }

    private boolean podeEfetuarRetirada(Integer valor) {
        return (valor / this.valorMoeda > 0);
    }

    public Integer parserDoubleToInteger(Double valor) {
        valor = (valor * 100);
        return valor.intValue();
    }

    public void efetuarRetirada(Integer valor) throws Exception{
        if(podeEfetuarRetirada(valor)) {
            valor = efetuaRetirada(valor);
        }
        if(next == null) {
            throw new Exception("Troco eh " + valor + " centavos");
        }

        next.efetuarRetirada(valor);
    }

    protected Integer efetuaRetirada(Integer valor) {
        return (valor % this.valorMoeda);
    }
}
