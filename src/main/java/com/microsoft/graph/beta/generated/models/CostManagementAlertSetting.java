package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Notify-only alert configuration for a spending policy. Each policy has at most one,retrieved from its own URL beneath the policy.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CostManagementAlertSetting extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CostManagementAlertSetting} and sets the default values.
     */
    public CostManagementAlertSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CostManagementAlertSetting}
     */
    @jakarta.annotation.Nonnull
    public static CostManagementAlertSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CostManagementAlertSetting();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("recipients", (n) -> { this.setRecipients(n.getCollectionOfObjectValues(User::createFromDiscriminatorValue)); });
        deserializerMap.put("thresholds", (n) -> { this.setThresholds(n.getCollectionOfObjectValues(CostManagementAlertThreshold::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. Whether alerting is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the recipients property value. The directory users notified when a threshold is crossed. The address is resolved at sendtime, so a recipient survives a mailbox change. Managed with $ref add and remove. Areference that does not resolve to a user in the tenant is rejected withalertRecipientNotFound.
     * @return a {@link java.util.List<User>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<User> getRecipients() {
        return this.backingStore.get("recipients");
    }
    /**
     * Gets the thresholds property value. The configured thresholds.
     * @return a {@link java.util.List<CostManagementAlertThreshold>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CostManagementAlertThreshold> getThresholds() {
        return this.backingStore.get("thresholds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeCollectionOfObjectValues("recipients", this.getRecipients());
        writer.writeCollectionOfObjectValues("thresholds", this.getThresholds());
    }
    /**
     * Sets the isEnabled property value. Whether alerting is enabled.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the recipients property value. The directory users notified when a threshold is crossed. The address is resolved at sendtime, so a recipient survives a mailbox change. Managed with $ref add and remove. Areference that does not resolve to a user in the tenant is rejected withalertRecipientNotFound.
     * @param value Value to set for the recipients property.
     */
    public void setRecipients(@jakarta.annotation.Nullable final java.util.List<User> value) {
        this.backingStore.set("recipients", value);
    }
    /**
     * Sets the thresholds property value. The configured thresholds.
     * @param value Value to set for the thresholds property.
     */
    public void setThresholds(@jakarta.annotation.Nullable final java.util.List<CostManagementAlertThreshold> value) {
        this.backingStore.set("thresholds", value);
    }
}
