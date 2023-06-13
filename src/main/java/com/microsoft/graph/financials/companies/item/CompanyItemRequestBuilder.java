package com.microsoft.graph.financials.companies.item;

import com.microsoft.graph.financials.companies.item.accounts.AccountsRequestBuilder;
import com.microsoft.graph.financials.companies.item.agedaccountspayable.AgedAccountsPayableRequestBuilder;
import com.microsoft.graph.financials.companies.item.agedaccountsreceivable.AgedAccountsReceivableRequestBuilder;
import com.microsoft.graph.financials.companies.item.companyinformation.CompanyInformationRequestBuilder;
import com.microsoft.graph.financials.companies.item.countriesregions.CountriesRegionsRequestBuilder;
import com.microsoft.graph.financials.companies.item.currencies.CurrenciesRequestBuilder;
import com.microsoft.graph.financials.companies.item.customerpaymentjournals.CustomerPaymentJournalsRequestBuilder;
import com.microsoft.graph.financials.companies.item.customerpayments.CustomerPaymentsRequestBuilder;
import com.microsoft.graph.financials.companies.item.customers.CustomersRequestBuilder;
import com.microsoft.graph.financials.companies.item.dimensions.DimensionsRequestBuilder;
import com.microsoft.graph.financials.companies.item.dimensionvalues.DimensionValuesRequestBuilder;
import com.microsoft.graph.financials.companies.item.employees.EmployeesRequestBuilder;
import com.microsoft.graph.financials.companies.item.generalledgerentries.GeneralLedgerEntriesRequestBuilder;
import com.microsoft.graph.financials.companies.item.itemcategories.ItemCategoriesRequestBuilder;
import com.microsoft.graph.financials.companies.item.items.ItemsRequestBuilder;
import com.microsoft.graph.financials.companies.item.journallines.JournalLinesRequestBuilder;
import com.microsoft.graph.financials.companies.item.journals.JournalsRequestBuilder;
import com.microsoft.graph.financials.companies.item.paymentmethods.PaymentMethodsRequestBuilder;
import com.microsoft.graph.financials.companies.item.paymentterms.PaymentTermsRequestBuilder;
import com.microsoft.graph.financials.companies.item.picture.PictureRequestBuilder;
import com.microsoft.graph.financials.companies.item.purchaseinvoicelines.PurchaseInvoiceLinesRequestBuilder;
import com.microsoft.graph.financials.companies.item.purchaseinvoices.PurchaseInvoicesRequestBuilder;
import com.microsoft.graph.financials.companies.item.salescreditmemolines.SalesCreditMemoLinesRequestBuilder;
import com.microsoft.graph.financials.companies.item.salescreditmemos.SalesCreditMemosRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesinvoicelines.SalesInvoiceLinesRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesinvoices.SalesInvoicesRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesorderlines.SalesOrderLinesRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesorders.SalesOrdersRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesquotelines.SalesQuoteLinesRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesquotes.SalesQuotesRequestBuilder;
import com.microsoft.graph.financials.companies.item.shipmentmethods.ShipmentMethodsRequestBuilder;
import com.microsoft.graph.financials.companies.item.taxareas.TaxAreasRequestBuilder;
import com.microsoft.graph.financials.companies.item.taxgroups.TaxGroupsRequestBuilder;
import com.microsoft.graph.financials.companies.item.unitsofmeasure.UnitsOfMeasureRequestBuilder;
import com.microsoft.graph.financials.companies.item.vendors.VendorsRequestBuilder;
import com.microsoft.graph.models.Company;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the companies property of the microsoft.graph.financials entity.
 */
