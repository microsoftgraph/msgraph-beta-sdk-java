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
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Company Request.
 */
public class CompanyRequest extends BaseRequest implements ICompanyRequest {
	
    /**
     * The request for the Company
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CompanyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Company.class);
    }

    /**
     * Gets the Company from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Company> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Company from the service
     *
     * @return the Company from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Company get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Company> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Company with a source
     *
     * @param sourceCompany the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Company sourceCompany, final ICallback<Company> callback) {
        send(HttpMethod.PATCH, callback, sourceCompany);
    }

    /**
     * Patches this Company with a source
     *
     * @param sourceCompany the source object with updates
     * @return the updated Company
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Company patch(final Company sourceCompany) throws ClientException {
        return send(HttpMethod.PATCH, sourceCompany);
    }

    /**
     * Creates a Company with a new object
     *
     * @param newCompany the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Company newCompany, final ICallback<Company> callback) {
        send(HttpMethod.POST, callback, newCompany);
    }

    /**
     * Creates a Company with a new object
     *
     * @param newCompany the new object to create
     * @return the created Company
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Company post(final Company newCompany) throws ClientException {
        return send(HttpMethod.POST, newCompany);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ICompanyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (CompanyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ICompanyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (CompanyRequest)this;
     }

}

