package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageResourceRole extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AccessPackageResourceRole} and sets the default values.
     */
    public AccessPackageResourceRole() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessPackageResourceRole}
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageResourceRole createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResourceRole();
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
     * Gets the description property value. A description for the resource role.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name of the resource role such as the role defined by the application.
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
        deserializerMap.put("originId", (n) -> { this.setOriginId(n.getStringValue()); });
        deserializerMap.put("originSystem", (n) -> { this.setOriginSystem(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the originId property value. The unique identifier of the resource role in the origin system. For a SharePoint Online site, the originId is the sequence number of the role in the site.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOriginId() {
        return this.backingStore.get("originId");
    }
    /**
     * Gets the originSystem property value. The type of the resource in the origin system, such as SharePointOnline, AadApplication or AadGroup.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOriginSystem() {
        return this.backingStore.get("originSystem");
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
        writer.writeStringValue("originId", this.getOriginId());
        writer.writeStringValue("originSystem", this.getOriginSystem());
    }
    /**
     * Sets the accessPackageResource property value. The accessPackageResource property
     * @param value Value to set for the accessPackageResource property.
     */
    public void setAccessPackageResource(@jakarta.annotation.Nullable final AccessPackageResource value) {
        this.backingStore.set("accessPackageResource", value);
    }
    /**
     * Sets the description property value. A description for the resource role.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name of the resource role such as the role defined by the application.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the originId property value. The unique identifier of the resource role in the origin system. For a SharePoint Online site, the originId is the sequence number of the role in the site.
     * @param value Value to set for the originId property.
     */
    public void setOriginId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("originId", value);
    }
    /**
     * Sets the originSystem property value. The type of the resource in the origin system, such as SharePointOnline, AadApplication or AadGroup.
     * @param value Value to set for the originSystem property.
     */
    public void setOriginSystem(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("originSystem", value);
    }
}
