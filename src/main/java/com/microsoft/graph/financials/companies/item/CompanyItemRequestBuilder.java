package com.microsoft.graph.financials.companies.item;

import com.microsoft.graph.financials.companies.item.accounts.AccountsRequestBuilder;
import com.microsoft.graph.financials.companies.item.accounts.item.AccountItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.agedaccountspayable.AgedAccountsPayableRequestBuilder;
import com.microsoft.graph.financials.companies.item.agedaccountspayable.item.AgedAccountsPayableItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.agedaccountsreceivable.AgedAccountsReceivableRequestBuilder;
import com.microsoft.graph.financials.companies.item.agedaccountsreceivable.item.AgedAccountsReceivableItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.companyinformation.CompanyInformationRequestBuilder;
import com.microsoft.graph.financials.companies.item.companyinformation.item.CompanyInformationItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.countriesregions.CountriesRegionsRequestBuilder;
import com.microsoft.graph.financials.companies.item.countriesregions.item.CountryRegionItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.currencies.CurrenciesRequestBuilder;
import com.microsoft.graph.financials.companies.item.currencies.item.CurrencyItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.customerpaymentjournals.CustomerPaymentJournalsRequestBuilder;
import com.microsoft.graph.financials.companies.item.customerpaymentjournals.item.CustomerPaymentJournalItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.customerpayments.CustomerPaymentsRequestBuilder;
import com.microsoft.graph.financials.companies.item.customerpayments.item.CustomerPaymentItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.customers.CustomersRequestBuilder;
import com.microsoft.graph.financials.companies.item.customers.item.CustomerItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.dimensions.DimensionsRequestBuilder;
import com.microsoft.graph.financials.companies.item.dimensions.item.DimensionItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.dimensionvalues.DimensionValuesRequestBuilder;
import com.microsoft.graph.financials.companies.item.dimensionvalues.item.DimensionValueItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.employees.EmployeesRequestBuilder;
import com.microsoft.graph.financials.companies.item.employees.item.EmployeeItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.generalledgerentries.GeneralLedgerEntriesRequestBuilder;
import com.microsoft.graph.financials.companies.item.generalledgerentries.item.GeneralLedgerEntryItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.itemcategories.item.ItemCategoryItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.itemcategories.ItemCategoriesRequestBuilder;
import com.microsoft.graph.financials.companies.item.items.item.ItemItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.items.ItemsRequestBuilder;
import com.microsoft.graph.financials.companies.item.journallines.item.JournalLineItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.journallines.JournalLinesRequestBuilder;
import com.microsoft.graph.financials.companies.item.journals.item.JournalItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.journals.JournalsRequestBuilder;
import com.microsoft.graph.financials.companies.item.paymentmethods.item.PaymentMethodItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.paymentmethods.PaymentMethodsRequestBuilder;
import com.microsoft.graph.financials.companies.item.paymentterms.item.PaymentTermItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.paymentterms.PaymentTermsRequestBuilder;
import com.microsoft.graph.financials.companies.item.picture.item.PictureItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.picture.PictureRequestBuilder;
import com.microsoft.graph.financials.companies.item.purchaseinvoicelines.item.PurchaseInvoiceLineItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.purchaseinvoicelines.PurchaseInvoiceLinesRequestBuilder;
import com.microsoft.graph.financials.companies.item.purchaseinvoices.item.PurchaseInvoiceItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.purchaseinvoices.PurchaseInvoicesRequestBuilder;
import com.microsoft.graph.financials.companies.item.salescreditmemolines.item.SalesCreditMemoLineItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.salescreditmemolines.SalesCreditMemoLinesRequestBuilder;
import com.microsoft.graph.financials.companies.item.salescreditmemos.item.SalesCreditMemoItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.salescreditmemos.SalesCreditMemosRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesinvoicelines.item.SalesInvoiceLineItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesinvoicelines.SalesInvoiceLinesRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesinvoices.item.SalesInvoiceItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesinvoices.SalesInvoicesRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesorderlines.item.SalesOrderLineItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesorderlines.SalesOrderLinesRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesorders.item.SalesOrderItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesorders.SalesOrdersRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesquotelines.item.SalesQuoteLineItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesquotelines.SalesQuoteLinesRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesquotes.item.SalesQuoteItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesquotes.SalesQuotesRequestBuilder;
import com.microsoft.graph.financials.companies.item.shipmentmethods.item.ShipmentMethodItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.shipmentmethods.ShipmentMethodsRequestBuilder;
import com.microsoft.graph.financials.companies.item.taxareas.item.TaxAreaItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.taxareas.TaxAreasRequestBuilder;
import com.microsoft.graph.financials.companies.item.taxgroups.item.TaxGroupItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.taxgroups.TaxGroupsRequestBuilder;
import com.microsoft.graph.financials.companies.item.unitsofmeasure.item.UnitOfMeasureItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.unitsofmeasure.UnitsOfMeasureRequestBuilder;
import com.microsoft.graph.financials.companies.item.vendors.item.VendorItemRequestBuilder;
import com.microsoft.graph.financials.companies.item.vendors.VendorsRequestBuilder;
import com.microsoft.graph.models.Company;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the companies property of the microsoft.graph.financials entity. */
public class CompanyItemRequestBuilder {
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
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
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
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
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
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /** Provides operations to manage the vendors property of the microsoft.graph.company entity. */
    @javax.annotation.Nonnull
    public VendorsRequestBuilder vendors() {
        return new VendorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accounts property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a AccountItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AccountItemRequestBuilder accounts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("account%2Did", id);
        return new AccountItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the agedAccountsPayable property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a AgedAccountsPayableItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AgedAccountsPayableItemRequestBuilder agedAccountsPayable(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("agedAccountsPayable%2Did", id);
        return new AgedAccountsPayableItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the agedAccountsReceivable property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a AgedAccountsReceivableItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AgedAccountsReceivableItemRequestBuilder agedAccountsReceivable(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("agedAccountsReceivable%2Did", id);
        return new AgedAccountsReceivableItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the companyInformation property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a CompanyInformationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CompanyInformationItemRequestBuilder companyInformation(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("companyInformation%2Did", id);
        return new CompanyInformationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new CompanyItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public CompanyItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/financials/companies/{company%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new CompanyItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public CompanyItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/financials/companies/{company%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Provides operations to manage the countriesRegions property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a CountryRegionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CountryRegionItemRequestBuilder countriesRegions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("countryRegion%2Did", id);
        return new CountryRegionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get companies from financials
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get companies from financials
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Provides operations to manage the currencies property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a CurrencyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CurrencyItemRequestBuilder currencies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("currency%2Did", id);
        return new CurrencyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the customerPaymentJournals property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a CustomerPaymentJournalItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CustomerPaymentJournalItemRequestBuilder customerPaymentJournals(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("customerPaymentJournal%2Did", id);
        return new CustomerPaymentJournalItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the customerPayments property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a CustomerPaymentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CustomerPaymentItemRequestBuilder customerPayments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("customerPayment%2Did", id);
        return new CustomerPaymentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the customers property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a CustomerItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CustomerItemRequestBuilder customers(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("customer%2Did", id);
        return new CustomerItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the dimensions property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a DimensionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DimensionItemRequestBuilder dimensions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("dimension%2Did", id);
        return new DimensionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the dimensionValues property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a DimensionValueItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DimensionValueItemRequestBuilder dimensionValues(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("dimensionValue%2Did", id);
        return new DimensionValueItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the employees property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a EmployeeItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EmployeeItemRequestBuilder employees(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("employee%2Did", id);
        return new EmployeeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the generalLedgerEntries property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a GeneralLedgerEntryItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GeneralLedgerEntryItemRequestBuilder generalLedgerEntries(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("generalLedgerEntry%2Did", id);
        return new GeneralLedgerEntryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get companies from financials
     * @return a CompletableFuture of company
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Company> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Company::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Company>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Get companies from financials
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of company
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Company> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Company::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Company>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the itemCategories property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a ItemCategoryItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ItemCategoryItemRequestBuilder itemCategories(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("itemCategory%2Did", id);
        return new ItemCategoryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the items property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a ItemItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ItemItemRequestBuilder items(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("item%2Did", id);
        return new ItemItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the journalLines property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a JournalLineItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public JournalLineItemRequestBuilder journalLines(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("journalLine%2Did", id);
        return new JournalLineItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the journals property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a JournalItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public JournalItemRequestBuilder journals(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("journal%2Did", id);
        return new JournalItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the paymentMethods property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a PaymentMethodItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PaymentMethodItemRequestBuilder paymentMethods(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("paymentMethod%2Did", id);
        return new PaymentMethodItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the paymentTerms property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a PaymentTermItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PaymentTermItemRequestBuilder paymentTerms(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("paymentTerm%2Did", id);
        return new PaymentTermItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the picture property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a PictureItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PictureItemRequestBuilder picture(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("picture%2Did", id);
        return new PictureItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the purchaseInvoiceLines property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a PurchaseInvoiceLineItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PurchaseInvoiceLineItemRequestBuilder purchaseInvoiceLines(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("purchaseInvoiceLine%2Did", id);
        return new PurchaseInvoiceLineItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the purchaseInvoices property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a PurchaseInvoiceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PurchaseInvoiceItemRequestBuilder purchaseInvoices(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("purchaseInvoice%2Did", id);
        return new PurchaseInvoiceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the salesCreditMemoLines property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a SalesCreditMemoLineItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SalesCreditMemoLineItemRequestBuilder salesCreditMemoLines(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("salesCreditMemoLine%2Did", id);
        return new SalesCreditMemoLineItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the salesCreditMemos property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a SalesCreditMemoItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SalesCreditMemoItemRequestBuilder salesCreditMemos(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("salesCreditMemo%2Did", id);
        return new SalesCreditMemoItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the salesInvoiceLines property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a SalesInvoiceLineItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SalesInvoiceLineItemRequestBuilder salesInvoiceLines(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("salesInvoiceLine%2Did", id);
        return new SalesInvoiceLineItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the salesInvoices property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a SalesInvoiceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SalesInvoiceItemRequestBuilder salesInvoices(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("salesInvoice%2Did", id);
        return new SalesInvoiceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the salesOrderLines property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a SalesOrderLineItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SalesOrderLineItemRequestBuilder salesOrderLines(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("salesOrderLine%2Did", id);
        return new SalesOrderLineItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the salesOrders property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a SalesOrderItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SalesOrderItemRequestBuilder salesOrders(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("salesOrder%2Did", id);
        return new SalesOrderItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the salesQuoteLines property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a SalesQuoteLineItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SalesQuoteLineItemRequestBuilder salesQuoteLines(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("salesQuoteLine%2Did", id);
        return new SalesQuoteLineItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the salesQuotes property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a SalesQuoteItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SalesQuoteItemRequestBuilder salesQuotes(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("salesQuote%2Did", id);
        return new SalesQuoteItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the shipmentMethods property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a ShipmentMethodItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ShipmentMethodItemRequestBuilder shipmentMethods(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("shipmentMethod%2Did", id);
        return new ShipmentMethodItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the taxAreas property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a TaxAreaItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TaxAreaItemRequestBuilder taxAreas(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("taxArea%2Did", id);
        return new TaxAreaItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the taxGroups property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a TaxGroupItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TaxGroupItemRequestBuilder taxGroups(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("taxGroup%2Did", id);
        return new TaxGroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the unitsOfMeasure property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a UnitOfMeasureItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnitOfMeasureItemRequestBuilder unitsOfMeasure(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unitOfMeasure%2Did", id);
        return new UnitOfMeasureItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the vendors property of the microsoft.graph.company entity.
     * @param id Unique identifier of the item
     * @return a VendorItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public VendorItemRequestBuilder vendors(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("vendor%2Did", id);
        return new VendorItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Get companies from financials */
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
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class GetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
        /**
         * Instantiates a new GetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public GetRequestConfiguration() {
        }
    }
}
