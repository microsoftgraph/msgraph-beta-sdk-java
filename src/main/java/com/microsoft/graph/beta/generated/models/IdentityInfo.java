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
public class IdentityInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link IdentityInfo} and sets the default values.
     */
    public IdentityInfo() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IdentityInfo}
     */
    @jakarta.annotation.Nonnull
    public static IdentityInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentityInfo();
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
     * Gets the anchor property value. The anchor property that uniquely identifies the identity in its directory.
     * @return a {@link AttributeInfo}
     */
    @jakarta.annotation.Nullable
    public AttributeInfo getAnchor() {
        return this.backingStore.get("anchor");
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
     * Gets the details property value. Additional details about the identity.
     * @return a {@link DetailsInfo}
     */
    @jakarta.annotation.Nullable
    public DetailsInfo getDetails() {
        return this.backingStore.get("details");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("anchor", (n) -> { this.setAnchor(n.getObjectValue(AttributeInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("details", (n) -> { this.setDetails(n.getObjectValue(DetailsInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("identityType", (n) -> { this.setIdentityType(n.getStringValue()); });
        deserializerMap.put("matchingProperty", (n) -> { this.setMatchingProperty(n.getObjectValue(AttributeInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identityType property value. The type of identity, such as user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIdentityType() {
        return this.backingStore.get("identityType");
    }
    /**
     * Gets the matchingProperty property value. The property used to match identities across directories.
     * @return a {@link AttributeInfo}
     */
    @jakarta.annotation.Nullable
    public AttributeInfo getMatchingProperty() {
        return this.backingStore.get("matchingProperty");
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
        writer.writeObjectValue("anchor", this.getAnchor());
        writer.writeObjectValue("details", this.getDetails());
        writer.writeStringValue("identityType", this.getIdentityType());
        writer.writeObjectValue("matchingProperty", this.getMatchingProperty());
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
     * Sets the anchor property value. The anchor property that uniquely identifies the identity in its directory.
     * @param value Value to set for the anchor property.
     */
    public void setAnchor(@jakarta.annotation.Nullable final AttributeInfo value) {
        this.backingStore.set("anchor", value);
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
     * Sets the details property value. Additional details about the identity.
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final DetailsInfo value) {
        this.backingStore.set("details", value);
    }
    /**
     * Sets the identityType property value. The type of identity, such as user.
     * @param value Value to set for the identityType property.
     */
    public void setIdentityType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identityType", value);
    }
    /**
     * Sets the matchingProperty property value. The property used to match identities across directories.
     * @param value Value to set for the matchingProperty property.
     */
    public void setMatchingProperty(@jakarta.annotation.Nullable final AttributeInfo value) {
        this.backingStore.set("matchingProperty", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
