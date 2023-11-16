package com.microsoft.graph.models.industrydata;

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
public class UserMatchingSetting implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new UserMatchingSetting and sets the default values.
     */
    public UserMatchingSetting() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserMatchingSetting
     */
    @jakarta.annotation.Nonnull
    public static UserMatchingSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserMatchingSetting();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("matchTarget", (n) -> { this.setMatchTarget(n.getObjectValue(UserMatchTargetReferenceValue::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("priorityOrder", (n) -> { this.setPriorityOrder(n.getIntegerValue()); });
        deserializerMap.put("roleGroup", (n) -> { this.setRoleGroup(n.getObjectValue(RoleGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("sourceIdentifier", (n) -> { this.setSourceIdentifier(n.getObjectValue(IdentifierTypeReferenceValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the matchTarget property value. The RefUserMatchTarget for matching a user from the source with a Microsoft Entra user object.
     * @return a UserMatchTargetReferenceValue
     */
    @jakarta.annotation.Nullable
    public UserMatchTargetReferenceValue getMatchTarget() {
        return this.BackingStore.get("matchTarget");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the priorityOrder property value. The priority order to apply when a user has multiple RefRole codes assigned.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPriorityOrder() {
        return this.BackingStore.get("priorityOrder");
    }
    /**
     * Gets the roleGroup property value. The roleGroup property
     * @return a RoleGroup
     */
    @jakarta.annotation.Nullable
    public RoleGroup getRoleGroup() {
        return this.BackingStore.get("roleGroup");
    }
    /**
     * Gets the sourceIdentifier property value. The sourceIdentifier property
     * @return a IdentifierTypeReferenceValue
     */
    @jakarta.annotation.Nullable
    public IdentifierTypeReferenceValue getSourceIdentifier() {
        return this.BackingStore.get("sourceIdentifier");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("matchTarget", this.getMatchTarget());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("priorityOrder", this.getPriorityOrder());
        writer.writeObjectValue("roleGroup", this.getRoleGroup());
        writer.writeObjectValue("sourceIdentifier", this.getSourceIdentifier());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the matchTarget property value. The RefUserMatchTarget for matching a user from the source with a Microsoft Entra user object.
     * @param value Value to set for the matchTarget property.
     */
    public void setMatchTarget(@jakarta.annotation.Nullable final UserMatchTargetReferenceValue value) {
        this.BackingStore.set("matchTarget", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the priorityOrder property value. The priority order to apply when a user has multiple RefRole codes assigned.
     * @param value Value to set for the priorityOrder property.
     */
    public void setPriorityOrder(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("priorityOrder", value);
    }
    /**
     * Sets the roleGroup property value. The roleGroup property
     * @param value Value to set for the roleGroup property.
     */
    public void setRoleGroup(@jakarta.annotation.Nullable final RoleGroup value) {
        this.BackingStore.set("roleGroup", value);
    }
    /**
     * Sets the sourceIdentifier property value. The sourceIdentifier property
     * @param value Value to set for the sourceIdentifier property.
     */
    public void setSourceIdentifier(@jakarta.annotation.Nullable final IdentifierTypeReferenceValue value) {
        this.BackingStore.set("sourceIdentifier", value);
    }
}
