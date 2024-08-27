package com.microsoft.graph.beta.education.synchronizationprofiles.item;

import com.microsoft.graph.beta.education.synchronizationprofiles.item.errors.ErrorsRequestBuilder;
import com.microsoft.graph.beta.education.synchronizationprofiles.item.pause.PauseRequestBuilder;
import com.microsoft.graph.beta.education.synchronizationprofiles.item.profilestatus.ProfileStatusRequestBuilder;
import com.microsoft.graph.beta.education.synchronizationprofiles.item.reset.ResetRequestBuilder;
import com.microsoft.graph.beta.education.synchronizationprofiles.item.resume.ResumeRequestBuilder;
import com.microsoft.graph.beta.education.synchronizationprofiles.item.start.StartRequestBuilder;
import com.microsoft.graph.beta.education.synchronizationprofiles.item.uploadurl.UploadUrlRequestBuilder;
import com.microsoft.graph.beta.models.EducationSynchronizationProfile;
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
 * Provides operations to manage the synchronizationProfiles property of the microsoft.graph.educationRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationSynchronizationProfileItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the errors property of the microsoft.graph.educationSynchronizationProfile entity.
     * @return a {@link ErrorsRequestBuilder}
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public ErrorsRequestBuilder errors() {
        return new ErrorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the pause method.
     * @return a {@link PauseRequestBuilder}
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public PauseRequestBuilder pause() {
        return new PauseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the profileStatus property of the microsoft.graph.educationSynchronizationProfile entity.
     * @return a {@link ProfileStatusRequestBuilder}
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public ProfileStatusRequestBuilder profileStatus() {
        return new ProfileStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the reset method.
     * @return a {@link ResetRequestBuilder}
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public ResetRequestBuilder reset() {
        return new ResetRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the resume method.
     * @return a {@link ResumeRequestBuilder}
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public ResumeRequestBuilder resume() {
        return new ResumeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the start method.
     * @return a {@link StartRequestBuilder}
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public StartRequestBuilder start() {
        return new StartRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the uploadUrl method.
     * @return a {@link UploadUrlRequestBuilder}
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public UploadUrlRequestBuilder uploadUrl() {
        return new UploadUrlRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link EducationSynchronizationProfileItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EducationSynchronizationProfileItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/education/synchronizationProfiles/{educationSynchronizationProfile%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link EducationSynchronizationProfileItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EducationSynchronizationProfileItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/education/synchronizationProfiles/{educationSynchronizationProfile%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete a school data synchronization profile in the tenant based on the identifier.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     * @see <a href="https://learn.microsoft.com/graph/api/educationsynchronizationprofile-delete?view=graph-rest-beta">Find more info here</a>
     */
    @Deprecated
    public void delete() {
        delete(null);
    }
    /**
     * Delete a school data synchronization profile in the tenant based on the identifier.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     * @see <a href="https://learn.microsoft.com/graph/api/educationsynchronizationprofile-delete?view=graph-rest-beta">Find more info here</a>
     */
    @Deprecated
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Retrieve a school data synchronization profile in the tenant based on the identifier.
     * @return a {@link EducationSynchronizationProfile}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     * @see <a href="https://learn.microsoft.com/graph/api/educationsynchronizationprofile-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public EducationSynchronizationProfile get() {
        return get(null);
    }
    /**
     * Retrieve a school data synchronization profile in the tenant based on the identifier.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link EducationSynchronizationProfile}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     * @see <a href="https://learn.microsoft.com/graph/api/educationsynchronizationprofile-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public EducationSynchronizationProfile get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EducationSynchronizationProfile::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property synchronizationProfiles in education
     * @param body The request body
     * @return a {@link EducationSynchronizationProfile}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public EducationSynchronizationProfile patch(@jakarta.annotation.Nonnull final EducationSynchronizationProfile body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property synchronizationProfiles in education
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link EducationSynchronizationProfile}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public EducationSynchronizationProfile patch(@jakarta.annotation.Nonnull final EducationSynchronizationProfile body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EducationSynchronizationProfile::createFromDiscriminatorValue);
    }
    /**
     * Delete a school data synchronization profile in the tenant based on the identifier.
     * @return a {@link RequestInformation}
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a school data synchronization profile in the tenant based on the identifier.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Retrieve a school data synchronization profile in the tenant based on the identifier.
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
     * Retrieve a school data synchronization profile in the tenant based on the identifier.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property synchronizationProfiles in education
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final EducationSynchronizationProfile body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property synchronizationProfiles in education
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final EducationSynchronizationProfile body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link EducationSynchronizationProfileItemRequestBuilder}
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public EducationSynchronizationProfileItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new EducationSynchronizationProfileItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve a school data synchronization profile in the tenant based on the identifier.
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
