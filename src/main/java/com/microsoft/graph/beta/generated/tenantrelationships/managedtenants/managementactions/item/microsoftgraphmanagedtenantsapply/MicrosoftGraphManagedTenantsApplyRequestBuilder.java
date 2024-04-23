package com.microsoft.graph.beta.tenantrelationships.managedtenants.managementactions.item.microsoftgraphmanagedtenantsapply;

import com.microsoft.graph.beta.models.managedtenants.ManagementActionDeploymentStatus;
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
 * Provides operations to call the apply method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftGraphManagedTenantsApplyRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MicrosoftGraphManagedTenantsApplyRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphManagedTenantsApplyRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenantRelationships/managedTenants/managementActions/{managementAction%2Did}/microsoft.graph.managedTenants.apply", pathParameters);
    }
    /**
     * Instantiates a new {@link MicrosoftGraphManagedTenantsApplyRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphManagedTenantsApplyRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenantRelationships/managedTenants/managementActions/{managementAction%2Did}/microsoft.graph.managedTenants.apply", rawUrl);
    }
    /**
     * Applies a management action against a specific managed tenant. By performing this operation the appropriate configurations will be made and policies created. As example when applying the require multifactor authentication for admins management action creates a Microsoft Entra Conditional Access policy that requires multifactor authentication for all users that have been assigned an administrative directory role.
     * @param body The request body
     * @return a {@link ManagementActionDeploymentStatus}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/managedtenants-managementaction-apply?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ManagementActionDeploymentStatus post(@jakarta.annotation.Nonnull final ApplyPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Applies a management action against a specific managed tenant. By performing this operation the appropriate configurations will be made and policies created. As example when applying the require multifactor authentication for admins management action creates a Microsoft Entra Conditional Access policy that requires multifactor authentication for all users that have been assigned an administrative directory role.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ManagementActionDeploymentStatus}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/managedtenants-managementaction-apply?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ManagementActionDeploymentStatus post(@jakarta.annotation.Nonnull final ApplyPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ManagementActionDeploymentStatus::createFromDiscriminatorValue);
    }
    /**
     * Applies a management action against a specific managed tenant. By performing this operation the appropriate configurations will be made and policies created. As example when applying the require multifactor authentication for admins management action creates a Microsoft Entra Conditional Access policy that requires multifactor authentication for all users that have been assigned an administrative directory role.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ApplyPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Applies a management action against a specific managed tenant. By performing this operation the appropriate configurations will be made and policies created. As example when applying the require multifactor authentication for admins management action creates a Microsoft Entra Conditional Access policy that requires multifactor authentication for all users that have been assigned an administrative directory role.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ApplyPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link MicrosoftGraphManagedTenantsApplyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphManagedTenantsApplyRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MicrosoftGraphManagedTenantsApplyRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
