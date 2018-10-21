package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ClosingWithIdAndRoot
 */
public class ClosingWithIdAndRoot   {
  private String customerOfferReference = null;

  private String customerOfferClosingTaskReference = null;

  private String customerReference = null;

  private String productInstanceReference = null;

  private String employeeBusinessUnitReference = null;

  private String dateTime = null;

  private String customerOfferResult = null;


  /**
   * `status: Provisionally Registered`   bian-reference: CustomerOffer   general-info: Customer Offer Reference    
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
   * @return customerOfferClosingTaskReference
  **/

  public String getCustomerOfferClosingTaskReference() {
    return customerOfferClosingTaskReference;
  }

  public void setCustomerOfferClosingTaskReference(String customerOfferClosingTaskReference) {
    this.customerOfferClosingTaskReference = customerOfferClosingTaskReference;
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
   * `status: Provisionally Registered` bian-reference: CustomerOffer.OfferedAgreement(as MasterAgreement).GovernedContract(as Agreement).Product general-info: Product Instance Reference (reference once set-up initiated for completed offers) 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status:  Provisionally Registered` bian-reference: CustomerOffer.TargetCustomer.RelationshipManager.BusinessUnit   general-info: Employee/Business Unit Reference 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * Get dateTime
   * @return dateTime
  **/

  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }


  /**
   * `status: Provisionally Registered'  bian-reference: CustomerOffer.Result 
   * @return customerOfferResult
  **/

  public String getCustomerOfferResult() {
    return customerOfferResult;
  }

  public void setCustomerOfferResult(String customerOfferResult) {
    this.customerOfferResult = customerOfferResult;
  }


}

