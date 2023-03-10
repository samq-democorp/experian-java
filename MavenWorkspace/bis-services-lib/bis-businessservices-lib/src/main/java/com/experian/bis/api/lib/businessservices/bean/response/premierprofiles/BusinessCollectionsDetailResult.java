package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class BusinessCollectionsDetailResult {
	
	private String accountStatus;
	private String datePlacedForCollection;
	private String dateClosed;
	private String amountPlacedForCollection;
	private long amountPaid;
	private CollectionAgencyInfoResult collectionAgencyInfo;
	private ClientOfCollectionAgency clientOfCollectionAgency;
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public String getDatePlacedForCollection() {
		return datePlacedForCollection;
	}
	public void setDatePlacedForCollection(String datePlacedForCollection) {
		this.datePlacedForCollection = datePlacedForCollection;
	}
	public String getDateClosed() {
		return dateClosed;
	}
	public void setDateClosed(String dateClosed) {
		this.dateClosed = dateClosed;
	}
	public String getAmountPlacedForCollection() {
		return amountPlacedForCollection;
	}
	public void setAmountPlacedForCollection(String amountPlacedForCollection) {
		this.amountPlacedForCollection = amountPlacedForCollection;
	}
	public long getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(long amountPaid) {
		this.amountPaid = amountPaid;
	}
	public CollectionAgencyInfoResult getCollectionAgencyInfo() {
		return collectionAgencyInfo;
	}
	public void setCollectionAgencyInfo(CollectionAgencyInfoResult collectionAgencyInfo) {
		this.collectionAgencyInfo = collectionAgencyInfo;
	}
	public ClientOfCollectionAgency getClientOfCollectionAgency() {
		return clientOfCollectionAgency;
	}
	public void setClientOfCollectionAgency(ClientOfCollectionAgency clientOfCollectionAgency) {
		this.clientOfCollectionAgency = clientOfCollectionAgency;
	}
	

}
