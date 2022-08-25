import java.io.Serializable;

public class ProductOnline implements Serializable

    private String nome;
    private Double valor;

    public ProductOnline(){}

    public ProductOnline(String nome, Double valor) {
        this.valor = valor;
        this.nome = nome;


    }

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ProductOnline productOnline = new ProductOnline(nome:"camiseta", valor:20d);
        System.out.println(productOnline);

        ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream(nome:'product.byte'));
        objectOutput.writeObject(productOnline);
        objectOutput.close();

        ObjectInputStream objectOutput = new ObjectInputStream(new FileInputStream(nome:'product.byte'));
        objectInput.readObject(productOnline);
        objectInput.close();


    } 
}
