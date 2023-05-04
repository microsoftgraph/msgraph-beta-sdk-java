package com.microsoft.serviceClient;

import com.azure.core.credential.TokenCredential;
import com.microsoft.graph.requests.BaseGraphRequestAdapter;
import com.microsoft.graph.requests.GraphClientOption;
import com.microsoft.graph.requests.IBaseClient;
import com.microsoft.info.Constants;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.authentication.AnonymousAuthenticationProvider;
import com.microsoft.kiota.authentication.AuthenticationProvider;
import com.microsoft.kiota.authentication.AzureIdentityAuthenticationProvider;

import okhttp3.OkHttpClient;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class GraphServiceClient extends com.microsoft.graph.BaseGraphServiceClient implements IBaseClient {
    private RequestAdapter requestAdapter;
    /**
     * Sets a few basic values for the GraphClientOptions to pass to the client.
     * @return the GraphClientOptions instance for the GraphServiceClient.
     */
    @Nonnull
    public static GraphClientOption getGraphClientOptions() {
        GraphClientOption graphClientOptions = new GraphClientOption();
        graphClientOptions.setGraphServiceTargetVersion("beta");
        graphClientOptions.setClientLibraryVersion(Constants.VERSION_NAME);
        return graphClientOptions;
    }
    /**
     * Instantiates a new BaseGraphServiceClient and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GraphServiceClient(@Nonnull RequestAdapter requestAdapter) {
        super(requestAdapter);
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiate the GraphServiceClient using an AuthenticationProvider.
     * @param authenticationProvider The AuthenticationProvider for this GraphServiceClient.
     */
    public GraphServiceClient(@Nonnull AuthenticationProvider authenticationProvider) {
        this(new BaseGraphRequestAdapter(authenticationProvider, null, "beta" , getGraphClientOptions()));
    }
    /**
     * Instantiate the GraphServiceClient using an AuthenticationProvider and OkHttpClient.
     * @param authenticationProvider The AuthenticationProvider for this GraphServiceClient.
     * @param client The OkHttpClient for the GraphServiceClient.
     */
    @SuppressWarnings("LambdaLast")
    public GraphServiceClient(@Nonnull AuthenticationProvider authenticationProvider, @Nonnull OkHttpClient client) {
        this(new BaseGraphRequestAdapter(authenticationProvider, null, "beta", client));
    }
    /**
     * Instantiate the GraphServiceClient using an OkHttpClient
     * @param client The OkHttpClient for the GraphServiceClient.
     */
    public GraphServiceClient(@Nonnull OkHttpClient client) {
        this(new AnonymousAuthenticationProvider(), client);
    }
    /**
     * Instantiate the GraphServiceClient using a TokenCredential and Scopes.
     * @param tokenCredential The TokenCredential for this GraphServiceClient.
     * @param scopes The Scopes for this GraphServiceClient.
     */
    @SuppressWarnings("LambdaLast")
    public GraphServiceClient(@Nonnull TokenCredential tokenCredential, @Nullable String... scopes) {
        this(new AzureIdentityAuthenticationProvider(tokenCredential, null, scopes));
    }
    /**
     * Sets the RequestAdapter for the GraphServiceClient.
     * @param requestAdapter the request adapter to use to execute the requests.
     */
    @Override
    public void setRequestAdapter(@Nonnull RequestAdapter requestAdapter) {
        this.requestAdapter = requestAdapter;
    }
    /**
     * Gets the RequestAdapter for the GraphServiceClient.
     * @return the request adapter to use to execute the requests.
     */
    @Nonnull
    @Override
    public RequestAdapter getRequestAdapter() {
        return this.requestAdapter;
    }
}
