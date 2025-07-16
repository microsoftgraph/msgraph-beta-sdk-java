package com.microsoft.graph.beta.sites.item.contentmodels.getbynamewithmodelname;

import com.microsoft.graph.beta.models.ContentModel;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.sites.item.contentmodels.getbynamewithmodelname.addtodrive.AddToDriveRequestBuilder;
import com.microsoft.graph.beta.sites.item.contentmodels.getbynamewithmodelname.getapplieddrives.GetAppliedDrivesRequestBuilder;
import com.microsoft.graph.beta.sites.item.contentmodels.getbynamewithmodelname.removefromdrive.RemoveFromDriveRequestBuilder;
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
 * Provides operations to call the getByName method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetByNameWithModelNameRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the addToDrive method.
     * @return a {@link AddToDriveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddToDriveRequestBuilder addToDrive() {
        return new AddToDriveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getAppliedDrives method.
     * @return a {@link GetAppliedDrivesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetAppliedDrivesRequestBuilder getAppliedDrives() {
        return new GetAppliedDrivesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the removeFromDrive method.
     * @return a {@link RemoveFromDriveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RemoveFromDriveRequestBuilder removeFromDrive() {
        return new RemoveFromDriveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link GetByNameWithModelNameRequestBuilder} and sets the default values.
     * @param modelName Usage: modelName=&apos;{modelName}&apos;
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetByNameWithModelNameRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String modelName) {
        super(requestAdapter, "{+baseurl}/sites/{site%2Did}/contentModels/getByName(modelName='{modelName}')", pathParameters);
        this.pathParameters.put("modelName", modelName);
    }
    /**
     * Instantiates a new {@link GetByNameWithModelNameRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetByNameWithModelNameRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sites/{site%2Did}/contentModels/getByName(modelName='{modelName}')", rawUrl);
    }
    /**
     * Read the properties and relationships of a contentModel object by its model name. The name should be the full model filename, including the file extension; for example, exampleModel.classifier.
     * @return a {@link ContentModel}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/contentmodel-getbyname?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ContentModel get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of a contentModel object by its model name. The name should be the full model filename, including the file extension; for example, exampleModel.classifier.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ContentModel}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/contentmodel-getbyname?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ContentModel get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ContentModel::createFromDiscriminatorValue);
    }
    /**
     * Read the properties and relationships of a contentModel object by its model name. The name should be the full model filename, including the file extension; for example, exampleModel.classifier.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of a contentModel object by its model name. The name should be the full model filename, including the file extension; for example, exampleModel.classifier.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link GetByNameWithModelNameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetByNameWithModelNameRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetByNameWithModelNameRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
