package com.microsoft.graph.beta.security.microsoftgraphsecuritygetrunhuntingquerywithquerytimespantimespanwithworkspaceid;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.security.HuntingQueryResults;
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
import java.util.UUID;
/**
 * Provides operations to call the getRunHuntingQuery method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftGraphSecurityGetRunHuntingQueryWithQuerytimespanTimespanWithWorkspaceIdRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MicrosoftGraphSecurityGetRunHuntingQueryWithQuerytimespanTimespanWithWorkspaceIdRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param query Usage: query=&apos;{query}&apos;
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphSecurityGetRunHuntingQueryWithQuerytimespanTimespanWithWorkspaceIdRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String query) {
        super(requestAdapter, "{+baseurl}/security/microsoft.graph.security.getRunHuntingQuery(query='{query}',timespan='@timespan',workspaceId=@workspaceId){?timespan*,workspaceId*}", pathParameters);
        this.pathParameters.put("query", query);
    }
    /**
     * Instantiates a new {@link MicrosoftGraphSecurityGetRunHuntingQueryWithQuerytimespanTimespanWithWorkspaceIdRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphSecurityGetRunHuntingQueryWithQuerytimespanTimespanWithWorkspaceIdRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/microsoft.graph.security.getRunHuntingQuery(query='{query}',timespan='@timespan',workspaceId=@workspaceId){?timespan*,workspaceId*}", rawUrl);
    }
    /**
     * Query a specified set of event, activity, or entity data supported by Microsoft Defender XDR to proactively look for specific threats in your environment, by using a GET request. This function is the GET-based companion to the runHuntingQuery action. It accepts a query in Kusto Query Language (KQL) as a URL parameter, executes it against the advanced hunting schema, and returns the same huntingQueryResults shape as the POST action. Use this function in scenarios that can&apos;t issue authenticated POST requests, such as Power BI dashboards that authenticate through Web.Contents. Find out more about hunting for threats across devices, emails, apps, and identities. Learn about KQL. For information on using advanced hunting in the Microsoft Defender portal, see Proactively hunt for threats with advanced hunting in Microsoft Defender XDR.
     * @return a {@link HuntingQueryResults}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public HuntingQueryResults get() {
        return get(null);
    }
    /**
     * Query a specified set of event, activity, or entity data supported by Microsoft Defender XDR to proactively look for specific threats in your environment, by using a GET request. This function is the GET-based companion to the runHuntingQuery action. It accepts a query in Kusto Query Language (KQL) as a URL parameter, executes it against the advanced hunting schema, and returns the same huntingQueryResults shape as the POST action. Use this function in scenarios that can&apos;t issue authenticated POST requests, such as Power BI dashboards that authenticate through Web.Contents. Find out more about hunting for threats across devices, emails, apps, and identities. Learn about KQL. For information on using advanced hunting in the Microsoft Defender portal, see Proactively hunt for threats with advanced hunting in Microsoft Defender XDR.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link HuntingQueryResults}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public HuntingQueryResults get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, HuntingQueryResults::createFromDiscriminatorValue);
    }
    /**
     * Query a specified set of event, activity, or entity data supported by Microsoft Defender XDR to proactively look for specific threats in your environment, by using a GET request. This function is the GET-based companion to the runHuntingQuery action. It accepts a query in Kusto Query Language (KQL) as a URL parameter, executes it against the advanced hunting schema, and returns the same huntingQueryResults shape as the POST action. Use this function in scenarios that can&apos;t issue authenticated POST requests, such as Power BI dashboards that authenticate through Web.Contents. Find out more about hunting for threats across devices, emails, apps, and identities. Learn about KQL. For information on using advanced hunting in the Microsoft Defender portal, see Proactively hunt for threats with advanced hunting in Microsoft Defender XDR.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Query a specified set of event, activity, or entity data supported by Microsoft Defender XDR to proactively look for specific threats in your environment, by using a GET request. This function is the GET-based companion to the runHuntingQuery action. It accepts a query in Kusto Query Language (KQL) as a URL parameter, executes it against the advanced hunting schema, and returns the same huntingQueryResults shape as the POST action. Use this function in scenarios that can&apos;t issue authenticated POST requests, such as Power BI dashboards that authenticate through Web.Contents. Find out more about hunting for threats across devices, emails, apps, and identities. Learn about KQL. For information on using advanced hunting in the Microsoft Defender portal, see Proactively hunt for threats with advanced hunting in Microsoft Defender XDR.
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
     * @return a {@link MicrosoftGraphSecurityGetRunHuntingQueryWithQuerytimespanTimespanWithWorkspaceIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphSecurityGetRunHuntingQueryWithQuerytimespanTimespanWithWorkspaceIdRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MicrosoftGraphSecurityGetRunHuntingQueryWithQuerytimespanTimespanWithWorkspaceIdRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Query a specified set of event, activity, or entity data supported by Microsoft Defender XDR to proactively look for specific threats in your environment, by using a GET request. This function is the GET-based companion to the runHuntingQuery action. It accepts a query in Kusto Query Language (KQL) as a URL parameter, executes it against the advanced hunting schema, and returns the same huntingQueryResults shape as the POST action. Use this function in scenarios that can&apos;t issue authenticated POST requests, such as Power BI dashboards that authenticate through Web.Contents. Find out more about hunting for threats across devices, emails, apps, and identities. Learn about KQL. For information on using advanced hunting in the Microsoft Defender portal, see Proactively hunt for threats with advanced hunting in Microsoft Defender XDR.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Usage: timespan=&apos;@timespan&apos;
         */
        @jakarta.annotation.Nullable
        public String timespan;
        /**
         * Usage: workspaceId=@workspaceId
         */
        @jakarta.annotation.Nullable
        public UUID workspaceId;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("timespan", timespan);
            allQueryParams.put("workspaceId", workspaceId);
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
