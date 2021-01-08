// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Company;
import com.microsoft.graph.requests.extensions.AccountCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccountRequestBuilder;
import com.microsoft.graph.requests.extensions.AgedAccountsPayableCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AgedAccountsPayableRequestBuilder;
import com.microsoft.graph.requests.extensions.AgedAccountsReceivableCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AgedAccountsReceivableRequestBuilder;
import com.microsoft.graph.requests.extensions.CompanyInformationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CompanyInformationRequestBuilder;
import com.microsoft.graph.requests.extensions.CountryRegionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CountryRegionRequestBuilder;
import com.microsoft.graph.requests.extensions.CurrencyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.CustomerPaymentJournalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CustomerPaymentJournalRequestBuilder;
import com.microsoft.graph.requests.extensions.CustomerPaymentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CustomerPaymentRequestBuilder;
import com.microsoft.graph.requests.extensions.CustomerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CustomerRequestBuilder;
import com.microsoft.graph.requests.extensions.DimensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DimensionRequestBuilder;
import com.microsoft.graph.requests.extensions.DimensionValueCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DimensionValueRequestBuilder;
import com.microsoft.graph.requests.extensions.EmployeeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EmployeeRequestBuilder;
import com.microsoft.graph.requests.extensions.GeneralLedgerEntryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GeneralLedgerEntryRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemRequestBuilder;
import com.microsoft.graph.requests.extensions.JournalLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.JournalLineRequestBuilder;
import com.microsoft.graph.requests.extensions.JournalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.JournalRequestBuilder;
import com.microsoft.graph.requests.extensions.PaymentMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PaymentMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.PaymentTermCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PaymentTermRequestBuilder;
import com.microsoft.graph.requests.extensions.PictureCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PictureRequestBuilder;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceLineRequestBuilder;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesCreditMemoLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesCreditMemoLineRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesCreditMemoCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesCreditMemoRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesInvoiceLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesInvoiceLineRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesInvoiceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesInvoiceRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesOrderLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesOrderLineRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesOrderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesOrderRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesQuoteLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesQuoteLineRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesQuoteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesQuoteRequestBuilder;
import com.microsoft.graph.requests.extensions.ShipmentMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ShipmentMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.TaxAreaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TaxAreaRequestBuilder;
import com.microsoft.graph.requests.extensions.TaxGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TaxGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.UnitOfMeasureCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UnitOfMeasureRequestBuilder;
import com.microsoft.graph.requests.extensions.VendorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.VendorRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Company Request.
 */
public class CompanyRequest extends BaseRequest<Company> {
	
    /**
     * The request for the Company
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CompanyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Company.class);
    }

    /**
     * Gets the Company from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super Company> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Company from the service
     *
     * @return the Company from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Company get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super Company> callback) {
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
    public void patch(@Nonnull final Company sourceCompany, @Nonnull final ICallback<? super Company> callback) {
        send(HttpMethod.PATCH, callback, sourceCompany);
    }

    /**
     * Patches this Company with a source
     *
     * @param sourceCompany the source object with updates
     * @return the updated Company
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Company patch(@Nonnull final Company sourceCompany) throws ClientException {
        return send(HttpMethod.PATCH, sourceCompany);
    }

    /**
     * Creates a Company with a new object
     *
     * @param newCompany the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final Company newCompany, @Nonnull final ICallback<? super Company> callback) {
        send(HttpMethod.POST, callback, newCompany);
    }

    /**
     * Creates a Company with a new object
     *
     * @param newCompany the new object to create
     * @return the created Company
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Company post(@Nonnull final Company newCompany) throws ClientException {
        return send(HttpMethod.POST, newCompany);
    }

    /**
     * Creates a Company with a new object
     *
     * @param newCompany the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final Company newCompany, @Nonnull final ICallback<? super Company> callback) {
        send(HttpMethod.PUT, callback, newCompany);
    }

    /**
     * Creates a Company with a new object
     *
     * @param newCompany the object to create/update
     * @return the created Company
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Company put(@Nonnull final Company newCompany) throws ClientException {
        return send(HttpMethod.PUT, newCompany);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public CompanyRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public CompanyRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

