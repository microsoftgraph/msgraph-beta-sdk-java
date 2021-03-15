// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Company;
import com.microsoft.graph.requests.AccountCollectionRequestBuilder;
import com.microsoft.graph.requests.AccountRequestBuilder;
import com.microsoft.graph.requests.AgedAccountsPayableCollectionRequestBuilder;
import com.microsoft.graph.requests.AgedAccountsPayableRequestBuilder;
import com.microsoft.graph.requests.AgedAccountsReceivableCollectionRequestBuilder;
import com.microsoft.graph.requests.AgedAccountsReceivableRequestBuilder;
import com.microsoft.graph.requests.CompanyInformationCollectionRequestBuilder;
import com.microsoft.graph.requests.CompanyInformationRequestBuilder;
import com.microsoft.graph.requests.CountryRegionCollectionRequestBuilder;
import com.microsoft.graph.requests.CountryRegionRequestBuilder;
import com.microsoft.graph.requests.CurrencyCollectionRequestBuilder;
import com.microsoft.graph.requests.CurrencyRequestBuilder;
import com.microsoft.graph.requests.CustomerPaymentJournalCollectionRequestBuilder;
import com.microsoft.graph.requests.CustomerPaymentJournalRequestBuilder;
import com.microsoft.graph.requests.CustomerPaymentCollectionRequestBuilder;
import com.microsoft.graph.requests.CustomerPaymentRequestBuilder;
import com.microsoft.graph.requests.CustomerCollectionRequestBuilder;
import com.microsoft.graph.requests.CustomerRequestBuilder;
import com.microsoft.graph.requests.DimensionCollectionRequestBuilder;
import com.microsoft.graph.requests.DimensionRequestBuilder;
import com.microsoft.graph.requests.DimensionValueCollectionRequestBuilder;
import com.microsoft.graph.requests.DimensionValueRequestBuilder;
import com.microsoft.graph.requests.EmployeeCollectionRequestBuilder;
import com.microsoft.graph.requests.EmployeeRequestBuilder;
import com.microsoft.graph.requests.GeneralLedgerEntryCollectionRequestBuilder;
import com.microsoft.graph.requests.GeneralLedgerEntryRequestBuilder;
import com.microsoft.graph.requests.ItemCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.ItemCategoryRequestBuilder;
import com.microsoft.graph.requests.ItemCollectionRequestBuilder;
import com.microsoft.graph.requests.ItemRequestBuilder;
import com.microsoft.graph.requests.JournalLineCollectionRequestBuilder;
import com.microsoft.graph.requests.JournalLineRequestBuilder;
import com.microsoft.graph.requests.JournalCollectionRequestBuilder;
import com.microsoft.graph.requests.JournalRequestBuilder;
import com.microsoft.graph.requests.PaymentMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.PaymentMethodRequestBuilder;
import com.microsoft.graph.requests.PaymentTermCollectionRequestBuilder;
import com.microsoft.graph.requests.PaymentTermRequestBuilder;
import com.microsoft.graph.requests.PictureCollectionRequestBuilder;
import com.microsoft.graph.requests.PictureRequestBuilder;
import com.microsoft.graph.requests.PurchaseInvoiceLineCollectionRequestBuilder;
import com.microsoft.graph.requests.PurchaseInvoiceLineRequestBuilder;
import com.microsoft.graph.requests.PurchaseInvoiceCollectionRequestBuilder;
import com.microsoft.graph.requests.PurchaseInvoiceRequestBuilder;
import com.microsoft.graph.requests.SalesCreditMemoLineCollectionRequestBuilder;
import com.microsoft.graph.requests.SalesCreditMemoLineRequestBuilder;
import com.microsoft.graph.requests.SalesCreditMemoCollectionRequestBuilder;
import com.microsoft.graph.requests.SalesCreditMemoRequestBuilder;
import com.microsoft.graph.requests.SalesInvoiceLineCollectionRequestBuilder;
import com.microsoft.graph.requests.SalesInvoiceLineRequestBuilder;
import com.microsoft.graph.requests.SalesInvoiceCollectionRequestBuilder;
import com.microsoft.graph.requests.SalesInvoiceRequestBuilder;
import com.microsoft.graph.requests.SalesOrderLineCollectionRequestBuilder;
import com.microsoft.graph.requests.SalesOrderLineRequestBuilder;
import com.microsoft.graph.requests.SalesOrderCollectionRequestBuilder;
import com.microsoft.graph.requests.SalesOrderRequestBuilder;
import com.microsoft.graph.requests.SalesQuoteLineCollectionRequestBuilder;
import com.microsoft.graph.requests.SalesQuoteLineRequestBuilder;
import com.microsoft.graph.requests.SalesQuoteCollectionRequestBuilder;
import com.microsoft.graph.requests.SalesQuoteRequestBuilder;
import com.microsoft.graph.requests.ShipmentMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.ShipmentMethodRequestBuilder;
import com.microsoft.graph.requests.TaxAreaCollectionRequestBuilder;
import com.microsoft.graph.requests.TaxAreaRequestBuilder;
import com.microsoft.graph.requests.TaxGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.TaxGroupRequestBuilder;
import com.microsoft.graph.requests.UnitOfMeasureCollectionRequestBuilder;
import com.microsoft.graph.requests.UnitOfMeasureRequestBuilder;
import com.microsoft.graph.requests.VendorCollectionRequestBuilder;
import com.microsoft.graph.requests.VendorRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Company Request Builder.
 */
