package microsoft.graph.users.item.profile;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.odataerrors.ODataError;
import microsoft.graph.models.Profile;
import microsoft.graph.users.item.profile.account.AccountRequestBuilder;
import microsoft.graph.users.item.profile.account.item.UserAccountInformationItemRequestBuilder;
import microsoft.graph.users.item.profile.addresses.AddressesRequestBuilder;
import microsoft.graph.users.item.profile.addresses.item.ItemAddressItemRequestBuilder;
import microsoft.graph.users.item.profile.anniversaries.AnniversariesRequestBuilder;
import microsoft.graph.users.item.profile.anniversaries.item.PersonAnnualEventItemRequestBuilder;
import microsoft.graph.users.item.profile.awards.AwardsRequestBuilder;
import microsoft.graph.users.item.profile.awards.item.PersonAwardItemRequestBuilder;
import microsoft.graph.users.item.profile.certifications.CertificationsRequestBuilder;
import microsoft.graph.users.item.profile.certifications.item.PersonCertificationItemRequestBuilder;
import microsoft.graph.users.item.profile.educationalactivities.EducationalActivitiesRequestBuilder;
import microsoft.graph.users.item.profile.educationalactivities.item.EducationalActivityItemRequestBuilder;
import microsoft.graph.users.item.profile.emails.EmailsRequestBuilder;
import microsoft.graph.users.item.profile.emails.item.ItemEmailItemRequestBuilder;
import microsoft.graph.users.item.profile.interests.InterestsRequestBuilder;
import microsoft.graph.users.item.profile.interests.item.PersonInterestItemRequestBuilder;
import microsoft.graph.users.item.profile.languages.item.LanguageProficiencyItemRequestBuilder;
import microsoft.graph.users.item.profile.languages.LanguagesRequestBuilder;
import microsoft.graph.users.item.profile.names.item.PersonNameItemRequestBuilder;
import microsoft.graph.users.item.profile.names.NamesRequestBuilder;
import microsoft.graph.users.item.profile.notes.item.PersonAnnotationItemRequestBuilder;
import microsoft.graph.users.item.profile.notes.NotesRequestBuilder;
import microsoft.graph.users.item.profile.patents.item.ItemPatentItemRequestBuilder;
import microsoft.graph.users.item.profile.patents.PatentsRequestBuilder;
import microsoft.graph.users.item.profile.phones.item.ItemPhoneItemRequestBuilder;
import microsoft.graph.users.item.profile.phones.PhonesRequestBuilder;
import microsoft.graph.users.item.profile.positions.item.WorkPositionItemRequestBuilder;
import microsoft.graph.users.item.profile.positions.PositionsRequestBuilder;
import microsoft.graph.users.item.profile.projects.item.ProjectParticipationItemRequestBuilder;
import microsoft.graph.users.item.profile.projects.ProjectsRequestBuilder;
import microsoft.graph.users.item.profile.publications.item.ItemPublicationItemRequestBuilder;
import microsoft.graph.users.item.profile.publications.PublicationsRequestBuilder;
import microsoft.graph.users.item.profile.skills.item.SkillProficiencyItemRequestBuilder;
import microsoft.graph.users.item.profile.skills.SkillsRequestBuilder;
import microsoft.graph.users.item.profile.webaccounts.item.WebAccountItemRequestBuilder;
import microsoft.graph.users.item.profile.webaccounts.WebAccountsRequestBuilder;
import microsoft.graph.users.item.profile.websites.item.PersonWebsiteItemRequestBuilder;
import microsoft.graph.users.item.profile.websites.WebsitesRequestBuilder;
/** Provides operations to manage the profile property of the microsoft.graph.user entity. */
public class ProfileRequestBuilder {
    /** The account property */
    @javax.annotation.Nonnull
    public AccountRequestBuilder account() {
        return new AccountRequestBuilder(pathParameters, requestAdapter);
    }
    /** The addresses property */
    @javax.annotation.Nonnull
    public AddressesRequestBuilder addresses() {
        return new AddressesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The anniversaries property */
    @javax.annotation.Nonnull
    public AnniversariesRequestBuilder anniversaries() {
        return new AnniversariesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The awards property */
    @javax.annotation.Nonnull
    public AwardsRequestBuilder awards() {
        return new AwardsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The certifications property */
    @javax.annotation.Nonnull
    public CertificationsRequestBuilder certifications() {
        return new CertificationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The educationalActivities property */
    @javax.annotation.Nonnull
    public EducationalActivitiesRequestBuilder educationalActivities() {
        return new EducationalActivitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The emails property */
    @javax.annotation.Nonnull
    public EmailsRequestBuilder emails() {
        return new EmailsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The interests property */
    @javax.annotation.Nonnull
    public InterestsRequestBuilder interests() {
        return new InterestsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The languages property */
    @javax.annotation.Nonnull
    public LanguagesRequestBuilder languages() {
        return new LanguagesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The names property */
    @javax.annotation.Nonnull
    public NamesRequestBuilder names() {
        return new NamesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The notes property */
    @javax.annotation.Nonnull
    public NotesRequestBuilder notes() {
        return new NotesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The patents property */
    @javax.annotation.Nonnull
    public PatentsRequestBuilder patents() {
        return new PatentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The phones property */
    @javax.annotation.Nonnull
    public PhonesRequestBuilder phones() {
        return new PhonesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The positions property */
    @javax.annotation.Nonnull
    public PositionsRequestBuilder positions() {
        return new PositionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The projects property */
    @javax.annotation.Nonnull
    public ProjectsRequestBuilder projects() {
        return new ProjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The publications property */
    @javax.annotation.Nonnull
    public PublicationsRequestBuilder publications() {
        return new PublicationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** The skills property */
    @javax.annotation.Nonnull
    public SkillsRequestBuilder skills() {
        return new SkillsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /** The webAccounts property */
    @javax.annotation.Nonnull
    public WebAccountsRequestBuilder webAccounts() {
        return new WebAccountsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The websites property */
    @javax.annotation.Nonnull
    public WebsitesRequestBuilder websites() {
        return new WebsitesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.profile.account.item collection
     * @param id Unique identifier of the item
     * @return a userAccountInformationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UserAccountInformationItemRequestBuilder account(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("userAccountInformation%2Did", id);
        return new UserAccountInformationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.profile.addresses.item collection
     * @param id Unique identifier of the item
     * @return a itemAddressItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ItemAddressItemRequestBuilder addresses(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("itemAddress%2Did", id);
        return new ItemAddressItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.profile.anniversaries.item collection
     * @param id Unique identifier of the item
     * @return a personAnnualEventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PersonAnnualEventItemRequestBuilder anniversaries(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("personAnnualEvent%2Did", id);
        return new PersonAnnualEventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.profile.awards.item collection
     * @param id Unique identifier of the item
     * @return a personAwardItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PersonAwardItemRequestBuilder awards(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("personAward%2Did", id);
        return new PersonAwardItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.profile.certifications.item collection
     * @param id Unique identifier of the item
     * @return a personCertificationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PersonCertificationItemRequestBuilder certifications(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("personCertification%2Did", id);
        return new PersonCertificationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ProfileRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public ProfileRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/users/{user%2Did}/profile{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new ProfileRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public ProfileRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/users/{user%2Did}/profile{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property profile for users
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property profile for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<ProfileRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final ProfileRequestBuilderDeleteRequestConfiguration requestConfig = new ProfileRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Represents properties that are descriptive of a user in a tenant.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Represents properties that are descriptive of a user in a tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<ProfileRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final ProfileRequestBuilderGetRequestConfiguration requestConfig = new ProfileRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property profile in users
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Profile body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property profile in users
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Profile body, @javax.annotation.Nullable final java.util.function.Consumer<ProfileRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final ProfileRequestBuilderPatchRequestConfiguration requestConfig = new ProfileRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property profile for users
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property profile for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<ProfileRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property profile for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<ProfileRequestBuilderDeleteRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.profile.educationalActivities.item collection
     * @param id Unique identifier of the item
     * @return a educationalActivityItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EducationalActivityItemRequestBuilder educationalActivities(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("educationalActivity%2Did", id);
        return new EducationalActivityItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.profile.emails.item collection
     * @param id Unique identifier of the item
     * @return a itemEmailItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ItemEmailItemRequestBuilder emails(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("itemEmail%2Did", id);
        return new ItemEmailItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Represents properties that are descriptive of a user in a tenant.
     * @return a CompletableFuture of profile
     */
    public java.util.concurrent.CompletableFuture<Profile> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Profile::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Represents properties that are descriptive of a user in a tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of profile
     */
    public java.util.concurrent.CompletableFuture<Profile> get(@javax.annotation.Nullable final java.util.function.Consumer<ProfileRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Profile::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Represents properties that are descriptive of a user in a tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of profile
     */
    public java.util.concurrent.CompletableFuture<Profile> get(@javax.annotation.Nullable final java.util.function.Consumer<ProfileRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Profile::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.profile.interests.item collection
     * @param id Unique identifier of the item
     * @return a personInterestItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PersonInterestItemRequestBuilder interests(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("personInterest%2Did", id);
        return new PersonInterestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.profile.languages.item collection
     * @param id Unique identifier of the item
     * @return a languageProficiencyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public LanguageProficiencyItemRequestBuilder languages(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("languageProficiency%2Did", id);
        return new LanguageProficiencyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.profile.names.item collection
     * @param id Unique identifier of the item
     * @return a personNameItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PersonNameItemRequestBuilder names(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("personName%2Did", id);
        return new PersonNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.profile.notes.item collection
     * @param id Unique identifier of the item
     * @return a personAnnotationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PersonAnnotationItemRequestBuilder notes(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("personAnnotation%2Did", id);
        return new PersonAnnotationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property profile in users
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final Profile body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property profile in users
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final Profile body, @javax.annotation.Nullable final java.util.function.Consumer<ProfileRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property profile in users
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final Profile body, @javax.annotation.Nullable final java.util.function.Consumer<ProfileRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.profile.patents.item collection
     * @param id Unique identifier of the item
     * @return a itemPatentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ItemPatentItemRequestBuilder patents(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("itemPatent%2Did", id);
        return new ItemPatentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.profile.phones.item collection
     * @param id Unique identifier of the item
     * @return a itemPhoneItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ItemPhoneItemRequestBuilder phones(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("itemPhone%2Did", id);
        return new ItemPhoneItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.profile.positions.item collection
     * @param id Unique identifier of the item
     * @return a workPositionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WorkPositionItemRequestBuilder positions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("workPosition%2Did", id);
        return new WorkPositionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.profile.projects.item collection
     * @param id Unique identifier of the item
     * @return a projectParticipationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ProjectParticipationItemRequestBuilder projects(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("projectParticipation%2Did", id);
        return new ProjectParticipationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.profile.publications.item collection
     * @param id Unique identifier of the item
     * @return a itemPublicationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ItemPublicationItemRequestBuilder publications(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("itemPublication%2Did", id);
        return new ItemPublicationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.profile.skills.item collection
     * @param id Unique identifier of the item
     * @return a skillProficiencyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SkillProficiencyItemRequestBuilder skills(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("skillProficiency%2Did", id);
        return new SkillProficiencyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.profile.webAccounts.item collection
     * @param id Unique identifier of the item
     * @return a webAccountItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WebAccountItemRequestBuilder webAccounts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("webAccount%2Did", id);
        return new WebAccountItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.profile.websites.item collection
     * @param id Unique identifier of the item
     * @return a personWebsiteItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PersonWebsiteItemRequestBuilder websites(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("personWebsite%2Did", id);
        return new PersonWebsiteItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ProfileRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new profileRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        public ProfileRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Represents properties that are descriptive of a user in a tenant. */
    public class ProfileRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ProfileRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public ProfileRequestBuilderGetQueryParameters queryParameters = new ProfileRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new profileRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public ProfileRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ProfileRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new profileRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public ProfileRequestBuilderPatchRequestConfiguration() {
        }
    }
}
