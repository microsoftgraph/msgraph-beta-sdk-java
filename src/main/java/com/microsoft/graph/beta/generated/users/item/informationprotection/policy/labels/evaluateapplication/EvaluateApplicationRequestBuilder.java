package com.microsoft.graph.beta.users.item.informationprotection.policy.labels.evaluateapplication;

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
 * Provides operations to call the evaluateApplication method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EvaluateApplicationRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link EvaluateApplicationRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EvaluateApplicationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/informationProtection/policy/labels/evaluateApplication", pathParameters);
    }
    /**
     * Instantiates a new {@link EvaluateApplicationRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EvaluateApplicationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/informationProtection/policy/labels/evaluateApplication", rawUrl);
    }
    /**
     * Compute the information protection label that should be applied and return the set of actions that must be taken to correctly label the information. This API is useful when a label should be set manually or explicitly by a user or service, rather than automatically based on file contents.  Given contentInfo, which includes existing content metadata key/value pairs, and labelingOptions as an input, the API returns an informationProtectionAction object that contains one of more of the following: 
     * @param body The request body
     * @return a {@link EvaluateApplicationPostResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * This API will no longer be accessible, please see microsoft.graph.security.informationProtection APIs. as of 2021-02/Beta_SensitivityLabels on 2021-02-15 and will be removed 2022-08-15
     * @see <a href="https://learn.microsoft.com/graph/api/informationprotectionlabel-evaluateapplication?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public EvaluateApplicationPostResponse post(@jakarta.annotation.Nonnull final EvaluateApplicationPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Compute the information protection label that should be applied and return the set of actions that must be taken to correctly label the information. This API is useful when a label should be set manually or explicitly by a user or service, rather than automatically based on file contents.  Given contentInfo, which includes existing content metadata key/value pairs, and labelingOptions as an input, the API returns an informationProtectionAction object that contains one of more of the following: 
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link EvaluateApplicationPostResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * This API will no longer be accessible, please see microsoft.graph.security.informationProtection APIs. as of 2021-02/Beta_SensitivityLabels on 2021-02-15 and will be removed 2022-08-15
     * @see <a href="https://learn.microsoft.com/graph/api/informationprotectionlabel-evaluateapplication?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public EvaluateApplicationPostResponse post(@jakarta.annotation.Nonnull final EvaluateApplicationPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EvaluateApplicationPostResponse::createFromDiscriminatorValue);
    }
    /**
     * Compute the information protection label that should be applied and return the set of actions that must be taken to correctly label the information. This API is useful when a label should be set manually or explicitly by a user or service, rather than automatically based on file contents.  Given contentInfo, which includes existing content metadata key/value pairs, and labelingOptions as an input, the API returns an informationProtectionAction object that contains one of more of the following: 
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * This API will no longer be accessible, please see microsoft.graph.security.informationProtection APIs. as of 2021-02/Beta_SensitivityLabels on 2021-02-15 and will be removed 2022-08-15
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EvaluateApplicationPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Compute the information protection label that should be applied and return the set of actions that must be taken to correctly label the information. This API is useful when a label should be set manually or explicitly by a user or service, rather than automatically based on file contents.  Given contentInfo, which includes existing content metadata key/value pairs, and labelingOptions as an input, the API returns an informationProtectionAction object that contains one of more of the following: 
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * This API will no longer be accessible, please see microsoft.graph.security.informationProtection APIs. as of 2021-02/Beta_SensitivityLabels on 2021-02-15 and will be removed 2022-08-15
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EvaluateApplicationPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link EvaluateApplicationRequestBuilder}
     * @deprecated
     * This API will no longer be accessible, please see microsoft.graph.security.informationProtection APIs. as of 2021-02/Beta_SensitivityLabels on 2021-02-15 and will be removed 2022-08-15
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public EvaluateApplicationRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new EvaluateApplicationRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
