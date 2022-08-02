package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WebAccount extends ItemFacet implements Parsable {
    /** Contains the description the user has provided for the account on the service being referenced. */
    private String _description;
    /** The service property */
    private ServiceInformation _service;
    /** Contains a status message from the cloud service if provided or synchronized. */
    private String _statusMessage;
    /** The thumbnailUrl property */
    private String _thumbnailUrl;
    /** The user name  displayed for the webaccount. */
    private String _userId;
    /** Contains a link to the user's profile on the cloud service if one exists. */
    private String _webUrl;
    /**
     * Instantiates a new WebAccount and sets the default values.
     * @return a void
     */
    public WebAccount() {
        super();
        this.setOdataType("#microsoft.graph.webAccount");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WebAccount
     */
    @javax.annotation.Nonnull
    public static WebAccount createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WebAccount();
    }
    /**
     * Gets the description property value. Contains the description the user has provided for the account on the service being referenced.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WebAccount currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("service", (n) -> { currentObject.setService(n.getObjectValue(ServiceInformation::createFromDiscriminatorValue)); });
            this.put("statusMessage", (n) -> { currentObject.setStatusMessage(n.getStringValue()); });
            this.put("thumbnailUrl", (n) -> { currentObject.setThumbnailUrl(n.getStringValue()); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
            this.put("webUrl", (n) -> { currentObject.setWebUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the service property value. The service property
     * @return a serviceInformation
     */
    @javax.annotation.Nullable
    public ServiceInformation getService() {
        return this._service;
    }
    /**
     * Gets the statusMessage property value. Contains a status message from the cloud service if provided or synchronized.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatusMessage() {
        return this._statusMessage;
    }
    /**
     * Gets the thumbnailUrl property value. The thumbnailUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getThumbnailUrl() {
        return this._thumbnailUrl;
    }
    /**
     * Gets the userId property value. The user name  displayed for the webaccount.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Gets the webUrl property value. Contains a link to the user's profile on the cloud service if one exists.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this._webUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("service", this.getService());
        writer.writeStringValue("statusMessage", this.getStatusMessage());
        writer.writeStringValue("thumbnailUrl", this.getThumbnailUrl());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the description property value. Contains the description the user has provided for the account on the service being referenced.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the service property value. The service property
     * @param value Value to set for the service property.
     * @return a void
     */
    public void setService(@javax.annotation.Nullable final ServiceInformation value) {
        this._service = value;
    }
    /**
     * Sets the statusMessage property value. Contains a status message from the cloud service if provided or synchronized.
     * @param value Value to set for the statusMessage property.
     * @return a void
     */
    public void setStatusMessage(@javax.annotation.Nullable final String value) {
        this._statusMessage = value;
    }
    /**
     * Sets the thumbnailUrl property value. The thumbnailUrl property
     * @param value Value to set for the thumbnailUrl property.
     * @return a void
     */
    public void setThumbnailUrl(@javax.annotation.Nullable final String value) {
        this._thumbnailUrl = value;
    }
    /**
     * Sets the userId property value. The user name  displayed for the webaccount.
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
    /**
     * Sets the webUrl property value. Contains a link to the user's profile on the cloud service if one exists.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}
