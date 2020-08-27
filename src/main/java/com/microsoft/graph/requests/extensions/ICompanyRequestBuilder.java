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
import com.microsoft.graph.requests.extensions.ICustomerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICustomerRequestBuilder;
import com.microsoft.graph.requests.extensions.IVendorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IVendorRequestBuilder;
import com.microsoft.graph.requests.extensions.ICompanyInformationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICompanyInformationRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesInvoiceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesInvoiceRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesInvoiceLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesInvoiceLineRequestBuilder;
import com.microsoft.graph.requests.extensions.ICustomerPaymentJournalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICustomerPaymentJournalRequestBuilder;
import com.microsoft.graph.requests.extensions.ICustomerPaymentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICustomerPaymentRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccountCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccountRequestBuilder;
import com.microsoft.graph.requests.extensions.ITaxGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITaxGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IJournalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IJournalRequestBuilder;
import com.microsoft.graph.requests.extensions.IJournalLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IJournalLineRequestBuilder;
import com.microsoft.graph.requests.extensions.IEmployeeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEmployeeRequestBuilder;
import com.microsoft.graph.requests.extensions.IGeneralLedgerEntryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGeneralLedgerEntryRequestBuilder;
import com.microsoft.graph.requests.extensions.ICurrencyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.IPaymentMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPaymentMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.IDimensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDimensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDimensionValueCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDimensionValueRequestBuilder;
import com.microsoft.graph.requests.extensions.IPaymentTermCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPaymentTermRequestBuilder;
import com.microsoft.graph.requests.extensions.IShipmentMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IShipmentMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.ICountryRegionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICountryRegionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesOrderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesOrderRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesOrderLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesOrderLineRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnitOfMeasureCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnitOfMeasureRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgedAccountsReceivableCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgedAccountsReceivableRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgedAccountsPayableCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgedAccountsPayableRequestBuilder;
import com.microsoft.graph.requests.extensions.ITaxAreaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITaxAreaRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesQuoteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesQuoteRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesQuoteLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesQuoteLineRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesCreditMemoCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesCreditMemoRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesCreditMemoLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesCreditMemoLineRequestBuilder;
import com.microsoft.graph.requests.extensions.IPurchaseInvoiceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPurchaseInvoiceRequestBuilder;
import com.microsoft.graph.requests.extensions.IPurchaseInvoiceLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPurchaseInvoiceLineRequestBuilder;
import com.microsoft.graph.requests.extensions.IPictureCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPictureRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Company Request Builder.
 */
public interface ICompanyRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the ICompanyRequest instance
     */
    ICompanyRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ICompanyRequest instance
     */
    ICompanyRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IItemCollectionRequestBuilder items();

    IItemRequestBuilder items(final String id);

    ICustomerCollectionRequestBuilder customers();

    ICustomerRequestBuilder customers(final String id);

    IVendorCollectionRequestBuilder vendors();

    IVendorRequestBuilder vendors(final String id);

    ICompanyInformationCollectionRequestBuilder companyInformation();

    ICompanyInformationRequestBuilder companyInformation(final String id);

    ISalesInvoiceCollectionRequestBuilder salesInvoices();

    ISalesInvoiceRequestBuilder salesInvoices(final String id);

    ISalesInvoiceLineCollectionRequestBuilder salesInvoiceLines();

    ISalesInvoiceLineRequestBuilder salesInvoiceLines(final String id);

    ICustomerPaymentJournalCollectionRequestBuilder customerPaymentJournals();

    ICustomerPaymentJournalRequestBuilder customerPaymentJournals(final String id);

    ICustomerPaymentCollectionRequestBuilder customerPayments();

    ICustomerPaymentRequestBuilder customerPayments(final String id);

    IAccountCollectionRequestBuilder accounts();

    IAccountRequestBuilder accounts(final String id);

    ITaxGroupCollectionRequestBuilder taxGroups();

    ITaxGroupRequestBuilder taxGroups(final String id);

    IJournalCollectionRequestBuilder journals();

    IJournalRequestBuilder journals(final String id);

    IJournalLineCollectionRequestBuilder journalLines();

    IJournalLineRequestBuilder journalLines(final String id);

    IEmployeeCollectionRequestBuilder employees();

    IEmployeeRequestBuilder employees(final String id);

    IGeneralLedgerEntryCollectionRequestBuilder generalLedgerEntries();

    IGeneralLedgerEntryRequestBuilder generalLedgerEntries(final String id);

    ICurrencyCollectionRequestBuilder currencies();

    ICurrencyRequestBuilder currencies(final String id);

    IPaymentMethodCollectionRequestBuilder paymentMethods();

    IPaymentMethodRequestBuilder paymentMethods(final String id);

    IDimensionCollectionRequestBuilder dimensions();

    IDimensionRequestBuilder dimensions(final String id);

    IDimensionValueCollectionRequestBuilder dimensionValues();

    IDimensionValueRequestBuilder dimensionValues(final String id);

    IPaymentTermCollectionRequestBuilder paymentTerms();

    IPaymentTermRequestBuilder paymentTerms(final String id);

    IShipmentMethodCollectionRequestBuilder shipmentMethods();

    IShipmentMethodRequestBuilder shipmentMethods(final String id);

    IItemCategoryCollectionRequestBuilder itemCategories();

    IItemCategoryRequestBuilder itemCategories(final String id);

    ICountryRegionCollectionRequestBuilder countriesRegions();

    ICountryRegionRequestBuilder countriesRegions(final String id);

    ISalesOrderCollectionRequestBuilder salesOrders();

    ISalesOrderRequestBuilder salesOrders(final String id);

    ISalesOrderLineCollectionRequestBuilder salesOrderLines();

    ISalesOrderLineRequestBuilder salesOrderLines(final String id);

    IUnitOfMeasureCollectionRequestBuilder unitsOfMeasure();

    IUnitOfMeasureRequestBuilder unitsOfMeasure(final String id);

    IAgedAccountsReceivableCollectionRequestBuilder agedAccountsReceivable();

    IAgedAccountsReceivableRequestBuilder agedAccountsReceivable(final String id);

    IAgedAccountsPayableCollectionRequestBuilder agedAccountsPayable();

    IAgedAccountsPayableRequestBuilder agedAccountsPayable(final String id);

    ITaxAreaCollectionRequestBuilder taxAreas();

    ITaxAreaRequestBuilder taxAreas(final String id);

    ISalesQuoteCollectionRequestBuilder salesQuotes();

    ISalesQuoteRequestBuilder salesQuotes(final String id);

    ISalesQuoteLineCollectionRequestBuilder salesQuoteLines();

    ISalesQuoteLineRequestBuilder salesQuoteLines(final String id);

    ISalesCreditMemoCollectionRequestBuilder salesCreditMemos();

    ISalesCreditMemoRequestBuilder salesCreditMemos(final String id);

    ISalesCreditMemoLineCollectionRequestBuilder salesCreditMemoLines();

    ISalesCreditMemoLineRequestBuilder salesCreditMemoLines(final String id);

    IPurchaseInvoiceCollectionRequestBuilder purchaseInvoices();

    IPurchaseInvoiceRequestBuilder purchaseInvoices(final String id);

    IPurchaseInvoiceLineCollectionRequestBuilder purchaseInvoiceLines();

    IPurchaseInvoiceLineRequestBuilder purchaseInvoiceLines(final String id);

    IPictureCollectionRequestBuilder picture();

    IPictureRequestBuilder picture(final String id);

}