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
 * Represents a connector data store linkage record for an object in a synchronization job.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ObjectConnection implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ObjectConnection} and sets the default values.
     */
    public ObjectConnection() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ObjectConnection}
     */
    @jakarta.annotation.Nonnull
    public static ObjectConnection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ObjectConnection();
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
     * Gets the displayName property value. Display name of the connected object. Nullable. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("objectId", (n) -> { this.setObjectId(n.getStringValue()); });
        deserializerMap.put("objectTypeName", (n) -> { this.setObjectTypeName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sourceAnchor", (n) -> { this.setSourceAnchor(n.getStringValue()); });
        deserializerMap.put("targetAnchor", (n) -> { this.setTargetAnchor(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the objectId property value. Identifier supplied in the request to look up the connection. Can be the source or target identifier for the object in the synchronization job. Key. Not nullable. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getObjectId() {
        return this.backingStore.get("objectId");
    }
    /**
     * Gets the objectTypeName property value. Logical object type, such as User or Group. Not nullable. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getObjectTypeName() {
        return this.backingStore.get("objectTypeName");
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
     * Gets the sourceAnchor property value. Anchor or join value in the source directory. Not nullable. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceAnchor() {
        return this.backingStore.get("sourceAnchor");
    }
    /**
     * Gets the targetAnchor property value. Anchor or transformed identifier in the target space. Not nullable. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetAnchor() {
        return this.backingStore.get("targetAnchor");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("objectId", this.getObjectId());
        writer.writeStringValue("objectTypeName", this.getObjectTypeName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sourceAnchor", this.getSourceAnchor());
        writer.writeStringValue("targetAnchor", this.getTargetAnchor());
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
     * Sets the displayName property value. Display name of the connected object. Nullable. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the objectId property value. Identifier supplied in the request to look up the connection. Can be the source or target identifier for the object in the synchronization job. Key. Not nullable. Read-only.
     * @param value Value to set for the objectId property.
     */
    public void setObjectId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("objectId", value);
    }
    /**
     * Sets the objectTypeName property value. Logical object type, such as User or Group. Not nullable. Read-only.
     * @param value Value to set for the objectTypeName property.
     */
    public void setObjectTypeName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("objectTypeName", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the sourceAnchor property value. Anchor or join value in the source directory. Not nullable. Read-only.
     * @param value Value to set for the sourceAnchor property.
     */
    public void setSourceAnchor(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceAnchor", value);
    }
    /**
     * Sets the targetAnchor property value. Anchor or transformed identifier in the target space. Not nullable. Read-only.
     * @param value Value to set for the targetAnchor property.
     */
    public void setTargetAnchor(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetAnchor", value);
    }
}
