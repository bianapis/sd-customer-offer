package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * OfferBase
 */
public class OfferBase   {
  private Object customerOfferRecord = null;

  private String customerReference = null;

  private String productReference = null;

  private String dateTime = null;

  private String date = null;

  private String employeeBusinessUnitReference = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return customerOfferRecord
  **/

  public Object getCustomerOfferRecord() {
    return customerOfferRecord;
  }

  public void setCustomerOfferRecord(Object customerOfferRecord) {
    this.customerOfferRecord = customerOfferRecord;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  
   * @return dateTime
  **/

  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }


  /**
   * Get date
   * @return date
  **/

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerOffer.TargetCustomer.RelationshipManager.BusinessUnit general-info: Employee Business Unit 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


}