public class CompanyRequestBuilder extends BaseRequestBuilder<Company> {

    /**
     * The request builder for the Company
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CompanyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the CompanyRequest instance
     */
    @Nonnull
    public CompanyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the CompanyRequest instance
     */
    @Nonnull
    public CompanyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.CompanyRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the Account collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AccountCollectionRequestBuilder accounts() {
        return new AccountCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("accounts"), getClient(), null);
    }

    /**
     * Gets a request builder for the Account item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AccountRequestBuilder accounts(@Nonnull final String id) {
        return new AccountRequestBuilder(getRequestUrlWithAdditionalSegment("accounts") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the AgedAccountsPayable collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AgedAccountsPayableCollectionRequestBuilder agedAccountsPayable() {
        return new AgedAccountsPayableCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("agedAccountsPayable"), getClient(), null);
    }

    /**
     * Gets a request builder for the AgedAccountsPayable item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AgedAccountsPayableRequestBuilder agedAccountsPayable(@Nonnull final String id) {
        return new AgedAccountsPayableRequestBuilder(getRequestUrlWithAdditionalSegment("agedAccountsPayable") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the AgedAccountsReceivable collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AgedAccountsReceivableCollectionRequestBuilder agedAccountsReceivable() {
        return new AgedAccountsReceivableCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("agedAccountsReceivable"), getClient(), null);
    }

    /**
     * Gets a request builder for the AgedAccountsReceivable item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AgedAccountsReceivableRequestBuilder agedAccountsReceivable(@Nonnull final String id) {
        return new AgedAccountsReceivableRequestBuilder(getRequestUrlWithAdditionalSegment("agedAccountsReceivable") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the CompanyInformation collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CompanyInformationCollectionRequestBuilder companyInformation() {
        return new CompanyInformationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("companyInformation"), getClient(), null);
    }

    /**
     * Gets a request builder for the CompanyInformation item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CompanyInformationRequestBuilder companyInformation(@Nonnull final String id) {
        return new CompanyInformationRequestBuilder(getRequestUrlWithAdditionalSegment("companyInformation") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the CountryRegion collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CountryRegionCollectionRequestBuilder countriesRegions() {
        return new CountryRegionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("countriesRegions"), getClient(), null);
    }

    /**
     * Gets a request builder for the CountryRegion item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CountryRegionRequestBuilder countriesRegions(@Nonnull final String id) {
        return new CountryRegionRequestBuilder(getRequestUrlWithAdditionalSegment("countriesRegions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Currency collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CurrencyCollectionRequestBuilder currencies() {
        return new CurrencyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("currencies"), getClient(), null);
    }

    /**
     * Gets a request builder for the Currency item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CurrencyRequestBuilder currencies(@Nonnull final String id) {
        return new CurrencyRequestBuilder(getRequestUrlWithAdditionalSegment("currencies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the CustomerPaymentJournal collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CustomerPaymentJournalCollectionRequestBuilder customerPaymentJournals() {
        return new CustomerPaymentJournalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("customerPaymentJournals"), getClient(), null);
    }

    /**
     * Gets a request builder for the CustomerPaymentJournal item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CustomerPaymentJournalRequestBuilder customerPaymentJournals(@Nonnull final String id) {
        return new CustomerPaymentJournalRequestBuilder(getRequestUrlWithAdditionalSegment("customerPaymentJournals") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the CustomerPayment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CustomerPaymentCollectionRequestBuilder customerPayments() {
        return new CustomerPaymentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("customerPayments"), getClient(), null);
    }

    /**
     * Gets a request builder for the CustomerPayment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CustomerPaymentRequestBuilder customerPayments(@Nonnull final String id) {
        return new CustomerPaymentRequestBuilder(getRequestUrlWithAdditionalSegment("customerPayments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Customer collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CustomerCollectionRequestBuilder customers() {
        return new CustomerCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("customers"), getClient(), null);
    }

    /**
     * Gets a request builder for the Customer item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CustomerRequestBuilder customers(@Nonnull final String id) {
        return new CustomerRequestBuilder(getRequestUrlWithAdditionalSegment("customers") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Dimension collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DimensionCollectionRequestBuilder dimensions() {
        return new DimensionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("dimensions"), getClient(), null);
    }

    /**
     * Gets a request builder for the Dimension item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DimensionRequestBuilder dimensions(@Nonnull final String id) {
        return new DimensionRequestBuilder(getRequestUrlWithAdditionalSegment("dimensions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DimensionValue collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DimensionValueCollectionRequestBuilder dimensionValues() {
        return new DimensionValueCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("dimensionValues"), getClient(), null);
    }

    /**
     * Gets a request builder for the DimensionValue item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DimensionValueRequestBuilder dimensionValues(@Nonnull final String id) {
        return new DimensionValueRequestBuilder(getRequestUrlWithAdditionalSegment("dimensionValues") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Employee collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public EmployeeCollectionRequestBuilder employees() {
        return new EmployeeCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("employees"), getClient(), null);
    }

    /**
     * Gets a request builder for the Employee item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public EmployeeRequestBuilder employees(@Nonnull final String id) {
        return new EmployeeRequestBuilder(getRequestUrlWithAdditionalSegment("employees") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the GeneralLedgerEntry collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public GeneralLedgerEntryCollectionRequestBuilder generalLedgerEntries() {
        return new GeneralLedgerEntryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("generalLedgerEntries"), getClient(), null);
    }

    /**
     * Gets a request builder for the GeneralLedgerEntry item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public GeneralLedgerEntryRequestBuilder generalLedgerEntries(@Nonnull final String id) {
        return new GeneralLedgerEntryRequestBuilder(getRequestUrlWithAdditionalSegment("generalLedgerEntries") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ItemCategory collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ItemCategoryCollectionRequestBuilder itemCategories() {
        return new ItemCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("itemCategories"), getClient(), null);
    }

    /**
     * Gets a request builder for the ItemCategory item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ItemCategoryRequestBuilder itemCategories(@Nonnull final String id) {
        return new ItemCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("itemCategories") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Item collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ItemCollectionRequestBuilder items() {
        return new ItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("items"), getClient(), null);
    }

    /**
     * Gets a request builder for the Item item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ItemRequestBuilder items(@Nonnull final String id) {
        return new ItemRequestBuilder(getRequestUrlWithAdditionalSegment("items") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the JournalLine collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public JournalLineCollectionRequestBuilder journalLines() {
        return new JournalLineCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("journalLines"), getClient(), null);
    }

    /**
     * Gets a request builder for the JournalLine item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public JournalLineRequestBuilder journalLines(@Nonnull final String id) {
        return new JournalLineRequestBuilder(getRequestUrlWithAdditionalSegment("journalLines") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Journal collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public JournalCollectionRequestBuilder journals() {
        return new JournalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("journals"), getClient(), null);
    }

    /**
     * Gets a request builder for the Journal item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public JournalRequestBuilder journals(@Nonnull final String id) {
        return new JournalRequestBuilder(getRequestUrlWithAdditionalSegment("journals") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PaymentMethod collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PaymentMethodCollectionRequestBuilder paymentMethods() {
        return new PaymentMethodCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("paymentMethods"), getClient(), null);
    }

    /**
     * Gets a request builder for the PaymentMethod item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PaymentMethodRequestBuilder paymentMethods(@Nonnull final String id) {
        return new PaymentMethodRequestBuilder(getRequestUrlWithAdditionalSegment("paymentMethods") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PaymentTerm collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PaymentTermCollectionRequestBuilder paymentTerms() {
        return new PaymentTermCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("paymentTerms"), getClient(), null);
    }

    /**
     * Gets a request builder for the PaymentTerm item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PaymentTermRequestBuilder paymentTerms(@Nonnull final String id) {
        return new PaymentTermRequestBuilder(getRequestUrlWithAdditionalSegment("paymentTerms") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Picture collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PictureCollectionRequestBuilder picture() {
        return new PictureCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("picture"), getClient(), null);
    }

    /**
     * Gets a request builder for the Picture item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PictureRequestBuilder picture(@Nonnull final String id) {
        return new PictureRequestBuilder(getRequestUrlWithAdditionalSegment("picture") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PurchaseInvoiceLine collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PurchaseInvoiceLineCollectionRequestBuilder purchaseInvoiceLines() {
        return new PurchaseInvoiceLineCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("purchaseInvoiceLines"), getClient(), null);
    }

    /**
     * Gets a request builder for the PurchaseInvoiceLine item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PurchaseInvoiceLineRequestBuilder purchaseInvoiceLines(@Nonnull final String id) {
        return new PurchaseInvoiceLineRequestBuilder(getRequestUrlWithAdditionalSegment("purchaseInvoiceLines") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PurchaseInvoice collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PurchaseInvoiceCollectionRequestBuilder purchaseInvoices() {
        return new PurchaseInvoiceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("purchaseInvoices"), getClient(), null);
    }

    /**
     * Gets a request builder for the PurchaseInvoice item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PurchaseInvoiceRequestBuilder purchaseInvoices(@Nonnull final String id) {
        return new PurchaseInvoiceRequestBuilder(getRequestUrlWithAdditionalSegment("purchaseInvoices") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SalesCreditMemoLine collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SalesCreditMemoLineCollectionRequestBuilder salesCreditMemoLines() {
        return new SalesCreditMemoLineCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("salesCreditMemoLines"), getClient(), null);
    }

    /**
     * Gets a request builder for the SalesCreditMemoLine item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SalesCreditMemoLineRequestBuilder salesCreditMemoLines(@Nonnull final String id) {
        return new SalesCreditMemoLineRequestBuilder(getRequestUrlWithAdditionalSegment("salesCreditMemoLines") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SalesCreditMemo collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SalesCreditMemoCollectionRequestBuilder salesCreditMemos() {
        return new SalesCreditMemoCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("salesCreditMemos"), getClient(), null);
    }

    /**
     * Gets a request builder for the SalesCreditMemo item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SalesCreditMemoRequestBuilder salesCreditMemos(@Nonnull final String id) {
        return new SalesCreditMemoRequestBuilder(getRequestUrlWithAdditionalSegment("salesCreditMemos") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SalesInvoiceLine collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SalesInvoiceLineCollectionRequestBuilder salesInvoiceLines() {
        return new SalesInvoiceLineCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("salesInvoiceLines"), getClient(), null);
    }

    /**
     * Gets a request builder for the SalesInvoiceLine item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SalesInvoiceLineRequestBuilder salesInvoiceLines(@Nonnull final String id) {
        return new SalesInvoiceLineRequestBuilder(getRequestUrlWithAdditionalSegment("salesInvoiceLines") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SalesInvoice collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SalesInvoiceCollectionRequestBuilder salesInvoices() {
        return new SalesInvoiceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("salesInvoices"), getClient(), null);
    }

    /**
     * Gets a request builder for the SalesInvoice item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SalesInvoiceRequestBuilder salesInvoices(@Nonnull final String id) {
        return new SalesInvoiceRequestBuilder(getRequestUrlWithAdditionalSegment("salesInvoices") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SalesOrderLine collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SalesOrderLineCollectionRequestBuilder salesOrderLines() {
        return new SalesOrderLineCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("salesOrderLines"), getClient(), null);
    }

    /**
     * Gets a request builder for the SalesOrderLine item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SalesOrderLineRequestBuilder salesOrderLines(@Nonnull final String id) {
        return new SalesOrderLineRequestBuilder(getRequestUrlWithAdditionalSegment("salesOrderLines") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SalesOrder collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SalesOrderCollectionRequestBuilder salesOrders() {
        return new SalesOrderCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("salesOrders"), getClient(), null);
    }

    /**
     * Gets a request builder for the SalesOrder item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SalesOrderRequestBuilder salesOrders(@Nonnull final String id) {
        return new SalesOrderRequestBuilder(getRequestUrlWithAdditionalSegment("salesOrders") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SalesQuoteLine collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SalesQuoteLineCollectionRequestBuilder salesQuoteLines() {
        return new SalesQuoteLineCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("salesQuoteLines"), getClient(), null);
    }

    /**
     * Gets a request builder for the SalesQuoteLine item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SalesQuoteLineRequestBuilder salesQuoteLines(@Nonnull final String id) {
        return new SalesQuoteLineRequestBuilder(getRequestUrlWithAdditionalSegment("salesQuoteLines") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SalesQuote collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SalesQuoteCollectionRequestBuilder salesQuotes() {
        return new SalesQuoteCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("salesQuotes"), getClient(), null);
    }

    /**
     * Gets a request builder for the SalesQuote item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SalesQuoteRequestBuilder salesQuotes(@Nonnull final String id) {
        return new SalesQuoteRequestBuilder(getRequestUrlWithAdditionalSegment("salesQuotes") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ShipmentMethod collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ShipmentMethodCollectionRequestBuilder shipmentMethods() {
        return new ShipmentMethodCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("shipmentMethods"), getClient(), null);
    }

    /**
     * Gets a request builder for the ShipmentMethod item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ShipmentMethodRequestBuilder shipmentMethods(@Nonnull final String id) {
        return new ShipmentMethodRequestBuilder(getRequestUrlWithAdditionalSegment("shipmentMethods") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the TaxArea collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TaxAreaCollectionRequestBuilder taxAreas() {
        return new TaxAreaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("taxAreas"), getClient(), null);
    }

    /**
     * Gets a request builder for the TaxArea item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TaxAreaRequestBuilder taxAreas(@Nonnull final String id) {
        return new TaxAreaRequestBuilder(getRequestUrlWithAdditionalSegment("taxAreas") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the TaxGroup collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TaxGroupCollectionRequestBuilder taxGroups() {
        return new TaxGroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("taxGroups"), getClient(), null);
    }

    /**
     * Gets a request builder for the TaxGroup item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TaxGroupRequestBuilder taxGroups(@Nonnull final String id) {
        return new TaxGroupRequestBuilder(getRequestUrlWithAdditionalSegment("taxGroups") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the UnitOfMeasure collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UnitOfMeasureCollectionRequestBuilder unitsOfMeasure() {
        return new UnitOfMeasureCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("unitsOfMeasure"), getClient(), null);
    }

    /**
     * Gets a request builder for the UnitOfMeasure item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UnitOfMeasureRequestBuilder unitsOfMeasure(@Nonnull final String id) {
        return new UnitOfMeasureRequestBuilder(getRequestUrlWithAdditionalSegment("unitsOfMeasure") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Vendor collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public VendorCollectionRequestBuilder vendors() {
        return new VendorCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("vendors"), getClient(), null);
    }

    /**
     * Gets a request builder for the Vendor item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public VendorRequestBuilder vendors(@Nonnull final String id) {
        return new VendorRequestBuilder(getRequestUrlWithAdditionalSegment("vendors") + "/" + id, getClient(), null);
    }
}
