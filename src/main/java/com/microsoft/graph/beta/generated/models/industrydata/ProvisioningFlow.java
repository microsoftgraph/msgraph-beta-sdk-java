package com.microsoft.graph.beta.models.industrydata;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProvisioningFlow extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ProvisioningFlow} and sets the default values.
     */
    public ProvisioningFlow() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProvisioningFlow}
     */
    @jakarta.annotation.Nonnull
    public static ProvisioningFlow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.industryData.administrativeUnitProvisioningFlow": return new AdministrativeUnitProvisioningFlow();
                case "#microsoft.graph.industryData.classGroupProvisioningFlow": return new ClassGroupProvisioningFlow();
                case "#microsoft.graph.industryData.securityGroupProvisioningFlow": return new SecurityGroupProvisioningFlow();
                case "#microsoft.graph.industryData.userProvisioningFlow": return new UserProvisioningFlow();
            }
        }
        return new ProvisioningFlow();
    }
    /**
     * Gets the createdDateTime property value. The date and time when the provisioning flow was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("readinessStatus", (n) -> { this.setReadinessStatus(n.getEnumValue(ReadinessStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the provisioning flow was most recently changed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the readinessStatus property value. The state of the activity from creation through to ready to do work. The possible values are: notReady, ready, failed, disabled, expired, unknownFutureValue.
     * @return a {@link ReadinessStatus}
     */
    @jakarta.annotation.Nullable
    public ReadinessStatus getReadinessStatus() {
        return this.backingStore.get("readinessStatus");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the provisioning flow was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the provisioning flow was most recently changed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the readinessStatus property value. The state of the activity from creation through to ready to do work. The possible values are: notReady, ready, failed, disabled, expired, unknownFutureValue.
     * @param value Value to set for the readinessStatus property.
     */
    public void setReadinessStatus(@jakarta.annotation.Nullable final ReadinessStatus value) {
        this.backingStore.set("readinessStatus", value);
    }
}
