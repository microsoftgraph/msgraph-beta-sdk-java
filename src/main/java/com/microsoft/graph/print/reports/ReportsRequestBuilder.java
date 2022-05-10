package microsoft.graph.print.reports;

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
import microsoft.graph.models.odataerrors.ODataError;
import microsoft.graph.models.ReportRoot;
import microsoft.graph.print.reports.applicationsignindetailedsummary.ApplicationSignInDetailedSummaryRequestBuilder;
import microsoft.graph.print.reports.applicationsignindetailedsummary.item.ApplicationSignInDetailedSummaryItemRequestBuilder;
import microsoft.graph.print.reports.authenticationmethods.AuthenticationMethodsRequestBuilder;
import microsoft.graph.print.reports.credentialuserregistrationdetails.CredentialUserRegistrationDetailsRequestBuilder;
import microsoft.graph.print.reports.credentialuserregistrationdetails.item.CredentialUserRegistrationDetailsItemRequestBuilder;
import microsoft.graph.print.reports.dailyprintusagebyprinter.DailyPrintUsageByPrinterRequestBuilder;
import microsoft.graph.print.reports.dailyprintusagebyuser.DailyPrintUsageByUserRequestBuilder;
import microsoft.graph.print.reports.dailyprintusagesummariesbyprinter.DailyPrintUsageSummariesByPrinterRequestBuilder;
import microsoft.graph.print.reports.dailyprintusagesummariesbyuser.DailyPrintUsageSummariesByUserRequestBuilder;
import microsoft.graph.print.reports.monthlyprintusagebyprinter.MonthlyPrintUsageByPrinterRequestBuilder;
import microsoft.graph.print.reports.monthlyprintusagebyuser.MonthlyPrintUsageByUserRequestBuilder;
import microsoft.graph.print.reports.monthlyprintusagesummariesbyprinter.MonthlyPrintUsageSummariesByPrinterRequestBuilder;
import microsoft.graph.print.reports.monthlyprintusagesummariesbyuser.MonthlyPrintUsageSummariesByUserRequestBuilder;
import microsoft.graph.print.reports.usercredentialusagedetails.item.UserCredentialUsageDetailsItemRequestBuilder;
import microsoft.graph.print.reports.usercredentialusagedetails.UserCredentialUsageDetailsRequestBuilder;
/** Provides operations to manage the reports property of the microsoft.graph.print entity. */
public class ReportsRequestBuilder {
    /** The applicationSignInDetailedSummary property */
    @javax.annotation.Nonnull
    public ApplicationSignInDetailedSummaryRequestBuilder applicationSignInDetailedSummary() {
        return new ApplicationSignInDetailedSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /** The authenticationMethods property */
    @javax.annotation.Nonnull
    public AuthenticationMethodsRequestBuilder authenticationMethods() {
        return new AuthenticationMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The credentialUserRegistrationDetails property */
    @javax.annotation.Nonnull
    public CredentialUserRegistrationDetailsRequestBuilder credentialUserRegistrationDetails() {
        return new CredentialUserRegistrationDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The dailyPrintUsageByPrinter property */
    @javax.annotation.Nonnull
    public DailyPrintUsageByPrinterRequestBuilder dailyPrintUsageByPrinter() {
        return new DailyPrintUsageByPrinterRequestBuilder(pathParameters, requestAdapter);
    }
    /** The dailyPrintUsageByUser property */
    @javax.annotation.Nonnull
    public DailyPrintUsageByUserRequestBuilder dailyPrintUsageByUser() {
        return new DailyPrintUsageByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /** The dailyPrintUsageSummariesByPrinter property */
    @javax.annotation.Nonnull
    public DailyPrintUsageSummariesByPrinterRequestBuilder dailyPrintUsageSummariesByPrinter() {
        return new DailyPrintUsageSummariesByPrinterRequestBuilder(pathParameters, requestAdapter);
    }
    /** The dailyPrintUsageSummariesByUser property */
    @javax.annotation.Nonnull
    public DailyPrintUsageSummariesByUserRequestBuilder dailyPrintUsageSummariesByUser() {
        return new DailyPrintUsageSummariesByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /** The monthlyPrintUsageByPrinter property */
    @javax.annotation.Nonnull
    public MonthlyPrintUsageByPrinterRequestBuilder monthlyPrintUsageByPrinter() {
        return new MonthlyPrintUsageByPrinterRequestBuilder(pathParameters, requestAdapter);
    }
    /** The monthlyPrintUsageByUser property */
    @javax.annotation.Nonnull
    public MonthlyPrintUsageByUserRequestBuilder monthlyPrintUsageByUser() {
        return new MonthlyPrintUsageByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /** The monthlyPrintUsageSummariesByPrinter property */
    @javax.annotation.Nonnull
    public MonthlyPrintUsageSummariesByPrinterRequestBuilder monthlyPrintUsageSummariesByPrinter() {
        return new MonthlyPrintUsageSummariesByPrinterRequestBuilder(pathParameters, requestAdapter);
    }
    /** The monthlyPrintUsageSummariesByUser property */
    @javax.annotation.Nonnull
    public MonthlyPrintUsageSummariesByUserRequestBuilder monthlyPrintUsageSummariesByUser() {
        return new MonthlyPrintUsageSummariesByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /** The userCredentialUsageDetails property */
    @javax.annotation.Nonnull
    public UserCredentialUsageDetailsRequestBuilder userCredentialUsageDetails() {
        return new UserCredentialUsageDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.print.reports.applicationSignInDetailedSummary.item collection
     * @param id Unique identifier of the item
     * @return a applicationSignInDetailedSummaryItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ApplicationSignInDetailedSummaryItemRequestBuilder applicationSignInDetailedSummary(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("applicationSignInDetailedSummary%2Did", id);
        return new ApplicationSignInDetailedSummaryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ReportsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public ReportsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/print/reports{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new ReportsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public ReportsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/print/reports{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property reports for print
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property reports for print
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<ReportsRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final ReportsRequestBuilderDeleteRequestConfiguration requestConfig = new ReportsRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get reports from print
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get reports from print
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<ReportsRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final ReportsRequestBuilderGetRequestConfiguration requestConfig = new ReportsRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property reports in print
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final ReportRoot body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property reports in print
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final ReportRoot body, @javax.annotation.Nullable final java.util.function.Consumer<ReportsRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final ReportsRequestBuilderPatchRequestConfiguration requestConfig = new ReportsRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Gets an item from the Microsoft.Graph.print.reports.credentialUserRegistrationDetails.item collection
     * @param id Unique identifier of the item
     * @return a credentialUserRegistrationDetailsItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CredentialUserRegistrationDetailsItemRequestBuilder credentialUserRegistrationDetails(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("credentialUserRegistrationDetails%2Did", id);
        return new CredentialUserRegistrationDetailsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.print.reports.dailyPrintUsageByPrinter.item collection
     * @param id Unique identifier of the item
     * @return a printUsageByPrinterItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.print.reports.dailyprintusagebyprinter.item.PrintUsageByPrinterItemRequestBuilder dailyPrintUsageByPrinter(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("printUsageByPrinter%2Did", id);
        return new microsoft.graph.print.reports.dailyprintusagebyprinter.item.PrintUsageByPrinterItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.print.reports.dailyPrintUsageByUser.item collection
     * @param id Unique identifier of the item
     * @return a printUsageByUserItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.print.reports.dailyprintusagebyuser.item.PrintUsageByUserItemRequestBuilder dailyPrintUsageByUser(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("printUsageByUser%2Did", id);
        return new microsoft.graph.print.reports.dailyprintusagebyuser.item.PrintUsageByUserItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.print.reports.dailyPrintUsageSummariesByPrinter.item collection
     * @param id Unique identifier of the item
     * @return a printUsageByPrinterItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.print.reports.dailyprintusagesummariesbyprinter.item.PrintUsageByPrinterItemRequestBuilder dailyPrintUsageSummariesByPrinter(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("printUsageByPrinter%2Did", id);
        return new microsoft.graph.print.reports.dailyprintusagesummariesbyprinter.item.PrintUsageByPrinterItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.print.reports.dailyPrintUsageSummariesByUser.item collection
     * @param id Unique identifier of the item
     * @return a printUsageByUserItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.print.reports.dailyprintusagesummariesbyuser.item.PrintUsageByUserItemRequestBuilder dailyPrintUsageSummariesByUser(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("printUsageByUser%2Did", id);
        return new microsoft.graph.print.reports.dailyprintusagesummariesbyuser.item.PrintUsageByUserItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete navigation property reports for print
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property reports for print
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<ReportsRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property reports for print
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<ReportsRequestBuilderDeleteRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get reports from print
     * @return a CompletableFuture of reportRoot
     */
    public java.util.concurrent.CompletableFuture<ReportRoot> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ReportRoot::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get reports from print
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of reportRoot
     */
    public java.util.concurrent.CompletableFuture<ReportRoot> get(@javax.annotation.Nullable final java.util.function.Consumer<ReportsRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ReportRoot::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get reports from print
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of reportRoot
     */
    public java.util.concurrent.CompletableFuture<ReportRoot> get(@javax.annotation.Nullable final java.util.function.Consumer<ReportsRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ReportRoot::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.print.reports.monthlyPrintUsageByPrinter.item collection
     * @param id Unique identifier of the item
     * @return a printUsageByPrinterItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.print.reports.monthlyprintusagebyprinter.item.PrintUsageByPrinterItemRequestBuilder monthlyPrintUsageByPrinter(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("printUsageByPrinter%2Did", id);
        return new microsoft.graph.print.reports.monthlyprintusagebyprinter.item.PrintUsageByPrinterItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.print.reports.monthlyPrintUsageByUser.item collection
     * @param id Unique identifier of the item
     * @return a printUsageByUserItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.print.reports.monthlyprintusagebyuser.item.PrintUsageByUserItemRequestBuilder monthlyPrintUsageByUser(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("printUsageByUser%2Did", id);
        return new microsoft.graph.print.reports.monthlyprintusagebyuser.item.PrintUsageByUserItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.print.reports.monthlyPrintUsageSummariesByPrinter.item collection
     * @param id Unique identifier of the item
     * @return a printUsageByPrinterItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.print.reports.monthlyprintusagesummariesbyprinter.item.PrintUsageByPrinterItemRequestBuilder monthlyPrintUsageSummariesByPrinter(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("printUsageByPrinter%2Did", id);
        return new microsoft.graph.print.reports.monthlyprintusagesummariesbyprinter.item.PrintUsageByPrinterItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.print.reports.monthlyPrintUsageSummariesByUser.item collection
     * @param id Unique identifier of the item
     * @return a printUsageByUserItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.print.reports.monthlyprintusagesummariesbyuser.item.PrintUsageByUserItemRequestBuilder monthlyPrintUsageSummariesByUser(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("printUsageByUser%2Did", id);
        return new microsoft.graph.print.reports.monthlyprintusagesummariesbyuser.item.PrintUsageByUserItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property reports in print
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final ReportRoot body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property reports in print
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final ReportRoot body, @javax.annotation.Nullable final java.util.function.Consumer<ReportsRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property reports in print
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final ReportRoot body, @javax.annotation.Nullable final java.util.function.Consumer<ReportsRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.print.reports.userCredentialUsageDetails.item collection
     * @param id Unique identifier of the item
     * @return a userCredentialUsageDetailsItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UserCredentialUsageDetailsItemRequestBuilder userCredentialUsageDetails(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("userCredentialUsageDetails%2Did", id);
        return new UserCredentialUsageDetailsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ReportsRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new reportsRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        public ReportsRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Get reports from print */
    public class ReportsRequestBuilderGetQueryParameters {
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
    public class ReportsRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public ReportsRequestBuilderGetQueryParameters queryParameters = new ReportsRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new reportsRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public ReportsRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ReportsRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new reportsRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public ReportsRequestBuilderPatchRequestConfiguration() {
        }
    }
}
