package com.timbuchalka.springdemo.domain.promotion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.timbuchalka.springdemo.domain.product.ConsumerProduct;
import com.timbuchalka.springdemo.domain.product.IndustrialProduct;

@Component("myfair")
public class TradeFair {

	// @Autowired
	private IndustrialProduct industrialProduct;
	// @Autowired
	private ConsumerProduct consumerProduct;

	@Autowired
	public TradeFair(IndustrialProduct industrialProduct, ConsumerProduct consumerProduct) {
		this.industrialProduct = industrialProduct;
		this.consumerProduct = consumerProduct;
	}

	// @Autowired
	// public void setIndustrialProduct(IndustrialProduct industrialProduct) {
	// System.out.println("Autowired setter called");
	// this.industrialProduct = industrialProduct;
	// }
	//
	// @Autowired
	// public void setConsumerProduct(ConsumerProduct consumerProduct) {
	// System.out.println("Autowired setter called");
	// this.consumerProduct = consumerProduct;
	// }

	public int declareIndustrialProductPrice(IndustrialProduct industrialProduct) {
		return industrialProduct.calculatePrice();
	}

	public int declareConsumerProductPrice(ConsumerProduct consumerProduct) {
		return consumerProduct.calculatePrice();
	}

	public String specialPromotionalPricing() {
		String priceInfo = "Industrial Product is priced at $" + declareIndustrialProductPrice(industrialProduct)
				+ " and " + "Consumer Product is priced at $" + declareConsumerProductPrice(consumerProduct);
		return priceInfo;
	}
}
