/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerOfferApiService {

	OfferBaseWithId executePost(OfferBase request);
	
	DocumentationBaseWithIdAndRoot executePostDocumentations(String crReferenceId, DocumentationBase request);
	
	DocumentationBaseWithIdAndRoot executePutDocumentations(String crReferenceId, String bqReferenceId, DocumentationBase request);
	
	CustomerBaseWithIdAndRoot executePostCustomers(String crReferenceId, CustomerBase request);
	
	CustomerBaseWithIdAndRoot executePutCustomers(String crReferenceId, String bqReferenceId, CustomerBase request);
	
	OfferBaseWithId executePut(String crReferenceId, OfferBase request);
	
	CustomerOfferRecordResponse record(String crReferenceId, CustomerOfferRecordRequest request);
	
	OfferBaseWithId requestPost(OfferBase request);
	
	DisclosureBaseWithIdAndRoot requestPostDisclosures(String crReferenceId, DisclosureBase request);
	
	DisclosureBaseWithIdAndRoot requestPutDisclosures(String crReferenceId, String bqReferenceId, DisclosureBase request);
	
	PricingBaseWithIdAndRoot requestPostPricings(String crReferenceId, PricingBase request);
	
	PricingBaseWithIdAndRoot requestPutPricings(String crReferenceId, PricingBase request);
	
	ProductBaseWithIdAndRoot requestPostProducts(String crReferenceId, ProductBase request);
	
	ProductBaseWithIdAndRoot requestPutProducts(String crReferenceId, String bqReferenceId, ProductBase request);
	
	OfferBaseWithId requestPut(String crReferenceId, OfferBase request);
	
	OfferBaseWithId retrieve(String crReferenceId);
	
	AgreementBaseWithIdAndRoot retrieveAgreements(String crReferenceId, String bqReferenceId);
	
	AuditWithIdAndRoot retrieveAudits(String crReferenceId, String bqReferenceId);
	
	BookingBaseWithIdAndRoot retrieveBookings(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	ClosingWithIdAndRoot retrieveClosings(String crReferenceId, String bqReferenceId);
	
	CollateralBaseWithIdAndRoot retrieveCollaterals(String crReferenceId, String bqReferenceId);
	
	ComplianceBaseWithIdAndRoot retrieveCompliances(String crReferenceId, String bqReferenceId);
	
	CorrespondenceBaseWithIdAndRoot retrieveCorrespondences(String crReferenceId, String bqReferenceId);
	
	CreditBaseWithIdAndRoot retrieveCredits(String crReferenceId, String bqReferenceId);
	
	CustomerBaseWithIdAndRoot retrieveCustomers(String crReferenceId, String bqReferenceId);
	
	DisclosureBaseWithIdAndRoot retrieveDisclosures(String crReferenceId, String bqReferenceId);
	
	DocumentationBaseWithIdAndRoot retrieveDocumentations(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	PricingBaseWithIdAndRoot retrievePricings(String crReferenceId, String bqReferenceId);
	
	ProductBaseWithIdAndRoot retrieveProducts(String crReferenceId, String bqReferenceId);
	
	UnderwritingWithIdAndRoot retrieveUnderwritings(String crReferenceId, String bqReferenceId);
	
	OfferBaseWithId update(String crReferenceId, OfferBase request);
	
}
