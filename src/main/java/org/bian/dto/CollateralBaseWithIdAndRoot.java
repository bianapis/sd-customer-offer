package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CollateralBaseWithIdAndRoot
 */
public class CollateralBaseWithIdAndRoot   {
  private String customerOfferReference = null;

  private String customerOfferCollateralTaskReference = null;

  private String collateralRequirement = null;

  private String collateralEarmarkReference = null;

  private String collateralAllocationReference = null;

  private String collateralAssetReference = null;


  /**
   * `status: Provisionally Registered`   bian-reference: CustomerOffer    
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
   * @return customerOfferCollateralTaskReference
  **/

  public String getCustomerOfferCollateralTaskReference() {
    return customerOfferCollateralTaskReference;
  }

  public void setCustomerOfferCollateralTaskReference(String customerOfferCollateralTaskReference) {
    this.customerOfferCollateralTaskReference = customerOfferCollateralTaskReference;
  }


  /**
   * `status: Registered` bian-reference : CustomerOffer.OfferedAgreement(as MasterAgreement).GovernedContract(as CollateralAgreement).Collateral.CollateralAmount iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FLlGEcTGEeChad0JzLk7QA_1826831344/elements/_FLlGE8TGEeChad0JzLk7QA_-1191802314) general-info: Collateral Amount 
   * @return collateralRequirement
  **/

  public String getCollateralRequirement() {
    return collateralRequirement;
  }

  public void setCollateralRequirement(String collateralRequirement) {
    this.collateralRequirement = collateralRequirement;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E6vNtsTGEeChad0JzLk7QA_393174175/elements/_lrcFQC1hEeGp2Zpvgj9Dtw_-638405304) general-info: Earmarked Collateral bian-reference : CustomerOffer.OfferedAgreement(as MasterAgreement).GovernedContract(as CollateralAgreement).Collateral 
   * @return collateralEarmarkReference
  **/

  public String getCollateralEarmarkReference() {
    return collateralEarmarkReference;
  }

  public void setCollateralEarmarkReference(String collateralEarmarkReference) {
    this.collateralEarmarkReference = collateralEarmarkReference;
  }


  /**
   * `status: Registered`  bian-reference : CustomerOffer.OfferedAgreement(as MasterAgreement).GovernedContract(as Collateral Agreement).Collateral.AssetHolding.Asset iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E6vNtsTGEeChad0JzLk7QA_393174175/elements/_lrcFQC1hEeGp2Zpvgj9Dtw_-638405304) general-info: pointer to collateralized item 
   * @return collateralAllocationReference
  **/

  public String getCollateralAllocationReference() {
    return collateralAllocationReference;
  }

  public void setCollateralAllocationReference(String collateralAllocationReference) {
    this.collateralAllocationReference = collateralAllocationReference;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5111cTGEeChad0JzLk7QA_-802839934/elements/_E5_m0MTGEeChad0JzLk7QA_-670722578) general-info: allocated collateral - at closure 
   * @return collateralAssetReference
  **/

  public String getCollateralAssetReference() {
    return collateralAssetReference;
  }

  public void setCollateralAssetReference(String collateralAssetReference) {
    this.collateralAssetReference = collateralAssetReference;
  }


}

