package com.tools.factories;

import com.models.ProductReview;
import net.bytebuddy.utility.RandomString;

public class ProductReviewFactory {
    public static ProductReview getProductReviewInstance(String summary) {
        ProductReview productReview = new ProductReview();
        productReview.setSummary(summary);
     //   productReview.setNickname(RandomString.make(10));
        //TODO set the rest of the fields. It is preferable to use random generated values
        return productReview;
    }
}
