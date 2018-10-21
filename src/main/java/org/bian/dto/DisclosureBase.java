package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * DisclosureBase
 */
public class DisclosureBase   {
  private String disclosureType = null;

  private String disclosureTextDescription = null;

  private String customerAcceptanceIndicator = null;

  private String documentReference = null;


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9ju10HltEeG7BsjMvd1mEw_-739610260/elements/_9j4m0HltEeG7BsjMvd1mEw_-611051048) bian-reference: CustomerOffer.OfferedAgreement.Disclosure(as Undertaking).Type general-info: Disclosure Type 
   * @return disclosureType
  **/

  public String getDisclosureType() {
    return disclosureType;
  }

  public void setDisclosureType(String disclosureType) {
    this.disclosureType = disclosureType;
  }


  /**
   * `status: Registered'  iso-link: [click here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9ju10HltEeG7BsjMvd1mEw_-739610260/elements/_9j4m0XltEeG7BsjMvd1mEw_369279782)  bian-reference: CustomerOffer.OfferedAgreement.Disclosure(as Undertaking).Purpose  general-info: Disclosure Text/Description (for customer review)   
   * @return disclosureTextDescription
  **/

  public String getDisclosureTextDescription() {
    return disclosureTextDescription;
  }

  public void setDisclosureTextDescription(String disclosureTextDescription) {
    this.disclosureTextDescription = disclosureTextDescription;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9ju10HltEeG7BsjMvd1mEw_-739610260/elements/_9j4m03ltEeG7BsjMvd1mEw_-1318630222) bian-reference: CustomerOffer.OfferedAgreement.Disclosure(as Undertaking).ConfirmationIndicator general-info: Confirmation Indicator 
   * @return customerAcceptanceIndicator
  **/

  public String getCustomerAcceptanceIndicator() {
    return customerAcceptanceIndicator;
  }

  public void setCustomerAcceptanceIndicator(String customerAcceptanceIndicator) {
    this.customerAcceptanceIndicator = customerAcceptanceIndicator;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9ju10HltEeG7BsjMvd1mEw_-739610260/elements/_9kx-tHltEeG7BsjMvd1mEw_2137767733) bian-reference: CustomerOffer.OfferedAgreement.Disclosure (as Undertaking).SpecifiedDocument general-info: Customer signature/acceptance record 
   * @return documentReference
  **/

  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }


}

