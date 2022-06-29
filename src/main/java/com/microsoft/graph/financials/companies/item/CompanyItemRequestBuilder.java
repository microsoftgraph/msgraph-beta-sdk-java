package microsoft.graph.financials.companies.item;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.financials.companies.item.accounts.AccountsRequestBuilder;
import microsoft.graph.financials.companies.item.accounts.item.AccountItemRequestBuilder;
import microsoft.graph.financials.companies.item.agedaccountspayable.AgedAccountsPayableRequestBuilder;
import microsoft.graph.financials.companies.item.agedaccountspayable.item.AgedAccountsPayableItemRequestBuilder;
import microsoft.graph.financials.companies.item.agedaccountsreceivable.AgedAccountsReceivableRequestBuilder;
import microsoft.graph.financials.companies.item.agedaccountsreceivable.item.AgedAccountsReceivableItemRequestBuilder;
import microsoft.graph.financials.companies.item.companyinformation.CompanyInformationRequestBuilder;
import microsoft.graph.financials.companies.item.companyinformation.item.CompanyInformationItemRequestBuilder;
import microsoft.graph.financials.companies.item.countriesregions.CountriesRegionsRequestBuilder;
import microsoft.graph.financials.companies.item.countriesregions.item.CountryRegionItemRequestBuilder;
import microsoft.graph.financials.companies.item.currencies.CurrenciesRequestBuilder;
import microsoft.graph.financials.companies.item.currencies.item.CurrencyItemRequestBuilder;
import microsoft.graph.financials.companies.item.customerpaymentjournals.CustomerPaymentJournalsRequestBuilder;
import microsoft.graph.financials.companies.item.customerpaymentjournals.item.CustomerPaymentJournalItemRequestBuilder;
import microsoft.graph.financials.companies.item.customerpayments.CustomerPaymentsRequestBuilder;
import microsoft.graph.financials.companies.item.customerpayments.item.CustomerPaymentItemRequestBuilder;
import microsoft.graph.financials.companies.item.customers.CustomersRequestBuilder;
import microsoft.graph.financials.companies.item.customers.item.CustomerItemRequestBuilder;
import microsoft.graph.financials.companies.item.dimensions.DimensionsRequestBuilder;
import microsoft.graph.financials.companies.item.dimensions.item.DimensionItemRequestBuilder;
import microsoft.graph.financials.companies.item.dimensionvalues.DimensionValuesRequestBuilder;
import microsoft.graph.financials.companies.item.dimensionvalues.item.DimensionValueItemRequestBuilder;
import microsoft.graph.financials.companies.item.employees.EmployeesRequestBuilder;
import microsoft.graph.financials.companies.item.employees.item.EmployeeItemRequestBuilder;
import microsoft.graph.financials.companies.item.generalledgerentries.GeneralLedgerEntriesRequestBuilder;
import microsoft.graph.financials.companies.item.generalledgerentries.item.GeneralLedgerEntryItemRequestBuilder;
import microsoft.graph.financials.companies.item.itemcategories.item.ItemCategoryItemRequestBuilder;
import microsoft.graph.financials.companies.item.itemcategories.ItemCategoriesRequestBuilder;
import microsoft.graph.financials.companies.item.items.item.ItemItemRequestBuilder;
import microsoft.graph.financials.companies.item.items.ItemsRequestBuilder;
import microsoft.graph.financials.companies.item.journallines.item.JournalLineItemRequestBuilder;
import microsoft.graph.financials.companies.item.journallines.JournalLinesRequestBuilder;
import microsoft.graph.financials.companies.item.journals.item.JournalItemRequestBuilder;
import microsoft.graph.financials.companies.item.journals.JournalsRequestBuilder;
import microsoft.graph.financials.companies.item.paymentmethods.item.PaymentMethodItemRequestBuilder;
import microsoft.graph.financials.companies.item.paymentmethods.PaymentMethodsRequestBuilder;
import microsoft.graph.financials.companies.item.paymentterms.item.PaymentTermItemRequestBuilder;
import microsoft.graph.financials.companies.item.paymentterms.PaymentTermsRequestBuilder;
import microsoft.graph.financials.companies.item.picture.item.PictureItemRequestBuilder;
import microsoft.graph.financials.companies.item.picture.PictureRequestBuilder;
import microsoft.graph.financials.companies.item.purchaseinvoicelines.item.PurchaseInvoiceLineItemRequestBuilder;
import microsoft.graph.financials.companies.item.purchaseinvoicelines.PurchaseInvoiceLinesRequestBuilder;
import microsoft.graph.financials.companies.item.purchaseinvoices.item.PurchaseInvoiceItemRequestBuilder;
import microsoft.graph.financials.companies.item.purchaseinvoices.PurchaseInvoicesRequestBuilder;
import microsoft.graph.financials.companies.item.salescreditmemolines.item.SalesCreditMemoLineItemRequestBuilder;
import microsoft.graph.financials.companies.item.salescreditmemolines.SalesCreditMemoLinesRequestBuilder;
import microsoft.graph.financials.companies.item.salescreditmemos.item.SalesCreditMemoItemRequestBuilder;
import microsoft.graph.financials.companies.item.salescreditmemos.SalesCreditMemosRequestBuilder;
import microsoft.graph.financials.companies.item.salesinvoicelines.item.SalesInvoiceLineItemRequestBuilder;
import microsoft.graph.financials.companies.item.salesinvoicelines.SalesInvoiceLinesRequestBuilder;
import microsoft.graph.financials.companies.item.salesinvoices.item.SalesInvoiceItemRequestBuilder;
import microsoft.graph.financials.companies.item.salesinvoices.SalesInvoicesRequestBuilder;
import microsoft.graph.financials.companies.item.salesorderlines.item.SalesOrderLineItemRequestBuilder;
import microsoft.graph.financials.companies.item.salesorderlines.SalesOrderLinesRequestBuilder;
import microsoft.graph.financials.companies.item.salesorders.item.SalesOrderItemRequestBuilder;
import microsoft.graph.financials.companies.item.salesorders.SalesOrdersRequestBuilder;
import microsoft.graph.financials.companies.item.salesquotelines.item.SalesQuoteLineItemRequestBuilder;
import microsoft.graph.financials.companies.item.salesquotelines.SalesQuoteLinesRequestBuilder;
import microsoft.graph.financials.companies.item.salesquotes.item.SalesQuoteItemRequestBuilder;
import microsoft.graph.financials.companies.item.salesquotes.SalesQuotesRequestBuilder;
import microsoft.graph.financials.companies.item.shipmentmethods.item.ShipmentMethodItemRequestBuilder;
import microsoft.graph.financials.companies.item.shipmentmethods.ShipmentMethodsRequestBuilder;
import microsoft.graph.financials.companies.item.taxareas.item.TaxAreaItemRequestBuilder;
import microsoft.graph.financials.companies.item.taxareas.TaxAreasRequestBuilder;
import microsoft.graph.financials.companies.item.taxgroups.item.TaxGroupItemRequestBuilder;
import microsoft.graph.financials.companies.item.taxgroups.TaxGroupsRequestBuilder;
import microsoft.graph.financials.companies.item.unitsofmeasure.item.UnitOfMeasureItemRequestBuilder;
import microsoft.graph.financials.companies.item.unitsofmeasure.UnitsOfMeasureRequestBuilder;
import microsoft.graph.financials.companies.item.vendors.item.VendorItemRequestBuilder;
import microsoft.graph.financials.companies.item.vendors.VendorsRequestBuilder;
import microsoft.graph.models.Company;
import microsoft.graph.models.odataerrors.ODataError;
/** Provides operations to manage the companies property of the microsoft.graph.financials entity. */
public class CompanyItemRequestBuilder {
    /** The accounts property */
    @javax.annotation.Nonnull
    public AccountsRequestBuilder accounts() {
        return new AccountsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The agedAccountsPayable property */
    @javax.annotation.Nonnull
    public AgedAccountsPayableRequestBuilder agedAccountsPayable() {
        return new AgedAccountsPayableRequestBuilder(pathParameters, requestAdapter);
    }
    /** The agedAccountsReceivable property */
    @javax.annotation.Nonnull
    public AgedAccountsReceivableRequestBuilder agedAccountsReceivable() {
        return new AgedAccountsReceivableRequestBuilder(pathParameters, requestAdapter);
    }
    /** The companyInformation property */
    @javax.annotation.Nonnull
    public CompanyInformationRequestBuilder companyInformation() {
        return new CompanyInformationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The countriesRegions property */
    @javax.annotation.Nonnull
    public CountriesRegionsRequestBuilder countriesRegions() {
        return new CountriesRegionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The currencies property */
    @javax.annotation.Nonnull
    public CurrenciesRequestBuilder currencies() {
        return new CurrenciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The customerPaymentJournals property */
    @javax.annotation.Nonnull
    public CustomerPaymentJournalsRequestBuilder customerPaymentJournals() {
        return new CustomerPaymentJournalsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The customerPayments property */
    @javax.annotation.Nonnull
    public CustomerPaymentsRequestBuilder customerPayments() {
        return new CustomerPaymentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The customers property */
    @javax.annotation.Nonnull
    public CustomersRequestBuilder customers() {
        return new CustomersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The dimensions property */
    @javax.annotation.Nonnull
    public DimensionsRequestBuilder dimensions() {
        return new DimensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The dimensionValues property */
    @javax.annotation.Nonnull
    public DimensionValuesRequestBuilder dimensionValues() {
        return new DimensionValuesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The employees property */
    @javax.annotation.Nonnull
    public EmployeesRequestBuilder employees() {
        return new EmployeesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The generalLedgerEntries property */
    @javax.annotation.Nonnull
    public GeneralLedgerEntriesRequestBuilder generalLedgerEntries() {
        return new GeneralLedgerEntriesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The itemCategories property */
    @javax.annotation.Nonnull
    public ItemCategoriesRequestBuilder itemCategories() {
        return new ItemCategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The items property */
    @javax.annotation.Nonnull
    public ItemsRequestBuilder items() {
        return new ItemsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The journalLines property */
    @javax.annotation.Nonnull
    public JournalLinesRequestBuilder journalLines() {
        return new JournalLinesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The journals property */
    @javax.annotation.Nonnull
    public JournalsRequestBuilder journals() {
        return new JournalsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The paymentMethods property */
    @javax.annotation.Nonnull
    public PaymentMethodsRequestBuilder paymentMethods() {
        return new PaymentMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The paymentTerms property */
    @javax.annotation.Nonnull
    public PaymentTermsRequestBuilder paymentTerms() {
        return new PaymentTermsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The picture property */
    @javax.annotation.Nonnull
    public PictureRequestBuilder picture() {
        return new PictureRequestBuilder(pathParameters, requestAdapter);
    }
    /** The purchaseInvoiceLines property */
    @javax.annotation.Nonnull
    public PurchaseInvoiceLinesRequestBuilder purchaseInvoiceLines() {
        return new PurchaseInvoiceLinesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The purchaseInvoices property */
    @javax.annotation.Nonnull
    public PurchaseInvoicesRequestBuilder purchaseInvoices() {
        return new PurchaseInvoicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** The salesCreditMemoLines property */
    @javax.annotation.Nonnull
    public SalesCreditMemoLinesRequestBuilder salesCreditMemoLines() {
        return new SalesCreditMemoLinesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The salesCreditMemos property */
    @javax.annotation.Nonnull
    public SalesCreditMemosRequestBuilder salesCreditMemos() {
        return new SalesCreditMemosRequestBuilder(pathParameters, requestAdapter);
    }
    /** The salesInvoiceLines property */
    @javax.annotation.Nonnull
    public SalesInvoiceLinesRequestBuilder salesInvoiceLines() {
        return new SalesInvoiceLinesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The salesInvoices property */
    @javax.annotation.Nonnull
    public SalesInvoicesRequestBuilder salesInvoices() {
        return new SalesInvoicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The salesOrderLines property */
    @javax.annotation.Nonnull
    public SalesOrderLinesRequestBuilder salesOrderLines() {
        return new SalesOrderLinesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The salesOrders property */
    @javax.annotation.Nonnull
    public SalesOrdersRequestBuilder salesOrders() {
        return new SalesOrdersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The salesQuoteLines property */
    @javax.annotation.Nonnull
    public SalesQuoteLinesRequestBuilder salesQuoteLines() {
        return new SalesQuoteLinesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The salesQuotes property */
    @javax.annotation.Nonnull
    public SalesQuotesRequestBuilder salesQuotes() {
        return new SalesQuotesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The shipmentMethods property */
    @javax.annotation.Nonnull
    public ShipmentMethodsRequestBuilder shipmentMethods() {
        return new ShipmentMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The taxAreas property */
    @javax.annotation.Nonnull
    public TaxAreasRequestBuilder taxAreas() {
        return new TaxAreasRequestBuilder(pathParameters, requestAdapter);
    }
    /** The taxGroups property */
    @javax.annotation.Nonnull
    public TaxGroupsRequestBuilder taxGroups() {
        return new TaxGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The unitsOfMeasure property */
    @javax.annotation.Nonnull
    public UnitsOfMeasureRequestBuilder unitsOfMeasure() {
        return new UnitsOfMeasureRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /** The vendors property */
    @javax.annotation.Nonnull
    public VendorsRequestBuilder vendors() {
        return new VendorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.accounts.item collection
     * @param id Unique identifier of the item
     * @return a accountItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AccountItemRequestBuilder accounts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("account%2Did", id);
        return new AccountItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.agedAccountsPayable.item collection
     * @param id Unique identifier of the item
     * @return a agedAccountsPayableItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AgedAccountsPayableItemRequestBuilder agedAccountsPayable(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("agedAccountsPayable%2Did", id);
        return new AgedAccountsPayableItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.agedAccountsReceivable.item collection
     * @param id Unique identifier of the item
     * @return a agedAccountsReceivableItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AgedAccountsReceivableItemRequestBuilder agedAccountsReceivable(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("agedAccountsReceivable%2Did", id);
        return new AgedAccountsReceivableItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.companyInformation.item collection
     * @param id Unique identifier of the item
     * @return a companyInformationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CompanyInformationItemRequestBuilder companyInformation(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("companyInformation%2Did", id);
        return new CompanyInformationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new CompanyItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public CompanyItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/financials/companies/{company%2Did}{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new CompanyItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public CompanyItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/financials/companies/{company%2Did}{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.countriesRegions.item collection
     * @param id Unique identifier of the item
     * @return a countryRegionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CountryRegionItemRequestBuilder countriesRegions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
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
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<CompanyItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final CompanyItemRequestBuilderGetRequestConfiguration requestConfig = new CompanyItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.currencies.item collection
     * @param id Unique identifier of the item
     * @return a currencyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CurrencyItemRequestBuilder currencies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("currency%2Did", id);
        return new CurrencyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.customerPaymentJournals.item collection
     * @param id Unique identifier of the item
     * @return a customerPaymentJournalItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CustomerPaymentJournalItemRequestBuilder customerPaymentJournals(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("customerPaymentJournal%2Did", id);
        return new CustomerPaymentJournalItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.customerPayments.item collection
     * @param id Unique identifier of the item
     * @return a customerPaymentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CustomerPaymentItemRequestBuilder customerPayments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("customerPayment%2Did", id);
        return new CustomerPaymentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.customers.item collection
     * @param id Unique identifier of the item
     * @return a customerItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CustomerItemRequestBuilder customers(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("customer%2Did", id);
        return new CustomerItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.dimensions.item collection
     * @param id Unique identifier of the item
     * @return a dimensionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DimensionItemRequestBuilder dimensions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("dimension%2Did", id);
        return new DimensionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.dimensionValues.item collection
     * @param id Unique identifier of the item
     * @return a dimensionValueItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DimensionValueItemRequestBuilder dimensionValues(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("dimensionValue%2Did", id);
        return new DimensionValueItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.employees.item collection
     * @param id Unique identifier of the item
     * @return a employeeItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EmployeeItemRequestBuilder employees(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("employee%2Did", id);
        return new EmployeeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.generalLedgerEntries.item collection
     * @param id Unique identifier of the item
     * @return a generalLedgerEntryItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GeneralLedgerEntryItemRequestBuilder generalLedgerEntries(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("generalLedgerEntry%2Did", id);
        return new GeneralLedgerEntryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get companies from financials
     * @return a CompletableFuture of company
     */
    public java.util.concurrent.CompletableFuture<Company> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Company::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get companies from financials
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of company
     */
    public java.util.concurrent.CompletableFuture<Company> get(@javax.annotation.Nullable final java.util.function.Consumer<CompanyItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Company::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get companies from financials
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of company
     */
    public java.util.concurrent.CompletableFuture<Company> get(@javax.annotation.Nullable final java.util.function.Consumer<CompanyItemRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Company::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.itemCategories.item collection
     * @param id Unique identifier of the item
     * @return a itemCategoryItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ItemCategoryItemRequestBuilder itemCategories(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("itemCategory%2Did", id);
        return new ItemCategoryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.items.item collection
     * @param id Unique identifier of the item
     * @return a itemItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ItemItemRequestBuilder items(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("item%2Did", id);
        return new ItemItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.journalLines.item collection
     * @param id Unique identifier of the item
     * @return a journalLineItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public JournalLineItemRequestBuilder journalLines(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("journalLine%2Did", id);
        return new JournalLineItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.journals.item collection
     * @param id Unique identifier of the item
     * @return a journalItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public JournalItemRequestBuilder journals(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("journal%2Did", id);
        return new JournalItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.paymentMethods.item collection
     * @param id Unique identifier of the item
     * @return a paymentMethodItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PaymentMethodItemRequestBuilder paymentMethods(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("paymentMethod%2Did", id);
        return new PaymentMethodItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.paymentTerms.item collection
     * @param id Unique identifier of the item
     * @return a paymentTermItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PaymentTermItemRequestBuilder paymentTerms(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("paymentTerm%2Did", id);
        return new PaymentTermItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.picture.item collection
     * @param id Unique identifier of the item
     * @return a pictureItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PictureItemRequestBuilder picture(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("picture%2Did", id);
        return new PictureItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.purchaseInvoiceLines.item collection
     * @param id Unique identifier of the item
     * @return a purchaseInvoiceLineItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PurchaseInvoiceLineItemRequestBuilder purchaseInvoiceLines(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("purchaseInvoiceLine%2Did", id);
        return new PurchaseInvoiceLineItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.purchaseInvoices.item collection
     * @param id Unique identifier of the item
     * @return a purchaseInvoiceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PurchaseInvoiceItemRequestBuilder purchaseInvoices(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("purchaseInvoice%2Did", id);
        return new PurchaseInvoiceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.salesCreditMemoLines.item collection
     * @param id Unique identifier of the item
     * @return a salesCreditMemoLineItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SalesCreditMemoLineItemRequestBuilder salesCreditMemoLines(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("salesCreditMemoLine%2Did", id);
        return new SalesCreditMemoLineItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.salesCreditMemos.item collection
     * @param id Unique identifier of the item
     * @return a salesCreditMemoItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SalesCreditMemoItemRequestBuilder salesCreditMemos(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("salesCreditMemo%2Did", id);
        return new SalesCreditMemoItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.salesInvoiceLines.item collection
     * @param id Unique identifier of the item
     * @return a salesInvoiceLineItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SalesInvoiceLineItemRequestBuilder salesInvoiceLines(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("salesInvoiceLine%2Did", id);
        return new SalesInvoiceLineItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.salesInvoices.item collection
     * @param id Unique identifier of the item
     * @return a salesInvoiceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SalesInvoiceItemRequestBuilder salesInvoices(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("salesInvoice%2Did", id);
        return new SalesInvoiceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.salesOrderLines.item collection
     * @param id Unique identifier of the item
     * @return a salesOrderLineItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SalesOrderLineItemRequestBuilder salesOrderLines(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("salesOrderLine%2Did", id);
        return new SalesOrderLineItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.salesOrders.item collection
     * @param id Unique identifier of the item
     * @return a salesOrderItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SalesOrderItemRequestBuilder salesOrders(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("salesOrder%2Did", id);
        return new SalesOrderItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.salesQuoteLines.item collection
     * @param id Unique identifier of the item
     * @return a salesQuoteLineItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SalesQuoteLineItemRequestBuilder salesQuoteLines(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("salesQuoteLine%2Did", id);
        return new SalesQuoteLineItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.salesQuotes.item collection
     * @param id Unique identifier of the item
     * @return a salesQuoteItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SalesQuoteItemRequestBuilder salesQuotes(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("salesQuote%2Did", id);
        return new SalesQuoteItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.shipmentMethods.item collection
     * @param id Unique identifier of the item
     * @return a shipmentMethodItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ShipmentMethodItemRequestBuilder shipmentMethods(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("shipmentMethod%2Did", id);
        return new ShipmentMethodItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.taxAreas.item collection
     * @param id Unique identifier of the item
     * @return a taxAreaItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TaxAreaItemRequestBuilder taxAreas(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("taxArea%2Did", id);
        return new TaxAreaItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.taxGroups.item collection
     * @param id Unique identifier of the item
     * @return a taxGroupItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TaxGroupItemRequestBuilder taxGroups(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("taxGroup%2Did", id);
        return new TaxGroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.unitsOfMeasure.item collection
     * @param id Unique identifier of the item
     * @return a unitOfMeasureItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnitOfMeasureItemRequestBuilder unitsOfMeasure(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unitOfMeasure%2Did", id);
        return new UnitOfMeasureItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.financials.companies.item.vendors.item collection
     * @param id Unique identifier of the item
     * @return a vendorItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public VendorItemRequestBuilder vendors(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("vendor%2Did", id);
        return new VendorItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Get companies from financials */
    public class CompanyItemRequestBuilderGetQueryParameters {
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
    public class CompanyItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public CompanyItemRequestBuilderGetQueryParameters queryParameters = new CompanyItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new companyItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public CompanyItemRequestBuilderGetRequestConfiguration() {
        }
    }
}
