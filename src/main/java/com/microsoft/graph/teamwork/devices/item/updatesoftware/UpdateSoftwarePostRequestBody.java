package com.microsoft.graph.teamwork.devices.item.updatesoftware;

import com.microsoft.graph.models.TeamworkSoftwareType;
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
public class UpdateSoftwarePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new UpdateSoftwarePostRequestBody and sets the default values.
     */
    public UpdateSoftwarePostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UpdateSoftwarePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static UpdateSoftwarePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateSoftwarePostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("softwareType", (n) -> { this.setSoftwareType(n.getEnumValue(TeamworkSoftwareType.class)); });
        deserializerMap.put("softwareVersion", (n) -> { this.setSoftwareVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the softwareType property value. The softwareType property
     * @return a TeamworkSoftwareType
     */
    @jakarta.annotation.Nullable
    public TeamworkSoftwareType getSoftwareType() {
        return this.backingStore.get("softwareType");
    }
    /**
     * Gets the softwareVersion property value. The softwareVersion property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSoftwareVersion() {
        return this.backingStore.get("softwareVersion");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("softwareType", this.getSoftwareType());
        writer.writeStringValue("softwareVersion", this.getSoftwareVersion());
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
     * Sets the softwareType property value. The softwareType property
     * @param value Value to set for the softwareType property.
     */
    public void setSoftwareType(@jakarta.annotation.Nullable final TeamworkSoftwareType value) {
        this.backingStore.set("softwareType", value);
    }
    /**
     * Sets the softwareVersion property value. The softwareVersion property
     * @param value Value to set for the softwareVersion property.
     */
    public void setSoftwareVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("softwareVersion", value);
    }
}
