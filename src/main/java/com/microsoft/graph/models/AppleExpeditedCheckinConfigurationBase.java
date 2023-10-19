package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Experimental profile to increase the rate of device check-ins per day of iOS/macOS devices. This profile type is deprecated.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppleExpeditedCheckinConfigurationBase extends DeviceConfiguration implements Parsable {
    /**
     * Gets or sets whether to enable expedited device check-ins.
     */
    private Boolean enableExpeditedCheckin;
    /**
     * Instantiates a new AppleExpeditedCheckinConfigurationBase and sets the default values.
     */
    public AppleExpeditedCheckinConfigurationBase() {
        super();
        this.setOdataType("#microsoft.graph.appleExpeditedCheckinConfigurationBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AppleExpeditedCheckinConfigurationBase
     */
    @jakarta.annotation.Nonnull
    public static AppleExpeditedCheckinConfigurationBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableExpeditedCheckin() {
        return this.enableExpeditedCheckin;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("enableExpeditedCheckin", (n) -> { this.setEnableExpeditedCheckin(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("enableExpeditedCheckin", this.getEnableExpeditedCheckin());
    }
    /**
     * Sets the enableExpeditedCheckin property value. Gets or sets whether to enable expedited device check-ins.
     * @param value Value to set for the enableExpeditedCheckin property.
     */
    public void setEnableExpeditedCheckin(@jakarta.annotation.Nullable final Boolean value) {
        this.enableExpeditedCheckin = value;
    }
}
