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
public class TeamworkSoftwareUpdateStatus implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new TeamworkSoftwareUpdateStatus and sets the default values.
     */
    public TeamworkSoftwareUpdateStatus() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamworkSoftwareUpdateStatus
     */
    @jakarta.annotation.Nonnull
    public static TeamworkSoftwareUpdateStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkSoftwareUpdateStatus();
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
     * Gets the availableVersion property value. The available software version to update.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAvailableVersion() {
        return this.backingStore.get("availableVersion");
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
     * Gets the currentVersion property value. The current software version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCurrentVersion() {
        return this.backingStore.get("currentVersion");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("availableVersion", (n) -> { this.setAvailableVersion(n.getStringValue()); });
        deserializerMap.put("currentVersion", (n) -> { this.setCurrentVersion(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("softwareFreshness", (n) -> { this.setSoftwareFreshness(n.getEnumValue(TeamworkSoftwareUpdateStatusSoftwareFreshness::forValue)); });
        return deserializerMap;
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
     * Gets the softwareFreshness property value. The update status of the software. The possible values are: unknown, latest, updateAvailable, unknownFutureValue.
     * @return a TeamworkSoftwareUpdateStatusSoftwareFreshness
     */
    @jakarta.annotation.Nullable
    public TeamworkSoftwareUpdateStatusSoftwareFreshness getSoftwareFreshness() {
        return this.backingStore.get("softwareFreshness");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("availableVersion", this.getAvailableVersion());
        writer.writeStringValue("currentVersion", this.getCurrentVersion());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("softwareFreshness", this.getSoftwareFreshness());
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
     * Sets the availableVersion property value. The available software version to update.
     * @param value Value to set for the availableVersion property.
     */
    public void setAvailableVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("availableVersion", value);
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
     * Sets the currentVersion property value. The current software version.
     * @param value Value to set for the currentVersion property.
     */
    public void setCurrentVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("currentVersion", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the softwareFreshness property value. The update status of the software. The possible values are: unknown, latest, updateAvailable, unknownFutureValue.
     * @param value Value to set for the softwareFreshness property.
     */
    public void setSoftwareFreshness(@jakarta.annotation.Nullable final TeamworkSoftwareUpdateStatusSoftwareFreshness value) {
        this.backingStore.set("softwareFreshness", value);
    }
}
