package com.microsoft.graph.beta.admin;

import com.microsoft.graph.beta.admin.appsandservices.AppsAndServicesRequestBuilder;
import com.microsoft.graph.beta.admin.configurationmanagement.ConfigurationManagementRequestBuilder;
import com.microsoft.graph.beta.admin.dynamics.DynamicsRequestBuilder;
import com.microsoft.graph.beta.admin.edge.EdgeRequestBuilder;
import com.microsoft.graph.beta.admin.entra.EntraRequestBuilder;
import com.microsoft.graph.beta.admin.exchange.ExchangeRequestBuilder;
import com.microsoft.graph.beta.admin.forms.FormsRequestBuilder;
import com.microsoft.graph.beta.admin.microsoft365apps.Microsoft365AppsRequestBuilder;
import com.microsoft.graph.beta.admin.people.PeopleRequestBuilder;
import com.microsoft.graph.beta.admin.reportsettings.ReportSettingsRequestBuilder;
import com.microsoft.graph.beta.admin.serviceannouncement.ServiceAnnouncementRequestBuilder;
import com.microsoft.graph.beta.admin.sharepoint.SharepointRequestBuilder;
import com.microsoft.graph.beta.admin.teams.TeamsRequestBuilder;
import com.microsoft.graph.beta.admin.todo.TodoRequestBuilder;
import com.microsoft.graph.beta.admin.windows.WindowsRequestBuilder;
import com.microsoft.graph.beta.models.Admin;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the admin singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdminRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the appsAndServices property of the microsoft.graph.admin entity.
     * @return a {@link AppsAndServicesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppsAndServicesRequestBuilder appsAndServices() {
        return new AppsAndServicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the configurationManagement property of the microsoft.graph.admin entity.
     * @return a {@link ConfigurationManagementRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConfigurationManagementRequestBuilder configurationManagement() {
        return new ConfigurationManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the dynamics property of the microsoft.graph.admin entity.
     * @return a {@link DynamicsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DynamicsRequestBuilder dynamics() {
        return new DynamicsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the edge property of the microsoft.graph.admin entity.
     * @return a {@link EdgeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EdgeRequestBuilder edge() {
        return new EdgeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the entra property of the microsoft.graph.admin entity.
     * @return a {@link EntraRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EntraRequestBuilder entra() {
        return new EntraRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the exchange property of the microsoft.graph.admin entity.
     * @return a {@link ExchangeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExchangeRequestBuilder exchange() {
        return new ExchangeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the forms property of the microsoft.graph.admin entity.
     * @return a {@link FormsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FormsRequestBuilder forms() {
        return new FormsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the microsoft365Apps property of the microsoft.graph.admin entity.
     * @return a {@link Microsoft365AppsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public Microsoft365AppsRequestBuilder microsoft365Apps() {
        return new Microsoft365AppsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the people property of the microsoft.graph.admin entity.
     * @return a {@link PeopleRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PeopleRequestBuilder people() {
        return new PeopleRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the reportSettings property of the microsoft.graph.admin entity.
     * @return a {@link ReportSettingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReportSettingsRequestBuilder reportSettings() {
        return new ReportSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the serviceAnnouncement property of the microsoft.graph.admin entity.
     * @return a {@link ServiceAnnouncementRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ServiceAnnouncementRequestBuilder serviceAnnouncement() {
        return new ServiceAnnouncementRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sharepoint property of the microsoft.graph.admin entity.
     * @return a {@link SharepointRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SharepointRequestBuilder sharepoint() {
        return new SharepointRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the teams property of the microsoft.graph.admin entity.
     * @return a {@link TeamsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TeamsRequestBuilder teams() {
        return new TeamsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the todo property of the microsoft.graph.admin entity.
     * @return a {@link TodoRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TodoRequestBuilder todo() {
        return new TodoRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the windows property of the microsoft.graph.admin entity.
     * @return a {@link WindowsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WindowsRequestBuilder windows() {
        return new WindowsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link AdminRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AdminRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link AdminRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AdminRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get admin
     * @return a {@link Admin}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Admin get() {
        return get(null);
    }
    /**
     * Get admin
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Admin}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Admin get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Admin::createFromDiscriminatorValue);
    }
    /**
     * Update admin
     * @param body The request body
     * @return a {@link Admin}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Admin patch(@jakarta.annotation.Nonnull final Admin body) {
        return patch(body, null);
    }
    /**
     * Update admin
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Admin}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Admin patch(@jakarta.annotation.Nonnull final Admin body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Admin::createFromDiscriminatorValue);
    }
    /**
     * Get admin
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get admin
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update admin
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Admin body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update admin
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Admin body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link AdminRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AdminRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AdminRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get admin
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
