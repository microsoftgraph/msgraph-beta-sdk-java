package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewDataUploadTriggerCallbackData extends CustomExtensionData implements Parsable {
    /**
     * Instantiates a new {@link AccessReviewDataUploadTriggerCallbackData} and sets the default values.
     */
    public AccessReviewDataUploadTriggerCallbackData() {
        super();
        this.setOdataType("#microsoft.graph.accessReviewDataUploadTriggerCallbackData");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessReviewDataUploadTriggerCallbackData}
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewDataUploadTriggerCallbackData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewDataUploadTriggerCallbackData();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("permissionDescription", (n) -> { this.setPermissionDescription(n.getStringValue()); });
        deserializerMap.put("permissionId", (n) -> { this.setPermissionId(n.getStringValue()); });
        deserializerMap.put("permissionName", (n) -> { this.setPermissionName(n.getStringValue()); });
        deserializerMap.put("permissionType", (n) -> { this.setPermissionType(n.getStringValue()); });
        deserializerMap.put("principalAADId", (n) -> { this.setPrincipalAADId(n.getStringValue()); });
        deserializerMap.put("resourceDescription", (n) -> { this.setResourceDescription(n.getStringValue()); });
        deserializerMap.put("resourceId", (n) -> { this.setResourceId(n.getStringValue()); });
        deserializerMap.put("resourceName", (n) -> { this.setResourceName(n.getStringValue()); });
        deserializerMap.put("resourceOwners", (n) -> { this.setResourceOwners(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("resourceType", (n) -> { this.setResourceType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the permissionDescription property value. The permissionDescription property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPermissionDescription() {
        return this.backingStore.get("permissionDescription");
    }
    /**
     * Gets the permissionId property value. The permissionId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPermissionId() {
        return this.backingStore.get("permissionId");
    }
    /**
     * Gets the permissionName property value. The permissionName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPermissionName() {
        return this.backingStore.get("permissionName");
    }
    /**
     * Gets the permissionType property value. The permissionType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPermissionType() {
        return this.backingStore.get("permissionType");
    }
    /**
     * Gets the principalAADId property value. The principalAADId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrincipalAADId() {
        return this.backingStore.get("principalAADId");
    }
    /**
     * Gets the resourceDescription property value. The resourceDescription property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceDescription() {
        return this.backingStore.get("resourceDescription");
    }
    /**
     * Gets the resourceId property value. The resourceId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceId() {
        return this.backingStore.get("resourceId");
    }
    /**
     * Gets the resourceName property value. The resourceName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceName() {
        return this.backingStore.get("resourceName");
    }
    /**
     * Gets the resourceOwners property value. The resourceOwners property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getResourceOwners() {
        return this.backingStore.get("resourceOwners");
    }
    /**
     * Gets the resourceType property value. The resourceType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceType() {
        return this.backingStore.get("resourceType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("permissionDescription", this.getPermissionDescription());
        writer.writeStringValue("permissionId", this.getPermissionId());
        writer.writeStringValue("permissionName", this.getPermissionName());
        writer.writeStringValue("permissionType", this.getPermissionType());
        writer.writeStringValue("principalAADId", this.getPrincipalAADId());
        writer.writeStringValue("resourceDescription", this.getResourceDescription());
        writer.writeStringValue("resourceId", this.getResourceId());
        writer.writeStringValue("resourceName", this.getResourceName());
        writer.writeCollectionOfPrimitiveValues("resourceOwners", this.getResourceOwners());
        writer.writeStringValue("resourceType", this.getResourceType());
    }
    /**
     * Sets the permissionDescription property value. The permissionDescription property
     * @param value Value to set for the permissionDescription property.
     */
    public void setPermissionDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("permissionDescription", value);
    }
    /**
     * Sets the permissionId property value. The permissionId property
     * @param value Value to set for the permissionId property.
     */
    public void setPermissionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("permissionId", value);
    }
    /**
     * Sets the permissionName property value. The permissionName property
     * @param value Value to set for the permissionName property.
     */
    public void setPermissionName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("permissionName", value);
    }
    /**
     * Sets the permissionType property value. The permissionType property
     * @param value Value to set for the permissionType property.
     */
    public void setPermissionType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("permissionType", value);
    }
    /**
     * Sets the principalAADId property value. The principalAADId property
     * @param value Value to set for the principalAADId property.
     */
    public void setPrincipalAADId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("principalAADId", value);
    }
    /**
     * Sets the resourceDescription property value. The resourceDescription property
     * @param value Value to set for the resourceDescription property.
     */
    public void setResourceDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceDescription", value);
    }
    /**
     * Sets the resourceId property value. The resourceId property
     * @param value Value to set for the resourceId property.
     */
    public void setResourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceId", value);
    }
    /**
     * Sets the resourceName property value. The resourceName property
     * @param value Value to set for the resourceName property.
     */
    public void setResourceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceName", value);
    }
    /**
     * Sets the resourceOwners property value. The resourceOwners property
     * @param value Value to set for the resourceOwners property.
     */
    public void setResourceOwners(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("resourceOwners", value);
    }
    /**
     * Sets the resourceType property value. The resourceType property
     * @param value Value to set for the resourceType property.
     */
    public void setResourceType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceType", value);
    }
}
