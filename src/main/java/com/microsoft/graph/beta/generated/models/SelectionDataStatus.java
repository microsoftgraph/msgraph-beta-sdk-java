package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Freshness of each source that contributed to a computed balance or selection.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SelectionDataStatus implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SelectionDataStatus} and sets the default values.
     */
    public SelectionDataStatus() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SelectionDataStatus}
     */
    @jakarta.annotation.Nonnull
    public static SelectionDataStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SelectionDataStatus();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the evaluatedDateTime property value. When the result was evaluated. Always present.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEvaluatedDateTime() {
        return this.backingStore.get("evaluatedDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("evaluatedDateTime", (n) -> { this.setEvaluatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("groupMembershipAsOfDateTime", (n) -> { this.setGroupMembershipAsOfDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("policyConfigurationAsOfDateTime", (n) -> { this.setPolicyConfigurationAsOfDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("usageAsOfDateTime", (n) -> { this.setUsageAsOfDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupMembershipAsOfDateTime property value. As-of time of the group membership used.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getGroupMembershipAsOfDateTime() {
        return this.backingStore.get("groupMembershipAsOfDateTime");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the policyConfigurationAsOfDateTime property value. As-of time of the policy configuration used.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPolicyConfigurationAsOfDateTime() {
        return this.backingStore.get("policyConfigurationAsOfDateTime");
    }
    /**
     * Gets the usageAsOfDateTime property value. As-of time of the usage data used. Omitted when no usage read was performed.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUsageAsOfDateTime() {
        return this.backingStore.get("usageAsOfDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("evaluatedDateTime", this.getEvaluatedDateTime());
        writer.writeOffsetDateTimeValue("groupMembershipAsOfDateTime", this.getGroupMembershipAsOfDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("policyConfigurationAsOfDateTime", this.getPolicyConfigurationAsOfDateTime());
        writer.writeOffsetDateTimeValue("usageAsOfDateTime", this.getUsageAsOfDateTime());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the evaluatedDateTime property value. When the result was evaluated. Always present.
     * @param value Value to set for the evaluatedDateTime property.
     */
    public void setEvaluatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("evaluatedDateTime", value);
    }
    /**
     * Sets the groupMembershipAsOfDateTime property value. As-of time of the group membership used.
     * @param value Value to set for the groupMembershipAsOfDateTime property.
     */
    public void setGroupMembershipAsOfDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("groupMembershipAsOfDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the policyConfigurationAsOfDateTime property value. As-of time of the policy configuration used.
     * @param value Value to set for the policyConfigurationAsOfDateTime property.
     */
    public void setPolicyConfigurationAsOfDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("policyConfigurationAsOfDateTime", value);
    }
    /**
     * Sets the usageAsOfDateTime property value. As-of time of the usage data used. Omitted when no usage read was performed.
     * @param value Value to set for the usageAsOfDateTime property.
     */
    public void setUsageAsOfDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("usageAsOfDateTime", value);
    }
}
