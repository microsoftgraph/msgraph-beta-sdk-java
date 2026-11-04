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
/**
 * A directory object included in a Copilot policy setting assignment.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CopilotPolicySettingAssignmentMember implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CopilotPolicySettingAssignmentMember} and sets the default values.
     */
    public CopilotPolicySettingAssignmentMember() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CopilotPolicySettingAssignmentMember}
     */
    @jakarta.annotation.Nonnull
    public static CopilotPolicySettingAssignmentMember createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopilotPolicySettingAssignmentMember();
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
     * Gets the directoryObjectId property value. Identifier of the assigned user or group.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDirectoryObjectId() {
        return this.backingStore.get("directoryObjectId");
    }
    /**
     * Gets the directoryObjectType property value. The directory object type of a Copilot policy setting assignment member.
     * @return a {@link CopilotPolicySettingDirectoryObjectType}
     */
    @jakarta.annotation.Nullable
    public CopilotPolicySettingDirectoryObjectType getDirectoryObjectType() {
        return this.backingStore.get("directoryObjectType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("directoryObjectId", (n) -> { this.setDirectoryObjectId(n.getStringValue()); });
        deserializerMap.put("directoryObjectType", (n) -> { this.setDirectoryObjectType(n.getEnumValue(CopilotPolicySettingDirectoryObjectType::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("directoryObjectId", this.getDirectoryObjectId());
        writer.writeEnumValue("directoryObjectType", this.getDirectoryObjectType());
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
     * Sets the directoryObjectId property value. Identifier of the assigned user or group.
     * @param value Value to set for the directoryObjectId property.
     */
    public void setDirectoryObjectId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("directoryObjectId", value);
    }
    /**
     * Sets the directoryObjectType property value. The directory object type of a Copilot policy setting assignment member.
     * @param value Value to set for the directoryObjectType property.
     */
    public void setDirectoryObjectType(@jakarta.annotation.Nullable final CopilotPolicySettingDirectoryObjectType value) {
        this.backingStore.set("directoryObjectType", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
