package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * AuditWithIdAndRoot
 */
public class AuditWithIdAndRoot   {
  private String customerOfferReference = null;

  private String customerOfferComplianceTaskReference = null;

  private String guidelineComplianceCheckType = null;

  private String guidelineComplianceCheckRequirement = null;

  private String guidelineComplianceCheckSubmission = null;

  private String guidelineComplianceAdjustmentRequirement = null;

  private String guidelineComplianceCheckAssessment = null;


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
   * `status: Provisionally Registered` bian-reference: CustomerOffer.Audit.GuidelineComplianceCheck(as Assessment).AssessmentTemplate 
   * @return guidelineComplianceCheckType
  **/

  public String getGuidelineComplianceCheckType() {
    return guidelineComplianceCheckType;
  }

  public void setGuidelineComplianceCheckType(String guidelineComplianceCheckType) {
    this.guidelineComplianceCheckType = guidelineComplianceCheckType;
  }


  /**
   * `status: Provisionally Registered`  bian-reference: CustomerOffer.Audit.GuidelineComplianceCheck.CheckedGuideline(as GovernanceRule).SubmissionRequirement             general-info : submission requirements    
   * @return guidelineComplianceCheckRequirement
  **/

  public String getGuidelineComplianceCheckRequirement() {
    return guidelineComplianceCheckRequirement;
  }

  public void setGuidelineComplianceCheckRequirement(String guidelineComplianceCheckRequirement) {
    this.guidelineComplianceCheckRequirement = guidelineComplianceCheckRequirement;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerOffer.Audit.GuidelineComplianceCheck(as Assessment).SupportingDocument general-info : submission materials 
   * @return guidelineComplianceCheckSubmission
  **/

  public String getGuidelineComplianceCheckSubmission() {
    return guidelineComplianceCheckSubmission;
  }

  public void setGuidelineComplianceCheckSubmission(String guidelineComplianceCheckSubmission) {
    this.guidelineComplianceCheckSubmission = guidelineComplianceCheckSubmission;
  }


  /**
   * `status: Provisionally Registered`  bian-reference: CustomerOffer.Audit.GuidelineComplianceCheck(as Assessment).RequiredAdjustment general-info : change needed to comply 
   * @return guidelineComplianceAdjustmentRequirement
  **/

  public String getGuidelineComplianceAdjustmentRequirement() {
    return guidelineComplianceAdjustmentRequirement;
  }

  public void setGuidelineComplianceAdjustmentRequirement(String guidelineComplianceAdjustmentRequirement) {
    this.guidelineComplianceAdjustmentRequirement = guidelineComplianceAdjustmentRequirement;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerOffer.Audit.GuidelineComplianceCheck general-info : compliance assessment result 
   * @return guidelineComplianceCheckAssessment
  **/

  public String getGuidelineComplianceCheckAssessment() {
    return guidelineComplianceCheckAssessment;
  }

  public void setGuidelineComplianceCheckAssessment(String guidelineComplianceCheckAssessment) {
    this.guidelineComplianceCheckAssessment = guidelineComplianceCheckAssessment;
  }


}

