package com.microsoft.graph.beta.admin.people;

import com.microsoft.graph.beta.admin.people.iteminsights.ItemInsightsRequestBuilder;
import com.microsoft.graph.beta.admin.people.namepronunciation.NamePronunciationRequestBuilder;
import com.microsoft.graph.beta.admin.people.profilecardproperties.ProfileCardPropertiesRequestBuilder;
import com.microsoft.graph.beta.admin.people.profilepropertysettings.ProfilePropertySettingsRequestBuilder;
import com.microsoft.graph.beta.admin.people.profilesources.ProfileSourcesRequestBuilder;
import com.microsoft.graph.beta.admin.people.profilesourceswithsourceid.ProfileSourcesWithSourceIdRequestBuilder;
import com.microsoft.graph.beta.admin.people.pronouns.PronounsRequestBuilder;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.PeopleAdminSettings;
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
 * Provides operations to manage the people property of the microsoft.graph.admin entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PeopleRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the itemInsights property of the microsoft.graph.peopleAdminSettings entity.
     * @return a {@link ItemInsightsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ItemInsightsRequestBuilder itemInsights() {
        return new ItemInsightsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the namePronunciation property of the microsoft.graph.peopleAdminSettings entity.
     * @return a {@link NamePronunciationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NamePronunciationRequestBuilder namePronunciation() {
        return new NamePronunciationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the profileCardProperties property of the microsoft.graph.peopleAdminSettings entity.
     * @return a {@link ProfileCardPropertiesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProfileCardPropertiesRequestBuilder profileCardProperties() {
        return new ProfileCardPropertiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the profilePropertySettings property of the microsoft.graph.peopleAdminSettings entity.
     * @return a {@link ProfilePropertySettingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProfilePropertySettingsRequestBuilder profilePropertySettings() {
        return new ProfilePropertySettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the profileSources property of the microsoft.graph.peopleAdminSettings entity.
     * @return a {@link ProfileSourcesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProfileSourcesRequestBuilder profileSources() {
        return new ProfileSourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the pronouns property of the microsoft.graph.peopleAdminSettings entity.
     * @return a {@link PronounsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PronounsRequestBuilder pronouns() {
        return new PronounsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link PeopleRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PeopleRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/people{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link PeopleRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PeopleRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/people{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property people for admin
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property people for admin
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
     * Retrieve the properties and relationships of a peopleAdminSettings object.
     * @return a {@link PeopleAdminSettings}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/peopleadminsettings-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PeopleAdminSettings get() {
        return get(null);
    }
    /**
     * Retrieve the properties and relationships of a peopleAdminSettings object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PeopleAdminSettings}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/peopleadminsettings-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PeopleAdminSettings get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PeopleAdminSettings::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property people in admin
     * @param body The request body
     * @return a {@link PeopleAdminSettings}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public PeopleAdminSettings patch(@jakarta.annotation.Nonnull final PeopleAdminSettings body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property people in admin
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PeopleAdminSettings}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public PeopleAdminSettings patch(@jakarta.annotation.Nonnull final PeopleAdminSettings body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PeopleAdminSettings::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to manage the profileSources property of the microsoft.graph.peopleAdminSettings entity.
     * @param sourceId Alternate key of profileSource
     * @return a {@link ProfileSourcesWithSourceIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProfileSourcesWithSourceIdRequestBuilder profileSourcesWithSourceId(@jakarta.annotation.Nonnull final String sourceId) {
        Objects.requireNonNull(sourceId);
        return new ProfileSourcesWithSourceIdRequestBuilder(pathParameters, requestAdapter, sourceId);
    }
    /**
     * Delete navigation property people for admin
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property people for admin
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Retrieve the properties and relationships of a peopleAdminSettings object.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of a peopleAdminSettings object.
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
     * Update the navigation property people in admin
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final PeopleAdminSettings body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property people in admin
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final PeopleAdminSettings body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link PeopleRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PeopleRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PeopleRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve the properties and relationships of a peopleAdminSettings object.
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
