package com.microsoft.graph.beta.devicemanagement.virtualendpoint.snapshots.importsnapshot;

import com.microsoft.graph.beta.models.CloudPcSnapshotImportActionResult;
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
 * Provides operations to call the importSnapshot method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ImportSnapshotRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ImportSnapshotRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ImportSnapshotRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/snapshots/importSnapshot", pathParameters);
    }
    /**
     * Instantiates a new {@link ImportSnapshotRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ImportSnapshotRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/snapshots/importSnapshot", rawUrl);
    }
    /**
     * Import the snapshot from the customer-managed storage account using the provided information, and store it in the Azure storage account within the Cloud PC service on behalf of the customer.  To provision a new Cloud PC for a licensed user, import a valid .vhd snapshot from a customer-managed storage account into the Azure storage account used by the Cloud PC service.
     * @param body The request body
     * @return a {@link CloudPcSnapshotImportActionResult}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcsnapshot-importsnapshot?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CloudPcSnapshotImportActionResult post(@jakarta.annotation.Nonnull final ImportSnapshotPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Import the snapshot from the customer-managed storage account using the provided information, and store it in the Azure storage account within the Cloud PC service on behalf of the customer.  To provision a new Cloud PC for a licensed user, import a valid .vhd snapshot from a customer-managed storage account into the Azure storage account used by the Cloud PC service.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CloudPcSnapshotImportActionResult}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcsnapshot-importsnapshot?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CloudPcSnapshotImportActionResult post(@jakarta.annotation.Nonnull final ImportSnapshotPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudPcSnapshotImportActionResult::createFromDiscriminatorValue);
    }
    /**
     * Import the snapshot from the customer-managed storage account using the provided information, and store it in the Azure storage account within the Cloud PC service on behalf of the customer.  To provision a new Cloud PC for a licensed user, import a valid .vhd snapshot from a customer-managed storage account into the Azure storage account used by the Cloud PC service.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ImportSnapshotPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Import the snapshot from the customer-managed storage account using the provided information, and store it in the Azure storage account within the Cloud PC service on behalf of the customer.  To provision a new Cloud PC for a licensed user, import a valid .vhd snapshot from a customer-managed storage account into the Azure storage account used by the Cloud PC service.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ImportSnapshotPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link ImportSnapshotRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImportSnapshotRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ImportSnapshotRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
