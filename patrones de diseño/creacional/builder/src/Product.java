// Product class
class Product {
    private String attribute1;
    private String attribute2;
    private int attribute3;

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public void setAttribute3(int attribute3) {
        this.attribute3 = attribute3;
    }

    public void printProduct() {
        System.out.println("Product attributes:");
        System.out.println("Attribute 1: " + attribute1);
        System.out.println("Attribute 2: " + attribute2);
        System.out.println("Attribute 3: " + attribute3);
    }
}
