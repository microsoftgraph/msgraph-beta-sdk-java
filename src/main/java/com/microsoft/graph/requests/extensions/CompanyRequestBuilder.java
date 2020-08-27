// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Company;
import com.microsoft.graph.requests.extensions.IItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemRequestBuilder;
import com.microsoft.graph.requests.extensions.ICustomerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICustomerRequestBuilder;
import com.microsoft.graph.requests.extensions.CustomerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CustomerRequestBuilder;
import com.microsoft.graph.requests.extensions.IVendorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IVendorRequestBuilder;
import com.microsoft.graph.requests.extensions.VendorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.VendorRequestBuilder;
import com.microsoft.graph.requests.extensions.ICompanyInformationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICompanyInformationRequestBuilder;
import com.microsoft.graph.requests.extensions.CompanyInformationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CompanyInformationRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesInvoiceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesInvoiceRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesInvoiceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesInvoiceRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesInvoiceLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesInvoiceLineRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesInvoiceLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesInvoiceLineRequestBuilder;
import com.microsoft.graph.requests.extensions.ICustomerPaymentJournalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICustomerPaymentJournalRequestBuilder;
import com.microsoft.graph.requests.extensions.CustomerPaymentJournalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CustomerPaymentJournalRequestBuilder;
import com.microsoft.graph.requests.extensions.ICustomerPaymentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICustomerPaymentRequestBuilder;
import com.microsoft.graph.requests.extensions.CustomerPaymentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CustomerPaymentRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccountCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccountRequestBuilder;
import com.microsoft.graph.requests.extensions.AccountCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccountRequestBuilder;
import com.microsoft.graph.requests.extensions.ITaxGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITaxGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.TaxGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TaxGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IJournalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IJournalRequestBuilder;
import com.microsoft.graph.requests.extensions.JournalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.JournalRequestBuilder;
import com.microsoft.graph.requests.extensions.IJournalLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IJournalLineRequestBuilder;
import com.microsoft.graph.requests.extensions.JournalLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.JournalLineRequestBuilder;
import com.microsoft.graph.requests.extensions.IEmployeeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEmployeeRequestBuilder;
import com.microsoft.graph.requests.extensions.EmployeeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EmployeeRequestBuilder;
import com.microsoft.graph.requests.extensions.IGeneralLedgerEntryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGeneralLedgerEntryRequestBuilder;
import com.microsoft.graph.requests.extensions.GeneralLedgerEntryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GeneralLedgerEntryRequestBuilder;
import com.microsoft.graph.requests.extensions.ICurrencyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.CurrencyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.IPaymentMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPaymentMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.PaymentMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PaymentMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.IDimensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDimensionRequestBuilder;
import com.microsoft.graph.requests.extensions.DimensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DimensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDimensionValueCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDimensionValueRequestBuilder;
import com.microsoft.graph.requests.extensions.DimensionValueCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DimensionValueRequestBuilder;
import com.microsoft.graph.requests.extensions.IPaymentTermCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPaymentTermRequestBuilder;
import com.microsoft.graph.requests.extensions.PaymentTermCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PaymentTermRequestBuilder;
import com.microsoft.graph.requests.extensions.IShipmentMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IShipmentMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.ShipmentMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ShipmentMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.ICountryRegionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICountryRegionRequestBuilder;
import com.microsoft.graph.requests.extensions.CountryRegionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CountryRegionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesOrderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesOrderRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesOrderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesOrderRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesOrderLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesOrderLineRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesOrderLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesOrderLineRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnitOfMeasureCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnitOfMeasureRequestBuilder;
import com.microsoft.graph.requests.extensions.UnitOfMeasureCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UnitOfMeasureRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgedAccountsReceivableCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgedAccountsReceivableRequestBuilder;
import com.microsoft.graph.requests.extensions.AgedAccountsReceivableCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AgedAccountsReceivableRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgedAccountsPayableCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgedAccountsPayableRequestBuilder;
import com.microsoft.graph.requests.extensions.AgedAccountsPayableCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AgedAccountsPayableRequestBuilder;
import com.microsoft.graph.requests.extensions.ITaxAreaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITaxAreaRequestBuilder;
import com.microsoft.graph.requests.extensions.TaxAreaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TaxAreaRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesQuoteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesQuoteRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesQuoteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesQuoteRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesQuoteLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesQuoteLineRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesQuoteLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesQuoteLineRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesCreditMemoCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesCreditMemoRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesCreditMemoCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesCreditMemoRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesCreditMemoLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesCreditMemoLineRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesCreditMemoLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesCreditMemoLineRequestBuilder;
import com.microsoft.graph.requests.extensions.IPurchaseInvoiceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPurchaseInvoiceRequestBuilder;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceRequestBuilder;
import com.microsoft.graph.requests.extensions.IPurchaseInvoiceLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPurchaseInvoiceLineRequestBuilder;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceLineRequestBuilder;
import com.microsoft.graph.requests.extensions.IPictureCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPictureRequestBuilder;
import com.microsoft.graph.requests.extensions.PictureCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PictureRequestBuilder;

