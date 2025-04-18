package com.microsoft.graph.beta.deviceappmanagement.mobileapps.item;

import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.assign.AssignRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.assignments.AssignmentsRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.categories.CategoriesRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.graphandroidforworkapp.GraphAndroidForWorkAppRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.graphandroidlobapp.GraphAndroidLobAppRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.graphandroidmanagedstoreapp.GraphAndroidManagedStoreAppRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.graphandroidstoreapp.GraphAndroidStoreAppRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.graphioslobapp.GraphIosLobAppRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.graphiosstoreapp.GraphIosStoreAppRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.graphiosvppapp.GraphIosVppAppRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.graphmacosdmgapp.GraphMacOSDmgAppRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.graphmacoslobapp.GraphMacOSLobAppRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.graphmacospkgapp.GraphMacOSPkgAppRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.graphmanagedandroidlobapp.GraphManagedAndroidLobAppRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.graphmanagedioslobapp.GraphManagedIOSLobAppRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.graphmanagedmobilelobapp.GraphManagedMobileLobAppRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.graphmicrosoftstoreforbusinessapp.GraphMicrosoftStoreForBusinessAppRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.graphwin32lobapp.GraphWin32LobAppRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.graphwindowsappx.GraphWindowsAppXRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.graphwindowsmobilemsi.GraphWindowsMobileMSIRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.graphwindowsstoreapp.GraphWindowsStoreAppRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.graphwindowsuniversalappx.GraphWindowsUniversalAppXRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.graphwindowswebapp.GraphWindowsWebAppRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.graphwingetapp.GraphWinGetAppRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.relationships.RelationshipsRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.mobileapps.item.updaterelationships.UpdateRelationshipsRequestBuilder;
import com.microsoft.graph.beta.models.MobileApp;
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
 * Provides operations to manage the mobileApps property of the microsoft.graph.deviceAppManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileAppItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the assign method.
     * @return a {@link AssignRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AssignRequestBuilder assign() {
        return new AssignRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignments property of the microsoft.graph.mobileApp entity.
     * @return a {@link AssignmentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AssignmentsRequestBuilder assignments() {
        return new AssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the categories property of the microsoft.graph.mobileApp entity.
     * @return a {@link CategoriesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CategoriesRequestBuilder categories() {
        return new CategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to androidForWorkApp.
     * @return a {@link GraphAndroidForWorkAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphAndroidForWorkAppRequestBuilder graphAndroidForWorkApp() {
        return new GraphAndroidForWorkAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to androidLobApp.
     * @return a {@link GraphAndroidLobAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphAndroidLobAppRequestBuilder graphAndroidLobApp() {
        return new GraphAndroidLobAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to androidManagedStoreApp.
     * @return a {@link GraphAndroidManagedStoreAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphAndroidManagedStoreAppRequestBuilder graphAndroidManagedStoreApp() {
        return new GraphAndroidManagedStoreAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to androidStoreApp.
     * @return a {@link GraphAndroidStoreAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphAndroidStoreAppRequestBuilder graphAndroidStoreApp() {
        return new GraphAndroidStoreAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to iosLobApp.
     * @return a {@link GraphIosLobAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphIosLobAppRequestBuilder graphIosLobApp() {
        return new GraphIosLobAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to iosStoreApp.
     * @return a {@link GraphIosStoreAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphIosStoreAppRequestBuilder graphIosStoreApp() {
        return new GraphIosStoreAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to iosVppApp.
     * @return a {@link GraphIosVppAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphIosVppAppRequestBuilder graphIosVppApp() {
        return new GraphIosVppAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to macOSDmgApp.
     * @return a {@link GraphMacOSDmgAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphMacOSDmgAppRequestBuilder graphMacOSDmgApp() {
        return new GraphMacOSDmgAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to macOSLobApp.
     * @return a {@link GraphMacOSLobAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphMacOSLobAppRequestBuilder graphMacOSLobApp() {
        return new GraphMacOSLobAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to macOSPkgApp.
     * @return a {@link GraphMacOSPkgAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphMacOSPkgAppRequestBuilder graphMacOSPkgApp() {
        return new GraphMacOSPkgAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to managedAndroidLobApp.
     * @return a {@link GraphManagedAndroidLobAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphManagedAndroidLobAppRequestBuilder graphManagedAndroidLobApp() {
        return new GraphManagedAndroidLobAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to managedIOSLobApp.
     * @return a {@link GraphManagedIOSLobAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphManagedIOSLobAppRequestBuilder graphManagedIOSLobApp() {
        return new GraphManagedIOSLobAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to managedMobileLobApp.
     * @return a {@link GraphManagedMobileLobAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphManagedMobileLobAppRequestBuilder graphManagedMobileLobApp() {
        return new GraphManagedMobileLobAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to microsoftStoreForBusinessApp.
     * @return a {@link GraphMicrosoftStoreForBusinessAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphMicrosoftStoreForBusinessAppRequestBuilder graphMicrosoftStoreForBusinessApp() {
        return new GraphMicrosoftStoreForBusinessAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to win32LobApp.
     * @return a {@link GraphWin32LobAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphWin32LobAppRequestBuilder graphWin32LobApp() {
        return new GraphWin32LobAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to windowsAppX.
     * @return a {@link GraphWindowsAppXRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphWindowsAppXRequestBuilder graphWindowsAppX() {
        return new GraphWindowsAppXRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to windowsMobileMSI.
     * @return a {@link GraphWindowsMobileMSIRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphWindowsMobileMSIRequestBuilder graphWindowsMobileMSI() {
        return new GraphWindowsMobileMSIRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to windowsStoreApp.
     * @return a {@link GraphWindowsStoreAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphWindowsStoreAppRequestBuilder graphWindowsStoreApp() {
        return new GraphWindowsStoreAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to windowsUniversalAppX.
     * @return a {@link GraphWindowsUniversalAppXRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphWindowsUniversalAppXRequestBuilder graphWindowsUniversalAppX() {
        return new GraphWindowsUniversalAppXRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to windowsWebApp.
     * @return a {@link GraphWindowsWebAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphWindowsWebAppRequestBuilder graphWindowsWebApp() {
        return new GraphWindowsWebAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to winGetApp.
     * @return a {@link GraphWinGetAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphWinGetAppRequestBuilder graphWinGetApp() {
        return new GraphWinGetAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the relationships property of the microsoft.graph.mobileApp entity.
     * @return a {@link RelationshipsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RelationshipsRequestBuilder relationships() {
        return new RelationshipsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the updateRelationships method.
     * @return a {@link UpdateRelationshipsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateRelationshipsRequestBuilder updateRelationships() {
        return new UpdateRelationshipsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link MobileAppItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MobileAppItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement/mobileApps/{mobileApp%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link MobileAppItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MobileAppItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement/mobileApps/{mobileApp%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property mobileApps for deviceAppManagement
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property mobileApps for deviceAppManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * The mobile apps.
     * @return a {@link MobileApp}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public MobileApp get() {
        return get(null);
    }
    /**
     * The mobile apps.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link MobileApp}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public MobileApp get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, MobileApp::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property mobileApps in deviceAppManagement
     * @param body The request body
     * @return a {@link MobileApp}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public MobileApp patch(@jakarta.annotation.Nonnull final MobileApp body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property mobileApps in deviceAppManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link MobileApp}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public MobileApp patch(@jakarta.annotation.Nonnull final MobileApp body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, MobileApp::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property mobileApps for deviceAppManagement
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property mobileApps for deviceAppManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * The mobile apps.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The mobile apps.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property mobileApps in deviceAppManagement
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final MobileApp body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property mobileApps in deviceAppManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final MobileApp body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link MobileAppItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MobileAppItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MobileAppItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The mobile apps.
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
