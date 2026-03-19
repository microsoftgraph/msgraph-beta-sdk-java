package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ActivityLogBase extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ActivityLogBase} and sets the default values.
     */
    public ActivityLogBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ActivityLogBase}
     */
    @jakarta.annotation.Nonnull
    public static ActivityLogBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.backupPolicyActivityLog": return new BackupPolicyActivityLog();
                case "#microsoft.graph.dynamicRuleActivityLog": return new DynamicRuleActivityLog();
                case "#microsoft.graph.offboardingActivityLog": return new OffboardingActivityLog();
                case "#microsoft.graph.restoreTaskActivityLog": return new RestoreTaskActivityLog();
            }
        }
        return new ActivityLogBase();
    }
    /**
     * Gets the activityType property value. The activityType property
     * @return a {@link ActivityLogOperationType}
     */
    @jakarta.annotation.Nullable
    public ActivityLogOperationType getActivityType() {
        return this.backingStore.get("activityType");
    }
    /**
     * Gets the error property value. The error property
     * @return a {@link PublicError}
     */
    @jakarta.annotation.Nullable
    public PublicError getError() {
        return this.backingStore.get("error");
    }
    /**
     * Gets the eventDateTime property value. The eventDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this.backingStore.get("eventDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activityType", (n) -> { this.setActivityType(n.getEnumValue(ActivityLogOperationType::forValue)); });
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(PublicError::createFromDiscriminatorValue)); });
        deserializerMap.put("eventDateTime", (n) -> { this.setEventDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("performedBy", (n) -> { this.setPerformedBy(n.getStringValue()); });
        deserializerMap.put("resultStatus", (n) -> { this.setResultStatus(n.getEnumValue(ActivityLogResultStatus::forValue)); });
        deserializerMap.put("serviceType", (n) -> { this.setServiceType(n.getEnumValue(ServiceType::forValue)); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(ActivityLogSeverity::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the performedBy property value. The performedBy property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPerformedBy() {
        return this.backingStore.get("performedBy");
    }
    /**
     * Gets the resultStatus property value. The resultStatus property
     * @return a {@link ActivityLogResultStatus}
     */
    @jakarta.annotation.Nullable
    public ActivityLogResultStatus getResultStatus() {
        return this.backingStore.get("resultStatus");
    }
    /**
     * Gets the serviceType property value. The serviceType property
     * @return a {@link ServiceType}
     */
    @jakarta.annotation.Nullable
    public ServiceType getServiceType() {
        return this.backingStore.get("serviceType");
    }
    /**
     * Gets the severity property value. The severity property
     * @return a {@link ActivityLogSeverity}
     */
    @jakarta.annotation.Nullable
    public ActivityLogSeverity getSeverity() {
        return this.backingStore.get("severity");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("activityType", this.getActivityType());
        writer.writeObjectValue("error", this.getError());
        writer.writeOffsetDateTimeValue("eventDateTime", this.getEventDateTime());
        writer.writeStringValue("performedBy", this.getPerformedBy());
        writer.writeEnumValue("resultStatus", this.getResultStatus());
        writer.writeEnumValue("serviceType", this.getServiceType());
        writer.writeEnumValue("severity", this.getSeverity());
    }
    /**
     * Sets the activityType property value. The activityType property
     * @param value Value to set for the activityType property.
     */
    public void setActivityType(@jakarta.annotation.Nullable final ActivityLogOperationType value) {
        this.backingStore.set("activityType", value);
    }
    /**
     * Sets the error property value. The error property
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final PublicError value) {
        this.backingStore.set("error", value);
    }
    /**
     * Sets the eventDateTime property value. The eventDateTime property
     * @param value Value to set for the eventDateTime property.
     */
    public void setEventDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("eventDateTime", value);
    }
    /**
     * Sets the performedBy property value. The performedBy property
     * @param value Value to set for the performedBy property.
     */
    public void setPerformedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("performedBy", value);
    }
    /**
     * Sets the resultStatus property value. The resultStatus property
     * @param value Value to set for the resultStatus property.
     */
    public void setResultStatus(@jakarta.annotation.Nullable final ActivityLogResultStatus value) {
        this.backingStore.set("resultStatus", value);
    }
    /**
     * Sets the serviceType property value. The serviceType property
     * @param value Value to set for the serviceType property.
     */
    public void setServiceType(@jakarta.annotation.Nullable final ServiceType value) {
        this.backingStore.set("serviceType", value);
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final ActivityLogSeverity value) {
        this.backingStore.set("severity", value);
    }
}
