package com.microsoft.graph.beta.groups.item.team.schedule.timecards.item.startbreak;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.TimeCard;
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
 * Provides operations to call the startBreak method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StartBreakRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link StartBreakRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public StartBreakRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/team/schedule/timeCards/{timeCard%2Did}/startBreak", pathParameters);
    }
    /**
     * Instantiates a new {@link StartBreakRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public StartBreakRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/team/schedule/timeCards/{timeCard%2Did}/startBreak", rawUrl);
    }
    /**
     * Start a break in a specific timeCard.
     * @param body The request body
     * @return a {@link TimeCard}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/timecard-startbreak?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public TimeCard post(@jakarta.annotation.Nonnull final StartBreakPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Start a break in a specific timeCard.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link TimeCard}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/timecard-startbreak?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public TimeCard post(@jakarta.annotation.Nonnull final StartBreakPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, TimeCard::createFromDiscriminatorValue);
    }
    /**
     * Start a break in a specific timeCard.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final StartBreakPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Start a break in a specific timeCard.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final StartBreakPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link StartBreakRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StartBreakRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new StartBreakRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
