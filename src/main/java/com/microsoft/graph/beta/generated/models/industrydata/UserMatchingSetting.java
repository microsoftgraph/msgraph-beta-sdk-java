package com.microsoft.graph.beta.models.industrydata;

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
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link UserMatchingSetting} and sets the default values.
     */
    public UserMatchingSetting() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserMatchingSetting}
     */
    @jakarta.annotation.Nonnull
    public static UserMatchingSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserMatchingSetting();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
     * @return a {@link UserMatchTargetReferenceValue}
     */
    @jakarta.annotation.Nullable
    public UserMatchTargetReferenceValue getMatchTarget() {
        return this.backingStore.get("matchTarget");
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
     * Gets the priorityOrder property value. The priority order to apply when a user has multiple RefRole codes assigned.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPriorityOrder() {
        return this.backingStore.get("priorityOrder");
    }
    /**
     * Gets the roleGroup property value. The roleGroup property
     * @return a {@link RoleGroup}
     */
    @jakarta.annotation.Nullable
    public RoleGroup getRoleGroup() {
        return this.backingStore.get("roleGroup");
    }
    /**
     * Gets the sourceIdentifier property value. The sourceIdentifier property
     * @return a {@link IdentifierTypeReferenceValue}
     */
    @jakarta.annotation.Nullable
    public IdentifierTypeReferenceValue getSourceIdentifier() {
        return this.backingStore.get("sourceIdentifier");
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
     * Sets the matchTarget property value. The RefUserMatchTarget for matching a user from the source with a Microsoft Entra user object.
     * @param value Value to set for the matchTarget property.
     */
    public void setMatchTarget(@jakarta.annotation.Nullable final UserMatchTargetReferenceValue value) {
        this.backingStore.set("matchTarget", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the priorityOrder property value. The priority order to apply when a user has multiple RefRole codes assigned.
     * @param value Value to set for the priorityOrder property.
     */
    public void setPriorityOrder(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("priorityOrder", value);
    }
    /**
     * Sets the roleGroup property value. The roleGroup property
     * @param value Value to set for the roleGroup property.
     */
    public void setRoleGroup(@jakarta.annotation.Nullable final RoleGroup value) {
        this.backingStore.set("roleGroup", value);
    }
    /**
     * Sets the sourceIdentifier property value. The sourceIdentifier property
     * @param value Value to set for the sourceIdentifier property.
     */
    public void setSourceIdentifier(@jakarta.annotation.Nullable final IdentifierTypeReferenceValue value) {
        this.backingStore.set("sourceIdentifier", value);
    }
}
