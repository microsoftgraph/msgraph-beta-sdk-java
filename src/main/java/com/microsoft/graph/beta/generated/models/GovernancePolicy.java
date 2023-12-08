package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GovernancePolicy implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new GovernancePolicy and sets the default values.
     */
    public GovernancePolicy() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GovernancePolicy
     */
    @jakarta.annotation.Nonnull
    public static GovernancePolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernancePolicy();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the decisionMakerCriteria property value. The decisionMakerCriteria property
     * @return a java.util.List<GovernanceCriteria>
     */
    @jakarta.annotation.Nullable
    public java.util.List<GovernanceCriteria> getDecisionMakerCriteria() {
        return this.backingStore.get("decisionMakerCriteria");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("decisionMakerCriteria", (n) -> { this.setDecisionMakerCriteria(n.getCollectionOfObjectValues(GovernanceCriteria::createFromDiscriminatorValue)); });
        deserializerMap.put("notificationPolicy", (n) -> { this.setNotificationPolicy(n.getObjectValue(GovernanceNotificationPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the notificationPolicy property value. The notificationPolicy property
     * @return a GovernanceNotificationPolicy
     */
    @jakarta.annotation.Nullable
    public GovernanceNotificationPolicy getNotificationPolicy() {
        return this.backingStore.get("notificationPolicy");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("decisionMakerCriteria", this.getDecisionMakerCriteria());
        writer.writeObjectValue("notificationPolicy", this.getNotificationPolicy());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the decisionMakerCriteria property value. The decisionMakerCriteria property
     * @param value Value to set for the decisionMakerCriteria property.
     */
    public void setDecisionMakerCriteria(@jakarta.annotation.Nullable final java.util.List<GovernanceCriteria> value) {
        this.backingStore.set("decisionMakerCriteria", value);
    }
    /**
     * Sets the notificationPolicy property value. The notificationPolicy property
     * @param value Value to set for the notificationPolicy property.
     */
    public void setNotificationPolicy(@jakarta.annotation.Nullable final GovernanceNotificationPolicy value) {
        this.backingStore.set("notificationPolicy", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
