public abstract class Record {
    
    // Atttributes.
    public String name;
    public float amount;

    Record(String name, float amount) {

        this.name = name;
        this.amount = amount;

    }

    // Returns record name.
    public String getName() {

        return name;

    }

    // Sets record name.
    public void setName(String name) {

        this.name = name;

    }

    // Return record amount.
    public float getAmount() {

        return amount;

    }

    // Sets record amount.
    public void setAMount(float amount) {

        this.amount = amount;

    }

}
