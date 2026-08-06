package com.microsoft.graph.beta.security.casemanagement.casetypeconfigurations.item;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.security.casemanagement.CaseTypeConfiguration;
import com.microsoft.graph.beta.security.casemanagement.casetypeconfigurations.item.customfields.CustomFieldsRequestBuilder;
import com.microsoft.graph.beta.security.casemanagement.casetypeconfigurations.item.statuses.StatusesRequestBuilder;
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
 * Provides operations to manage the caseTypeConfigurations property of the microsoft.graph.security.caseManagementRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CaseTypeConfigurationItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the customFields property of the microsoft.graph.security.caseManagement.caseTypeConfiguration entity.
     * @return a {@link CustomFieldsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CustomFieldsRequestBuilder customFields() {
        return new CustomFieldsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the statuses property of the microsoft.graph.security.caseManagement.caseTypeConfiguration entity.
     * @return a {@link StatusesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StatusesRequestBuilder statuses() {
        return new StatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link CaseTypeConfigurationItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CaseTypeConfigurationItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/caseManagement/caseTypeConfigurations/{caseTypeConfiguration%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link CaseTypeConfigurationItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CaseTypeConfigurationItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/caseManagement/caseTypeConfigurations/{caseTypeConfiguration%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * The collection of case type configurations that define the statuses and custom fields available for each case type. Read-only. Supports $select, $count, and $expand of the statuses and customFields relationships.
     * @return a {@link CaseTypeConfiguration}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public CaseTypeConfiguration get() {
        return get(null);
    }
    /**
     * The collection of case type configurations that define the statuses and custom fields available for each case type. Read-only. Supports $select, $count, and $expand of the statuses and customFields relationships.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CaseTypeConfiguration}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public CaseTypeConfiguration get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CaseTypeConfiguration::createFromDiscriminatorValue);
    }
    /**
     * The collection of case type configurations that define the statuses and custom fields available for each case type. Read-only. Supports $select, $count, and $expand of the statuses and customFields relationships.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The collection of case type configurations that define the statuses and custom fields available for each case type. Read-only. Supports $select, $count, and $expand of the statuses and customFields relationships.
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link CaseTypeConfigurationItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CaseTypeConfigurationItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CaseTypeConfigurationItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * The collection of case type configurations that define the statuses and custom fields available for each case type. Read-only. Supports $select, $count, and $expand of the statuses and customFields relationships.
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
}
