package ru.outs.visitor;

@SuppressWarnings({"java:S106"})
public class CarServiceVip implements Visitor {
    private static final String MSG = "Дорого и красиво:";

    @Override
    public void visit(Engine item) {
        System.out.println(MSG + item.checkEngine());
    }

    @Override
    public void visit(Transmission item) {
        System.out.println(MSG + item.refreshOil());
    }

    @Override
    public void visit(Brake item) {
        System.out.println(MSG + item.replaceBrakePad());
    }
}
