package gift.sweets;

import gift.Special;

@Special(special = "Star")
public class Cookie extends Sweets{

    private String form;

    public Cookie() {
        super("Cookie", 20, 5);
        this.form = form;
    }
}