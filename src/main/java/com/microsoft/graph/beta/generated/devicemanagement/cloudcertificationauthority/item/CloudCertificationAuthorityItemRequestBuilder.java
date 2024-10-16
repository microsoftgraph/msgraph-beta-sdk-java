package com.microsoft.graph.beta.devicemanagement.cloudcertificationauthority.item;

import com.microsoft.graph.beta.devicemanagement.cloudcertificationauthority.item.changecloudcertificationauthoritystatus.ChangeCloudCertificationAuthorityStatusRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.cloudcertificationauthority.item.cloudcertificationauthorityleafcertificate.CloudCertificationAuthorityLeafCertificateRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.cloudcertificationauthority.item.getallcloudcertificationauthority.GetAllCloudCertificationAuthorityRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.cloudcertificationauthority.item.getallcloudcertificationauthorityleafcertificates.GetAllCloudCertificationAuthorityLeafCertificatesRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.cloudcertificationauthority.item.getcloudcertificationauthority.GetCloudCertificationAuthorityRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.cloudcertificationauthority.item.patchcloudcertificationauthority.PatchCloudCertificationAuthorityRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.cloudcertificationauthority.item.postcloudcertificationauthority.PostCloudCertificationAuthorityRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.cloudcertificationauthority.item.revokecloudcertificationauthoritycertificate.RevokeCloudCertificationAuthorityCertificateRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.cloudcertificationauthority.item.revokeleafcertificate.RevokeLeafCertificateRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.cloudcertificationauthority.item.uploadexternallysignedcertificationauthoritycertificate.UploadExternallySignedCertificationAuthorityCertificateRequestBuilder;
import com.microsoft.graph.beta.models.CloudCertificationAuthority;
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
 * Provides operations to manage the cloudCertificationAuthority property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudCertificationAuthorityItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the changeCloudCertificationAuthorityStatus method.
     * @return a {@link ChangeCloudCertificationAuthorityStatusRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChangeCloudCertificationAuthorityStatusRequestBuilder changeCloudCertificationAuthorityStatus() {
        return new ChangeCloudCertificationAuthorityStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the cloudCertificationAuthorityLeafCertificate property of the microsoft.graph.cloudCertificationAuthority entity.
     * @return a {@link CloudCertificationAuthorityLeafCertificateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CloudCertificationAuthorityLeafCertificateRequestBuilder cloudCertificationAuthorityLeafCertificate() {
        return new CloudCertificationAuthorityLeafCertificateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getAllCloudCertificationAuthority method.
     * @return a {@link GetAllCloudCertificationAuthorityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetAllCloudCertificationAuthorityRequestBuilder getAllCloudCertificationAuthority() {
        return new GetAllCloudCertificationAuthorityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getAllCloudCertificationAuthorityLeafCertificates method.
     * @return a {@link GetAllCloudCertificationAuthorityLeafCertificatesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetAllCloudCertificationAuthorityLeafCertificatesRequestBuilder getAllCloudCertificationAuthorityLeafCertificates() {
        return new GetAllCloudCertificationAuthorityLeafCertificatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getCloudCertificationAuthority method.
     * @return a {@link GetCloudCertificationAuthorityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCloudCertificationAuthorityRequestBuilder getCloudCertificationAuthority() {
        return new GetCloudCertificationAuthorityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the patchCloudCertificationAuthority method.
     * @return a {@link PatchCloudCertificationAuthorityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PatchCloudCertificationAuthorityRequestBuilder patchCloudCertificationAuthority() {
        return new PatchCloudCertificationAuthorityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the postCloudCertificationAuthority method.
     * @return a {@link PostCloudCertificationAuthorityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PostCloudCertificationAuthorityRequestBuilder postCloudCertificationAuthority() {
        return new PostCloudCertificationAuthorityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the revokeCloudCertificationAuthorityCertificate method.
     * @return a {@link RevokeCloudCertificationAuthorityCertificateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RevokeCloudCertificationAuthorityCertificateRequestBuilder revokeCloudCertificationAuthorityCertificate() {
        return new RevokeCloudCertificationAuthorityCertificateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the revokeLeafCertificate method.
     * @return a {@link RevokeLeafCertificateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RevokeLeafCertificateRequestBuilder revokeLeafCertificate() {
        return new RevokeLeafCertificateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the uploadExternallySignedCertificationAuthorityCertificate method.
     * @return a {@link UploadExternallySignedCertificationAuthorityCertificateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UploadExternallySignedCertificationAuthorityCertificateRequestBuilder uploadExternallySignedCertificationAuthorityCertificate() {
        return new UploadExternallySignedCertificationAuthorityCertificateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link CloudCertificationAuthorityItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CloudCertificationAuthorityItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/cloudCertificationAuthority/{cloudCertificationAuthority%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link CloudCertificationAuthorityItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CloudCertificationAuthorityItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/cloudCertificationAuthority/{cloudCertificationAuthority%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property cloudCertificationAuthority for deviceManagement
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property cloudCertificationAuthority for deviceManagement
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
     * Collection of CloudCertificationAuthority records associated with account.
     * @return a {@link CloudCertificationAuthority}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public CloudCertificationAuthority get() {
        return get(null);
    }
    /**
     * Collection of CloudCertificationAuthority records associated with account.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CloudCertificationAuthority}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public CloudCertificationAuthority get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudCertificationAuthority::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property cloudCertificationAuthority in deviceManagement
     * @param body The request body
     * @return a {@link CloudCertificationAuthority}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public CloudCertificationAuthority patch(@jakarta.annotation.Nonnull final CloudCertificationAuthority body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property cloudCertificationAuthority in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CloudCertificationAuthority}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public CloudCertificationAuthority patch(@jakarta.annotation.Nonnull final CloudCertificationAuthority body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudCertificationAuthority::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property cloudCertificationAuthority for deviceManagement
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property cloudCertificationAuthority for deviceManagement
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
     * Collection of CloudCertificationAuthority records associated with account.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Collection of CloudCertificationAuthority records associated with account.
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
     * Update the navigation property cloudCertificationAuthority in deviceManagement
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final CloudCertificationAuthority body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property cloudCertificationAuthority in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final CloudCertificationAuthority body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link CloudCertificationAuthorityItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CloudCertificationAuthorityItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CloudCertificationAuthorityItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Collection of CloudCertificationAuthority records associated with account.
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
