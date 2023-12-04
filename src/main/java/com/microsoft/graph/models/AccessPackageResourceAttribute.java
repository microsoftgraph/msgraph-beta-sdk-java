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
public class AccessPackageResourceAttribute implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new AccessPackageResourceAttribute and sets the default values.
     */
    public AccessPackageResourceAttribute() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessPackageResourceAttribute
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageResourceAttribute createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResourceAttribute();
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
     * Gets the attributeDestination property value. Information about how to set the attribute, currently a accessPackageUserDirectoryAttributeStore object type.
     * @return a AccessPackageResourceAttributeDestination
     */
    @jakarta.annotation.Nullable
    public AccessPackageResourceAttributeDestination getAttributeDestination() {
        return this.backingStore.get("attributeDestination");
    }
    /**
     * Gets the attributeName property value. The name of the attribute in the end system. If the destination is accessPackageUserDirectoryAttributeStore, then a user property such as jobTitle or a directory schema extension for the user object type, such as extension2b676109c7c74ae2b41549205f1947edpersonalTitle.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAttributeName() {
        return this.backingStore.get("attributeName");
    }
    /**
     * Gets the attributeSource property value. Information about how to populate the attribute value when an accessPackageAssignmentRequest is being fulfilled, currently a accessPackageResourceAttributeQuestion object type.
     * @return a AccessPackageResourceAttributeSource
     */
    @jakarta.annotation.Nullable
    public AccessPackageResourceAttributeSource getAttributeSource() {
        return this.backingStore.get("attributeSource");
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("attributeDestination", (n) -> { this.setAttributeDestination(n.getObjectValue(AccessPackageResourceAttributeDestination::createFromDiscriminatorValue)); });
        deserializerMap.put("attributeName", (n) -> { this.setAttributeName(n.getStringValue()); });
        deserializerMap.put("attributeSource", (n) -> { this.setAttributeSource(n.getObjectValue(AccessPackageResourceAttributeSource::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isEditable", (n) -> { this.setIsEditable(n.getBooleanValue()); });
        deserializerMap.put("isPersistedOnAssignmentRemoval", (n) -> { this.setIsPersistedOnAssignmentRemoval(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique identifier for the attribute on the access package resource. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.backingStore.get("id");
    }
    /**
     * Gets the isEditable property value. Specifies whether or not an existing attribute value can be edited by the requester.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEditable() {
        return this.backingStore.get("isEditable");
    }
    /**
     * Gets the isPersistedOnAssignmentRemoval property value. Specifies whether the attribute will remain in the end system after an assignment ends.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPersistedOnAssignmentRemoval() {
        return this.backingStore.get("isPersistedOnAssignmentRemoval");
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
        writer.writeObjectValue("attributeDestination", this.getAttributeDestination());
        writer.writeStringValue("attributeName", this.getAttributeName());
        writer.writeObjectValue("attributeSource", this.getAttributeSource());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isEditable", this.getIsEditable());
        writer.writeBooleanValue("isPersistedOnAssignmentRemoval", this.getIsPersistedOnAssignmentRemoval());
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
     * Sets the attributeDestination property value. Information about how to set the attribute, currently a accessPackageUserDirectoryAttributeStore object type.
     * @param value Value to set for the attributeDestination property.
     */
    public void setAttributeDestination(@jakarta.annotation.Nullable final AccessPackageResourceAttributeDestination value) {
        this.backingStore.set("attributeDestination", value);
    }
    /**
     * Sets the attributeName property value. The name of the attribute in the end system. If the destination is accessPackageUserDirectoryAttributeStore, then a user property such as jobTitle or a directory schema extension for the user object type, such as extension2b676109c7c74ae2b41549205f1947edpersonalTitle.
     * @param value Value to set for the attributeName property.
     */
    public void setAttributeName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("attributeName", value);
    }
    /**
     * Sets the attributeSource property value. Information about how to populate the attribute value when an accessPackageAssignmentRequest is being fulfilled, currently a accessPackageResourceAttributeQuestion object type.
     * @param value Value to set for the attributeSource property.
     */
    public void setAttributeSource(@jakarta.annotation.Nullable final AccessPackageResourceAttributeSource value) {
        this.backingStore.set("attributeSource", value);
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
     * Sets the id property value. Unique identifier for the attribute on the access package resource. Read-only.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("id", value);
    }
    /**
     * Sets the isEditable property value. Specifies whether or not an existing attribute value can be edited by the requester.
     * @param value Value to set for the isEditable property.
     */
    public void setIsEditable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEditable", value);
    }
    /**
     * Sets the isPersistedOnAssignmentRemoval property value. Specifies whether the attribute will remain in the end system after an assignment ends.
     * @param value Value to set for the isPersistedOnAssignmentRemoval property.
     */
    public void setIsPersistedOnAssignmentRemoval(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isPersistedOnAssignmentRemoval", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
