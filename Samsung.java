public class Samsung extends Phone{
    public Samsung(String model) {
        super(model);
    }

    @Override
    public void toCall() {
        System.out.println("Samsung call");
    }
}
