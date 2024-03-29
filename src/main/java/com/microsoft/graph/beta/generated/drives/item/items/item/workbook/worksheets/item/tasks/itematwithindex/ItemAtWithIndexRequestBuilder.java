package com.microsoft.graph.beta.drives.item.items.item.workbook.worksheets.item.tasks.itematwithindex;

import com.microsoft.graph.beta.drives.item.items.item.workbook.worksheets.item.tasks.itematwithindex.changes.ChangesRequestBuilder;
import com.microsoft.graph.beta.drives.item.items.item.workbook.worksheets.item.tasks.itematwithindex.comment.CommentRequestBuilder;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.WorkbookDocumentTask;
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
 * Provides operations to call the itemAt method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemAtWithIndexRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the changes property of the microsoft.graph.workbookDocumentTask entity.
     * @return a {@link ChangesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChangesRequestBuilder changes() {
        return new ChangesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the comment property of the microsoft.graph.workbookDocumentTask entity.
     * @return a {@link CommentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CommentRequestBuilder comment() {
        return new CommentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ItemAtWithIndexRequestBuilder} and sets the default values.
     * @param index Usage: index={index}
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ItemAtWithIndexRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final Integer index) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/worksheets/{workbookWorksheet%2Did}/tasks/itemAt(index={index})", pathParameters);
        this.pathParameters.put("index", index);
    }
    /**
     * Instantiates a new {@link ItemAtWithIndexRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ItemAtWithIndexRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/worksheets/{workbookWorksheet%2Did}/tasks/itemAt(index={index})", rawUrl);
    }
    /**
     * Invoke function itemAt
     * @return a {@link WorkbookDocumentTask}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public WorkbookDocumentTask get() {
        return get(null);
    }
    /**
     * Invoke function itemAt
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link WorkbookDocumentTask}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public WorkbookDocumentTask get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, WorkbookDocumentTask::createFromDiscriminatorValue);
    }
    /**
     * Invoke function itemAt
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Invoke function itemAt
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
     * @return a {@link ItemAtWithIndexRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ItemAtWithIndexRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ItemAtWithIndexRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
