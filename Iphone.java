public class Iphone extends Phone{
    public Iphone(String model) {
        super(model);
    }

    @Override
    public void toCall() {
        System.out.println("Iphone call");
    }
}
