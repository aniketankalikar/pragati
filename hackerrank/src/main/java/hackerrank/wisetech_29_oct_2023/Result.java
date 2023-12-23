package hackerrank.wisetech_29_oct_2023;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {

    /*
     * Complete the 'findLowestPrice' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. 2D_STRING_ARRAY products
     *  2. 2D_STRING_ARRAY discounts
     */

    public int findLowestPrice(List<List<String>> products, List<List<String>> discounts) {
        // Write your code here

        // Cpnstruct the hashMap of Discounts
        Map<String, Discount> discountMap = new HashMap<>();
        for (List<String> discount : discounts) {
            String tag = discount.get(0);
            String type = discount.get(1);
            String amount = discount.get(2);

            Discount discountObj = new Discount(tag, type, amount);
            discountMap.put(tag, discountObj);
        }

        // Construct the List of Products and calculate
        Discount discount = null;
        Integer totalAmount = 0;
        for (List<String> eachProduct : products) {
            String price = eachProduct.get(0);
            Integer iPrice = Integer.parseInt(price);
            Integer minPrice = Integer.MAX_VALUE;
            for (int i = 1; i < eachProduct.size(); i++) {
                String dTag = eachProduct.get(i);
                Integer discountedPrice = 0;
                if (dTag != null && !dTag.equals("") && !dTag.equals("EMPTY")) {
                    discount = discountMap.get(dTag);
                    switch (discount.getType()) {
                        case "0": {
                            discountedPrice = Integer.parseInt(discount.getAmount());
                            discountedPrice = Math.round(discountedPrice);
                            break;

                        }
                        case "1": {
                            discountedPrice = iPrice - (iPrice * (Integer.parseInt(discount.getAmount()) / 100));
                            discountedPrice = Math.round(discountedPrice);
                            break;
                        }
                        case "2": {
                            discountedPrice = iPrice - Integer.parseInt(discount.getAmount());
                            discountedPrice = Math.round(discountedPrice);
                            break;
                        }

                        default: {
                            discountedPrice = 0;
                            break;
                        }
                    }

                }
                minPrice = discountedPrice < minPrice ? discountedPrice : minPrice;
            }

            totalAmount += minPrice;
        }

        return totalAmount;

    }

}
