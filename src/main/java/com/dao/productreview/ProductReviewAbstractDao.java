package com.dao.productreview;

import com.google.inject.ImplementedBy;
import com.models.ProductReview;

@ImplementedBy(ProductReviewDao.class)
public interface ProductReviewAbstractDao {
    public void saveProductReview(ProductReview productReview);
}
