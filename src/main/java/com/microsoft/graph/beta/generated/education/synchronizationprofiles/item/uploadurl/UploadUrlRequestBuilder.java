package com.microsoft.graph.beta.education.synchronizationprofiles.item.uploadurl;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
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
 * Provides operations to call the uploadUrl method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UploadUrlRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link UploadUrlRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UploadUrlRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/education/synchronizationProfiles/{educationSynchronizationProfile%2Did}/uploadUrl()", pathParameters);
    }
    /**
     * Instantiates a new {@link UploadUrlRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UploadUrlRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/education/synchronizationProfiles/{educationSynchronizationProfile%2Did}/uploadUrl()", rawUrl);
    }
    /**
     * Retrieve a shared access signature (SAS) for uploading source files to Azure blob storage for a specific school data synchronization profile in the tenant. The SAS token has a validity of one hour. The upload URL is provided only for the CSV data provider.
     * @return a {@link UploadUrlGetResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     * @see <a href="https://learn.microsoft.com/graph/api/educationsynchronizationprofile-uploadurl?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public UploadUrlGetResponse get() {
        return get(null);
    }
    /**
     * Retrieve a shared access signature (SAS) for uploading source files to Azure blob storage for a specific school data synchronization profile in the tenant. The SAS token has a validity of one hour. The upload URL is provided only for the CSV data provider.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link UploadUrlGetResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     * @see <a href="https://learn.microsoft.com/graph/api/educationsynchronizationprofile-uploadurl?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public UploadUrlGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, UploadUrlGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Retrieve a shared access signature (SAS) for uploading source files to Azure blob storage for a specific school data synchronization profile in the tenant. The SAS token has a validity of one hour. The upload URL is provided only for the CSV data provider.
     * @return a {@link RequestInformation}
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve a shared access signature (SAS) for uploading source files to Azure blob storage for a specific school data synchronization profile in the tenant. The SAS token has a validity of one hour. The upload URL is provided only for the CSV data provider.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link UploadUrlRequestBuilder}
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public UploadUrlRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UploadUrlRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
