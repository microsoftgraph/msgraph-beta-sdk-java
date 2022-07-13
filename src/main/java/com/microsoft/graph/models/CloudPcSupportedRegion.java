package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcSupportedRegion extends Entity implements Parsable {
    /** The name for the supported region. Read-only. */
    private String _displayName;
    /** The regionStatus property */
    private CloudPcSupportedRegionStatus _regionStatus;
    /**
     * Instantiates a new CloudPcSupportedRegion and sets the default values.
     * @return a void
     */
    public CloudPcSupportedRegion() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcSupportedRegion
     */
    @javax.annotation.Nonnull
    public static CloudPcSupportedRegion createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcSupportedRegion();
    }
    /**
     * Gets the displayName property value. The name for the supported region. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcSupportedRegion currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("regionStatus", (n) -> { currentObject.setRegionStatus(n.getEnumValue(CloudPcSupportedRegionStatus.class)); });
        }};
    }
    /**
     * Gets the regionStatus property value. The regionStatus property
     * @return a cloudPcSupportedRegionStatus
     */
    @javax.annotation.Nullable
    public CloudPcSupportedRegionStatus getRegionStatus() {
        return this._regionStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("regionStatus", this.getRegionStatus());
    }
    /**
     * Sets the displayName property value. The name for the supported region. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the regionStatus property value. The regionStatus property
     * @param value Value to set for the regionStatus property.
     * @return a void
     */
    public void setRegionStatus(@javax.annotation.Nullable final CloudPcSupportedRegionStatus value) {
        this._regionStatus = value;
    }
}
