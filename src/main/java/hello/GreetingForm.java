package hello;

public class GreetingForm {
    private final String name;

    public GreetingForm() {
        this.name = null;
    }

    public GreetingForm(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
