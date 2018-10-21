package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CurrencyAndAmount;

import javax.validation.Valid;
  
/**
 * BookingBaseWithIdAndRoot
 */
public class BookingBaseWithIdAndRoot   {
  private String customerOfferReference = null;

  private String customerOfferBookingTaskReference = null;

  private String productInstanceReference = null;

  private String customerReference = null;

  private String businessUnitReference = null;

  private String assetLiabilityType = null;

  private CurrencyAndAmount amount = null;


  /**
   * `status: Provisionally Registered`  bian-reference: CustomerOffer     
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
   * @return customerOfferBookingTaskReference
  **/

  public String getCustomerOfferBookingTaskReference() {
    return customerOfferBookingTaskReference;
  }

  public void setCustomerOfferBookingTaskReference(String customerOfferBookingTaskReference) {
    this.customerOfferBookingTaskReference = customerOfferBookingTaskReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerOffer.OfferedAgreement.Product 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerOffer.TargetCustomer  general-info: Customer Reference 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Provisionally Registered`  bian-reference: CustomerOffer.TargetCustomer.RelationshipManager.BusinessUnit   general-info: Business Unit Reference (defines booking category)   
   * @return businessUnitReference
  **/

  public String getBusinessUnitReference() {
    return businessUnitReference;
  }

  public void setBusinessUnitReference(String businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Code 
   * @return assetLiabilityType
  **/

  public String getAssetLiabilityType() {
    return assetLiabilityType;
  }

  public void setAssetLiabilityType(String assetLiabilityType) {
    this.assetLiabilityType = assetLiabilityType;
  }


  /**
   * Get amount
   * @return amount
  **/

  public CurrencyAndAmount getAmount() {
    return amount;
  }

  public void setAmount(CurrencyAndAmount amount) {
    this.amount = amount;
  }


}

