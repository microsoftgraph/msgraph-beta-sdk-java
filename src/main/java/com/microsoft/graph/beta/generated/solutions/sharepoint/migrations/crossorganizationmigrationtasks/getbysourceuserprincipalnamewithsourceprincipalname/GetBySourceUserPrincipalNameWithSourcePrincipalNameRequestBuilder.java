package com.microsoft.graph.beta.solutions.sharepoint.migrations.crossorganizationmigrationtasks.getbysourceuserprincipalnamewithsourceprincipalname;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.SharePointMigrationTask;
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
 * Provides operations to call the getBySourceUserPrincipalName method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetBySourceUserPrincipalNameWithSourcePrincipalNameRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetBySourceUserPrincipalNameWithSourcePrincipalNameRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @param sourcePrincipalName Usage: sourcePrincipalName=&apos;{sourcePrincipalName}&apos;
     */
    public GetBySourceUserPrincipalNameWithSourcePrincipalNameRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String sourcePrincipalName) {
        super(requestAdapter, "{+baseurl}/solutions/sharePoint/migrations/crossOrganizationMigrationTasks/getBySourceUserPrincipalName(sourcePrincipalName='{sourcePrincipalName}')", pathParameters);
        this.pathParameters.put("sourcePrincipalName", sourcePrincipalName);
    }
    /**
     * Instantiates a new {@link GetBySourceUserPrincipalNameWithSourcePrincipalNameRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetBySourceUserPrincipalNameWithSourcePrincipalNameRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/sharePoint/migrations/crossOrganizationMigrationTasks/getBySourceUserPrincipalName(sourcePrincipalName='{sourcePrincipalName}')", rawUrl);
    }
    /**
     * Get a sharePointMigrationTask that was previously created for a user, using the source userPrincipalName. The returned sharePointMigrationTask object includes the source and target site URLs, migration status, optional timestamps (startedDateTime and finishedDateTime), and error details about issues during processing.
     * @return a {@link SharePointMigrationTask}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/sharepointmigrationtask-getbysourceuserprincipalname?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SharePointMigrationTask get() {
        return get(null);
    }
    /**
     * Get a sharePointMigrationTask that was previously created for a user, using the source userPrincipalName. The returned sharePointMigrationTask object includes the source and target site URLs, migration status, optional timestamps (startedDateTime and finishedDateTime), and error details about issues during processing.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SharePointMigrationTask}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/sharepointmigrationtask-getbysourceuserprincipalname?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SharePointMigrationTask get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SharePointMigrationTask::createFromDiscriminatorValue);
    }
    /**
     * Get a sharePointMigrationTask that was previously created for a user, using the source userPrincipalName. The returned sharePointMigrationTask object includes the source and target site URLs, migration status, optional timestamps (startedDateTime and finishedDateTime), and error details about issues during processing.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a sharePointMigrationTask that was previously created for a user, using the source userPrincipalName. The returned sharePointMigrationTask object includes the source and target site URLs, migration status, optional timestamps (startedDateTime and finishedDateTime), and error details about issues during processing.
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
     * @return a {@link GetBySourceUserPrincipalNameWithSourcePrincipalNameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetBySourceUserPrincipalNameWithSourcePrincipalNameRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetBySourceUserPrincipalNameWithSourcePrincipalNameRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
