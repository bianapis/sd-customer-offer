package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ComplianceBaseWithIdAndRoot
 */
public class ComplianceBaseWithIdAndRoot   {
  private String customerOfferReference = null;

  private String customerOfferComplianceTaskReference = null;

  private String regulatoryComplianceCheckType = null;

  private String regulatoryComplianceCheckRequirement = null;

  private String regulatoryComplianceCheckSubmission = null;

  private String regulatoryComplianceAdjustmentRequirement = null;

  private String regulatoryComplianceCheckAssessment = null;


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
   * @return customerOfferComplianceTaskReference
  **/

  public String getCustomerOfferComplianceTaskReference() {
    return customerOfferComplianceTaskReference;
  }

  public void setCustomerOfferComplianceTaskReference(String customerOfferComplianceTaskReference) {
    this.customerOfferComplianceTaskReference = customerOfferComplianceTaskReference;
  }


  /**
   * ` status: Provisionally Registered`  bian-reference: CustomerOffer.RegulatoryReport.RegulatoryCompliance.RegulatoryComplianceCheck (as Assessment).AssessmentTemplate 
   * @return regulatoryComplianceCheckType
  **/

  public String getRegulatoryComplianceCheckType() {
    return regulatoryComplianceCheckType;
  }

  public void setRegulatoryComplianceCheckType(String regulatoryComplianceCheckType) {
    this.regulatoryComplianceCheckType = regulatoryComplianceCheckType;
  }


  /**
   * `status: Provisionally Registered`  bian-reference: CustomerOffer.RegulatoryReport.RegulatoryComplianceCheck.Regulation(as GuidelineRule).SubmissionRequirement  general_info : submission requirements 
   * @return regulatoryComplianceCheckRequirement
  **/

  public String getRegulatoryComplianceCheckRequirement() {
    return regulatoryComplianceCheckRequirement;
  }

  public void setRegulatoryComplianceCheckRequirement(String regulatoryComplianceCheckRequirement) {
    this.regulatoryComplianceCheckRequirement = regulatoryComplianceCheckRequirement;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerOffer.Audit.GuidelineComplianceCheck(as Assessment).SupportingDocument  general-info : submitted materials 
   * @return regulatoryComplianceCheckSubmission
  **/

  public String getRegulatoryComplianceCheckSubmission() {
    return regulatoryComplianceCheckSubmission;
  }

  public void setRegulatoryComplianceCheckSubmission(String regulatoryComplianceCheckSubmission) {
    this.regulatoryComplianceCheckSubmission = regulatoryComplianceCheckSubmission;
  }


  /**
   * `status: Provisionally Registered`  bian-reference: CustomerOffer.Audit.GuidelineComplianceCheck(as Assessment).RequiredAdjustment    general-info : change needed to comply   
   * @return regulatoryComplianceAdjustmentRequirement
  **/

  public String getRegulatoryComplianceAdjustmentRequirement() {
    return regulatoryComplianceAdjustmentRequirement;
  }

  public void setRegulatoryComplianceAdjustmentRequirement(String regulatoryComplianceAdjustmentRequirement) {
    this.regulatoryComplianceAdjustmentRequirement = regulatoryComplianceAdjustmentRequirement;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerOffer.Audit.GuidelineComplianceCheck           general-info : compliance assessment result 
   * @return regulatoryComplianceCheckAssessment
  **/

  public String getRegulatoryComplianceCheckAssessment() {
    return regulatoryComplianceCheckAssessment;
  }

  public void setRegulatoryComplianceCheckAssessment(String regulatoryComplianceCheckAssessment) {
    this.regulatoryComplianceCheckAssessment = regulatoryComplianceCheckAssessment;
  }


}

