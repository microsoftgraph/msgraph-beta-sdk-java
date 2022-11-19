package com.microsoft.graph.me.profile;

import com.microsoft.graph.me.profile.account.AccountRequestBuilder;
import com.microsoft.graph.me.profile.account.item.UserAccountInformationItemRequestBuilder;
import com.microsoft.graph.me.profile.addresses.AddressesRequestBuilder;
import com.microsoft.graph.me.profile.addresses.item.ItemAddressItemRequestBuilder;
import com.microsoft.graph.me.profile.anniversaries.AnniversariesRequestBuilder;
import com.microsoft.graph.me.profile.anniversaries.item.PersonAnnualEventItemRequestBuilder;
import com.microsoft.graph.me.profile.awards.AwardsRequestBuilder;
import com.microsoft.graph.me.profile.awards.item.PersonAwardItemRequestBuilder;
import com.microsoft.graph.me.profile.certifications.CertificationsRequestBuilder;
import com.microsoft.graph.me.profile.certifications.item.PersonCertificationItemRequestBuilder;
import com.microsoft.graph.me.profile.educationalactivities.EducationalActivitiesRequestBuilder;
import com.microsoft.graph.me.profile.educationalactivities.item.EducationalActivityItemRequestBuilder;
import com.microsoft.graph.me.profile.emails.EmailsRequestBuilder;
import com.microsoft.graph.me.profile.emails.item.ItemEmailItemRequestBuilder;
import com.microsoft.graph.me.profile.interests.InterestsRequestBuilder;
import com.microsoft.graph.me.profile.interests.item.PersonInterestItemRequestBuilder;
import com.microsoft.graph.me.profile.languages.item.LanguageProficiencyItemRequestBuilder;
import com.microsoft.graph.me.profile.languages.LanguagesRequestBuilder;
import com.microsoft.graph.me.profile.names.item.PersonNameItemRequestBuilder;
import com.microsoft.graph.me.profile.names.NamesRequestBuilder;
import com.microsoft.graph.me.profile.notes.item.PersonAnnotationItemRequestBuilder;
import com.microsoft.graph.me.profile.notes.NotesRequestBuilder;
import com.microsoft.graph.me.profile.patents.item.ItemPatentItemRequestBuilder;
import com.microsoft.graph.me.profile.patents.PatentsRequestBuilder;
import com.microsoft.graph.me.profile.phones.item.ItemPhoneItemRequestBuilder;
import com.microsoft.graph.me.profile.phones.PhonesRequestBuilder;
import com.microsoft.graph.me.profile.positions.item.WorkPositionItemRequestBuilder;
import com.microsoft.graph.me.profile.positions.PositionsRequestBuilder;
import com.microsoft.graph.me.profile.projects.item.ProjectParticipationItemRequestBuilder;
import com.microsoft.graph.me.profile.projects.ProjectsRequestBuilder;
import com.microsoft.graph.me.profile.publications.item.ItemPublicationItemRequestBuilder;
import com.microsoft.graph.me.profile.publications.PublicationsRequestBuilder;
import com.microsoft.graph.me.profile.skills.item.SkillProficiencyItemRequestBuilder;
import com.microsoft.graph.me.profile.skills.SkillsRequestBuilder;
import com.microsoft.graph.me.profile.webaccounts.item.WebAccountItemRequestBuilder;
import com.microsoft.graph.me.profile.webaccounts.WebAccountsRequestBuilder;
import com.microsoft.graph.me.profile.websites.item.PersonWebsiteItemRequestBuilder;
import com.microsoft.graph.me.profile.websites.WebsitesRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Profile;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the profile property of the microsoft.graph.user entity. */
public class ProfileRequestBuilder {
    /** Provides operations to manage the account property of the microsoft.graph.profile entity. */
    @javax.annotation.Nonnull
    public AccountRequestBuilder account() {
        return new AccountRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the addresses property of the microsoft.graph.profile entity. */
    @javax.annotation.Nonnull
    public AddressesRequestBuilder addresses() {
        return new AddressesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the anniversaries property of the microsoft.graph.profile entity. */
    @javax.annotation.Nonnull
    public AnniversariesRequestBuilder anniversaries() {
        return new AnniversariesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the awards property of the microsoft.graph.profile entity. */
    @javax.annotation.Nonnull
    public AwardsRequestBuilder awards() {
        return new AwardsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the certifications property of the microsoft.graph.profile entity. */
    @javax.annotation.Nonnull
    public CertificationsRequestBuilder certifications() {
        return new CertificationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the educationalActivities property of the microsoft.graph.profile entity. */
    @javax.annotation.Nonnull
    public EducationalActivitiesRequestBuilder educationalActivities() {
        return new EducationalActivitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the emails property of the microsoft.graph.profile entity. */
    @javax.annotation.Nonnull
    public EmailsRequestBuilder emails() {
        return new EmailsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the interests property of the microsoft.graph.profile entity. */
    @javax.annotation.Nonnull
    public InterestsRequestBuilder interests() {
        return new InterestsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the languages property of the microsoft.graph.profile entity. */
    @javax.annotation.Nonnull
    public LanguagesRequestBuilder languages() {
        return new LanguagesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the names property of the microsoft.graph.profile entity. */
    @javax.annotation.Nonnull
    public NamesRequestBuilder names() {
        return new NamesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the notes property of the microsoft.graph.profile entity. */
    @javax.annotation.Nonnull
    public NotesRequestBuilder notes() {
        return new NotesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the patents property of the microsoft.graph.profile entity. */
    @javax.annotation.Nonnull
    public PatentsRequestBuilder patents() {
        return new PatentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** Provides operations to manage the phones property of the microsoft.graph.profile entity. */
    @javax.annotation.Nonnull
    public PhonesRequestBuilder phones() {
        return new PhonesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the positions property of the microsoft.graph.profile entity. */
    @javax.annotation.Nonnull
    public PositionsRequestBuilder positions() {
        return new PositionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the projects property of the microsoft.graph.profile entity. */
    @javax.annotation.Nonnull
    public ProjectsRequestBuilder projects() {
        return new ProjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the publications property of the microsoft.graph.profile entity. */
    @javax.annotation.Nonnull
    public PublicationsRequestBuilder publications() {
        return new PublicationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to manage the skills property of the microsoft.graph.profile entity. */
    @javax.annotation.Nonnull
    public SkillsRequestBuilder skills() {
        return new SkillsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /** Provides operations to manage the webAccounts property of the microsoft.graph.profile entity. */
    @javax.annotation.Nonnull
    public WebAccountsRequestBuilder webAccounts() {
        return new WebAccountsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the websites property of the microsoft.graph.profile entity. */
    @javax.annotation.Nonnull
    public WebsitesRequestBuilder websites() {
        return new WebsitesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the account property of the microsoft.graph.profile entity.
     * @param id Unique identifier of the item
     * @return a UserAccountInformationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UserAccountInformationItemRequestBuilder account(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("userAccountInformation%2Did", id);
        return new UserAccountInformationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the addresses property of the microsoft.graph.profile entity.
     * @param id Unique identifier of the item
     * @return a ItemAddressItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ItemAddressItemRequestBuilder addresses(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("itemAddress%2Did", id);
        return new ItemAddressItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the anniversaries property of the microsoft.graph.profile entity.
     * @param id Unique identifier of the item
     * @return a PersonAnnualEventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PersonAnnualEventItemRequestBuilder anniversaries(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("personAnnualEvent%2Did", id);
        return new PersonAnnualEventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the awards property of the microsoft.graph.profile entity.
     * @param id Unique identifier of the item
     * @return a PersonAwardItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PersonAwardItemRequestBuilder awards(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("personAward%2Did", id);
        return new PersonAwardItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the certifications property of the microsoft.graph.profile entity.
     * @param id Unique identifier of the item
     * @return a PersonCertificationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PersonCertificationItemRequestBuilder certifications(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("personCertification%2Did", id);
        return new PersonCertificationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ProfileRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ProfileRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/me/profile{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new ProfileRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ProfileRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/me/profile{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Deletes a profile object from a user's account.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Deletes a profile object from a user's account.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Retrieve the properties and relationships of a profile object for a given user. The **profile** resource exposes various rich properties that are descriptive of the user as relationships, for example, anniversaries and education activities. To get one of these navigation properties, use the corresponding GET method on that property. See the methods exposed by **profile**.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of a profile object for a given user. The **profile** resource exposes various rich properties that are descriptive of the user as relationships, for example, anniversaries and education activities. To get one of these navigation properties, use the corresponding GET method on that property. See the methods exposed by **profile**.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property profile in me
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Profile body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property profile in me
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Profile body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Deletes a profile object from a user's account.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Deletes a profile object from a user's account.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the educationalActivities property of the microsoft.graph.profile entity.
     * @param id Unique identifier of the item
     * @return a EducationalActivityItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EducationalActivityItemRequestBuilder educationalActivities(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("educationalActivity%2Did", id);
        return new EducationalActivityItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the emails property of the microsoft.graph.profile entity.
     * @param id Unique identifier of the item
     * @return a ItemEmailItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ItemEmailItemRequestBuilder emails(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("itemEmail%2Did", id);
        return new ItemEmailItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Retrieve the properties and relationships of a profile object for a given user. The **profile** resource exposes various rich properties that are descriptive of the user as relationships, for example, anniversaries and education activities. To get one of these navigation properties, use the corresponding GET method on that property. See the methods exposed by **profile**.
     * @return a CompletableFuture of profile
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Profile> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Profile::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<Profile> executionException = new java.util.concurrent.CompletableFuture<Profile>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Retrieve the properties and relationships of a profile object for a given user. The **profile** resource exposes various rich properties that are descriptive of the user as relationships, for example, anniversaries and education activities. To get one of these navigation properties, use the corresponding GET method on that property. See the methods exposed by **profile**.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of profile
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Profile> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Profile::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<Profile> executionException = new java.util.concurrent.CompletableFuture<Profile>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the interests property of the microsoft.graph.profile entity.
     * @param id Unique identifier of the item
     * @return a PersonInterestItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PersonInterestItemRequestBuilder interests(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("personInterest%2Did", id);
        return new PersonInterestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the languages property of the microsoft.graph.profile entity.
     * @param id Unique identifier of the item
     * @return a LanguageProficiencyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public LanguageProficiencyItemRequestBuilder languages(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("languageProficiency%2Did", id);
        return new LanguageProficiencyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the names property of the microsoft.graph.profile entity.
     * @param id Unique identifier of the item
     * @return a PersonNameItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PersonNameItemRequestBuilder names(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("personName%2Did", id);
        return new PersonNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the notes property of the microsoft.graph.profile entity.
     * @param id Unique identifier of the item
     * @return a PersonAnnotationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PersonAnnotationItemRequestBuilder notes(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("personAnnotation%2Did", id);
        return new PersonAnnotationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property profile in me
     * @param body 
     * @return a CompletableFuture of profile
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Profile> patch(@javax.annotation.Nonnull final Profile body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Profile::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<Profile> executionException = new java.util.concurrent.CompletableFuture<Profile>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property profile in me
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of profile
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Profile> patch(@javax.annotation.Nonnull final Profile body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Profile::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<Profile> executionException = new java.util.concurrent.CompletableFuture<Profile>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the patents property of the microsoft.graph.profile entity.
     * @param id Unique identifier of the item
     * @return a ItemPatentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ItemPatentItemRequestBuilder patents(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("itemPatent%2Did", id);
        return new ItemPatentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the phones property of the microsoft.graph.profile entity.
     * @param id Unique identifier of the item
     * @return a ItemPhoneItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ItemPhoneItemRequestBuilder phones(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("itemPhone%2Did", id);
        return new ItemPhoneItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the positions property of the microsoft.graph.profile entity.
     * @param id Unique identifier of the item
     * @return a WorkPositionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WorkPositionItemRequestBuilder positions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("workPosition%2Did", id);
        return new WorkPositionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the projects property of the microsoft.graph.profile entity.
     * @param id Unique identifier of the item
     * @return a ProjectParticipationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ProjectParticipationItemRequestBuilder projects(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("projectParticipation%2Did", id);
        return new ProjectParticipationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the publications property of the microsoft.graph.profile entity.
     * @param id Unique identifier of the item
     * @return a ItemPublicationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ItemPublicationItemRequestBuilder publications(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("itemPublication%2Did", id);
        return new ItemPublicationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the skills property of the microsoft.graph.profile entity.
     * @param id Unique identifier of the item
     * @return a SkillProficiencyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SkillProficiencyItemRequestBuilder skills(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("skillProficiency%2Did", id);
        return new SkillProficiencyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the webAccounts property of the microsoft.graph.profile entity.
     * @param id Unique identifier of the item
     * @return a WebAccountItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WebAccountItemRequestBuilder webAccounts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("webAccount%2Did", id);
        return new WebAccountItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the websites property of the microsoft.graph.profile entity.
     * @param id Unique identifier of the item
     * @return a PersonWebsiteItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PersonWebsiteItemRequestBuilder websites(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("personWebsite%2Did", id);
        return new PersonWebsiteItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new DeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DeleteRequestConfiguration() {
        }
    }
    /** Retrieve the properties and relationships of a profile object for a given user. The **profile** resource exposes various rich properties that are descriptive of the user as relationships, for example, anniversaries and education activities. To get one of these navigation properties, use the corresponding GET method on that property. See the methods exposed by **profile**. */
    public class GetQueryParameters {
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
    public class GetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
        /**
         * Instantiates a new GetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public GetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class PatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new PatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public PatchRequestConfiguration() {
        }
    }
}
