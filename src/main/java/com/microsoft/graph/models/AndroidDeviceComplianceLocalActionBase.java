package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidDeviceComplianceLocalActionBase extends Entity implements Parsable {
    /**
     * Number of minutes to wait till a local action is enforced. Valid values 0 to 2147483647
     */
    private Integer gracePeriodInMinutes;
    /**
     * Instantiates a new AndroidDeviceComplianceLocalActionBase and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidDeviceComplianceLocalActionBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidDeviceComplianceLocalActionBase
     */
    @javax.annotation.Nonnull
    public static AndroidDeviceComplianceLocalActionBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("gracePeriodInMinutes", (n) -> { this.setGracePeriodInMinutes(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the gracePeriodInMinutes property value. Number of minutes to wait till a local action is enforced. Valid values 0 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getGracePeriodInMinutes() {
        return this.gracePeriodInMinutes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("gracePeriodInMinutes", this.getGracePeriodInMinutes());
    }
    /**
     * Sets the gracePeriodInMinutes property value. Number of minutes to wait till a local action is enforced. Valid values 0 to 2147483647
     * @param value Value to set for the gracePeriodInMinutes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGracePeriodInMinutes(@javax.annotation.Nullable final Integer value) {
        this.gracePeriodInMinutes = value;
    }
}
