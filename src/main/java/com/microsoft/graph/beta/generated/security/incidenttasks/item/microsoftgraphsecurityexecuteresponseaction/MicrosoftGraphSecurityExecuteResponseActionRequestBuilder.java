package com.microsoft.graph.beta.security.incidenttasks.item.microsoftgraphsecurityexecuteresponseaction;

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
 * Provides operations to call the executeResponseAction method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftGraphSecurityExecuteResponseActionRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MicrosoftGraphSecurityExecuteResponseActionRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphSecurityExecuteResponseActionRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/incidentTasks/{incidentTask%2Did}/microsoft.graph.security.executeResponseAction", pathParameters);
    }
    /**
     * Instantiates a new {@link MicrosoftGraphSecurityExecuteResponseActionRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphSecurityExecuteResponseActionRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/incidentTasks/{incidentTask%2Did}/microsoft.graph.security.executeResponseAction", rawUrl);
    }
    /**
     * Execute a remediation action on a Microsoft Defender XDR incident task. Only the following actionType values are supported for automated execution: collectInvestigationPackage, isolateDevice, unRestrictAppExecution, unIsolateDevice, restrictAppExecution, runAntiVirusScan, stopAndQuarantineFile, submitIocRule.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/security-incidenttask-executeresponseaction?view=graph-rest-beta">Find more info here</a>
     */
    public void post() {
        post(null);
    }
    /**
     * Execute a remediation action on a Microsoft Defender XDR incident task. Only the following actionType values are supported for automated execution: collectInvestigationPackage, isolateDevice, unRestrictAppExecution, unIsolateDevice, restrictAppExecution, runAntiVirusScan, stopAndQuarantineFile, submitIocRule.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/security-incidenttask-executeresponseaction?view=graph-rest-beta">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Execute a remediation action on a Microsoft Defender XDR incident task. Only the following actionType values are supported for automated execution: collectInvestigationPackage, isolateDevice, unRestrictAppExecution, unIsolateDevice, restrictAppExecution, runAntiVirusScan, stopAndQuarantineFile, submitIocRule.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Execute a remediation action on a Microsoft Defender XDR incident task. Only the following actionType values are supported for automated execution: collectInvestigationPackage, isolateDevice, unRestrictAppExecution, unIsolateDevice, restrictAppExecution, runAntiVirusScan, stopAndQuarantineFile, submitIocRule.
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
     * @return a {@link MicrosoftGraphSecurityExecuteResponseActionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphSecurityExecuteResponseActionRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MicrosoftGraphSecurityExecuteResponseActionRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
