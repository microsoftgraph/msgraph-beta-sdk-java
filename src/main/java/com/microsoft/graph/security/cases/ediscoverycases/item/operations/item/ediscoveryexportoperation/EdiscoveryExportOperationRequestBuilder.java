package microsoft.graph.security.cases.ediscoverycases.item.operations.item.ediscoveryexportoperation;

import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import microsoft.graph.security.cases.ediscoverycases.item.operations.item.ediscoveryexportoperation.getdownloadurl.GetDownloadUrlRequestBuilder;
/** Builds and executes requests for operations under /security/cases/ediscoveryCases/{ediscoveryCase-id}/operations/{caseOperation-id}/microsoft.graph.security.ediscoveryExportOperation  */
public class EdiscoveryExportOperationRequestBuilder {
    /** Path parameters for the request  */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests.  */
    private final RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder  */
    private final String urlTemplate;
    /**
     * Instantiates a new EdiscoveryExportOperationRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public EdiscoveryExportOperationRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/operations/{caseOperation%2Did}/microsoft.graph.security.ediscoveryExportOperation";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new EdiscoveryExportOperationRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public EdiscoveryExportOperationRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/operations/{caseOperation%2Did}/microsoft.graph.security.ediscoveryExportOperation";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Provides operations to call the getDownloadUrl method.
     * @return a getDownloadUrlRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetDownloadUrlRequestBuilder getDownloadUrl() {
        return new GetDownloadUrlRequestBuilder(pathParameters, requestAdapter);
    }
}
