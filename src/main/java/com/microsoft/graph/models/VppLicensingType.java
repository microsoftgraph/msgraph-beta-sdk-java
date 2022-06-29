package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains properties for iOS Volume-Purchased Program (Vpp) Licensing Type. */
public class VppLicensingType implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Whether the program supports the device licensing type. */
    private Boolean _supportDeviceLicensing;
    /** Whether the program supports the device licensing type. */
    private Boolean _supportsDeviceLicensing;
    /** Whether the program supports the user licensing type. */
    private Boolean _supportsUserLicensing;
    /** Whether the program supports the user licensing type. */
    private Boolean _supportUserLicensing;
    /**
     * Instantiates a new vppLicensingType and sets the default values.
     * @return a void
     */
    public VppLicensingType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a vppLicensingType
     */
    @javax.annotation.Nonnull
    public static VppLicensingType createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VppLicensingType();
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
        final VppLicensingType currentObject = this;
        return new HashMap<>(4) {{
            this.put("supportDeviceLicensing", (n) -> { currentObject.setSupportDeviceLicensing(n.getBooleanValue()); });
            this.put("supportsDeviceLicensing", (n) -> { currentObject.setSupportsDeviceLicensing(n.getBooleanValue()); });
            this.put("supportsUserLicensing", (n) -> { currentObject.setSupportsUserLicensing(n.getBooleanValue()); });
            this.put("supportUserLicensing", (n) -> { currentObject.setSupportUserLicensing(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the supportDeviceLicensing property value. Whether the program supports the device licensing type.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSupportDeviceLicensing() {
        return this._supportDeviceLicensing;
    }
    /**
     * Gets the supportsDeviceLicensing property value. Whether the program supports the device licensing type.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSupportsDeviceLicensing() {
        return this._supportsDeviceLicensing;
    }
    /**
     * Gets the supportsUserLicensing property value. Whether the program supports the user licensing type.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSupportsUserLicensing() {
        return this._supportsUserLicensing;
    }
    /**
     * Gets the supportUserLicensing property value. Whether the program supports the user licensing type.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSupportUserLicensing() {
        return this._supportUserLicensing;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("supportDeviceLicensing", this.getSupportDeviceLicensing());
        writer.writeBooleanValue("supportsDeviceLicensing", this.getSupportsDeviceLicensing());
        writer.writeBooleanValue("supportsUserLicensing", this.getSupportsUserLicensing());
        writer.writeBooleanValue("supportUserLicensing", this.getSupportUserLicensing());
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
     * Sets the supportDeviceLicensing property value. Whether the program supports the device licensing type.
     * @param value Value to set for the supportDeviceLicensing property.
     * @return a void
     */
    public void setSupportDeviceLicensing(@javax.annotation.Nullable final Boolean value) {
        this._supportDeviceLicensing = value;
    }
    /**
     * Sets the supportsDeviceLicensing property value. Whether the program supports the device licensing type.
     * @param value Value to set for the supportsDeviceLicensing property.
     * @return a void
     */
    public void setSupportsDeviceLicensing(@javax.annotation.Nullable final Boolean value) {
        this._supportsDeviceLicensing = value;
    }
    /**
     * Sets the supportsUserLicensing property value. Whether the program supports the user licensing type.
     * @param value Value to set for the supportsUserLicensing property.
     * @return a void
     */
    public void setSupportsUserLicensing(@javax.annotation.Nullable final Boolean value) {
        this._supportsUserLicensing = value;
    }
    /**
     * Sets the supportUserLicensing property value. Whether the program supports the user licensing type.
     * @param value Value to set for the supportUserLicensing property.
     * @return a void
     */
    public void setSupportUserLicensing(@javax.annotation.Nullable final Boolean value) {
        this._supportUserLicensing = value;
    }
}
