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
        deserializerMap.put("principalId", (n) -> { this.setPrincipalId(n.getStringValue()); });
        deserializerMap.put("principalType", (n) -> { this.setPrincipalType(n.getEnumValue(PrincipalType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the permissionDescription property value. A description for the permission.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPermissionDescription() {
        return this.backingStore.get("permissionDescription");
    }
    /**
     * Gets the permissionId property value. The id of the permission assigned to this principal.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPermissionId() {
        return this.backingStore.get("permissionId");
    }
    /**
     * Gets the permissionName property value. The name of the permission assigned to this principal.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPermissionName() {
        return this.backingStore.get("permissionName");
    }
    /**
     * Gets the permissionType property value. The type of the permission assigned to this principal.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPermissionType() {
        return this.backingStore.get("permissionType");
    }
    /**
     * Gets the principalId property value. The id of the principal who has permissions on the custom data provided resource.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrincipalId() {
        return this.backingStore.get("principalId");
    }
    /**
     * Gets the principalType property value. The principalType property
     * @return a {@link PrincipalType}
     */
    @jakarta.annotation.Nullable
    public PrincipalType getPrincipalType() {
        return this.backingStore.get("principalType");
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
        writer.writeStringValue("principalId", this.getPrincipalId());
        writer.writeEnumValue("principalType", this.getPrincipalType());
    }
    /**
     * Sets the permissionDescription property value. A description for the permission.
     * @param value Value to set for the permissionDescription property.
     */
    public void setPermissionDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("permissionDescription", value);
    }
    /**
     * Sets the permissionId property value. The id of the permission assigned to this principal.
     * @param value Value to set for the permissionId property.
     */
    public void setPermissionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("permissionId", value);
    }
    /**
     * Sets the permissionName property value. The name of the permission assigned to this principal.
     * @param value Value to set for the permissionName property.
     */
    public void setPermissionName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("permissionName", value);
    }
    /**
     * Sets the permissionType property value. The type of the permission assigned to this principal.
     * @param value Value to set for the permissionType property.
     */
    public void setPermissionType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("permissionType", value);
    }
    /**
     * Sets the principalId property value. The id of the principal who has permissions on the custom data provided resource.
     * @param value Value to set for the principalId property.
     */
    public void setPrincipalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("principalId", value);
    }
    /**
     * Sets the principalType property value. The principalType property
     * @param value Value to set for the principalType property.
     */
    public void setPrincipalType(@jakarta.annotation.Nullable final PrincipalType value) {
        this.backingStore.set("principalType", value);
    }
}
