package com.microsoft.graph.beta.external.industrydata.runs.microsoftgraphindustrydatastart;

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
 * Provides operations to call the start method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftGraphIndustryDataStartRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MicrosoftGraphIndustryDataStartRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphIndustryDataStartRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/external/industryData/runs/microsoft.graph.industryData.start", pathParameters);
    }
    /**
     * Instantiates a new {@link MicrosoftGraphIndustryDataStartRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphIndustryDataStartRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/external/industryData/runs/microsoft.graph.industryData.start", rawUrl);
    }
    /**
     * Start a new industryDataRun. Industry data automates a run every 12 hours; however, users can use the start action to perform an on-demand run. The industry data service throttles the start of runs, allowing up to five successful runs every 12 hours. An on-demand run causes the next system-scheduled run to be skipped if it is set to run within the next 10 hours.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void post() {
        post(null);
    }
    /**
     * Start a new industryDataRun. Industry data automates a run every 12 hours; however, users can use the start action to perform an on-demand run. The industry data service throttles the start of runs, allowing up to five successful runs every 12 hours. An on-demand run causes the next system-scheduled run to be skipped if it is set to run within the next 10 hours.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Start a new industryDataRun. Industry data automates a run every 12 hours; however, users can use the start action to perform an on-demand run. The industry data service throttles the start of runs, allowing up to five successful runs every 12 hours. An on-demand run causes the next system-scheduled run to be skipped if it is set to run within the next 10 hours.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Start a new industryDataRun. Industry data automates a run every 12 hours; however, users can use the start action to perform an on-demand run. The industry data service throttles the start of runs, allowing up to five successful runs every 12 hours. An on-demand run causes the next system-scheduled run to be skipped if it is set to run within the next 10 hours.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link MicrosoftGraphIndustryDataStartRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphIndustryDataStartRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MicrosoftGraphIndustryDataStartRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
