package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ProductBase
 */
public class ProductBase   {
  private String productReference = null;

  private String productOption = null;

  private String productOptionDescription = null;

  private String productOptionSelection = null;


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
   * `status: Provisionally Registered`   bian-reference: CustomerOffer.OfferedAgreement.GovernedContract(as Agreement).Product.AvailableOption.OptionType             general-info: feature that can be configured for the customer 
   * @return productOption
  **/

  public String getProductOption() {
    return productOption;
  }

  public void setProductOption(String productOption) {
    this.productOption = productOption;
  }


  /**
   * `status: Provisionally Registered`  bian-reference: CustomerOffer.OfferedAgreement.GovernedContract(as Agreement).Product.AvailableOption.OptionType             general-info: feature description for review 
   * @return productOptionDescription
  **/

  public String getProductOptionDescription() {
    return productOptionDescription;
  }

  public void setProductOptionDescription(String productOptionDescription) {
    this.productOptionDescription = productOptionDescription;
  }


  /**
   * `status: Provisionally Registered`  bian-reference: CustomerOffer.OfferedAgreement.GovernedContract(as Agreement).Product.SelectedOption general-info: setting agreed/defined with customer  
   * @return productOptionSelection
  **/

  public String getProductOptionSelection() {
    return productOptionSelection;
  }

  public void setProductOptionSelection(String productOptionSelection) {
    this.productOptionSelection = productOptionSelection;
  }


}

