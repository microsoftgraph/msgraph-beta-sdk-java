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
public class OnPremisesApplicationSegment implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new OnPremisesApplicationSegment and sets the default values.
     */
    public OnPremisesApplicationSegment() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OnPremisesApplicationSegment
     */
    @jakarta.annotation.Nonnull
    public static OnPremisesApplicationSegment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesApplicationSegment();
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
     * Gets the alternateUrl property value. If you're configuring a traffic manager in front of multiple App Proxy application segments, contains the user-friendly URL that will point to the traffic manager.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAlternateUrl() {
        return this.BackingStore.get("alternateUrl");
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
     * Gets the corsConfigurations property value. CORS Rule definition for a particular application segment.
     * @return a java.util.List<CorsConfiguration>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CorsConfiguration> getCorsConfigurations() {
        return this.BackingStore.get("corsConfigurations");
    }
    /**
     * Gets the externalUrl property value. The published external URL for the application segment; for example, https://intranet.contoso.com./
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalUrl() {
        return this.BackingStore.get("externalUrl");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("alternateUrl", (n) -> { this.setAlternateUrl(n.getStringValue()); });
        deserializerMap.put("corsConfigurations", (n) -> { this.setCorsConfigurations(n.getCollectionOfObjectValues(CorsConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("externalUrl", (n) -> { this.setExternalUrl(n.getStringValue()); });
        deserializerMap.put("internalUrl", (n) -> { this.setInternalUrl(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the internalUrl property value. The internal URL of the application segment; for example, https://intranet/.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInternalUrl() {
        return this.BackingStore.get("internalUrl");
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("alternateUrl", this.getAlternateUrl());
        writer.writeCollectionOfObjectValues("corsConfigurations", this.getCorsConfigurations());
        writer.writeStringValue("externalUrl", this.getExternalUrl());
        writer.writeStringValue("internalUrl", this.getInternalUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the alternateUrl property value. If you're configuring a traffic manager in front of multiple App Proxy application segments, contains the user-friendly URL that will point to the traffic manager.
     * @param value Value to set for the alternateUrl property.
     */
    public void setAlternateUrl(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("alternateUrl", value);
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
     * Sets the corsConfigurations property value. CORS Rule definition for a particular application segment.
     * @param value Value to set for the corsConfigurations property.
     */
    public void setCorsConfigurations(@jakarta.annotation.Nullable final java.util.List<CorsConfiguration> value) {
        this.BackingStore.set("corsConfigurations", value);
    }
    /**
     * Sets the externalUrl property value. The published external URL for the application segment; for example, https://intranet.contoso.com./
     * @param value Value to set for the externalUrl property.
     */
    public void setExternalUrl(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("externalUrl", value);
    }
    /**
     * Sets the internalUrl property value. The internal URL of the application segment; for example, https://intranet/.
     * @param value Value to set for the internalUrl property.
     */
    public void setInternalUrl(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("internalUrl", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
}
