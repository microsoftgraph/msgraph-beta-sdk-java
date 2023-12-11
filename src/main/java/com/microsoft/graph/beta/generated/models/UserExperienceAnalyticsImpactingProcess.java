package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics top impacting process entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsImpactingProcess extends Entity implements Parsable {
    /**
     * Instantiates a new UserExperienceAnalyticsImpactingProcess and sets the default values.
     */
    public UserExperienceAnalyticsImpactingProcess() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsImpactingProcess
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsImpactingProcess createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsImpactingProcess();
    }
    /**
     * Gets the category property value. The category of impacting process.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory() {
        return this.backingStore.get("category");
    }
    /**
     * Gets the description property value. The description of process.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the deviceId property value. The unique identifier of the impacted device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("category", (n) -> { this.setCategory(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("impactValue", (n) -> { this.setImpactValue(n.getDoubleValue()); });
        deserializerMap.put("processName", (n) -> { this.setProcessName(n.getStringValue()); });
        deserializerMap.put("publisher", (n) -> { this.setPublisher(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the impactValue property value. The impact value of the process. Valid values 0 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getImpactValue() {
        return this.backingStore.get("impactValue");
    }
    /**
     * Gets the processName property value. The process name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProcessName() {
        return this.backingStore.get("processName");
    }
    /**
     * Gets the publisher property value. The publisher of the process.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPublisher() {
        return this.backingStore.get("publisher");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("category", this.getCategory());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeDoubleValue("impactValue", this.getImpactValue());
        writer.writeStringValue("processName", this.getProcessName());
        writer.writeStringValue("publisher", this.getPublisher());
    }
    /**
     * Sets the category property value. The category of impacting process.
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category", value);
    }
    /**
     * Sets the description property value. The description of process.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the deviceId property value. The unique identifier of the impacted device.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the impactValue property value. The impact value of the process. Valid values 0 to 1.79769313486232E+308
     * @param value Value to set for the impactValue property.
     */
    public void setImpactValue(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("impactValue", value);
    }
    /**
     * Sets the processName property value. The process name.
     * @param value Value to set for the processName property.
     */
    public void setProcessName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("processName", value);
    }
    /**
     * Sets the publisher property value. The publisher of the process.
     * @param value Value to set for the publisher property.
     */
    public void setPublisher(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("publisher", value);
    }
}
