package com.microsoft.graph.beta.print.printershares.item;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.PrinterShare;
import com.microsoft.graph.beta.print.printershares.item.allowedgroups.AllowedGroupsRequestBuilder;
import com.microsoft.graph.beta.print.printershares.item.allowedusers.AllowedUsersRequestBuilder;
import com.microsoft.graph.beta.print.printershares.item.jobs.JobsRequestBuilder;
import com.microsoft.graph.beta.print.printershares.item.printer.PrinterRequestBuilder;
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
 * Provides operations to manage the printerShares property of the microsoft.graph.print entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrinterShareItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the allowedGroups property of the microsoft.graph.printerShare entity.
     * @return a {@link AllowedGroupsRequestBuilder}
     * @deprecated
     * The printerShares navigation property is deprecated and will stop returning data on July 31, 2023. Please use the shares navigation property instead of this. as of 2023-06/Tasks_And_Plans on 2023-06-13 and will be removed 2023-07-31
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public AllowedGroupsRequestBuilder allowedGroups() {
        return new AllowedGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the allowedUsers property of the microsoft.graph.printerShare entity.
     * @return a {@link AllowedUsersRequestBuilder}
     * @deprecated
     * The printerShares navigation property is deprecated and will stop returning data on July 31, 2023. Please use the shares navigation property instead of this. as of 2023-06/Tasks_And_Plans on 2023-06-13 and will be removed 2023-07-31
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public AllowedUsersRequestBuilder allowedUsers() {
        return new AllowedUsersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the jobs property of the microsoft.graph.printerBase entity.
     * @return a {@link JobsRequestBuilder}
     * @deprecated
     * The printerShares navigation property is deprecated and will stop returning data on July 31, 2023. Please use the shares navigation property instead of this. as of 2023-06/Tasks_And_Plans on 2023-06-13 and will be removed 2023-07-31
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public JobsRequestBuilder jobs() {
        return new JobsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the printer property of the microsoft.graph.printerShare entity.
     * @return a {@link PrinterRequestBuilder}
     * @deprecated
     * The printerShares navigation property is deprecated and will stop returning data on July 31, 2023. Please use the shares navigation property instead of this. as of 2023-06/Tasks_And_Plans on 2023-06-13 and will be removed 2023-07-31
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public PrinterRequestBuilder printer() {
        return new PrinterRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link PrinterShareItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PrinterShareItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/print/printerShares/{printerShare%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link PrinterShareItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PrinterShareItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/print/printerShares/{printerShare%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property printerShares for print
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The printerShares navigation property is deprecated and will stop returning data on July 31, 2023. Please use the shares navigation property instead of this. as of 2023-06/Tasks_And_Plans on 2023-06-13 and will be removed 2023-07-31
     */
    @Deprecated
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property printerShares for print
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The printerShares navigation property is deprecated and will stop returning data on July 31, 2023. Please use the shares navigation property instead of this. as of 2023-06/Tasks_And_Plans on 2023-06-13 and will be removed 2023-07-31
     */
    @Deprecated
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Get printerShares from print
     * @return a {@link PrinterShare}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The printerShares navigation property is deprecated and will stop returning data on July 31, 2023. Please use the shares navigation property instead of this. as of 2023-06/Tasks_And_Plans on 2023-06-13 and will be removed 2023-07-31
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public PrinterShare get() {
        return get(null);
    }
    /**
     * Get printerShares from print
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PrinterShare}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The printerShares navigation property is deprecated and will stop returning data on July 31, 2023. Please use the shares navigation property instead of this. as of 2023-06/Tasks_And_Plans on 2023-06-13 and will be removed 2023-07-31
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public PrinterShare get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PrinterShare::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property printerShares in print
     * @param body The request body
     * @return a {@link PrinterShare}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The printerShares navigation property is deprecated and will stop returning data on July 31, 2023. Please use the shares navigation property instead of this. as of 2023-06/Tasks_And_Plans on 2023-06-13 and will be removed 2023-07-31
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public PrinterShare patch(@jakarta.annotation.Nonnull final PrinterShare body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property printerShares in print
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PrinterShare}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The printerShares navigation property is deprecated and will stop returning data on July 31, 2023. Please use the shares navigation property instead of this. as of 2023-06/Tasks_And_Plans on 2023-06-13 and will be removed 2023-07-31
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public PrinterShare patch(@jakarta.annotation.Nonnull final PrinterShare body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PrinterShare::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property printerShares for print
     * @return a {@link RequestInformation}
     * @deprecated
     * The printerShares navigation property is deprecated and will stop returning data on July 31, 2023. Please use the shares navigation property instead of this. as of 2023-06/Tasks_And_Plans on 2023-06-13 and will be removed 2023-07-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property printerShares for print
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The printerShares navigation property is deprecated and will stop returning data on July 31, 2023. Please use the shares navigation property instead of this. as of 2023-06/Tasks_And_Plans on 2023-06-13 and will be removed 2023-07-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * Get printerShares from print
     * @return a {@link RequestInformation}
     * @deprecated
     * The printerShares navigation property is deprecated and will stop returning data on July 31, 2023. Please use the shares navigation property instead of this. as of 2023-06/Tasks_And_Plans on 2023-06-13 and will be removed 2023-07-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get printerShares from print
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The printerShares navigation property is deprecated and will stop returning data on July 31, 2023. Please use the shares navigation property instead of this. as of 2023-06/Tasks_And_Plans on 2023-06-13 and will be removed 2023-07-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property printerShares in print
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * The printerShares navigation property is deprecated and will stop returning data on July 31, 2023. Please use the shares navigation property instead of this. as of 2023-06/Tasks_And_Plans on 2023-06-13 and will be removed 2023-07-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final PrinterShare body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property printerShares in print
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The printerShares navigation property is deprecated and will stop returning data on July 31, 2023. Please use the shares navigation property instead of this. as of 2023-06/Tasks_And_Plans on 2023-06-13 and will be removed 2023-07-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final PrinterShare body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link PrinterShareItemRequestBuilder}
     * @deprecated
     * The printerShares navigation property is deprecated and will stop returning data on July 31, 2023. Please use the shares navigation property instead of this. as of 2023-06/Tasks_And_Plans on 2023-06-13 and will be removed 2023-07-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public PrinterShareItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PrinterShareItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get printerShares from print
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
