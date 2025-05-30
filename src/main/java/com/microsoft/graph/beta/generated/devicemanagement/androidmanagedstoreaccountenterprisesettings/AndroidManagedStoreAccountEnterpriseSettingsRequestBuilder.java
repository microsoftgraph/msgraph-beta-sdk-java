package com.microsoft.graph.beta.devicemanagement.androidmanagedstoreaccountenterprisesettings;

import com.microsoft.graph.beta.devicemanagement.androidmanagedstoreaccountenterprisesettings.addapps.AddAppsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.androidmanagedstoreaccountenterprisesettings.approveapps.ApproveAppsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.androidmanagedstoreaccountenterprisesettings.completesignup.CompleteSignupRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.androidmanagedstoreaccountenterprisesettings.creategoogleplaywebtoken.CreateGooglePlayWebTokenRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.androidmanagedstoreaccountenterprisesettings.requestsignupurl.RequestSignupUrlRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.androidmanagedstoreaccountenterprisesettings.setandroiddeviceownerfullymanagedenrollmentstate.SetAndroidDeviceOwnerFullyManagedEnrollmentStateRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.androidmanagedstoreaccountenterprisesettings.syncapps.SyncAppsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.androidmanagedstoreaccountenterprisesettings.unbind.UnbindRequestBuilder;
import com.microsoft.graph.beta.models.AndroidManagedStoreAccountEnterpriseSettings;
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
 * Provides operations to manage the androidManagedStoreAccountEnterpriseSettings property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the addApps method.
     * @return a {@link AddAppsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddAppsRequestBuilder addApps() {
        return new AddAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the approveApps method.
     * @return a {@link ApproveAppsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApproveAppsRequestBuilder approveApps() {
        return new ApproveAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the completeSignup method.
     * @return a {@link CompleteSignupRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CompleteSignupRequestBuilder completeSignup() {
        return new CompleteSignupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the createGooglePlayWebToken method.
     * @return a {@link CreateGooglePlayWebTokenRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateGooglePlayWebTokenRequestBuilder createGooglePlayWebToken() {
        return new CreateGooglePlayWebTokenRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the requestSignupUrl method.
     * @return a {@link RequestSignupUrlRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RequestSignupUrlRequestBuilder requestSignupUrl() {
        return new RequestSignupUrlRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the setAndroidDeviceOwnerFullyManagedEnrollmentState method.
     * @return a {@link SetAndroidDeviceOwnerFullyManagedEnrollmentStateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SetAndroidDeviceOwnerFullyManagedEnrollmentStateRequestBuilder setAndroidDeviceOwnerFullyManagedEnrollmentState() {
        return new SetAndroidDeviceOwnerFullyManagedEnrollmentStateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the syncApps method.
     * @return a {@link SyncAppsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SyncAppsRequestBuilder syncApps() {
        return new SyncAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unbind method.
     * @return a {@link UnbindRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UnbindRequestBuilder unbind() {
        return new UnbindRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/androidManagedStoreAccountEnterpriseSettings{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/androidManagedStoreAccountEnterpriseSettings{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property androidManagedStoreAccountEnterpriseSettings for deviceManagement
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property androidManagedStoreAccountEnterpriseSettings for deviceManagement
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
     * The singleton Android managed store account enterprise settings entity.
     * @return a {@link AndroidManagedStoreAccountEnterpriseSettings}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AndroidManagedStoreAccountEnterpriseSettings get() {
        return get(null);
    }
    /**
     * The singleton Android managed store account enterprise settings entity.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AndroidManagedStoreAccountEnterpriseSettings}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AndroidManagedStoreAccountEnterpriseSettings get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AndroidManagedStoreAccountEnterpriseSettings::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property androidManagedStoreAccountEnterpriseSettings in deviceManagement
     * @param body The request body
     * @return a {@link AndroidManagedStoreAccountEnterpriseSettings}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AndroidManagedStoreAccountEnterpriseSettings patch(@jakarta.annotation.Nonnull final AndroidManagedStoreAccountEnterpriseSettings body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property androidManagedStoreAccountEnterpriseSettings in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AndroidManagedStoreAccountEnterpriseSettings}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AndroidManagedStoreAccountEnterpriseSettings patch(@jakarta.annotation.Nonnull final AndroidManagedStoreAccountEnterpriseSettings body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AndroidManagedStoreAccountEnterpriseSettings::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property androidManagedStoreAccountEnterpriseSettings for deviceManagement
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property androidManagedStoreAccountEnterpriseSettings for deviceManagement
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
     * The singleton Android managed store account enterprise settings entity.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The singleton Android managed store account enterprise settings entity.
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
     * Update the navigation property androidManagedStoreAccountEnterpriseSettings in deviceManagement
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AndroidManagedStoreAccountEnterpriseSettings body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property androidManagedStoreAccountEnterpriseSettings in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AndroidManagedStoreAccountEnterpriseSettings body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The singleton Android managed store account enterprise settings entity.
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
