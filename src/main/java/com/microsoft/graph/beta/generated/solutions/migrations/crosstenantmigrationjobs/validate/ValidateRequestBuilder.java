package com.microsoft.graph.beta.solutions.migrations.crosstenantmigrationjobs.validate;

import com.microsoft.graph.beta.models.CrossTenantMigrationJob;
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
 * Provides operations to call the validate method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ValidateRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ValidateRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ValidateRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/migrations/crossTenantMigrationJobs/validate", pathParameters);
    }
    /**
     * Instantiates a new {@link ValidateRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ValidateRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/migrations/crossTenantMigrationJobs/validate", rawUrl);
    }
    /**
     * Validate the configuration of a crossTenantMigrationJob. This function doesn&apos;t migrate any content, but goes through validation for the specified workloads to find any errors or misconfigurations that would affect an actual migration job. 
     * @param body The request body
     * @return a {@link CrossTenantMigrationJob}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2025-07/PrivatePreview:CrossTenantContentMigrationAPI on 2025-07-09 and will be removed 2026-07-09
     * @see <a href="https://learn.microsoft.com/graph/api/crosstenantmigrationjob-validate?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CrossTenantMigrationJob post(@jakarta.annotation.Nonnull final ValidatePostRequestBody body) {
        return post(body, null);
    }
    /**
     * Validate the configuration of a crossTenantMigrationJob. This function doesn&apos;t migrate any content, but goes through validation for the specified workloads to find any errors or misconfigurations that would affect an actual migration job. 
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CrossTenantMigrationJob}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     *  as of 2025-07/PrivatePreview:CrossTenantContentMigrationAPI on 2025-07-09 and will be removed 2026-07-09
     * @see <a href="https://learn.microsoft.com/graph/api/crosstenantmigrationjob-validate?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CrossTenantMigrationJob post(@jakarta.annotation.Nonnull final ValidatePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CrossTenantMigrationJob::createFromDiscriminatorValue);
    }
    /**
     * Validate the configuration of a crossTenantMigrationJob. This function doesn&apos;t migrate any content, but goes through validation for the specified workloads to find any errors or misconfigurations that would affect an actual migration job. 
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2025-07/PrivatePreview:CrossTenantContentMigrationAPI on 2025-07-09 and will be removed 2026-07-09
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ValidatePostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Validate the configuration of a crossTenantMigrationJob. This function doesn&apos;t migrate any content, but goes through validation for the specified workloads to find any errors or misconfigurations that would affect an actual migration job. 
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     *  as of 2025-07/PrivatePreview:CrossTenantContentMigrationAPI on 2025-07-09 and will be removed 2026-07-09
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ValidatePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link ValidateRequestBuilder}
     * @deprecated
     *  as of 2025-07/PrivatePreview:CrossTenantContentMigrationAPI on 2025-07-09 and will be removed 2026-07-09
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public ValidateRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ValidateRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
