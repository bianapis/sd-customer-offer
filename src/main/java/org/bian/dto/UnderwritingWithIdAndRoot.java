package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * UnderwritingWithIdAndRoot
 */
public class UnderwritingWithIdAndRoot   {
  private String customerOfferReference = null;

  private String customerOfferUnderwritingTaskReference = null;

  private String customerIncomeStatement = null;

  private String customerDebtStatement = null;

  private String customerAssetStatement = null;

  private String underwritingAssessmentReference = null;


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
   * `status: Provisionally Registered` bian-reference: CustomerOffer       
   * @return customerOfferUnderwritingTaskReference
  **/

  public String getCustomerOfferUnderwritingTaskReference() {
    return customerOfferUnderwritingTaskReference;
  }

  public void setCustomerOfferUnderwritingTaskReference(String customerOfferUnderwritingTaskReference) {
    this.customerOfferUnderwritingTaskReference = customerOfferUnderwritingTaskReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerOffer       
   * @return customerIncomeStatement
  **/

  public String getCustomerIncomeStatement() {
    return customerIncomeStatement;
  }

  public void setCustomerIncomeStatement(String customerIncomeStatement) {
    this.customerIncomeStatement = customerIncomeStatement;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info : bank and known non-bank managed debts 
   * @return customerDebtStatement
  **/

  public String getCustomerDebtStatement() {
    return customerDebtStatement;
  }

  public void setCustomerDebtStatement(String customerDebtStatement) {
    this.customerDebtStatement = customerDebtStatement;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info : bank and known non-bank managed assets 
   * @return customerAssetStatement
  **/

  public String getCustomerAssetStatement() {
    return customerAssetStatement;
  }

  public void setCustomerAssetStatement(String customerAssetStatement) {
    this.customerAssetStatement = customerAssetStatement;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return underwritingAssessmentReference
  **/

  public String getUnderwritingAssessmentReference() {
    return underwritingAssessmentReference;
  }

  public void setUnderwritingAssessmentReference(String underwritingAssessmentReference) {
    this.underwritingAssessmentReference = underwritingAssessmentReference;
  }


}

