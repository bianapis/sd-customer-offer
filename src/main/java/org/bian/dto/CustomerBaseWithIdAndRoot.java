package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerBaseWithIdAndRoot
 */
public class CustomerBaseWithIdAndRoot   {
  private String customerOfferReference = null;

  private String customerOfferCustomerReferenceTaskReference = null;

  private String customerReference = null;

  private String partyReference = null;


  /**
   * `status: Provisionally Registered` bian-reference: CustomerOffer general-info: Customer Offer Reference 
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
   * @return customerOfferCustomerReferenceTaskReference
  **/

  public String getCustomerOfferCustomerReferenceTaskReference() {
    return customerOfferCustomerReferenceTaskReference;
  }

  public void setCustomerOfferCustomerReferenceTaskReference(String customerOfferCustomerReferenceTaskReference) {
    this.customerOfferCustomerReferenceTaskReference = customerOfferCustomerReferenceTaskReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerOffer.TargetCustomer general-info: Customer Reference 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerOffer.TargetCustomer(as Role).Player(as Party).AccountableParty general-info: Party Reference 
   * @return partyReference
  **/

  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }


}

