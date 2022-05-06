package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Settings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Specifies if the user's primary mailbox is hosted in the cloud and is enabled for Microsoft Graph.  */
    private Boolean _hasGraphMailbox;
    /** Specifies if the user has a MyAnalytics license assigned.  */
    private Boolean _hasLicense;
    /** Specifies if the user opted out of MyAnalytics.  */
    private Boolean _hasOptedOut;
    /**
     * Instantiates a new settings and sets the default values.
     * @return a void
     */
    public Settings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a settings
     */
    @javax.annotation.Nonnull
    public static Settings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Settings();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Settings currentObject = this;
        return new HashMap<>(3) {{
            this.put("hasGraphMailbox", (n) -> { currentObject.setHasGraphMailbox(n.getBooleanValue()); });
            this.put("hasLicense", (n) -> { currentObject.setHasLicense(n.getBooleanValue()); });
            this.put("hasOptedOut", (n) -> { currentObject.setHasOptedOut(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the hasGraphMailbox property value. Specifies if the user's primary mailbox is hosted in the cloud and is enabled for Microsoft Graph.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasGraphMailbox() {
        return this._hasGraphMailbox;
    }
    /**
     * Gets the hasLicense property value. Specifies if the user has a MyAnalytics license assigned.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasLicense() {
        return this._hasLicense;
    }
    /**
     * Gets the hasOptedOut property value. Specifies if the user opted out of MyAnalytics.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasOptedOut() {
        return this._hasOptedOut;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("hasGraphMailbox", this.getHasGraphMailbox());
        writer.writeBooleanValue("hasLicense", this.getHasLicense());
        writer.writeBooleanValue("hasOptedOut", this.getHasOptedOut());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the hasGraphMailbox property value. Specifies if the user's primary mailbox is hosted in the cloud and is enabled for Microsoft Graph.
     * @param value Value to set for the hasGraphMailbox property.
     * @return a void
     */
    public void setHasGraphMailbox(@javax.annotation.Nullable final Boolean value) {
        this._hasGraphMailbox = value;
    }
    /**
     * Sets the hasLicense property value. Specifies if the user has a MyAnalytics license assigned.
     * @param value Value to set for the hasLicense property.
     * @return a void
     */
    public void setHasLicense(@javax.annotation.Nullable final Boolean value) {
        this._hasLicense = value;
    }
    /**
     * Sets the hasOptedOut property value. Specifies if the user opted out of MyAnalytics.
     * @param value Value to set for the hasOptedOut property.
     * @return a void
     */
    public void setHasOptedOut(@javax.annotation.Nullable final Boolean value) {
        this._hasOptedOut = value;
    }
}
