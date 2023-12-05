package com.microsoft.graph.admin.windows.updates.updatableassets.item;

import com.microsoft.graph.admin.windows.updates.updatableassets.item.microsoftgraphwindowsupdatesaddmembers.MicrosoftGraphWindowsUpdatesAddMembersRequestBuilder;
import com.microsoft.graph.admin.windows.updates.updatableassets.item.microsoftgraphwindowsupdatesaddmembersbyid.MicrosoftGraphWindowsUpdatesAddMembersByIdRequestBuilder;
import com.microsoft.graph.admin.windows.updates.updatableassets.item.microsoftgraphwindowsupdatesremovemembers.MicrosoftGraphWindowsUpdatesRemoveMembersRequestBuilder;
import com.microsoft.graph.admin.windows.updates.updatableassets.item.microsoftgraphwindowsupdatesremovemembersbyid.MicrosoftGraphWindowsUpdatesRemoveMembersByIdRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.windowsupdates.UpdatableAsset;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
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
 * Provides operations to manage the updatableAssets property of the microsoft.graph.adminWindowsUpdates entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdatableAssetItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the addMembers method.
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphWindowsUpdatesAddMembersRequestBuilder microsoftGraphWindowsUpdatesAddMembers() {
        return new MicrosoftGraphWindowsUpdatesAddMembersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the addMembersById method.
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphWindowsUpdatesAddMembersByIdRequestBuilder microsoftGraphWindowsUpdatesAddMembersById() {
        return new MicrosoftGraphWindowsUpdatesAddMembersByIdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the removeMembers method.
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphWindowsUpdatesRemoveMembersRequestBuilder microsoftGraphWindowsUpdatesRemoveMembers() {
        return new MicrosoftGraphWindowsUpdatesRemoveMembersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the removeMembersById method.
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphWindowsUpdatesRemoveMembersByIdRequestBuilder microsoftGraphWindowsUpdatesRemoveMembersById() {
        return new MicrosoftGraphWindowsUpdatesRemoveMembersByIdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new UpdatableAssetItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdatableAssetItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/windows/updates/updatableAssets/{updatableAsset%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new UpdatableAssetItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdatableAssetItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/windows/updates/updatableAssets/{updatableAsset%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete an azureADDevice object. When a Microsoft Entra device is deleted, it is unregistered from the deployment service and automatically unenrolled from management by the service for all update categories, as well as removed from every deploymentAudience and updatableAssetGroup.
     * @see <a href="https://learn.microsoft.com/graph/api/windowsupdates-azureaddevice-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete an azureADDevice object. When a Microsoft Entra device is deleted, it is unregistered from the deployment service and automatically unenrolled from management by the service for all update categories, as well as removed from every deploymentAudience and updatableAssetGroup.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/windowsupdates-azureaddevice-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Read the properties and relationships of an updatableAssetGroup object.
     * @return a UpdatableAsset
     * @see <a href="https://learn.microsoft.com/graph/api/windowsupdates-updatableassetgroup-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public UpdatableAsset get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of an updatableAssetGroup object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a UpdatableAsset
     * @see <a href="https://learn.microsoft.com/graph/api/windowsupdates-updatableassetgroup-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public UpdatableAsset get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, UpdatableAsset::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property updatableAssets in admin
     * @param body The request body
     * @return a UpdatableAsset
     */
    @jakarta.annotation.Nullable
    public UpdatableAsset patch(@jakarta.annotation.Nonnull final UpdatableAsset body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property updatableAssets in admin
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a UpdatableAsset
     */
    @jakarta.annotation.Nullable
    public UpdatableAsset patch(@jakarta.annotation.Nonnull final UpdatableAsset body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, UpdatableAsset::createFromDiscriminatorValue);
    }
    /**
     * Delete an azureADDevice object. When a Microsoft Entra device is deleted, it is unregistered from the deployment service and automatically unenrolled from management by the service for all update categories, as well as removed from every deploymentAudience and updatableAssetGroup.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete an azureADDevice object. When a Microsoft Entra device is deleted, it is unregistered from the deployment service and automatically unenrolled from management by the service for all update categories, as well as removed from every deploymentAudience and updatableAssetGroup.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Read the properties and relationships of an updatableAssetGroup object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of an updatableAssetGroup object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property updatableAssets in admin
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final UpdatableAsset body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property updatableAssets in admin
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final UpdatableAsset body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a UpdatableAssetItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public UpdatableAssetItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UpdatableAssetItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read the properties and relationships of an updatableAssetGroup object.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
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
