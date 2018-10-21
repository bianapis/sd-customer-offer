package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PricingBaseWithIdAndRoot
 */
public class PricingBaseWithIdAndRoot   {
  private String customerOfferReference = null;

  private String customerOfferPricingTaskReference = null;

  private String productPricing = null;

  private String negotiationGuidelinesRules = null;

  private String agreedPricing = null;

  private String pricingAdjustments = null;


  /**
   * `status: Provisionally Registered'  bian-reference: CustomerOffer  general-info: Customer Offer Reference   
   * @return customerOfferReference
  **/

  public String getCustomerOfferReference() {
    return customerOfferReference;
  }

  public void setCustomerOfferReference(String customerOfferReference) {
    this.customerOfferReference = customerOfferReference;
  }


  /**
   * `status: Provisionally Registered' bian-reference: CustomerOffer general-info: Customer Offer Reference 
   * @return customerOfferPricingTaskReference
  **/

  public String getCustomerOfferPricingTaskReference() {
    return customerOfferPricingTaskReference;
  }

  public void setCustomerOfferPricingTaskReference(String customerOfferPricingTaskReference) {
    this.customerOfferPricingTaskReference = customerOfferPricingTaskReference;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FKYzQMTGEeChad0JzLk7QA_-1231897848/elements/___L8Y2IiEeGD28DQaMef-g) bian-reference: CustomerOffer.OfferedAgreement.GovernedContract(as Agreement).Product.Quantity.GrossPriceQuantityRelatedLineItem general-info: Credit Grade 
   * @return productPricing
  **/

  public String getProductPricing() {
    return productPricing;
  }

  public void setProductPricing(String productPricing) {
    this.productPricing = productPricing;
  }


  /**
   * `status: Provisionally Registered`  bian-reference: CustomerOffer.OfferedAgreement.GovernedContract(as Agreement).Product.PricingRules  general-info : defines allowed situation-based variations   
   * @return negotiationGuidelinesRules
  **/

  public String getNegotiationGuidelinesRules() {
    return negotiationGuidelinesRules;
  }

  public void setNegotiationGuidelinesRules(String negotiationGuidelinesRules) {
    this.negotiationGuidelinesRules = negotiationGuidelinesRules;
  }


  /**
   * `status: Provisionally Registered'  bian-reference: CustomerOffer.OfferedAgreement.GovernedContract(as Agreement).Product.PricingRules  general-info : covers all negotiable prices/fees/penalties   
   * @return agreedPricing
  **/

  public String getAgreedPricing() {
    return agreedPricing;
  }

  public void setAgreedPricing(String agreedPricing) {
    this.agreedPricing = agreedPricing;
  }


  /**
   * `status: Registered` iso-link1: [click-here](https://www.iso20022.org/standardsrepository/public/dictionaryModel/repositorySearch.xhtml#query=Penalty/status=ANY/object=BUSINESS_COMPONENT) bian-reference: CustomerOffer.OfferedAgreement.GovernedContract(as Agreement).Product.Adjustment(as Penalty) iso-link2: [click-here] bian-reference: CustomerOffer.OfferedAgreement.GovernedContract(as Agreement).Product.Adjustment(as Charges) iso-link3: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_TkWg4A35EeKdSdbhKHXCPg_1501219725) bian-reference: CustomerOffer.OfferedAgreement.GovernedContract(as Agreement).Product.Adjustment(as Discount) iso-link4: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Flzj8MTGEeChad0JzLk7QA_-1112623234) bian-reference: CustomerOffer.OfferedAgreement.GovernedContract(as Agreement).Product.Adjustment(as Allowance) iso-link5: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FZSK58TGEeChad0JzLk7QA_-927609616) bian-reference: CustomerOffer.OfferedAgreement.GovernedContract(as Agreement).Product.Adjustment(as Commission) iso-link6: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5GO-MTGEeChad0JzLk7QA_602584288) bian-reference: CustomerOffer.OfferedAgreement.GovernedContract(as Agreement).Product.Adjustment.Price general-info: customer profile and/or bank imposed adjustments/discounts 
   * @return pricingAdjustments
  **/

  public String getPricingAdjustments() {
    return pricingAdjustments;
  }

  public void setPricingAdjustments(String pricingAdjustments) {
    this.pricingAdjustments = pricingAdjustments;
  }


}

