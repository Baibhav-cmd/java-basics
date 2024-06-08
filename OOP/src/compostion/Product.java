package compostion;

public class Product {
    private String model;
    private String manufracture;
    private int depth;
    private int height;
    private int width;
    public Product(String model, String manufracture) {
        this.model = model;
        this.manufracture = manufracture;
    }


}

class Monitor extends Product{

    public Monitor(String model,String manufracture) {
        super(model,manufracture);
    }

    class Motherboard extends Product{
        public Motherboard(String model, String manufracture) {
            super (model, manufracture);
        }

    }




}

