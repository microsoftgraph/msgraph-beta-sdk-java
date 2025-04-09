package com.microsoft.graph.beta.directory.templates.devicetemplates.item;

import com.microsoft.graph.beta.directory.templates.devicetemplates.item.createdevicefromtemplate.CreateDeviceFromTemplateRequestBuilder;
import com.microsoft.graph.beta.directory.templates.devicetemplates.item.deviceinstances.DeviceInstancesRequestBuilder;
import com.microsoft.graph.beta.directory.templates.devicetemplates.item.deviceinstanceswithdeviceid.DeviceInstancesWithDeviceIdRequestBuilder;
import com.microsoft.graph.beta.directory.templates.devicetemplates.item.owners.OwnersRequestBuilder;
import com.microsoft.graph.beta.models.DeviceTemplate;
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
 * Provides operations to manage the deviceTemplates property of the microsoft.graph.template entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceTemplateItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the createDeviceFromTemplate method.
     * @return a {@link CreateDeviceFromTemplateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateDeviceFromTemplateRequestBuilder createDeviceFromTemplate() {
        return new CreateDeviceFromTemplateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceInstances property of the microsoft.graph.deviceTemplate entity.
     * @return a {@link DeviceInstancesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceInstancesRequestBuilder deviceInstances() {
        return new DeviceInstancesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the owners property of the microsoft.graph.deviceTemplate entity.
     * @return a {@link OwnersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OwnersRequestBuilder owners() {
        return new OwnersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link DeviceTemplateItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeviceTemplateItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/directory/templates/deviceTemplates/{deviceTemplate%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link DeviceTemplateItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeviceTemplateItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/directory/templates/deviceTemplates/{deviceTemplate%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete a registered deviceTemplate. You must first delete all devices linked to the template before deleting the template itself. Only registered owners of the template can perform this operation.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/devicetemplate-delete?view=graph-rest-beta">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete a registered deviceTemplate. You must first delete all devices linked to the template before deleting the template itself. Only registered owners of the template can perform this operation.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/devicetemplate-delete?view=graph-rest-beta">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Provides operations to manage the deviceInstances property of the microsoft.graph.deviceTemplate entity.
     * @param deviceId Alternate key of device
     * @return a {@link DeviceInstancesWithDeviceIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceInstancesWithDeviceIdRequestBuilder deviceInstancesWithDeviceId(@jakarta.annotation.Nonnull final String deviceId) {
        Objects.requireNonNull(deviceId);
        return new DeviceInstancesWithDeviceIdRequestBuilder(pathParameters, requestAdapter, deviceId);
    }
    /**
     * Get the properties and relationships of a deviceTemplate object.
     * @return a {@link DeviceTemplate}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/devicetemplate-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DeviceTemplate get() {
        return get(null);
    }
    /**
     * Get the properties and relationships of a deviceTemplate object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DeviceTemplate}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/devicetemplate-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DeviceTemplate get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeviceTemplate::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property deviceTemplates in directory
     * @param body The request body
     * @return a {@link DeviceTemplate}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DeviceTemplate patch(@jakarta.annotation.Nonnull final DeviceTemplate body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property deviceTemplates in directory
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DeviceTemplate}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DeviceTemplate patch(@jakarta.annotation.Nonnull final DeviceTemplate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeviceTemplate::createFromDiscriminatorValue);
    }
    /**
     * Delete a registered deviceTemplate. You must first delete all devices linked to the template before deleting the template itself. Only registered owners of the template can perform this operation.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a registered deviceTemplate. You must first delete all devices linked to the template before deleting the template itself. Only registered owners of the template can perform this operation.
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
     * Get the properties and relationships of a deviceTemplate object.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the properties and relationships of a deviceTemplate object.
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
     * Update the navigation property deviceTemplates in directory
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DeviceTemplate body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property deviceTemplates in directory
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DeviceTemplate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link DeviceTemplateItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceTemplateItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DeviceTemplateItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get the properties and relationships of a deviceTemplate object.
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
