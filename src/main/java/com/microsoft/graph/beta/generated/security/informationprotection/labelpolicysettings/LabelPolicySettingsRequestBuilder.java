package com.microsoft.graph.beta.security.informationprotection.labelpolicysettings;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.security.InformationProtectionPolicySetting;
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
 * Provides operations to manage the labelPolicySettings property of the microsoft.graph.security.informationProtection entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LabelPolicySettingsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link LabelPolicySettingsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LabelPolicySettingsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/informationProtection/labelPolicySettings{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link LabelPolicySettingsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LabelPolicySettingsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/informationProtection/labelPolicySettings{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property labelPolicySettings for security
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property labelPolicySettings for security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Read the properties and relationships of an informationProtectionPolicySetting object. The settings exposed by this API should be used in applications to populate the moreInfoUrl property for Microsoft Purview Information Protection help, and indicate whether labeling is mandatory for the user and whether justification must be provided on downgrade.
     * @return a {@link InformationProtectionPolicySetting}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/security-informationprotectionpolicysetting-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public InformationProtectionPolicySetting get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of an informationProtectionPolicySetting object. The settings exposed by this API should be used in applications to populate the moreInfoUrl property for Microsoft Purview Information Protection help, and indicate whether labeling is mandatory for the user and whether justification must be provided on downgrade.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InformationProtectionPolicySetting}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/security-informationprotectionpolicysetting-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public InformationProtectionPolicySetting get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, InformationProtectionPolicySetting::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property labelPolicySettings in security
     * @param body The request body
     * @return a {@link InformationProtectionPolicySetting}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public InformationProtectionPolicySetting patch(@jakarta.annotation.Nonnull final InformationProtectionPolicySetting body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property labelPolicySettings in security
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InformationProtectionPolicySetting}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public InformationProtectionPolicySetting patch(@jakarta.annotation.Nonnull final InformationProtectionPolicySetting body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, InformationProtectionPolicySetting::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property labelPolicySettings for security
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property labelPolicySettings for security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Read the properties and relationships of an informationProtectionPolicySetting object. The settings exposed by this API should be used in applications to populate the moreInfoUrl property for Microsoft Purview Information Protection help, and indicate whether labeling is mandatory for the user and whether justification must be provided on downgrade.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of an informationProtectionPolicySetting object. The settings exposed by this API should be used in applications to populate the moreInfoUrl property for Microsoft Purview Information Protection help, and indicate whether labeling is mandatory for the user and whether justification must be provided on downgrade.
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
     * Update the navigation property labelPolicySettings in security
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final InformationProtectionPolicySetting body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property labelPolicySettings in security
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final InformationProtectionPolicySetting body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link LabelPolicySettingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LabelPolicySettingsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new LabelPolicySettingsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read the properties and relationships of an informationProtectionPolicySetting object. The settings exposed by this API should be used in applications to populate the moreInfoUrl property for Microsoft Purview Information Protection help, and indicate whether labeling is mandatory for the user and whether justification must be provided on downgrade.
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
