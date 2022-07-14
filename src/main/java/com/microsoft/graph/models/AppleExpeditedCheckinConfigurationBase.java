package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AppleExpeditedCheckinConfigurationBase extends DeviceConfiguration implements Parsable {
    /** Gets or sets whether to enable expedited device check-ins. */
    private Boolean _enableExpeditedCheckin;
    /**
     * Instantiates a new AppleExpeditedCheckinConfigurationBase and sets the default values.
     * @return a void
     */
    public AppleExpeditedCheckinConfigurationBase() {
        super();
        this.setType("#microsoft.graph.appleExpeditedCheckinConfigurationBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AppleExpeditedCheckinConfigurationBase
     */
    @javax.annotation.Nonnull
    public static AppleExpeditedCheckinConfigurationBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.iosExpeditedCheckinConfiguration": return new IosExpeditedCheckinConfiguration();
            }
        }
        return new AppleExpeditedCheckinConfigurationBase();
    }
    /**
     * Gets the enableExpeditedCheckin property value. Gets or sets whether to enable expedited device check-ins.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableExpeditedCheckin() {
        return this._enableExpeditedCheckin;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AppleExpeditedCheckinConfigurationBase currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("enableExpeditedCheckin", (n) -> { currentObject.setEnableExpeditedCheckin(n.getBooleanValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("enableExpeditedCheckin", this.getEnableExpeditedCheckin());
    }
    /**
     * Sets the enableExpeditedCheckin property value. Gets or sets whether to enable expedited device check-ins.
     * @param value Value to set for the enableExpeditedCheckin property.
     * @return a void
     */
    public void setEnableExpeditedCheckin(@javax.annotation.Nullable final Boolean value) {
        this._enableExpeditedCheckin = value;
    }
}
