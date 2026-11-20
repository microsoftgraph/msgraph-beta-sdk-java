package com.microsoft.graph.beta.security.microsoftgraphsecuritygethuntingschema;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.security.HuntingSchemaResult;
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
 * Provides operations to call the getHuntingSchema method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftGraphSecurityGetHuntingSchemaRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MicrosoftGraphSecurityGetHuntingSchemaRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphSecurityGetHuntingSchemaRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/microsoft.graph.security.getHuntingSchema()", pathParameters);
    }
    /**
     * Instantiates a new {@link MicrosoftGraphSecurityGetHuntingSchemaRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphSecurityGetHuntingSchemaRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/microsoft.graph.security.getHuntingSchema()", rawUrl);
    }
    /**
     * Retrieve the advanced hunting schema accessible to the signed-in user, including the tables and functions the user is authorized to query and invoke in advanced hunting with Microsoft Defender XDR. The returned schema reflects the user&apos;s effective permissions. Each user within a tenant may have a different effective schema depending on their role and access level. Common use cases include:
     * @return a {@link HuntingSchemaResult}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public HuntingSchemaResult get() {
        return get(null);
    }
    /**
     * Retrieve the advanced hunting schema accessible to the signed-in user, including the tables and functions the user is authorized to query and invoke in advanced hunting with Microsoft Defender XDR. The returned schema reflects the user&apos;s effective permissions. Each user within a tenant may have a different effective schema depending on their role and access level. Common use cases include:
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link HuntingSchemaResult}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public HuntingSchemaResult get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, HuntingSchemaResult::createFromDiscriminatorValue);
    }
    /**
     * Retrieve the advanced hunting schema accessible to the signed-in user, including the tables and functions the user is authorized to query and invoke in advanced hunting with Microsoft Defender XDR. The returned schema reflects the user&apos;s effective permissions. Each user within a tenant may have a different effective schema depending on their role and access level. Common use cases include:
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the advanced hunting schema accessible to the signed-in user, including the tables and functions the user is authorized to query and invoke in advanced hunting with Microsoft Defender XDR. The returned schema reflects the user&apos;s effective permissions. Each user within a tenant may have a different effective schema depending on their role and access level. Common use cases include:
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link MicrosoftGraphSecurityGetHuntingSchemaRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphSecurityGetHuntingSchemaRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MicrosoftGraphSecurityGetHuntingSchemaRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
