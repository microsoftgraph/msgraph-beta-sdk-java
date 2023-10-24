package com.microsoft.graph.users.item.profile;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Profile;
import com.microsoft.graph.users.item.profile.account.AccountRequestBuilder;
import com.microsoft.graph.users.item.profile.addresses.AddressesRequestBuilder;
import com.microsoft.graph.users.item.profile.anniversaries.AnniversariesRequestBuilder;
import com.microsoft.graph.users.item.profile.awards.AwardsRequestBuilder;
import com.microsoft.graph.users.item.profile.certifications.CertificationsRequestBuilder;
import com.microsoft.graph.users.item.profile.educationalactivities.EducationalActivitiesRequestBuilder;
import com.microsoft.graph.users.item.profile.emails.EmailsRequestBuilder;
import com.microsoft.graph.users.item.profile.interests.InterestsRequestBuilder;
import com.microsoft.graph.users.item.profile.languages.LanguagesRequestBuilder;
import com.microsoft.graph.users.item.profile.names.NamesRequestBuilder;
import com.microsoft.graph.users.item.profile.notes.NotesRequestBuilder;
import com.microsoft.graph.users.item.profile.patents.PatentsRequestBuilder;
import com.microsoft.graph.users.item.profile.phones.PhonesRequestBuilder;
import com.microsoft.graph.users.item.profile.positions.PositionsRequestBuilder;
import com.microsoft.graph.users.item.profile.projects.ProjectsRequestBuilder;
import com.microsoft.graph.users.item.profile.publications.PublicationsRequestBuilder;
import com.microsoft.graph.users.item.profile.skills.SkillsRequestBuilder;
import com.microsoft.graph.users.item.profile.webaccounts.WebAccountsRequestBuilder;
import com.microsoft.graph.users.item.profile.websites.WebsitesRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
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
 * Provides operations to manage the profile property of the microsoft.graph.user entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProfileRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the account property of the microsoft.graph.profile entity.
     */
    @jakarta.annotation.Nonnull
    public AccountRequestBuilder account() {
        return new AccountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the addresses property of the microsoft.graph.profile entity.
     */
    @jakarta.annotation.Nonnull
    public AddressesRequestBuilder addresses() {
        return new AddressesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the anniversaries property of the microsoft.graph.profile entity.
     */
    @jakarta.annotation.Nonnull
    public AnniversariesRequestBuilder anniversaries() {
        return new AnniversariesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the awards property of the microsoft.graph.profile entity.
     */
    @jakarta.annotation.Nonnull
    public AwardsRequestBuilder awards() {
        return new AwardsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the certifications property of the microsoft.graph.profile entity.
     */
    @jakarta.annotation.Nonnull
    public CertificationsRequestBuilder certifications() {
        return new CertificationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the educationalActivities property of the microsoft.graph.profile entity.
     */
    @jakarta.annotation.Nonnull
    public EducationalActivitiesRequestBuilder educationalActivities() {
        return new EducationalActivitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the emails property of the microsoft.graph.profile entity.
     */
    @jakarta.annotation.Nonnull
    public EmailsRequestBuilder emails() {
        return new EmailsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the interests property of the microsoft.graph.profile entity.
     */
    @jakarta.annotation.Nonnull
    public InterestsRequestBuilder interests() {
        return new InterestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the languages property of the microsoft.graph.profile entity.
     */
    @jakarta.annotation.Nonnull
    public LanguagesRequestBuilder languages() {
        return new LanguagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the names property of the microsoft.graph.profile entity.
     */
    @jakarta.annotation.Nonnull
    public NamesRequestBuilder names() {
        return new NamesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the notes property of the microsoft.graph.profile entity.
     */
    @jakarta.annotation.Nonnull
    public NotesRequestBuilder notes() {
        return new NotesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the patents property of the microsoft.graph.profile entity.
     */
    @jakarta.annotation.Nonnull
    public PatentsRequestBuilder patents() {
        return new PatentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the phones property of the microsoft.graph.profile entity.
     */
    @jakarta.annotation.Nonnull
    public PhonesRequestBuilder phones() {
        return new PhonesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the positions property of the microsoft.graph.profile entity.
     */
    @jakarta.annotation.Nonnull
    public PositionsRequestBuilder positions() {
        return new PositionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the projects property of the microsoft.graph.profile entity.
     */
    @jakarta.annotation.Nonnull
    public ProjectsRequestBuilder projects() {
        return new ProjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the publications property of the microsoft.graph.profile entity.
     */
    @jakarta.annotation.Nonnull
    public PublicationsRequestBuilder publications() {
        return new PublicationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the skills property of the microsoft.graph.profile entity.
     */
    @jakarta.annotation.Nonnull
    public SkillsRequestBuilder skills() {
        return new SkillsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the webAccounts property of the microsoft.graph.profile entity.
     */
    @jakarta.annotation.Nonnull
    public WebAccountsRequestBuilder webAccounts() {
        return new WebAccountsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the websites property of the microsoft.graph.profile entity.
     */
    @jakarta.annotation.Nonnull
    public WebsitesRequestBuilder websites() {
        return new WebsitesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ProfileRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProfileRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/profile{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ProfileRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProfileRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/profile{?%24select,%24expand}", rawUrl);
    }
    /**
     * Deletes a profile object from a user's account. This API is available in the following national cloud deployments.
     * @see <a href="https://learn.microsoft.com/graph/api/profile-delete?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Deletes a profile object from a user's account. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/profile-delete?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * Retrieve the properties and relationships of a profile object for a given user. The profile resource exposes various rich properties that are descriptive of the user as relationships, for example, anniversaries and education activities. To get one of these navigation properties, use the corresponding GET method on that property. See the methods exposed by profile. This API is available in the following national cloud deployments.
     * @return a CompletableFuture of Profile
     * @see <a href="https://learn.microsoft.com/graph/api/profile-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Profile> get() {
        return get(null);
    }
    /**
     * Retrieve the properties and relationships of a profile object for a given user. The profile resource exposes various rich properties that are descriptive of the user as relationships, for example, anniversaries and education activities. To get one of these navigation properties, use the corresponding GET method on that property. See the methods exposed by profile. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of Profile
     * @see <a href="https://learn.microsoft.com/graph/api/profile-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Profile> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, Profile::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property profile in users
     * @param body The request body
     * @return a CompletableFuture of Profile
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Profile> patch(@jakarta.annotation.Nonnull final Profile body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property profile in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of Profile
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Profile> patch(@jakarta.annotation.Nonnull final Profile body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, Profile::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Deletes a profile object from a user's account. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Deletes a profile object from a user's account. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json, application/json");
        return requestInfo;
    }
    /**
     * Retrieve the properties and relationships of a profile object for a given user. The profile resource exposes various rich properties that are descriptive of the user as relationships, for example, anniversaries and education activities. To get one of these navigation properties, use the corresponding GET method on that property. See the methods exposed by profile. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of a profile object for a given user. The profile resource exposes various rich properties that are descriptive of the user as relationships, for example, anniversaries and education activities. To get one of these navigation properties, use the corresponding GET method on that property. See the methods exposed by profile. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json;q=1");
        return requestInfo;
    }
    /**
     * Update the navigation property profile in users
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Profile body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property profile in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Profile body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json;q=1");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a ProfileRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ProfileRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ProfileRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve the properties and relationships of a profile object for a given user. The profile resource exposes various rich properties that are descriptive of the user as relationships, for example, anniversaries and education activities. To get one of these navigation properties, use the corresponding GET method on that property. See the methods exposed by profile. This API is available in the following national cloud deployments.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
