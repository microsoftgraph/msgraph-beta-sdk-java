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
/**
 * Represents a process that can receive an Apple Event notification.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSAppleEventReceiver implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new MacOSAppleEventReceiver and sets the default values.
     */
    public MacOSAppleEventReceiver() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSAppleEventReceiver
     */
    @jakarta.annotation.Nonnull
    public static MacOSAppleEventReceiver createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSAppleEventReceiver();
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
     * Gets the allowed property value. Allow or block this app from receiving Apple events.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowed() {
        return this.backingStore.get("allowed");
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
     * Gets the codeRequirement property value. Code requirement for the app or binary that receives the Apple Event.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCodeRequirement() {
        return this.backingStore.get("codeRequirement");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("allowed", (n) -> { this.setAllowed(n.getBooleanValue()); });
        deserializerMap.put("codeRequirement", (n) -> { this.setCodeRequirement(n.getStringValue()); });
        deserializerMap.put("identifier", (n) -> { this.setIdentifier(n.getStringValue()); });
        deserializerMap.put("identifierType", (n) -> { this.setIdentifierType(n.getEnumValue(MacOSProcessIdentifierType.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identifier property value. Bundle ID of the app or file path of the process or executable that receives the Apple Event.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIdentifier() {
        return this.backingStore.get("identifier");
    }
    /**
     * Gets the identifierType property value. Process identifier types for MacOS Privacy Preferences
     * @return a MacOSProcessIdentifierType
     */
    @jakarta.annotation.Nullable
    public MacOSProcessIdentifierType getIdentifierType() {
        return this.backingStore.get("identifierType");
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowed", this.getAllowed());
        writer.writeStringValue("codeRequirement", this.getCodeRequirement());
        writer.writeStringValue("identifier", this.getIdentifier());
        writer.writeEnumValue("identifierType", this.getIdentifierType());
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
     * Sets the allowed property value. Allow or block this app from receiving Apple events.
     * @param value Value to set for the allowed property.
     */
    public void setAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowed", value);
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
     * Sets the codeRequirement property value. Code requirement for the app or binary that receives the Apple Event.
     * @param value Value to set for the codeRequirement property.
     */
    public void setCodeRequirement(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("codeRequirement", value);
    }
    /**
     * Sets the identifier property value. Bundle ID of the app or file path of the process or executable that receives the Apple Event.
     * @param value Value to set for the identifier property.
     */
    public void setIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identifier", value);
    }
    /**
     * Sets the identifierType property value. Process identifier types for MacOS Privacy Preferences
     * @param value Value to set for the identifierType property.
     */
    public void setIdentifierType(@jakarta.annotation.Nullable final MacOSProcessIdentifierType value) {
        this.backingStore.set("identifierType", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
