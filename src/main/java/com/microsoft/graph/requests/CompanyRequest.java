// Template Source: BaseEntityRequest.java.tt
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
    public CompanyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Company.class);
    }

    /**
     * Gets the Company from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Company> getAsync() {
        return sendAsync(HttpMethod.GET, null);
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
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Company> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Company delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Company with a source
     *
     * @param sourceCompany the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Company> patchAsync(@Nonnull final Company sourceCompany) {
        return sendAsync(HttpMethod.PATCH, sourceCompany);
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
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Company> postAsync(@Nonnull final Company newCompany) {
        return sendAsync(HttpMethod.POST, newCompany);
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
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Company> putAsync(@Nonnull final Company newCompany) {
        return sendAsync(HttpMethod.PUT, newCompany);
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

