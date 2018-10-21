package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * AgreementBaseWithIdAndRoot
 */
public class AgreementBaseWithIdAndRoot   {
  private String customerOfferReference = null;

  private String customerOfferAgreementTaskReference = null;

  private String customerAgreementReference = null;

  private String salesProductAgreementReference = null;


  /**
   * `status: Provisionally Registered` bian-reference: CustomerOffer   general-info: Customer Offer Reference 
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
   * @return customerOfferAgreementTaskReference
  **/

  public String getCustomerOfferAgreementTaskReference() {
    return customerOfferAgreementTaskReference;
  }

  public void setCustomerOfferAgreementTaskReference(String customerOfferAgreementTaskReference) {
    this.customerOfferAgreementTaskReference = customerOfferAgreementTaskReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info : customer master agreement 
   * @return customerAgreementReference
  **/

  public String getCustomerAgreementReference() {
    return customerAgreementReference;
  }

  public void setCustomerAgreementReference(String customerAgreementReference) {
    this.customerAgreementReference = customerAgreementReference;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E2tpUMTGEeChad0JzLk7QA_1799405832) general-info: product specific sub/clause of master agreement 
   * @return salesProductAgreementReference
  **/

  public String getSalesProductAgreementReference() {
    return salesProductAgreementReference;
  }

  public void setSalesProductAgreementReference(String salesProductAgreementReference) {
    this.salesProductAgreementReference = salesProductAgreementReference;
  }


}

