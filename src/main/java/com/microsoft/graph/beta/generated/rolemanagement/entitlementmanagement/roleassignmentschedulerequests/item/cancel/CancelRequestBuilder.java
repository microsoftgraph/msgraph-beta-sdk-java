package com.microsoft.graph.beta.rolemanagement.entitlementmanagement.roleassignmentschedulerequests.item.cancel;

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
 * Provides operations to call the cancel method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CancelRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link CancelRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CancelRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/roleManagement/entitlementManagement/roleAssignmentScheduleRequests/{unifiedRoleAssignmentScheduleRequest%2Did}/cancel", pathParameters);
    }
    /**
     * Instantiates a new {@link CancelRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CancelRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/roleManagement/entitlementManagement/roleAssignmentScheduleRequests/{unifiedRoleAssignmentScheduleRequest%2Did}/cancel", rawUrl);
    }
    /**
     * Immediately cancel a unifiedRoleAssignmentScheduleRequest object that is in a Granted status, and have the system automatically delete the canceled request after 30 days. After calling this action, the status of the canceled unifiedRoleAssignmentScheduleRequest changes to Canceled.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * This version is being deprecated and is scheduled for removal on 2025-12-01.Please migrate to the latest version before the removal date. as of 2025-01/PrivatePreview:microsoft.applicationAuthorization on 2025-01-01 and will be removed 2025-12-01
     * @see <a href="https://learn.microsoft.com/graph/api/unifiedroleassignmentschedulerequest-cancel?view=graph-rest-beta">Find more info here</a>
     */
    @Deprecated
    public void post() {
        post(null);
    }
    /**
     * Immediately cancel a unifiedRoleAssignmentScheduleRequest object that is in a Granted status, and have the system automatically delete the canceled request after 30 days. After calling this action, the status of the canceled unifiedRoleAssignmentScheduleRequest changes to Canceled.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * This version is being deprecated and is scheduled for removal on 2025-12-01.Please migrate to the latest version before the removal date. as of 2025-01/PrivatePreview:microsoft.applicationAuthorization on 2025-01-01 and will be removed 2025-12-01
     * @see <a href="https://learn.microsoft.com/graph/api/unifiedroleassignmentschedulerequest-cancel?view=graph-rest-beta">Find more info here</a>
     */
    @Deprecated
    public void post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Immediately cancel a unifiedRoleAssignmentScheduleRequest object that is in a Granted status, and have the system automatically delete the canceled request after 30 days. After calling this action, the status of the canceled unifiedRoleAssignmentScheduleRequest changes to Canceled.
     * @return a {@link RequestInformation}
     * @deprecated
     * This version is being deprecated and is scheduled for removal on 2025-12-01.Please migrate to the latest version before the removal date. as of 2025-01/PrivatePreview:microsoft.applicationAuthorization on 2025-01-01 and will be removed 2025-12-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Immediately cancel a unifiedRoleAssignmentScheduleRequest object that is in a Granted status, and have the system automatically delete the canceled request after 30 days. After calling this action, the status of the canceled unifiedRoleAssignmentScheduleRequest changes to Canceled.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * This version is being deprecated and is scheduled for removal on 2025-12-01.Please migrate to the latest version before the removal date. as of 2025-01/PrivatePreview:microsoft.applicationAuthorization on 2025-01-01 and will be removed 2025-12-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link CancelRequestBuilder}
     * @deprecated
     * This version is being deprecated and is scheduled for removal on 2025-12-01.Please migrate to the latest version before the removal date. as of 2025-01/PrivatePreview:microsoft.applicationAuthorization on 2025-01-01 and will be removed 2025-12-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public CancelRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CancelRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
