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
public class AuthenticationAttributeCollectionPage implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new AuthenticationAttributeCollectionPage and sets the default values.
     */
    public AuthenticationAttributeCollectionPage() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuthenticationAttributeCollectionPage
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationAttributeCollectionPage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationAttributeCollectionPage();
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
     * Gets the customStringsFileId property value. The customStringsFileId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomStringsFileId() {
        return this.backingStore.get("customStringsFileId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("customStringsFileId", (n) -> { this.setCustomStringsFileId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("views", (n) -> { this.setViews(n.getCollectionOfObjectValues(AuthenticationAttributeCollectionPageViewConfiguration::createFromDiscriminatorValue)); });
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
     * Gets the views property value. A collection of displays of the attribute collection page.
     * @return a java.util.List<AuthenticationAttributeCollectionPageViewConfiguration>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationAttributeCollectionPageViewConfiguration> getViews() {
        return this.backingStore.get("views");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("customStringsFileId", this.getCustomStringsFileId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("views", this.getViews());
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
     * Sets the customStringsFileId property value. The customStringsFileId property
     * @param value Value to set for the customStringsFileId property.
     */
    public void setCustomStringsFileId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customStringsFileId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the views property value. A collection of displays of the attribute collection page.
     * @param value Value to set for the views property.
     */
    public void setViews(@jakarta.annotation.Nullable final java.util.List<AuthenticationAttributeCollectionPageViewConfiguration> value) {
        this.backingStore.set("views", value);
    }
}
