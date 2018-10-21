package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * DocumentationBaseWithIdAndRoot
 */
public class DocumentationBaseWithIdAndRoot   {
  private String customerOfferReference = null;

  private String customerOfferDocumentationTaskReference = null;

  private String documentReference = null;

  private String documentLocation = null;

  private String documentContent = null;

  private String documentStatus = null;


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
   * @return customerOfferDocumentationTaskReference
  **/

  public String getCustomerOfferDocumentationTaskReference() {
    return customerOfferDocumentationTaskReference;
  }

  public void setCustomerOfferDocumentationTaskReference(String customerOfferDocumentationTaskReference) {
    this.customerOfferDocumentationTaskReference = customerOfferDocumentationTaskReference;
  }


  /**
   * `status: Registered`   bian-reference: CustomerOffer.OfferedAgreement.Document    iso-link1: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E2tpUMTGEeChad0JzLk7QA_1799405832/elements/_K5uxMMRaEeGGj8mSL0xBEQ_-912494530)    bian-reference: CustomerOffer.OfferedAgreement(as MasterAgreement).GovernedContract.Document     iso-link2: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E2tpUMTGEeChad0JzLk7QA_1799405832/elements/_K5uxMMRaEeGGj8mSL0xBEQ_-912494530)    general-info: Document Reference (offer related documents)     
   * @return documentReference
  **/

  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info : physical master version and copies 
   * @return documentLocation
  **/

  public String getDocumentLocation() {
    return documentLocation;
  }

  public void setDocumentLocation(String documentLocation) {
    this.documentLocation = documentLocation;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info : any suitable format/media 
   * @return documentContent
  **/

  public String getDocumentContent() {
    return documentContent;
  }

  public void setDocumentContent(String documentContent) {
    this.documentContent = documentContent;
  }


  /**
   * `status: Registered` bian-reference : CustomerOffer.OfferedAgreement.Document.Status iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNET28TGEeChad0JzLk7QA_1924783636/elements/_FNNdwcTGEeChad0JzLk7QA_-1077516966) general-info: to track processing state/location of documents 
   * @return documentStatus
  **/

  public String getDocumentStatus() {
    return documentStatus;
  }

  public void setDocumentStatus(String documentStatus) {
    this.documentStatus = documentStatus;
  }


}

