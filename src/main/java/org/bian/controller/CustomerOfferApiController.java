/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class CustomerOfferApiController {

	@Autowired
	CustomerOfferApiService service;
	
	@Process.ExecutePost
	public BianResponse<OfferBaseWithId> executePost(@RequestBody BianRequest<OfferBase> bianRequest) {
		return BianResponse.forSuccess(service.executePost(bianRequest.getData()));
	}
	
	@BQ("documentations")
	@Process.ExecutePost
	public BianResponse<DocumentationBaseWithIdAndRoot> executePostDocumentations(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DocumentationBase> bianRequest) {
		return BianResponse.forSuccess(service.executePostDocumentations(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("documentations")
	@Process.ExecutePut
	public BianResponse<DocumentationBaseWithIdAndRoot> executePutDocumentations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<DocumentationBase> bianRequest) {
		return BianResponse.forSuccess(service.executePutDocumentations(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("customers")
	@Process.ExecutePost
	public BianResponse<CustomerBaseWithIdAndRoot> executePostCustomers(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerBase> bianRequest) {
		return BianResponse.forSuccess(service.executePostCustomers(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("customers")
	@Process.ExecutePut
	public BianResponse<CustomerBaseWithIdAndRoot> executePutCustomers(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CustomerBase> bianRequest) {
		return BianResponse.forSuccess(service.executePutCustomers(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.ExecutePut
	public BianResponse<OfferBaseWithId> executePut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<OfferBase> bianRequest) {
		return BianResponse.forSuccess(service.executePut(crReferenceId, bianRequest.getData()));
	}
	
	@Process.Record
	public BianResponse<CustomerOfferRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerOfferRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Process.RequestPost
	public BianResponse<OfferBaseWithId> requestPost(@RequestBody BianRequest<OfferBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@BQ("disclosures")
	@Process.RequestPost
	public BianResponse<DisclosureBaseWithIdAndRoot> requestPostDisclosures(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DisclosureBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostDisclosures(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("disclosures")
	@Process.RequestPut
	public BianResponse<DisclosureBaseWithIdAndRoot> requestPutDisclosures(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<DisclosureBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutDisclosures(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("pricings")
	@Process.RequestPost
	public BianResponse<PricingBaseWithIdAndRoot> requestPostPricings(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<PricingBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostPricings(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("pricings")
	@Process.RequestPut
	public BianResponse<PricingBaseWithIdAndRoot> requestPutPricings(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<PricingBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutPricings(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("products")
	@Process.RequestPost
	public BianResponse<ProductBaseWithIdAndRoot> requestPostProducts(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ProductBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostProducts(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("products")
	@Process.RequestPut
	public BianResponse<ProductBaseWithIdAndRoot> requestPutProducts(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ProductBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutProducts(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.RequestPut
	public BianResponse<OfferBaseWithId> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<OfferBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Process.Retrieve
	public BianResponse<OfferBaseWithId> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("agreements")
	@Process.Retrieve
	public BianResponse<AgreementBaseWithIdAndRoot> retrieveAgreements(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAgreements(crReferenceId, bqReferenceId));
	}
	
	@BQ("audits")
	@Process.Retrieve
	public BianResponse<AuditWithIdAndRoot> retrieveAudits(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAudits(crReferenceId, bqReferenceId));
	}
	
	@BQ("bookings")
	@Process.Retrieve
	public BianResponse<BookingBaseWithIdAndRoot> retrieveBookings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBookings(crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("closings")
	@Process.Retrieve
	public BianResponse<ClosingWithIdAndRoot> retrieveClosings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveClosings(crReferenceId, bqReferenceId));
	}
	
	@BQ("collaterals")
	@Process.Retrieve
	public BianResponse<CollateralBaseWithIdAndRoot> retrieveCollaterals(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCollaterals(crReferenceId, bqReferenceId));
	}
	
	@BQ("compliances")
	@Process.Retrieve
	public BianResponse<ComplianceBaseWithIdAndRoot> retrieveCompliances(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCompliances(crReferenceId, bqReferenceId));
	}
	
	@BQ("correspondences")
	@Process.Retrieve
	public BianResponse<CorrespondenceBaseWithIdAndRoot> retrieveCorrespondences(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCorrespondences(crReferenceId, bqReferenceId));
	}
	
	@BQ("credits")
	@Process.Retrieve
	public BianResponse<CreditBaseWithIdAndRoot> retrieveCredits(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCredits(crReferenceId, bqReferenceId));
	}
	
	@BQ("customers")
	@Process.Retrieve
	public BianResponse<CustomerBaseWithIdAndRoot> retrieveCustomers(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCustomers(crReferenceId, bqReferenceId));
	}
	
	@BQ("disclosures")
	@Process.Retrieve
	public BianResponse<DisclosureBaseWithIdAndRoot> retrieveDisclosures(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDisclosures(crReferenceId, bqReferenceId));
	}
	
	@BQ("documentations")
	@Process.Retrieve
	public BianResponse<DocumentationBaseWithIdAndRoot> retrieveDocumentations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDocumentations(crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("pricings")
	@Process.Retrieve
	public BianResponse<PricingBaseWithIdAndRoot> retrievePricings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePricings(crReferenceId, bqReferenceId));
	}
	
	@BQ("products")
	@Process.Retrieve
	public BianResponse<ProductBaseWithIdAndRoot> retrieveProducts(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProducts(crReferenceId, bqReferenceId));
	}
	
	@BQ("underwritings")
	@Process.Retrieve
	public BianResponse<UnderwritingWithIdAndRoot> retrieveUnderwritings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveUnderwritings(crReferenceId, bqReferenceId));
	}
	
	@Process.Update
	public BianResponse<OfferBaseWithId> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<OfferBase> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
