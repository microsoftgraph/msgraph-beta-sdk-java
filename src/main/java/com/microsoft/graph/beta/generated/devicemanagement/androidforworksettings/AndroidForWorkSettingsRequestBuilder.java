package com.microsoft.graph.beta.devicemanagement.androidforworksettings;

import com.microsoft.graph.beta.devicemanagement.androidforworksettings.completesignup.CompleteSignupRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.androidforworksettings.requestsignupurl.RequestSignupUrlRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.androidforworksettings.syncapps.SyncAppsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.androidforworksettings.unbind.UnbindRequestBuilder;
import com.microsoft.graph.beta.models.AndroidForWorkSettings;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
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
 * Provides operations to manage the androidForWorkSettings property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidForWorkSettingsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the completeSignup method.
     */
    @jakarta.annotation.Nonnull
    public CompleteSignupRequestBuilder completeSignup() {
        return new CompleteSignupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the requestSignupUrl method.
     */
    @jakarta.annotation.Nonnull
    public RequestSignupUrlRequestBuilder requestSignupUrl() {
        return new RequestSignupUrlRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the syncApps method.
     */
    @jakarta.annotation.Nonnull
    public SyncAppsRequestBuilder syncApps() {
        return new SyncAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unbind method.
     */
    @jakarta.annotation.Nonnull
    public UnbindRequestBuilder unbind() {
        return new UnbindRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new AndroidForWorkSettingsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AndroidForWorkSettingsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/androidForWorkSettings{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new AndroidForWorkSettingsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AndroidForWorkSettingsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/androidForWorkSettings{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property androidForWorkSettings for deviceManagement
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property androidForWorkSettings for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * The singleton Android for Work settings entity.
     * @return a AndroidForWorkSettings
     */
    @jakarta.annotation.Nullable
    public AndroidForWorkSettings get() {
        return get(null);
    }
    /**
     * The singleton Android for Work settings entity.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AndroidForWorkSettings
     */
    @jakarta.annotation.Nullable
    public AndroidForWorkSettings get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AndroidForWorkSettings::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property androidForWorkSettings in deviceManagement
     * @param body The request body
     * @return a AndroidForWorkSettings
     */
    @jakarta.annotation.Nullable
    public AndroidForWorkSettings patch(@jakarta.annotation.Nonnull final AndroidForWorkSettings body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property androidForWorkSettings in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AndroidForWorkSettings
     */
    @jakarta.annotation.Nullable
    public AndroidForWorkSettings patch(@jakarta.annotation.Nonnull final AndroidForWorkSettings body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AndroidForWorkSettings::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property androidForWorkSettings for deviceManagement
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property androidForWorkSettings for deviceManagement
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
     * The singleton Android for Work settings entity.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The singleton Android for Work settings entity.
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
     * Update the navigation property androidForWorkSettings in deviceManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AndroidForWorkSettings body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property androidForWorkSettings in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AndroidForWorkSettings body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a AndroidForWorkSettingsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AndroidForWorkSettingsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AndroidForWorkSettingsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The singleton Android for Work settings entity.
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