import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Company Request Builder.
 */
public class CompanyRequestBuilder extends BaseRequestBuilder implements ICompanyRequestBuilder {

    /**
     * The request builder for the Company
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CompanyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the ICompanyRequest instance
     */
    public ICompanyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ICompanyRequest instance
     */
    public ICompanyRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.CompanyRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IItemCollectionRequestBuilder items() {
        return new ItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("items"), getClient(), null);
    }

    public IItemRequestBuilder items(final String id) {
        return new ItemRequestBuilder(getRequestUrlWithAdditionalSegment("items") + "/" + id, getClient(), null);
    }
    public ICustomerCollectionRequestBuilder customers() {
        return new CustomerCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("customers"), getClient(), null);
    }

    public ICustomerRequestBuilder customers(final String id) {
        return new CustomerRequestBuilder(getRequestUrlWithAdditionalSegment("customers") + "/" + id, getClient(), null);
    }
    public IVendorCollectionRequestBuilder vendors() {
        return new VendorCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("vendors"), getClient(), null);
    }

    public IVendorRequestBuilder vendors(final String id) {
        return new VendorRequestBuilder(getRequestUrlWithAdditionalSegment("vendors") + "/" + id, getClient(), null);
    }
    public ICompanyInformationCollectionRequestBuilder companyInformation() {
        return new CompanyInformationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("companyInformation"), getClient(), null);
    }

    public ICompanyInformationRequestBuilder companyInformation(final String id) {
        return new CompanyInformationRequestBuilder(getRequestUrlWithAdditionalSegment("companyInformation") + "/" + id, getClient(), null);
    }
    public ISalesInvoiceCollectionRequestBuilder salesInvoices() {
        return new SalesInvoiceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("salesInvoices"), getClient(), null);
    }

    public ISalesInvoiceRequestBuilder salesInvoices(final String id) {
        return new SalesInvoiceRequestBuilder(getRequestUrlWithAdditionalSegment("salesInvoices") + "/" + id, getClient(), null);
    }
    public ISalesInvoiceLineCollectionRequestBuilder salesInvoiceLines() {
        return new SalesInvoiceLineCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("salesInvoiceLines"), getClient(), null);
    }

    public ISalesInvoiceLineRequestBuilder salesInvoiceLines(final String id) {
        return new SalesInvoiceLineRequestBuilder(getRequestUrlWithAdditionalSegment("salesInvoiceLines") + "/" + id, getClient(), null);
    }
    public ICustomerPaymentJournalCollectionRequestBuilder customerPaymentJournals() {
        return new CustomerPaymentJournalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("customerPaymentJournals"), getClient(), null);
    }

    public ICustomerPaymentJournalRequestBuilder customerPaymentJournals(final String id) {
        return new CustomerPaymentJournalRequestBuilder(getRequestUrlWithAdditionalSegment("customerPaymentJournals") + "/" + id, getClient(), null);
    }
    public ICustomerPaymentCollectionRequestBuilder customerPayments() {
        return new CustomerPaymentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("customerPayments"), getClient(), null);
    }

    public ICustomerPaymentRequestBuilder customerPayments(final String id) {
        return new CustomerPaymentRequestBuilder(getRequestUrlWithAdditionalSegment("customerPayments") + "/" + id, getClient(), null);
    }
    public IAccountCollectionRequestBuilder accounts() {
        return new AccountCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("accounts"), getClient(), null);
    }

    public IAccountRequestBuilder accounts(final String id) {
        return new AccountRequestBuilder(getRequestUrlWithAdditionalSegment("accounts") + "/" + id, getClient(), null);
    }
    public ITaxGroupCollectionRequestBuilder taxGroups() {
        return new TaxGroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("taxGroups"), getClient(), null);
    }

    public ITaxGroupRequestBuilder taxGroups(final String id) {
        return new TaxGroupRequestBuilder(getRequestUrlWithAdditionalSegment("taxGroups") + "/" + id, getClient(), null);
    }
    public IJournalCollectionRequestBuilder journals() {
        return new JournalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("journals"), getClient(), null);
    }

    public IJournalRequestBuilder journals(final String id) {
        return new JournalRequestBuilder(getRequestUrlWithAdditionalSegment("journals") + "/" + id, getClient(), null);
    }
    public IJournalLineCollectionRequestBuilder journalLines() {
        return new JournalLineCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("journalLines"), getClient(), null);
    }

    public IJournalLineRequestBuilder journalLines(final String id) {
        return new JournalLineRequestBuilder(getRequestUrlWithAdditionalSegment("journalLines") + "/" + id, getClient(), null);
    }
    public IEmployeeCollectionRequestBuilder employees() {
        return new EmployeeCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("employees"), getClient(), null);
    }

    public IEmployeeRequestBuilder employees(final String id) {
        return new EmployeeRequestBuilder(getRequestUrlWithAdditionalSegment("employees") + "/" + id, getClient(), null);
    }
    public IGeneralLedgerEntryCollectionRequestBuilder generalLedgerEntries() {
        return new GeneralLedgerEntryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("generalLedgerEntries"), getClient(), null);
    }

    public IGeneralLedgerEntryRequestBuilder generalLedgerEntries(final String id) {
        return new GeneralLedgerEntryRequestBuilder(getRequestUrlWithAdditionalSegment("generalLedgerEntries") + "/" + id, getClient(), null);
    }
    public ICurrencyCollectionRequestBuilder currencies() {
        return new CurrencyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("currencies"), getClient(), null);
    }

    public ICurrencyRequestBuilder currencies(final String id) {
        return new CurrencyRequestBuilder(getRequestUrlWithAdditionalSegment("currencies") + "/" + id, getClient(), null);
    }
    public IPaymentMethodCollectionRequestBuilder paymentMethods() {
        return new PaymentMethodCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("paymentMethods"), getClient(), null);
    }

    public IPaymentMethodRequestBuilder paymentMethods(final String id) {
        return new PaymentMethodRequestBuilder(getRequestUrlWithAdditionalSegment("paymentMethods") + "/" + id, getClient(), null);
    }
    public IDimensionCollectionRequestBuilder dimensions() {
        return new DimensionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("dimensions"), getClient(), null);
    }

    public IDimensionRequestBuilder dimensions(final String id) {
        return new DimensionRequestBuilder(getRequestUrlWithAdditionalSegment("dimensions") + "/" + id, getClient(), null);
    }
    public IDimensionValueCollectionRequestBuilder dimensionValues() {
        return new DimensionValueCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("dimensionValues"), getClient(), null);
    }

    public IDimensionValueRequestBuilder dimensionValues(final String id) {
        return new DimensionValueRequestBuilder(getRequestUrlWithAdditionalSegment("dimensionValues") + "/" + id, getClient(), null);
    }
    public IPaymentTermCollectionRequestBuilder paymentTerms() {
        return new PaymentTermCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("paymentTerms"), getClient(), null);
    }

    public IPaymentTermRequestBuilder paymentTerms(final String id) {
        return new PaymentTermRequestBuilder(getRequestUrlWithAdditionalSegment("paymentTerms") + "/" + id, getClient(), null);
    }
    public IShipmentMethodCollectionRequestBuilder shipmentMethods() {
        return new ShipmentMethodCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("shipmentMethods"), getClient(), null);
    }

    public IShipmentMethodRequestBuilder shipmentMethods(final String id) {
        return new ShipmentMethodRequestBuilder(getRequestUrlWithAdditionalSegment("shipmentMethods") + "/" + id, getClient(), null);
    }
    public IItemCategoryCollectionRequestBuilder itemCategories() {
        return new ItemCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("itemCategories"), getClient(), null);
    }

    public IItemCategoryRequestBuilder itemCategories(final String id) {
        return new ItemCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("itemCategories") + "/" + id, getClient(), null);
    }
    public ICountryRegionCollectionRequestBuilder countriesRegions() {
        return new CountryRegionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("countriesRegions"), getClient(), null);
    }

    public ICountryRegionRequestBuilder countriesRegions(final String id) {
        return new CountryRegionRequestBuilder(getRequestUrlWithAdditionalSegment("countriesRegions") + "/" + id, getClient(), null);
    }
    public ISalesOrderCollectionRequestBuilder salesOrders() {
        return new SalesOrderCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("salesOrders"), getClient(), null);
    }

    public ISalesOrderRequestBuilder salesOrders(final String id) {
        return new SalesOrderRequestBuilder(getRequestUrlWithAdditionalSegment("salesOrders") + "/" + id, getClient(), null);
    }
    public ISalesOrderLineCollectionRequestBuilder salesOrderLines() {
        return new SalesOrderLineCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("salesOrderLines"), getClient(), null);
    }

    public ISalesOrderLineRequestBuilder salesOrderLines(final String id) {
        return new SalesOrderLineRequestBuilder(getRequestUrlWithAdditionalSegment("salesOrderLines") + "/" + id, getClient(), null);
    }
    public IUnitOfMeasureCollectionRequestBuilder unitsOfMeasure() {
        return new UnitOfMeasureCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("unitsOfMeasure"), getClient(), null);
    }

    public IUnitOfMeasureRequestBuilder unitsOfMeasure(final String id) {
        return new UnitOfMeasureRequestBuilder(getRequestUrlWithAdditionalSegment("unitsOfMeasure") + "/" + id, getClient(), null);
    }
    public IAgedAccountsReceivableCollectionRequestBuilder agedAccountsReceivable() {
        return new AgedAccountsReceivableCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("agedAccountsReceivable"), getClient(), null);
    }

    public IAgedAccountsReceivableRequestBuilder agedAccountsReceivable(final String id) {
        return new AgedAccountsReceivableRequestBuilder(getRequestUrlWithAdditionalSegment("agedAccountsReceivable") + "/" + id, getClient(), null);
    }
    public IAgedAccountsPayableCollectionRequestBuilder agedAccountsPayable() {
        return new AgedAccountsPayableCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("agedAccountsPayable"), getClient(), null);
    }

    public IAgedAccountsPayableRequestBuilder agedAccountsPayable(final String id) {
        return new AgedAccountsPayableRequestBuilder(getRequestUrlWithAdditionalSegment("agedAccountsPayable") + "/" + id, getClient(), null);
    }
    public ITaxAreaCollectionRequestBuilder taxAreas() {
        return new TaxAreaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("taxAreas"), getClient(), null);
    }

    public ITaxAreaRequestBuilder taxAreas(final String id) {
        return new TaxAreaRequestBuilder(getRequestUrlWithAdditionalSegment("taxAreas") + "/" + id, getClient(), null);
    }
    public ISalesQuoteCollectionRequestBuilder salesQuotes() {
        return new SalesQuoteCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("salesQuotes"), getClient(), null);
    }

    public ISalesQuoteRequestBuilder salesQuotes(final String id) {
        return new SalesQuoteRequestBuilder(getRequestUrlWithAdditionalSegment("salesQuotes") + "/" + id, getClient(), null);
    }
    public ISalesQuoteLineCollectionRequestBuilder salesQuoteLines() {
        return new SalesQuoteLineCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("salesQuoteLines"), getClient(), null);
    }

    public ISalesQuoteLineRequestBuilder salesQuoteLines(final String id) {
        return new SalesQuoteLineRequestBuilder(getRequestUrlWithAdditionalSegment("salesQuoteLines") + "/" + id, getClient(), null);
    }
    public ISalesCreditMemoCollectionRequestBuilder salesCreditMemos() {
        return new SalesCreditMemoCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("salesCreditMemos"), getClient(), null);
    }

    public ISalesCreditMemoRequestBuilder salesCreditMemos(final String id) {
        return new SalesCreditMemoRequestBuilder(getRequestUrlWithAdditionalSegment("salesCreditMemos") + "/" + id, getClient(), null);
    }
    public ISalesCreditMemoLineCollectionRequestBuilder salesCreditMemoLines() {
        return new SalesCreditMemoLineCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("salesCreditMemoLines"), getClient(), null);
    }

    public ISalesCreditMemoLineRequestBuilder salesCreditMemoLines(final String id) {
        return new SalesCreditMemoLineRequestBuilder(getRequestUrlWithAdditionalSegment("salesCreditMemoLines") + "/" + id, getClient(), null);
    }
    public IPurchaseInvoiceCollectionRequestBuilder purchaseInvoices() {
        return new PurchaseInvoiceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("purchaseInvoices"), getClient(), null);
    }

    public IPurchaseInvoiceRequestBuilder purchaseInvoices(final String id) {
        return new PurchaseInvoiceRequestBuilder(getRequestUrlWithAdditionalSegment("purchaseInvoices") + "/" + id, getClient(), null);
    }
    public IPurchaseInvoiceLineCollectionRequestBuilder purchaseInvoiceLines() {
        return new PurchaseInvoiceLineCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("purchaseInvoiceLines"), getClient(), null);
    }

    public IPurchaseInvoiceLineRequestBuilder purchaseInvoiceLines(final String id) {
        return new PurchaseInvoiceLineRequestBuilder(getRequestUrlWithAdditionalSegment("purchaseInvoiceLines") + "/" + id, getClient(), null);
    }
    public IPictureCollectionRequestBuilder picture() {
        return new PictureCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("picture"), getClient(), null);
    }

    public IPictureRequestBuilder picture(final String id) {
        return new PictureRequestBuilder(getRequestUrlWithAdditionalSegment("picture") + "/" + id, getClient(), null);
    }
}
