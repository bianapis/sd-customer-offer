package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ProductBaseWithIdAndRoot
 */
public class ProductBaseWithIdAndRoot   {
  private String customerOfferReference = null;

  private String customerOfferCustomerProductTaskReference = null;

  private String productReference = null;

  private String productOption = null;

  private String productOptionDescription = null;

  private String productOptionSelection = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier description: |   `status: Provisionally Registered`   bian-reference: CustomerOffer   general-info: Customer Offer Reference 
   * @return customerOfferReference
  **/

  public String getCustomerOfferReference() {
    return customerOfferReference;
  }

  public void setCustomerOfferReference(String customerOfferReference) {
    this.customerOfferReference = customerOfferReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerOfferCustomerProductTaskReference
  **/

  public String getCustomerOfferCustomerProductTaskReference() {
    return customerOfferCustomerProductTaskReference;
  }

  public void setCustomerOfferCustomerProductTaskReference(String customerOfferCustomerProductTaskReference) {
    this.customerOfferCustomerProductTaskReference = customerOfferCustomerProductTaskReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerOffer.OfferedAgreement.GovernedContract(as Agreement).Product general-info: Product Reference 
   * @return productReference
  **/

  public String getProductReference() {
    return productReference;
  }

  public void setProductReference(String productReference) {
    this.productReference = productReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerOffer.OfferedAgreement.GovernedContract(as Agreement).Product.AvailableOption.OptionType general-info: Product Option 
   * @return productOption
  **/

  public String getProductOption() {
    return productOption;
  }

  public void setProductOption(String productOption) {
    this.productOption = productOption;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerOffer.OfferedAgreement.GovernedContract(as Agreement).Product.AvailableOption.OptionDescription general-info: Product Option Description 
   * @return productOptionDescription
  **/

  public String getProductOptionDescription() {
    return productOptionDescription;
  }

  public void setProductOptionDescription(String productOptionDescription) {
    this.productOptionDescription = productOptionDescription;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerOffer.OfferedAgreement.GovernedContract(as Agreement).Product.SelectedOption general-info: Product Option Selection 
   * @return productOptionSelection
  **/

  public String getProductOptionSelection() {
    return productOptionSelection;
  }

  public void setProductOptionSelection(String productOptionSelection) {
    this.productOptionSelection = productOptionSelection;
  }


}

