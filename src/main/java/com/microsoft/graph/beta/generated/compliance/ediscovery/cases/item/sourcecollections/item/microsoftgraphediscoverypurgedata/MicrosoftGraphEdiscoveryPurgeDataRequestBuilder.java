package com.microsoft.graph.beta.compliance.ediscovery.cases.item.sourcecollections.item.microsoftgraphediscoverypurgedata;

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
 * Provides operations to call the purgeData method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftGraphEdiscoveryPurgeDataRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MicrosoftGraphEdiscoveryPurgeDataRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphEdiscoveryPurgeDataRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compliance/ediscovery/cases/{case%2Did}/sourceCollections/{sourceCollection%2Did}/microsoft.graph.ediscovery.purgeData", pathParameters);
    }
    /**
     * Instantiates a new {@link MicrosoftGraphEdiscoveryPurgeDataRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphEdiscoveryPurgeDataRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compliance/ediscovery/cases/{case%2Did}/sourceCollections/{sourceCollection%2Did}/microsoft.graph.ediscovery.purgeData", rawUrl);
    }
    /**
     * Permanently delete Microsoft Teams messages contained in a sourceCollection. You can collect and purge the following categories of Teams content:- Teams 1:1 chats - Chat messages, posts, and attachments shared in a Teams conversation between two people. Teams 1:1 chats are also called *conversations*.- Teams group chats - Chat messages, posts, and attachments shared in a Teams conversation between three or more people. Also called *1:N* chats or *group conversations*.- Teams channels - Chat messages, posts, replies, and attachments shared in a standard Teams channel.- Private channels - Message posts, replies, and attachments shared in a private Teams channel.- Shared channels - Message posts, replies, and attachments shared in a shared Teams channel. For more information about purging Teams messages, see:- eDiscovery solution series: Data spillage scenario - Search and purge- Advanced eDiscovery workflow for content in Microsoft Teams 
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     * @see <a href="https://learn.microsoft.com/graph/api/ediscovery-sourcecollection-purgedata?view=graph-rest-beta">Find more info here</a>
     */
    @Deprecated
    public void post() {
        post(null);
    }
    /**
     * Permanently delete Microsoft Teams messages contained in a sourceCollection. You can collect and purge the following categories of Teams content:- Teams 1:1 chats - Chat messages, posts, and attachments shared in a Teams conversation between two people. Teams 1:1 chats are also called *conversations*.- Teams group chats - Chat messages, posts, and attachments shared in a Teams conversation between three or more people. Also called *1:N* chats or *group conversations*.- Teams channels - Chat messages, posts, replies, and attachments shared in a standard Teams channel.- Private channels - Message posts, replies, and attachments shared in a private Teams channel.- Shared channels - Message posts, replies, and attachments shared in a shared Teams channel. For more information about purging Teams messages, see:- eDiscovery solution series: Data spillage scenario - Search and purge- Advanced eDiscovery workflow for content in Microsoft Teams 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     * @see <a href="https://learn.microsoft.com/graph/api/ediscovery-sourcecollection-purgedata?view=graph-rest-beta">Find more info here</a>
     */
    @Deprecated
    public void post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Permanently delete Microsoft Teams messages contained in a sourceCollection. You can collect and purge the following categories of Teams content:- Teams 1:1 chats - Chat messages, posts, and attachments shared in a Teams conversation between two people. Teams 1:1 chats are also called *conversations*.- Teams group chats - Chat messages, posts, and attachments shared in a Teams conversation between three or more people. Also called *1:N* chats or *group conversations*.- Teams channels - Chat messages, posts, replies, and attachments shared in a standard Teams channel.- Private channels - Message posts, replies, and attachments shared in a private Teams channel.- Shared channels - Message posts, replies, and attachments shared in a shared Teams channel. For more information about purging Teams messages, see:- eDiscovery solution series: Data spillage scenario - Search and purge- Advanced eDiscovery workflow for content in Microsoft Teams 
     * @return a {@link RequestInformation}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Permanently delete Microsoft Teams messages contained in a sourceCollection. You can collect and purge the following categories of Teams content:- Teams 1:1 chats - Chat messages, posts, and attachments shared in a Teams conversation between two people. Teams 1:1 chats are also called *conversations*.- Teams group chats - Chat messages, posts, and attachments shared in a Teams conversation between three or more people. Also called *1:N* chats or *group conversations*.- Teams channels - Chat messages, posts, replies, and attachments shared in a standard Teams channel.- Private channels - Message posts, replies, and attachments shared in a private Teams channel.- Shared channels - Message posts, replies, and attachments shared in a shared Teams channel. For more information about purging Teams messages, see:- eDiscovery solution series: Data spillage scenario - Search and purge- Advanced eDiscovery workflow for content in Microsoft Teams 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link MicrosoftGraphEdiscoveryPurgeDataRequestBuilder}
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public MicrosoftGraphEdiscoveryPurgeDataRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MicrosoftGraphEdiscoveryPurgeDataRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
