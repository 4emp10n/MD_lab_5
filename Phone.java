public abstract class Phone {
    private String model;

    public Phone(String model) {
        this.model = model;
    }

    public String getModel()
    {
        return model;
    }

    public abstract void toCall();
}








