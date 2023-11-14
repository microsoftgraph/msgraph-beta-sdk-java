package com.microsoft.graph.devicemanagement.getassignmentfiltersstatusdetails;

import com.microsoft.graph.models.AssignmentFilterStatusDetails;
import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Provides operations to call the getAssignmentFiltersStatusDetails method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetAssignmentFiltersStatusDetailsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new GetAssignmentFiltersStatusDetailsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetAssignmentFiltersStatusDetailsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/getAssignmentFiltersStatusDetails", pathParameters);
    }
    /**
     * Instantiates a new GetAssignmentFiltersStatusDetailsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetAssignmentFiltersStatusDetailsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/getAssignmentFiltersStatusDetails", rawUrl);
    }
    /**
     * Invoke action getAssignmentFiltersStatusDetails
     * @param body The request body
     * @return a AssignmentFilterStatusDetails
     */
    @jakarta.annotation.Nullable
    public AssignmentFilterStatusDetails post(@jakarta.annotation.Nonnull final GetAssignmentFiltersStatusDetailsPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Invoke action getAssignmentFiltersStatusDetails
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AssignmentFilterStatusDetails
     */
    @jakarta.annotation.Nullable
    public AssignmentFilterStatusDetails post(@jakarta.annotation.Nonnull final GetAssignmentFiltersStatusDetailsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, AssignmentFilterStatusDetails::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Invoke action getAssignmentFiltersStatusDetails
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final GetAssignmentFiltersStatusDetailsPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Invoke action getAssignmentFiltersStatusDetails
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final GetAssignmentFiltersStatusDetailsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a GetAssignmentFiltersStatusDetailsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetAssignmentFiltersStatusDetailsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetAssignmentFiltersStatusDetailsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
