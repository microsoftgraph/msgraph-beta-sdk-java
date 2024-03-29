package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageResourceScope extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AccessPackageResourceScope} and sets the default values.
     */
    public AccessPackageResourceScope() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessPackageResourceScope}
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageResourceScope createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResourceScope();
    }
    /**
     * Gets the accessPackageResource property value. The accessPackageResource property
     * @return a {@link AccessPackageResource}
     */
    @jakarta.annotation.Nullable
    public AccessPackageResource getAccessPackageResource() {
        return this.backingStore.get("accessPackageResource");
    }
    /**
     * Gets the description property value. The description of the scope.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name of the scope.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackageResource", (n) -> { this.setAccessPackageResource(n.getObjectValue(AccessPackageResource::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isRootScope", (n) -> { this.setIsRootScope(n.getBooleanValue()); });
        deserializerMap.put("originId", (n) -> { this.setOriginId(n.getStringValue()); });
        deserializerMap.put("originSystem", (n) -> { this.setOriginSystem(n.getStringValue()); });
        deserializerMap.put("roleOriginId", (n) -> { this.setRoleOriginId(n.getStringValue()); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isRootScope property value. True if the scopes are arranged in a hierarchy and this is the top or root scope of the resource.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRootScope() {
        return this.backingStore.get("isRootScope");
    }
    /**
     * Gets the originId property value. The unique identifier for the scope in the resource as defined in the origin system.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOriginId() {
        return this.backingStore.get("originId");
    }
    /**
     * Gets the originSystem property value. The origin system for the scope.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOriginSystem() {
        return this.backingStore.get("originSystem");
    }
    /**
     * Gets the roleOriginId property value. The origin system for the role, if different.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRoleOriginId() {
        return this.backingStore.get("roleOriginId");
    }
    /**
     * Gets the url property value. A resource locator for the scope.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.backingStore.get("url");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("accessPackageResource", this.getAccessPackageResource());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isRootScope", this.getIsRootScope());
        writer.writeStringValue("originId", this.getOriginId());
        writer.writeStringValue("originSystem", this.getOriginSystem());
        writer.writeStringValue("roleOriginId", this.getRoleOriginId());
        writer.writeStringValue("url", this.getUrl());
    }
    /**
     * Sets the accessPackageResource property value. The accessPackageResource property
     * @param value Value to set for the accessPackageResource property.
     */
    public void setAccessPackageResource(@jakarta.annotation.Nullable final AccessPackageResource value) {
        this.backingStore.set("accessPackageResource", value);
    }
    /**
     * Sets the description property value. The description of the scope.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name of the scope.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isRootScope property value. True if the scopes are arranged in a hierarchy and this is the top or root scope of the resource.
     * @param value Value to set for the isRootScope property.
     */
    public void setIsRootScope(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRootScope", value);
    }
    /**
     * Sets the originId property value. The unique identifier for the scope in the resource as defined in the origin system.
     * @param value Value to set for the originId property.
     */
    public void setOriginId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("originId", value);
    }
    /**
     * Sets the originSystem property value. The origin system for the scope.
     * @param value Value to set for the originSystem property.
     */
    public void setOriginSystem(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("originSystem", value);
    }
    /**
     * Sets the roleOriginId property value. The origin system for the role, if different.
     * @param value Value to set for the roleOriginId property.
     */
    public void setRoleOriginId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("roleOriginId", value);
    }
    /**
     * Sets the url property value. A resource locator for the scope.
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("url", value);
    }
}
