public class Teste {

    public static void main(String[] args) {
        final Integer X1 = 2;
        final Integer Y1 = 2;
        final Integer X2 = 5;
        final Integer Y2 = 9;
        final Double RAIO = 1.5;
        final Integer ALTURA = 5;

        Ponto inicio = new Ponto(X1, Y1);
        Ponto fim = new Ponto(X2, Y2);
        Ponto centro = new Ponto(X1, Y2);

        Reta reta = new Reta(inicio, fim);

        Quadrilatero quadrilatero = new Quadrilatero(reta);
        Circulo circulo = new Circulo(RAIO, centro);
        Triangulo triangulo = new Triangulo(reta, ALTURA);

        // Desenha figura
        System.out.println(quadrilatero.desenhaFigura());
        System.out.println(circulo.desenhaFigura());
        System.out.println(triangulo.desenhaFigura());

        // Area figura
        System.out.println(quadrilatero.areaFigura());
        System.out.println(circulo.areaFigura());
        System.out.println(triangulo.areaFigura());

        // Perimetro figura
        System.out.println(quadrilatero.perimetroFigura());
        System.out.println(circulo.perimetroFigura());
        System.out.println(triangulo.perimetroFigura());

        // To_string
        System.out.println(quadrilatero);
        System.out.println(circulo);
        System.out.println(triangulo);
    }

}
