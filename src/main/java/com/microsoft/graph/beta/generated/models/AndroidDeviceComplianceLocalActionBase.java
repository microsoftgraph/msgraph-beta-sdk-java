package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Local Action Configuration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidDeviceComplianceLocalActionBase extends Entity implements Parsable {
    /**
     * Instantiates a new AndroidDeviceComplianceLocalActionBase and sets the default values.
     */
    public AndroidDeviceComplianceLocalActionBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidDeviceComplianceLocalActionBase
     */
    @jakarta.annotation.Nonnull
    public static AndroidDeviceComplianceLocalActionBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.androidDeviceComplianceLocalActionLockDevice": return new AndroidDeviceComplianceLocalActionLockDevice();
                case "#microsoft.graph.androidDeviceComplianceLocalActionLockDeviceWithPasscode": return new AndroidDeviceComplianceLocalActionLockDeviceWithPasscode();
            }
        }
        return new AndroidDeviceComplianceLocalActionBase();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("gracePeriodInMinutes", (n) -> { this.setGracePeriodInMinutes(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the gracePeriodInMinutes property value. Number of minutes to wait till a local action is enforced. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getGracePeriodInMinutes() {
        return this.backingStore.get("gracePeriodInMinutes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("gracePeriodInMinutes", this.getGracePeriodInMinutes());
    }
    /**
     * Sets the gracePeriodInMinutes property value. Number of minutes to wait till a local action is enforced. Valid values 0 to 2147483647
     * @param value Value to set for the gracePeriodInMinutes property.
     */
    public void setGracePeriodInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("gracePeriodInMinutes", value);
    }
}
