package com.diego.springdemo.domain.promotion;

import com.diego.springdemo.domain.product.ConsumerProduct;
import com.diego.springdemo.domain.product.IndustrialProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myFair")
public class TradeFair {

    private ConsumerProduct consumerProduct;

    private IndustrialProduct industrialProduct;

    @Autowired
    public TradeFair(ConsumerProduct consumerProduct, IndustrialProduct industrialProduct) {
        this.consumerProduct = consumerProduct;
        this.industrialProduct = industrialProduct;
    }

    public String specialPromotionalPricing() {
        return "Industrial Product is priced at $" + industrialProduct.calculatePrice()
                + " and " + "Consumer Product is priced at $" + consumerProduct.calculatePrice();
    }
}

