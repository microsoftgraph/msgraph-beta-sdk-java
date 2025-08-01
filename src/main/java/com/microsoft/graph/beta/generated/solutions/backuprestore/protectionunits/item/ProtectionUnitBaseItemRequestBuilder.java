package com.microsoft.graph.beta.solutions.backuprestore.protectionunits.item;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.ProtectionUnitBase;
import com.microsoft.graph.beta.solutions.backuprestore.protectionunits.item.canceloffboard.CancelOffboardRequestBuilder;
import com.microsoft.graph.beta.solutions.backuprestore.protectionunits.item.graphdriveprotectionunit.GraphDriveProtectionUnitRequestBuilder;
import com.microsoft.graph.beta.solutions.backuprestore.protectionunits.item.graphmailboxprotectionunit.GraphMailboxProtectionUnitRequestBuilder;
import com.microsoft.graph.beta.solutions.backuprestore.protectionunits.item.graphsiteprotectionunit.GraphSiteProtectionUnitRequestBuilder;
import com.microsoft.graph.beta.solutions.backuprestore.protectionunits.item.offboard.OffboardRequestBuilder;
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
 * Provides operations to manage the protectionUnits property of the microsoft.graph.backupRestoreRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProtectionUnitBaseItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the cancelOffboard method.
     * @return a {@link CancelOffboardRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CancelOffboardRequestBuilder cancelOffboard() {
        return new CancelOffboardRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to driveProtectionUnit.
     * @return a {@link GraphDriveProtectionUnitRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphDriveProtectionUnitRequestBuilder graphDriveProtectionUnit() {
        return new GraphDriveProtectionUnitRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to mailboxProtectionUnit.
     * @return a {@link GraphMailboxProtectionUnitRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphMailboxProtectionUnitRequestBuilder graphMailboxProtectionUnit() {
        return new GraphMailboxProtectionUnitRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to siteProtectionUnit.
     * @return a {@link GraphSiteProtectionUnitRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphSiteProtectionUnitRequestBuilder graphSiteProtectionUnit() {
        return new GraphSiteProtectionUnitRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the offboard method.
     * @return a {@link OffboardRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OffboardRequestBuilder offboard() {
        return new OffboardRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ProtectionUnitBaseItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProtectionUnitBaseItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/backupRestore/protectionUnits/{protectionUnitBase%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link ProtectionUnitBaseItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProtectionUnitBaseItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/backupRestore/protectionUnits/{protectionUnitBase%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Read the properties and relationships of a protectionUnitBase object.
     * @return a {@link ProtectionUnitBase}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/protectionunitbase-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ProtectionUnitBase get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of a protectionUnitBase object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ProtectionUnitBase}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/protectionunitbase-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ProtectionUnitBase get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ProtectionUnitBase::createFromDiscriminatorValue);
    }
    /**
     * Read the properties and relationships of a protectionUnitBase object.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of a protectionUnitBase object.
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ProtectionUnitBaseItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProtectionUnitBaseItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ProtectionUnitBaseItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Read the properties and relationships of a protectionUnitBase object.
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
}
