package com.microsoft.graph.beta.admin.windows.updates.updatepolicies.item.audience;

import com.microsoft.graph.beta.admin.windows.updates.updatepolicies.item.audience.applicablecontent.ApplicableContentRequestBuilder;
import com.microsoft.graph.beta.admin.windows.updates.updatepolicies.item.audience.exclusions.ExclusionsRequestBuilder;
import com.microsoft.graph.beta.admin.windows.updates.updatepolicies.item.audience.members.MembersRequestBuilder;
import com.microsoft.graph.beta.admin.windows.updates.updatepolicies.item.audience.microsoftgraphwindowsupdatesupdateaudience.MicrosoftGraphWindowsUpdatesUpdateAudienceRequestBuilder;
import com.microsoft.graph.beta.admin.windows.updates.updatepolicies.item.audience.microsoftgraphwindowsupdatesupdateaudiencebyid.MicrosoftGraphWindowsUpdatesUpdateAudienceByIdRequestBuilder;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.windowsupdates.DeploymentAudience;
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
 * Provides operations to manage the audience property of the microsoft.graph.windowsUpdates.updatePolicy entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AudienceRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the applicableContent property of the microsoft.graph.windowsUpdates.deploymentAudience entity.
     * @return a {@link ApplicableContentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApplicableContentRequestBuilder applicableContent() {
        return new ApplicableContentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the exclusions property of the microsoft.graph.windowsUpdates.deploymentAudience entity.
     * @return a {@link ExclusionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExclusionsRequestBuilder exclusions() {
        return new ExclusionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the members property of the microsoft.graph.windowsUpdates.deploymentAudience entity.
     * @return a {@link MembersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MembersRequestBuilder members() {
        return new MembersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the updateAudience method.
     * @return a {@link MicrosoftGraphWindowsUpdatesUpdateAudienceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphWindowsUpdatesUpdateAudienceRequestBuilder microsoftGraphWindowsUpdatesUpdateAudience() {
        return new MicrosoftGraphWindowsUpdatesUpdateAudienceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the updateAudienceById method.
     * @return a {@link MicrosoftGraphWindowsUpdatesUpdateAudienceByIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphWindowsUpdatesUpdateAudienceByIdRequestBuilder microsoftGraphWindowsUpdatesUpdateAudienceById() {
        return new MicrosoftGraphWindowsUpdatesUpdateAudienceByIdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link AudienceRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AudienceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/windows/updates/updatePolicies/{updatePolicy%2Did}/audience{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link AudienceRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AudienceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/windows/updates/updatePolicies/{updatePolicy%2Did}/audience{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property audience for admin
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property audience for admin
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
     * Specifies the audience to target.
     * @return a {@link DeploymentAudience}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DeploymentAudience get() {
        return get(null);
    }
    /**
     * Specifies the audience to target.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DeploymentAudience}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DeploymentAudience get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeploymentAudience::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property audience in admin
     * @param body The request body
     * @return a {@link DeploymentAudience}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DeploymentAudience patch(@jakarta.annotation.Nonnull final DeploymentAudience body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property audience in admin
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DeploymentAudience}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DeploymentAudience patch(@jakarta.annotation.Nonnull final DeploymentAudience body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeploymentAudience::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property audience for admin
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property audience for admin
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * Specifies the audience to target.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Specifies the audience to target.
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
     * Update the navigation property audience in admin
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DeploymentAudience body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property audience in admin
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DeploymentAudience body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link AudienceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AudienceRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AudienceRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Specifies the audience to target.
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
