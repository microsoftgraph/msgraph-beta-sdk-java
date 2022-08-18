package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of allowedDataLocation entities. */
public class AllowedDataLocation extends Entity implements Parsable {
    /** The appId property */
    private String _appId;
    /** The domain property */
    private String _domain;
    /** The isDefault property */
    private Boolean _isDefault;
    /** The location property */
    private String _location;
    /**
     * Instantiates a new allowedDataLocation and sets the default values.
     * @return a void
     */
    public AllowedDataLocation() {
        super();
        this.setOdataType("#microsoft.graph.allowedDataLocation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a allowedDataLocation
     */
    @javax.annotation.Nonnull
    public static AllowedDataLocation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AllowedDataLocation();
    }
    /**
     * Gets the appId property value. The appId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this._appId;
    }
    /**
     * Gets the domain property value. The domain property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDomain() {
        return this._domain;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AllowedDataLocation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appId", (n) -> { currentObject.setAppId(n.getStringValue()); });
            this.put("domain", (n) -> { currentObject.setDomain(n.getStringValue()); });
            this.put("isDefault", (n) -> { currentObject.setIsDefault(n.getBooleanValue()); });
            this.put("location", (n) -> { currentObject.setLocation(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isDefault property value. The isDefault property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefault() {
        return this._isDefault;
    }
    /**
     * Gets the location property value. The location property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocation() {
        return this._location;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("domain", this.getDomain());
        writer.writeBooleanValue("isDefault", this.getIsDefault());
        writer.writeStringValue("location", this.getLocation());
    }
    /**
     * Sets the appId property value. The appId property
     * @param value Value to set for the appId property.
     * @return a void
     */
    public void setAppId(@javax.annotation.Nullable final String value) {
        this._appId = value;
    }
    /**
     * Sets the domain property value. The domain property
     * @param value Value to set for the domain property.
     * @return a void
     */
    public void setDomain(@javax.annotation.Nullable final String value) {
        this._domain = value;
    }
    /**
     * Sets the isDefault property value. The isDefault property
     * @param value Value to set for the isDefault property.
     * @return a void
     */
    public void setIsDefault(@javax.annotation.Nullable final Boolean value) {
        this._isDefault = value;
    }
    /**
     * Sets the location property value. The location property
     * @param value Value to set for the location property.
     * @return a void
     */
    public void setLocation(@javax.annotation.Nullable final String value) {
        this._location = value;
    }
}
