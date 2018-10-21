/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerOfferApiServiceImpl implements CustomerOfferApiService {

	public OfferBaseWithId executePost(OfferBase request){
		return JsonReader.read("executePost-OfferBaseWithId.json",new TypeReference<OfferBaseWithId>(){});
	}
	
	public DocumentationBaseWithIdAndRoot executePostDocumentations(String crReferenceId, DocumentationBase request){
		return JsonReader.read("executePost-DocumentationBaseWithIdAndRoot.json",new TypeReference<DocumentationBaseWithIdAndRoot>(){});
	}
	
	public DocumentationBaseWithIdAndRoot executePutDocumentations(String crReferenceId, String bqReferenceId, DocumentationBase request){
		return JsonReader.read("executePut-DocumentationBaseWithIdAndRoot.json",new TypeReference<DocumentationBaseWithIdAndRoot>(){});
	}
	
	public CustomerBaseWithIdAndRoot executePostCustomers(String crReferenceId, CustomerBase request){
		return JsonReader.read("executePost-CustomerBaseWithIdAndRoot.json",new TypeReference<CustomerBaseWithIdAndRoot>(){});
	}
	
	public CustomerBaseWithIdAndRoot executePutCustomers(String crReferenceId, String bqReferenceId, CustomerBase request){
		return JsonReader.read("executePut-CustomerBaseWithIdAndRoot.json",new TypeReference<CustomerBaseWithIdAndRoot>(){});
	}
	
	public OfferBaseWithId executePut(String crReferenceId, OfferBase request){
		return JsonReader.read("executePut-OfferBaseWithId.json",new TypeReference<OfferBaseWithId>(){});
	}
	
	public CustomerOfferRecordResponse record(String crReferenceId, CustomerOfferRecordRequest request){
		return JsonReader.read("record-CustomerOfferRecordResponse.json",new TypeReference<CustomerOfferRecordResponse>(){});
	}
	
	public OfferBaseWithId requestPost(OfferBase request){
		return JsonReader.read("requestPost-OfferBaseWithId.json",new TypeReference<OfferBaseWithId>(){});
	}
	
	public DisclosureBaseWithIdAndRoot requestPostDisclosures(String crReferenceId, DisclosureBase request){
		return JsonReader.read("requestPost-DisclosureBaseWithIdAndRoot.json",new TypeReference<DisclosureBaseWithIdAndRoot>(){});
	}
	
	public DisclosureBaseWithIdAndRoot requestPutDisclosures(String crReferenceId, String bqReferenceId, DisclosureBase request){
		return JsonReader.read("requestPut-DisclosureBaseWithIdAndRoot.json",new TypeReference<DisclosureBaseWithIdAndRoot>(){});
	}
	
	public PricingBaseWithIdAndRoot requestPostPricings(String crReferenceId, PricingBase request){
		return JsonReader.read("requestPost-PricingBaseWithIdAndRoot.json",new TypeReference<PricingBaseWithIdAndRoot>(){});
	}
	
	public PricingBaseWithIdAndRoot requestPutPricings(String crReferenceId, PricingBase request){
		return JsonReader.read("requestPut-PricingBaseWithIdAndRoot.json",new TypeReference<PricingBaseWithIdAndRoot>(){});
	}
	
	public ProductBaseWithIdAndRoot requestPostProducts(String crReferenceId, ProductBase request){
		return JsonReader.read("requestPost-ProductBaseWithIdAndRoot.json",new TypeReference<ProductBaseWithIdAndRoot>(){});
	}
	
	public ProductBaseWithIdAndRoot requestPutProducts(String crReferenceId, String bqReferenceId, ProductBase request){
		return JsonReader.read("requestPut-ProductBaseWithIdAndRoot.json",new TypeReference<ProductBaseWithIdAndRoot>(){});
	}
	
	public OfferBaseWithId requestPut(String crReferenceId, OfferBase request){
		return JsonReader.read("requestPut-OfferBaseWithId.json",new TypeReference<OfferBaseWithId>(){});
	}
	
	public OfferBaseWithId retrieve(String crReferenceId){
		return JsonReader.read("retrieve-OfferBaseWithId.json",new TypeReference<OfferBaseWithId>(){});
	}
	
	public AgreementBaseWithIdAndRoot retrieveAgreements(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-AgreementBaseWithIdAndRoot.json",new TypeReference<AgreementBaseWithIdAndRoot>(){});
	}
	
	public AuditWithIdAndRoot retrieveAudits(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-AuditWithIdAndRoot.json",new TypeReference<AuditWithIdAndRoot>(){});
	}
	
	public BookingBaseWithIdAndRoot retrieveBookings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BookingBaseWithIdAndRoot.json",new TypeReference<BookingBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public ClosingWithIdAndRoot retrieveClosings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ClosingWithIdAndRoot.json",new TypeReference<ClosingWithIdAndRoot>(){});
	}
	
	public CollateralBaseWithIdAndRoot retrieveCollaterals(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CollateralBaseWithIdAndRoot.json",new TypeReference<CollateralBaseWithIdAndRoot>(){});
	}
	
	public ComplianceBaseWithIdAndRoot retrieveCompliances(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ComplianceBaseWithIdAndRoot.json",new TypeReference<ComplianceBaseWithIdAndRoot>(){});
	}
	
	public CorrespondenceBaseWithIdAndRoot retrieveCorrespondences(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CorrespondenceBaseWithIdAndRoot.json",new TypeReference<CorrespondenceBaseWithIdAndRoot>(){});
	}
	
	public CreditBaseWithIdAndRoot retrieveCredits(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CreditBaseWithIdAndRoot.json",new TypeReference<CreditBaseWithIdAndRoot>(){});
	}
	
	public CustomerBaseWithIdAndRoot retrieveCustomers(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerBaseWithIdAndRoot.json",new TypeReference<CustomerBaseWithIdAndRoot>(){});
	}
	
	public DisclosureBaseWithIdAndRoot retrieveDisclosures(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DisclosureBaseWithIdAndRoot.json",new TypeReference<DisclosureBaseWithIdAndRoot>(){});
	}
	
	public DocumentationBaseWithIdAndRoot retrieveDocumentations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DocumentationBaseWithIdAndRoot.json",new TypeReference<DocumentationBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public PricingBaseWithIdAndRoot retrievePricings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PricingBaseWithIdAndRoot.json",new TypeReference<PricingBaseWithIdAndRoot>(){});
	}
	
	public ProductBaseWithIdAndRoot retrieveProducts(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ProductBaseWithIdAndRoot.json",new TypeReference<ProductBaseWithIdAndRoot>(){});
	}
	
	public UnderwritingWithIdAndRoot retrieveUnderwritings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-UnderwritingWithIdAndRoot.json",new TypeReference<UnderwritingWithIdAndRoot>(){});
	}
	
	public OfferBaseWithId update(String crReferenceId, OfferBase request){
		return JsonReader.read("update-OfferBaseWithId.json",new TypeReference<OfferBaseWithId>(){});
	}
	
}
