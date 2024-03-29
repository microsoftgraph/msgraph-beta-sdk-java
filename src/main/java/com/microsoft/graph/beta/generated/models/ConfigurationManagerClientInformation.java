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
 * Configuration Manager client information synced from SCCM
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConfigurationManagerClientInformation implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ConfigurationManagerClientInformation} and sets the default values.
     */
    public ConfigurationManagerClientInformation() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConfigurationManagerClientInformation}
     */
    @jakarta.annotation.Nonnull
    public static ConfigurationManagerClientInformation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfigurationManagerClientInformation();
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
     * Gets the clientIdentifier property value. Configuration Manager Client Id from SCCM
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientIdentifier() {
        return this.backingStore.get("clientIdentifier");
    }
    /**
     * Gets the clientVersion property value. Configuration Manager Client version from SCCM
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientVersion() {
        return this.backingStore.get("clientVersion");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("clientIdentifier", (n) -> { this.setClientIdentifier(n.getStringValue()); });
        deserializerMap.put("clientVersion", (n) -> { this.setClientVersion(n.getStringValue()); });
        deserializerMap.put("isBlocked", (n) -> { this.setIsBlocked(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isBlocked property value. Configuration Manager Client blocked status from SCCM
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsBlocked() {
        return this.backingStore.get("isBlocked");
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
        writer.writeStringValue("clientIdentifier", this.getClientIdentifier());
        writer.writeStringValue("clientVersion", this.getClientVersion());
        writer.writeBooleanValue("isBlocked", this.getIsBlocked());
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
     * Sets the clientIdentifier property value. Configuration Manager Client Id from SCCM
     * @param value Value to set for the clientIdentifier property.
     */
    public void setClientIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientIdentifier", value);
    }
    /**
     * Sets the clientVersion property value. Configuration Manager Client version from SCCM
     * @param value Value to set for the clientVersion property.
     */
    public void setClientVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientVersion", value);
    }
    /**
     * Sets the isBlocked property value. Configuration Manager Client blocked status from SCCM
     * @param value Value to set for the isBlocked property.
     */
    public void setIsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isBlocked", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
