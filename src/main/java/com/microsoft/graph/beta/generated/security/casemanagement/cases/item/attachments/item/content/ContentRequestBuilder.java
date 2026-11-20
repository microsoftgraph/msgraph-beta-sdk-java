package com.microsoft.graph.beta.security.casemanagement.cases.item.attachments.item.content;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.security.casemanagement.Attachment;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the media for the security entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ContentRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ContentRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ContentRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/caseManagement/cases/{case%2Did}/attachments/{attachment%2Did}/content", pathParameters);
    }
    /**
     * Instantiates a new {@link ContentRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ContentRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/caseManagement/cases/{case%2Did}/attachments/{attachment%2Did}/content", rawUrl);
    }
    /**
     * The binary content stream for the attachment. Use the Upload content and Download content methods to access it.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * The binary content stream for the attachment. Use the Upload content and Download content methods to access it.
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
     * Download the binary content of an attachment. After an upload completes, the service asynchronously scans the attachment for malware. Poll the attachment metadata by using Get attachment. If scanResult is unscanned, wait and try again later. Download the content only when scanResult is noThreatsFound. Don&apos;t download content when scanResult is malicious.
     * @return a {@link InputStream}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/security-casemanagement-attachment-download-content?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public InputStream get() {
        return get(null);
    }
    /**
     * Download the binary content of an attachment. After an upload completes, the service asynchronously scans the attachment for malware. Poll the attachment metadata by using Get attachment. If scanResult is unscanned, wait and try again later. Download the content only when scanResult is noThreatsFound. Don&apos;t download content when scanResult is malicious.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InputStream}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/security-casemanagement-attachment-download-content?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public InputStream get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitive(requestInfo, errorMapping, InputStream.class);
    }
    /**
     * Upload binary content for an attachment. Create the attachment metadata first by using Create case attachment. The maximum file size is 100 MB. Upload files in chunks of no more than 1 MB. For files larger than 1 MB, send one PUT request for each chunk until all byte ranges are uploaded.
     * @param body Binary request body
     * @return a {@link Attachment}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/security-casemanagement-attachment-upload-content?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Attachment put(@jakarta.annotation.Nonnull final InputStream body) {
        return put(body, null);
    }
    /**
     * Upload binary content for an attachment. Create the attachment metadata first by using Create case attachment. The maximum file size is 100 MB. Upload files in chunks of no more than 1 MB. For files larger than 1 MB, send one PUT request for each chunk until all byte ranges are uploaded.
     * @param body Binary request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Attachment}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/security-casemanagement-attachment-upload-content?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Attachment put(@jakarta.annotation.Nonnull final InputStream body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Attachment::createFromDiscriminatorValue);
    }
    /**
     * The binary content stream for the attachment. Use the Upload content and Download content methods to access it.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * The binary content stream for the attachment. Use the Upload content and Download content methods to access it.
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
     * Download the binary content of an attachment. After an upload completes, the service asynchronously scans the attachment for malware. Poll the attachment metadata by using Get attachment. If scanResult is unscanned, wait and try again later. Download the content only when scanResult is noThreatsFound. Don&apos;t download content when scanResult is malicious.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Download the binary content of an attachment. After an upload completes, the service asynchronously scans the attachment for malware. Poll the attachment metadata by using Get attachment. If scanResult is unscanned, wait and try again later. Download the content only when scanResult is noThreatsFound. Don&apos;t download content when scanResult is malicious.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/octet-stream, application/json");
        return requestInfo;
    }
    /**
     * Upload binary content for an attachment. Create the attachment metadata first by using Create case attachment. The maximum file size is 100 MB. Upload files in chunks of no more than 1 MB. For files larger than 1 MB, send one PUT request for each chunk until all byte ranges are uploaded.
     * @param body Binary request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final InputStream body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Upload binary content for an attachment. Create the attachment metadata first by using Create case attachment. The maximum file size is 100 MB. Upload files in chunks of no more than 1 MB. For files larger than 1 MB, send one PUT request for each chunk until all byte ranges are uploaded.
     * @param body Binary request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final InputStream body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setStreamContent(body, "application/octet-stream");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ContentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ContentRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ContentRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
