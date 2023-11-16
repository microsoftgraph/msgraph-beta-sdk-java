package com.microsoft.graph.models;

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
    private BackingStore BackingStore;
    /**
     * Instantiates a new TeamworkSoftwareUpdateStatus and sets the default values.
     */
    public TeamworkSoftwareUpdateStatus() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
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
        Map<String, Object> value = this.BackingStore.get("additionalData");
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
        return this.BackingStore.get("availableVersion");
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
     * Gets the currentVersion property value. The current software version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCurrentVersion() {
        return this.BackingStore.get("currentVersion");
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
        deserializerMap.put("softwareFreshness", (n) -> { this.setSoftwareFreshness(n.getEnumValue(TeamworkSoftwareFreshness.class)); });
        return deserializerMap;
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
     * Gets the softwareFreshness property value. The update status of the software. The possible values are: unknown, latest, updateAvailable, unknownFutureValue.
     * @return a TeamworkSoftwareFreshness
     */
    @jakarta.annotation.Nullable
    public TeamworkSoftwareFreshness getSoftwareFreshness() {
        return this.BackingStore.get("softwareFreshness");
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
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the availableVersion property value. The available software version to update.
     * @param value Value to set for the availableVersion property.
     */
    public void setAvailableVersion(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("availableVersion", value);
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
     * Sets the currentVersion property value. The current software version.
     * @param value Value to set for the currentVersion property.
     */
    public void setCurrentVersion(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("currentVersion", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the softwareFreshness property value. The update status of the software. The possible values are: unknown, latest, updateAvailable, unknownFutureValue.
     * @param value Value to set for the softwareFreshness property.
     */
    public void setSoftwareFreshness(@jakarta.annotation.Nullable final TeamworkSoftwareFreshness value) {
        this.BackingStore.set("softwareFreshness", value);
    }
}
