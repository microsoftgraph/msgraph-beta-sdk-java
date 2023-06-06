package com.microsoft.graph.communications.callrecords.microsoftgraphcallrecordsgetsmslogwithfromdatetimewithtodatetime;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to call the getSmsLog method.
 */
public class MicrosoftGraphCallRecordsGetSmsLogWithFromDateTimeWithToDateTimeRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new MicrosoftGraphCallRecordsGetSmsLogWithFromDateTimeWithToDateTimeRequestBuilder and sets the default values.
     * @param fromDateTime Usage: fromDateTime={fromDateTime}
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @param toDateTime Usage: toDateTime={toDateTime}
     * @return a void
     */
    @javax.annotation.Nullable
    public MicrosoftGraphCallRecordsGetSmsLogWithFromDateTimeWithToDateTimeRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter, @javax.annotation.Nullable final OffsetDateTime fromDateTime, @javax.annotation.Nullable final OffsetDateTime toDateTime) {
        super(requestAdapter, "{+baseurl}/communications/callRecords/microsoft.graph.callRecords.getSmsLog(fromDateTime={fromDateTime},toDateTime={toDateTime}){?%24top,%24skip,%24search,%24filter,%24count}", pathParameters);
        this.pathParameters.put("fromDateTime", fromDateTime);
        this.pathParameters.put("toDateTime", toDateTime);
    }
    /**
     * Instantiates a new MicrosoftGraphCallRecordsGetSmsLogWithFromDateTimeWithToDateTimeRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public MicrosoftGraphCallRecordsGetSmsLogWithFromDateTimeWithToDateTimeRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/communications/callRecords/microsoft.graph.callRecords.getSmsLog(fromDateTime={fromDateTime},toDateTime={toDateTime}){?%24top,%24skip,%24search,%24filter,%24count}", rawUrl);
    }
    /**
     * Invoke function getSmsLog
     * @return a CompletableFuture of getSmsLogWithFromDateTimeWithToDateTimeResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<GetSmsLogWithFromDateTimeWithToDateTimeResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, GetSmsLogWithFromDateTimeWithToDateTimeResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<GetSmsLogWithFromDateTimeWithToDateTimeResponse> executionException = new java.util.concurrent.CompletableFuture<GetSmsLogWithFromDateTimeWithToDateTimeResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Invoke function getSmsLog
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of getSmsLogWithFromDateTimeWithToDateTimeResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<GetSmsLogWithFromDateTimeWithToDateTimeResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, GetSmsLogWithFromDateTimeWithToDateTimeResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<GetSmsLogWithFromDateTimeWithToDateTimeResponse> executionException = new java.util.concurrent.CompletableFuture<GetSmsLogWithFromDateTimeWithToDateTimeResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Invoke function getSmsLog
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Invoke function getSmsLog
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Invoke function getSmsLog
     */
    public class GetQueryParameters {
        /** Include count of items */
        @QueryParameter(name = "%24count")
        @javax.annotation.Nullable
        public Boolean count;
        /** Filter items by property values */
        @QueryParameter(name = "%24filter")
        @javax.annotation.Nullable
        public String filter;
        /** Search items by search phrases */
        @QueryParameter(name = "%24search")
        @javax.annotation.Nullable
        public String search;
        /** Skip the first n items */
        @QueryParameter(name = "%24skip")
        @javax.annotation.Nullable
        public Integer skip;
        /** Show only the first n items */
        @QueryParameter(name = "%24top")
        @javax.annotation.Nullable
        public Integer top;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
