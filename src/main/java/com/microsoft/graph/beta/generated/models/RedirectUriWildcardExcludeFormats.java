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
public class RedirectUriWildcardExcludeFormats implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link RedirectUriWildcardExcludeFormats} and sets the default values.
     */
    public RedirectUriWildcardExcludeFormats() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RedirectUriWildcardExcludeFormats}
     */
    @jakarta.annotation.Nonnull
    public static RedirectUriWildcardExcludeFormats createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RedirectUriWildcardExcludeFormats();
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
     * Gets the excludeWildcardsInPath property value. The excludeWildcardsInPath property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getExcludeWildcardsInPath() {
        return this.backingStore.get("excludeWildcardsInPath");
    }
    /**
     * Gets the excludeWildcardsInPathWithDomains property value. The excludeWildcardsInPathWithDomains property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExcludeWildcardsInPathWithDomains() {
        return this.backingStore.get("excludeWildcardsInPathWithDomains");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("excludeWildcardsInPath", (n) -> { this.setExcludeWildcardsInPath(n.getBooleanValue()); });
        deserializerMap.put("excludeWildcardsInPathWithDomains", (n) -> { this.setExcludeWildcardsInPathWithDomains(n.getCollectionOfPrimitiveValues(String.class)); });
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
        writer.writeBooleanValue("excludeWildcardsInPath", this.getExcludeWildcardsInPath());
        writer.writeCollectionOfPrimitiveValues("excludeWildcardsInPathWithDomains", this.getExcludeWildcardsInPathWithDomains());
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
     * Sets the excludeWildcardsInPath property value. The excludeWildcardsInPath property
     * @param value Value to set for the excludeWildcardsInPath property.
     */
    public void setExcludeWildcardsInPath(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("excludeWildcardsInPath", value);
    }
    /**
     * Sets the excludeWildcardsInPathWithDomains property value. The excludeWildcardsInPathWithDomains property
     * @param value Value to set for the excludeWildcardsInPathWithDomains property.
     */
    public void setExcludeWildcardsInPathWithDomains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("excludeWildcardsInPathWithDomains", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
