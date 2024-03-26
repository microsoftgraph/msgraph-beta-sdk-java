package com.microsoft.graph.beta.deviceappmanagement.mobileapps.convertfrommobileappcatalogpackagewithmobileappcatalogpackageid;

import com.microsoft.graph.beta.models.MobileApp;
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
 * Provides operations to call the convertFromMobileAppCatalogPackage method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConvertFromMobileAppCatalogPackageWithMobileAppCatalogPackageIdRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ConvertFromMobileAppCatalogPackageWithMobileAppCatalogPackageIdRequestBuilder} and sets the default values.
     * @param mobileAppCatalogPackageId Usage: mobileAppCatalogPackageId='{mobileAppCatalogPackageId}'
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConvertFromMobileAppCatalogPackageWithMobileAppCatalogPackageIdRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String mobileAppCatalogPackageId) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement/mobileApps/convertFromMobileAppCatalogPackage(mobileAppCatalogPackageId='{mobileAppCatalogPackageId}')", pathParameters);
        this.pathParameters.put("mobileAppCatalogPackageId", mobileAppCatalogPackageId);
    }
    /**
     * Instantiates a new {@link ConvertFromMobileAppCatalogPackageWithMobileAppCatalogPackageIdRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConvertFromMobileAppCatalogPackageWithMobileAppCatalogPackageIdRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement/mobileApps/convertFromMobileAppCatalogPackage(mobileAppCatalogPackageId='{mobileAppCatalogPackageId}')", rawUrl);
    }
    /**
     * Invoke function convertFromMobileAppCatalogPackage
     * @return a {@link MobileApp}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public MobileApp get() {
        return get(null);
    }
    /**
     * Invoke function convertFromMobileAppCatalogPackage
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
     * Invoke function convertFromMobileAppCatalogPackage
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Invoke function convertFromMobileAppCatalogPackage
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
     * @return a {@link ConvertFromMobileAppCatalogPackageWithMobileAppCatalogPackageIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConvertFromMobileAppCatalogPackageWithMobileAppCatalogPackageIdRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ConvertFromMobileAppCatalogPackageWithMobileAppCatalogPackageIdRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
