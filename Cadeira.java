public class Cadeira {
    // Atributos
    private String material;
    private String cor;
    private int altura;
    private int largura;
    private boolean possuiApoioBraco;

    // Construtor
    public Cadeira(String material, String cor, int altura, int largura, boolean possuiApoioBraco) {
        this.material = material;
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
        this.possuiApoioBraco = possuiApoioBraco;
    }

    // Métodos
    public void sentar() {
        System.out.println("Sentando na cadeira.");
    }

    public void ajustarAltura(int novaAltura) {
        this.altura = novaAltura;
        System.out.println("Altura ajustada para: " + novaAltura + " cm.");
    }

    // Getters e Setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public boolean isPossuiApoioBraco() {
        return possuiApoioBraco;
    }

    public void setPossuiApoioBraco(boolean possuiApoioBraco) {
        this.possuiApoioBraco = possuiApoioBraco;
    }

    @Override
    public String toString() {
        return "Cadeira{" +
                "material='" + material + '\'' +
                ", cor='" + cor + '\'' +
                ", altura=" + altura +
                ", largura=" + largura +
                ", possuiApoioBraco=" + possuiApoioBraco +
                '}';
    }
}
