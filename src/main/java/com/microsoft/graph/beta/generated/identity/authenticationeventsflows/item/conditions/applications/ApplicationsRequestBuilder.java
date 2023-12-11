package com.microsoft.graph.beta.identity.authenticationeventsflows.item.conditions.applications;

import com.microsoft.graph.beta.identity.authenticationeventsflows.item.conditions.applications.includeapplications.IncludeApplicationsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /identity/authenticationEventsFlows/{authenticationEventsFlow-id}/conditions/applications
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApplicationsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the includeApplications property of the microsoft.graph.authenticationConditionsApplications entity.
     */
    @jakarta.annotation.Nonnull
    public IncludeApplicationsRequestBuilder includeApplications() {
        return new IncludeApplicationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ApplicationsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApplicationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/authenticationEventsFlows/{authenticationEventsFlow%2Did}/conditions/applications", pathParameters);
    }
    /**
     * Instantiates a new ApplicationsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApplicationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/authenticationEventsFlows/{authenticationEventsFlow%2Did}/conditions/applications", rawUrl);
    }
}
