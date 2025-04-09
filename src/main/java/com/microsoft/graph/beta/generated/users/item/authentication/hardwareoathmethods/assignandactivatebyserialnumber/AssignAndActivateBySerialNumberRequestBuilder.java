package com.microsoft.graph.beta.users.item.authentication.hardwareoathmethods.assignandactivatebyserialnumber;

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
 * Provides operations to call the assignAndActivateBySerialNumber method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssignAndActivateBySerialNumberRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link AssignAndActivateBySerialNumberRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AssignAndActivateBySerialNumberRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/authentication/hardwareOathMethods/assignAndActivateBySerialNumber", pathParameters);
    }
    /**
     * Instantiates a new {@link AssignAndActivateBySerialNumberRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AssignAndActivateBySerialNumberRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/authentication/hardwareOathMethods/assignAndActivateBySerialNumber", rawUrl);
    }
    /**
     * Assign and activate a hardware token at the same time by hardware token serial number.
     * @param body The request body
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/hardwareoathauthenticationmethod-assignandactivatebyserialnumber?view=graph-rest-beta">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nonnull final AssignAndActivateBySerialNumberPostRequestBody body) {
        post(body, null);
    }
    /**
     * Assign and activate a hardware token at the same time by hardware token serial number.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/hardwareoathauthenticationmethod-assignandactivatebyserialnumber?view=graph-rest-beta">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nonnull final AssignAndActivateBySerialNumberPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Assign and activate a hardware token at the same time by hardware token serial number.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AssignAndActivateBySerialNumberPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Assign and activate a hardware token at the same time by hardware token serial number.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AssignAndActivateBySerialNumberPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link AssignAndActivateBySerialNumberRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AssignAndActivateBySerialNumberRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AssignAndActivateBySerialNumberRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
