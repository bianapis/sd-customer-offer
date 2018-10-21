package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CorrespondenceBaseWithIdAndRoot
 */
public class CorrespondenceBaseWithIdAndRoot   {
  private String customerOfferReference = null;

  private String customerOfferCorrespondenceTaskReference = null;

  private String customerReference = null;

  private String customerMailingAddress = null;

  private String correspondenceReference = null;


  /**
   * `status: Provisionally Registered`  bian-reference: CustomerOffer   general-info: Customer Offer Reference 
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
   * @return customerOfferCorrespondenceTaskReference
  **/

  public String getCustomerOfferCorrespondenceTaskReference() {
    return customerOfferCorrespondenceTaskReference;
  }

  public void setCustomerOfferCorrespondenceTaskReference(String customerOfferCorrespondenceTaskReference) {
    this.customerOfferCorrespondenceTaskReference = customerOfferCorrespondenceTaskReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerOffer.TargetCustomer   general-info: Customer Reference 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerMailingAddress
  **/

  public String getCustomerMailingAddress() {
    return customerMailingAddress;
  }

  public void setCustomerMailingAddress(String customerMailingAddress) {
    this.customerMailingAddress = customerMailingAddress;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info : to handle request/receipt of documents 
   * @return correspondenceReference
  **/

  public String getCorrespondenceReference() {
    return correspondenceReference;
  }

  public void setCorrespondenceReference(String correspondenceReference) {
    this.correspondenceReference = correspondenceReference;
  }


}

