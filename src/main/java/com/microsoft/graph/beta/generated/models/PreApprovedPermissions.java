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
public class PreApprovedPermissions implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PreApprovedPermissions} and sets the default values.
     */
    public PreApprovedPermissions() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PreApprovedPermissions}
     */
    @jakarta.annotation.Nonnull
    public static PreApprovedPermissions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.allPreApprovedPermissions": return new AllPreApprovedPermissions();
                case "#microsoft.graph.allPreApprovedPermissionsOnResourceApp": return new AllPreApprovedPermissionsOnResourceApp();
                case "#microsoft.graph.enumeratedPreApprovedPermissions": return new EnumeratedPreApprovedPermissions();
            }
        }
        return new PreApprovedPermissions();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("permissionKind", (n) -> { this.setPermissionKind(n.getEnumValue(PermissionKind::forValue)); });
        deserializerMap.put("permissionType", (n) -> { this.setPermissionType(n.getEnumValue(PermissionType::forValue)); });
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
     * Gets the permissionKind property value. Indicates the scope of permissions that are included in this condition set. Possible values: all for all permissions, enumerated for a given list of permissions, or allPermissionsOnResourceApp for all permissions from a given API. Required.
     * @return a {@link PermissionKind}
     */
    @jakarta.annotation.Nullable
    public PermissionKind getPermissionKind() {
        return this.backingStore.get("permissionKind");
    }
    /**
     * Gets the permissionType property value. The type of permission being granted. Possible values: application for application permissions, or delegated for delegated permissions. Required.
     * @return a {@link PermissionType}
     */
    @jakarta.annotation.Nullable
    public PermissionType getPermissionType() {
        return this.backingStore.get("permissionType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("permissionKind", this.getPermissionKind());
        writer.writeEnumValue("permissionType", this.getPermissionType());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the permissionKind property value. Indicates the scope of permissions that are included in this condition set. Possible values: all for all permissions, enumerated for a given list of permissions, or allPermissionsOnResourceApp for all permissions from a given API. Required.
     * @param value Value to set for the permissionKind property.
     */
    public void setPermissionKind(@jakarta.annotation.Nullable final PermissionKind value) {
        this.backingStore.set("permissionKind", value);
    }
    /**
     * Sets the permissionType property value. The type of permission being granted. Possible values: application for application permissions, or delegated for delegated permissions. Required.
     * @param value Value to set for the permissionType property.
     */
    public void setPermissionType(@jakarta.annotation.Nullable final PermissionType value) {
        this.backingStore.set("permissionType", value);
    }
}
