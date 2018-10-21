package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CreditBaseWithIdAndRoot
 */
public class CreditBaseWithIdAndRoot   {
  private String customerOfferReference = null;

  private String customerOfferCreditTaskReference = null;

  private String customerCreditRating = null;

  private String creditAuthorizationDecisionReference = null;

  private String creditAuthorizationDecision = null;


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
   * `status: Provisionally Registered` bian-reference: CustomerOffer general-info: Customer Offer Reference 
   * @return customerOfferCreditTaskReference
  **/

  public String getCustomerOfferCreditTaskReference() {
    return customerOfferCreditTaskReference;
  }

  public void setCustomerOfferCreditTaskReference(String customerOfferCreditTaskReference) {
    this.customerOfferCreditTaskReference = customerOfferCreditTaskReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerOffer.CreditRating general-info: Customer Credit Rating  
   * @return customerCreditRating
  **/

  public String getCustomerCreditRating() {
    return customerCreditRating;
  }

  public void setCustomerCreditRating(String customerCreditRating) {
    this.customerCreditRating = customerCreditRating;
  }


  /**
   * `status: Provisionally Registered`  bian-reference: CustomerOffer.CreditAuthorisation(as Assessment)  general-info : where credit authorization required   
   * @return creditAuthorizationDecisionReference
  **/

  public String getCreditAuthorizationDecisionReference() {
    return creditAuthorizationDecisionReference;
  }

  public void setCreditAuthorizationDecisionReference(String creditAuthorizationDecisionReference) {
    this.creditAuthorizationDecisionReference = creditAuthorizationDecisionReference;
  }


  /**
   * `status: Provisionally Registered`  bian-reference: CustomerOffer.CreditAuthorisation(as Assessment).AssessmentResult general-info : where credit authorization required 
   * @return creditAuthorizationDecision
  **/

  public String getCreditAuthorizationDecision() {
    return creditAuthorizationDecision;
  }

  public void setCreditAuthorizationDecision(String creditAuthorizationDecision) {
    this.creditAuthorizationDecision = creditAuthorizationDecision;
  }


}

