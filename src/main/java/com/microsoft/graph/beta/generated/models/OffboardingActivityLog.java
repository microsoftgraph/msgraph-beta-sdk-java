package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OffboardingActivityLog extends ActivityLogBase implements Parsable {
    /**
     * Instantiates a new {@link OffboardingActivityLog} and sets the default values.
     */
    public OffboardingActivityLog() {
        super();
        this.setOdataType("#microsoft.graph.offboardingActivityLog");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OffboardingActivityLog}
     */
    @jakarta.annotation.Nonnull
    public static OffboardingActivityLog createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OffboardingActivityLog();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("offboardingDetails", (n) -> { this.setOffboardingDetails(n.getObjectValue(OffboardingDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("policyId", (n) -> { this.setPolicyId(n.getStringValue()); });
        deserializerMap.put("policyName", (n) -> { this.setPolicyName(n.getStringValue()); });
        deserializerMap.put("policyStatus", (n) -> { this.setPolicyStatus(n.getEnumValue(ProtectionPolicyStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the offboardingDetails property value. The offboardingDetails property
     * @return a {@link OffboardingDetails}
     */
    @jakarta.annotation.Nullable
    public OffboardingDetails getOffboardingDetails() {
        return this.backingStore.get("offboardingDetails");
    }
    /**
     * Gets the policyId property value. The policyId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyId() {
        return this.backingStore.get("policyId");
    }
    /**
     * Gets the policyName property value. The policyName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyName() {
        return this.backingStore.get("policyName");
    }
    /**
     * Gets the policyStatus property value. The policyStatus property
     * @return a {@link ProtectionPolicyStatus}
     */
    @jakarta.annotation.Nullable
    public ProtectionPolicyStatus getPolicyStatus() {
        return this.backingStore.get("policyStatus");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("offboardingDetails", this.getOffboardingDetails());
        writer.writeStringValue("policyId", this.getPolicyId());
        writer.writeStringValue("policyName", this.getPolicyName());
        writer.writeEnumValue("policyStatus", this.getPolicyStatus());
    }
    /**
     * Sets the offboardingDetails property value. The offboardingDetails property
     * @param value Value to set for the offboardingDetails property.
     */
    public void setOffboardingDetails(@jakarta.annotation.Nullable final OffboardingDetails value) {
        this.backingStore.set("offboardingDetails", value);
    }
    /**
     * Sets the policyId property value. The policyId property
     * @param value Value to set for the policyId property.
     */
    public void setPolicyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyId", value);
    }
    /**
     * Sets the policyName property value. The policyName property
     * @param value Value to set for the policyName property.
     */
    public void setPolicyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyName", value);
    }
    /**
     * Sets the policyStatus property value. The policyStatus property
     * @param value Value to set for the policyStatus property.
     */
    public void setPolicyStatus(@jakarta.annotation.Nullable final ProtectionPolicyStatus value) {
        this.backingStore.set("policyStatus", value);
    }
}
