package hackerrank.wisetech_29_oct_2023;

public class Discount {
    String tag = "";
    String type = "";
    String amount = "";

    public Discount(String tagInput, String typeInput, String amountInput) {
        this.tag = tagInput;
        this.type = typeInput;
        this.amount = amountInput;
    }

    public String getTag() {
        return tag;
    }

    public String getType() {
        return type;
    }

    public String getAmount() {
        return amount;
    }
}
