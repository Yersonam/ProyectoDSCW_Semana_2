// Concrete Builder
class ConcreteBuilder implements Builder {
    private Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }

    public void buildAttribute1(String attribute1) {
        product.setAttribute1(attribute1);
    }

    public void buildAttribute2(String attribute2) {
        product.setAttribute2(attribute2);
    }

    public void buildAttribute3(int attribute3) {
        product.setAttribute3(attribute3);
    }

    public Product getProduct() {
        return product;
    }
}