public class CompanyItemRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the accounts property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public AccountsRequestBuilder accounts() {
        return new AccountsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the agedAccountsPayable property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public AgedAccountsPayableRequestBuilder agedAccountsPayable() {
        return new AgedAccountsPayableRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the agedAccountsReceivable property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public AgedAccountsReceivableRequestBuilder agedAccountsReceivable() {
        return new AgedAccountsReceivableRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the companyInformation property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public CompanyInformationRequestBuilder companyInformation() {
        return new CompanyInformationRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the countriesRegions property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public CountriesRegionsRequestBuilder countriesRegions() {
        return new CountriesRegionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the currencies property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public CurrenciesRequestBuilder currencies() {
        return new CurrenciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the customerPaymentJournals property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public CustomerPaymentJournalsRequestBuilder customerPaymentJournals() {
        return new CustomerPaymentJournalsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the customerPayments property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public CustomerPaymentsRequestBuilder customerPayments() {
        return new CustomerPaymentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the customers property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public CustomersRequestBuilder customers() {
        return new CustomersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the dimensions property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public DimensionsRequestBuilder dimensions() {
        return new DimensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the dimensionValues property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public DimensionValuesRequestBuilder dimensionValues() {
        return new DimensionValuesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the employees property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public EmployeesRequestBuilder employees() {
        return new EmployeesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the generalLedgerEntries property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public GeneralLedgerEntriesRequestBuilder generalLedgerEntries() {
        return new GeneralLedgerEntriesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the itemCategories property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public ItemCategoriesRequestBuilder itemCategories() {
        return new ItemCategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the items property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public ItemsRequestBuilder items() {
        return new ItemsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the journalLines property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public JournalLinesRequestBuilder journalLines() {
        return new JournalLinesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the journals property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public JournalsRequestBuilder journals() {
        return new JournalsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the paymentMethods property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public PaymentMethodsRequestBuilder paymentMethods() {
        return new PaymentMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the paymentTerms property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public PaymentTermsRequestBuilder paymentTerms() {
        return new PaymentTermsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the picture property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public PictureRequestBuilder picture() {
        return new PictureRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the purchaseInvoiceLines property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public PurchaseInvoiceLinesRequestBuilder purchaseInvoiceLines() {
        return new PurchaseInvoiceLinesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the purchaseInvoices property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public PurchaseInvoicesRequestBuilder purchaseInvoices() {
        return new PurchaseInvoicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the salesCreditMemoLines property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public SalesCreditMemoLinesRequestBuilder salesCreditMemoLines() {
        return new SalesCreditMemoLinesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the salesCreditMemos property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public SalesCreditMemosRequestBuilder salesCreditMemos() {
        return new SalesCreditMemosRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the salesInvoiceLines property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public SalesInvoiceLinesRequestBuilder salesInvoiceLines() {
        return new SalesInvoiceLinesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the salesInvoices property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public SalesInvoicesRequestBuilder salesInvoices() {
        return new SalesInvoicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the salesOrderLines property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public SalesOrderLinesRequestBuilder salesOrderLines() {
        return new SalesOrderLinesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the salesOrders property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public SalesOrdersRequestBuilder salesOrders() {
        return new SalesOrdersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the salesQuoteLines property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public SalesQuoteLinesRequestBuilder salesQuoteLines() {
        return new SalesQuoteLinesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the salesQuotes property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public SalesQuotesRequestBuilder salesQuotes() {
        return new SalesQuotesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the shipmentMethods property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public ShipmentMethodsRequestBuilder shipmentMethods() {
        return new ShipmentMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the taxAreas property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public TaxAreasRequestBuilder taxAreas() {
        return new TaxAreasRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the taxGroups property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public TaxGroupsRequestBuilder taxGroups() {
        return new TaxGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the unitsOfMeasure property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public UnitsOfMeasureRequestBuilder unitsOfMeasure() {
        return new UnitsOfMeasureRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the vendors property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public VendorsRequestBuilder vendors() {
        return new VendorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new CompanyItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public CompanyItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/financials/companies/{company%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new CompanyItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public CompanyItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/financials/companies/{company%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Get companies from financials
     * @return a CompletableFuture of Company
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Company> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Company::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Company> executionException = new java.util.concurrent.CompletableFuture<Company>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get companies from financials
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of Company
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Company> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Company::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Company> executionException = new java.util.concurrent.CompletableFuture<Company>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get companies from financials
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get companies from financials
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get companies from financials
     */
    public class GetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
