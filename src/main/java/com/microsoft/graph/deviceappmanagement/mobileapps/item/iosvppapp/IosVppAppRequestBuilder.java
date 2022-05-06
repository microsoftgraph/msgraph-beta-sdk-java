package microsoft.graph.deviceappmanagement.mobileapps.item.iosvppapp;

import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import microsoft.graph.deviceappmanagement.mobileapps.item.iosvppapp.revokealllicenses.RevokeAllLicensesRequestBuilder;
import microsoft.graph.deviceappmanagement.mobileapps.item.iosvppapp.revokedevicelicense.RevokeDeviceLicenseRequestBuilder;
import microsoft.graph.deviceappmanagement.mobileapps.item.iosvppapp.revokeuserlicense.RevokeUserLicenseRequestBuilder;
/** Builds and executes requests for operations under /deviceAppManagement/mobileApps/{mobileApp-id}/microsoft.graph.iosVppApp  */
public class IosVppAppRequestBuilder {
    /** Path parameters for the request  */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests.  */
    private final RequestAdapter requestAdapter;
    /** The revokeAllLicenses property  */
    @javax.annotation.Nonnull
    public RevokeAllLicensesRequestBuilder revokeAllLicenses() {
        return new RevokeAllLicensesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The revokeDeviceLicense property  */
    @javax.annotation.Nonnull
    public RevokeDeviceLicenseRequestBuilder revokeDeviceLicense() {
        return new RevokeDeviceLicenseRequestBuilder(pathParameters, requestAdapter);
    }
    /** The revokeUserLicense property  */
    @javax.annotation.Nonnull
    public RevokeUserLicenseRequestBuilder revokeUserLicense() {
        return new RevokeUserLicenseRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder  */
    private final String urlTemplate;
    /**
     * Instantiates a new IosVppAppRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public IosVppAppRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceAppManagement/mobileApps/{mobileApp%2Did}/microsoft.graph.iosVppApp";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new IosVppAppRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public IosVppAppRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceAppManagement/mobileApps/{mobileApp%2Did}/microsoft.graph.iosVppApp";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
}
