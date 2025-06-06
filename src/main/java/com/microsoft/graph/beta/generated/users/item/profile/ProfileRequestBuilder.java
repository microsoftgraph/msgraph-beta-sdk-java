package com.microsoft.graph.beta.users.item.profile;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.Profile;
import com.microsoft.graph.beta.users.item.profile.account.AccountRequestBuilder;
import com.microsoft.graph.beta.users.item.profile.addresses.AddressesRequestBuilder;
import com.microsoft.graph.beta.users.item.profile.anniversaries.AnniversariesRequestBuilder;
import com.microsoft.graph.beta.users.item.profile.awards.AwardsRequestBuilder;
import com.microsoft.graph.beta.users.item.profile.certifications.CertificationsRequestBuilder;
import com.microsoft.graph.beta.users.item.profile.educationalactivities.EducationalActivitiesRequestBuilder;
import com.microsoft.graph.beta.users.item.profile.emails.EmailsRequestBuilder;
import com.microsoft.graph.beta.users.item.profile.interests.InterestsRequestBuilder;
import com.microsoft.graph.beta.users.item.profile.languages.LanguagesRequestBuilder;
import com.microsoft.graph.beta.users.item.profile.names.NamesRequestBuilder;
import com.microsoft.graph.beta.users.item.profile.notes.NotesRequestBuilder;
import com.microsoft.graph.beta.users.item.profile.patents.PatentsRequestBuilder;
import com.microsoft.graph.beta.users.item.profile.phones.PhonesRequestBuilder;
import com.microsoft.graph.beta.users.item.profile.positions.PositionsRequestBuilder;
import com.microsoft.graph.beta.users.item.profile.projects.ProjectsRequestBuilder;
import com.microsoft.graph.beta.users.item.profile.publications.PublicationsRequestBuilder;
import com.microsoft.graph.beta.users.item.profile.skills.SkillsRequestBuilder;
import com.microsoft.graph.beta.users.item.profile.webaccounts.WebAccountsRequestBuilder;
import com.microsoft.graph.beta.users.item.profile.websites.WebsitesRequestBuilder;
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
/**
 * Provides operations to manage the profile property of the microsoft.graph.user entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProfileRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the account property of the microsoft.graph.profile entity.
     * @return a {@link AccountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AccountRequestBuilder account() {
        return new AccountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the addresses property of the microsoft.graph.profile entity.
     * @return a {@link AddressesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddressesRequestBuilder addresses() {
        return new AddressesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the anniversaries property of the microsoft.graph.profile entity.
     * @return a {@link AnniversariesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AnniversariesRequestBuilder anniversaries() {
        return new AnniversariesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the awards property of the microsoft.graph.profile entity.
     * @return a {@link AwardsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AwardsRequestBuilder awards() {
        return new AwardsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the certifications property of the microsoft.graph.profile entity.
     * @return a {@link CertificationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CertificationsRequestBuilder certifications() {
        return new CertificationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the educationalActivities property of the microsoft.graph.profile entity.
     * @return a {@link EducationalActivitiesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EducationalActivitiesRequestBuilder educationalActivities() {
        return new EducationalActivitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the emails property of the microsoft.graph.profile entity.
     * @return a {@link EmailsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EmailsRequestBuilder emails() {
        return new EmailsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the interests property of the microsoft.graph.profile entity.
     * @return a {@link InterestsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InterestsRequestBuilder interests() {
        return new InterestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the languages property of the microsoft.graph.profile entity.
     * @return a {@link LanguagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LanguagesRequestBuilder languages() {
        return new LanguagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the names property of the microsoft.graph.profile entity.
     * @return a {@link NamesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NamesRequestBuilder names() {
        return new NamesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the notes property of the microsoft.graph.profile entity.
     * @return a {@link NotesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NotesRequestBuilder notes() {
        return new NotesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the patents property of the microsoft.graph.profile entity.
     * @return a {@link PatentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PatentsRequestBuilder patents() {
        return new PatentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the phones property of the microsoft.graph.profile entity.
     * @return a {@link PhonesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PhonesRequestBuilder phones() {
        return new PhonesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the positions property of the microsoft.graph.profile entity.
     * @return a {@link PositionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PositionsRequestBuilder positions() {
        return new PositionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the projects property of the microsoft.graph.profile entity.
     * @return a {@link ProjectsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProjectsRequestBuilder projects() {
        return new ProjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the publications property of the microsoft.graph.profile entity.
     * @return a {@link PublicationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PublicationsRequestBuilder publications() {
        return new PublicationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the skills property of the microsoft.graph.profile entity.
     * @return a {@link SkillsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SkillsRequestBuilder skills() {
        return new SkillsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the webAccounts property of the microsoft.graph.profile entity.
     * @return a {@link WebAccountsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WebAccountsRequestBuilder webAccounts() {
        return new WebAccountsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the websites property of the microsoft.graph.profile entity.
     * @return a {@link WebsitesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WebsitesRequestBuilder websites() {
        return new WebsitesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ProfileRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProfileRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/profile{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link ProfileRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProfileRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/profile{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property profile for users
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property profile for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Represents properties that are descriptive of a user in a tenant.
     * @return a {@link Profile}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Profile get() {
        return get(null);
    }
    /**
     * Represents properties that are descriptive of a user in a tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Profile}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Profile get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Profile::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property profile in users
     * @param body The request body
     * @return a {@link Profile}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Profile patch(@jakarta.annotation.Nonnull final Profile body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property profile in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Profile}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Profile patch(@jakarta.annotation.Nonnull final Profile body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Profile::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property profile for users
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property profile for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * Represents properties that are descriptive of a user in a tenant.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Represents properties that are descriptive of a user in a tenant.
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
     * Update the navigation property profile in users
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Profile body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property profile in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Profile body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ProfileRequestBuilder}
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
     * Represents properties that are descriptive of a user in a tenant.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
