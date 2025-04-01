package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationalUnit extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new {@link OrganizationalUnit} and sets the default values.
     */
    public OrganizationalUnit() {
        super();
        this.setOdataType("#microsoft.graph.organizationalUnit");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrganizationalUnit}
     */
    @jakarta.annotation.Nonnull
    public static OrganizationalUnit createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationalUnit();
    }
    /**
     * Gets the children property value. The children property
     * @return a {@link java.util.List<OrganizationalUnit>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OrganizationalUnit> getChildren() {
        return this.backingStore.get("children");
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The displayName property
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
        deserializerMap.put("children", (n) -> { this.setChildren(n.getCollectionOfObjectValues(OrganizationalUnit::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("organizationalUnitParent", (n) -> { this.setOrganizationalUnitParent(n.getObjectValue(OrganizationalUnit::createFromDiscriminatorValue)); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("transitiveChildren", (n) -> { this.setTransitiveChildren(n.getCollectionOfObjectValues(OrganizationalUnit::createFromDiscriminatorValue)); });
        deserializerMap.put("transitiveResources", (n) -> { this.setTransitiveResources(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the organizationalUnitParent property value. The organizationalUnitParent property
     * @return a {@link OrganizationalUnit}
     */
    @jakarta.annotation.Nullable
    public OrganizationalUnit getOrganizationalUnitParent() {
        return this.backingStore.get("organizationalUnitParent");
    }
    /**
     * Gets the resources property value. The resources property
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getResources() {
        return this.backingStore.get("resources");
    }
    /**
     * Gets the transitiveChildren property value. The transitiveChildren property
     * @return a {@link java.util.List<OrganizationalUnit>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OrganizationalUnit> getTransitiveChildren() {
        return this.backingStore.get("transitiveChildren");
    }
    /**
     * Gets the transitiveResources property value. The transitiveResources property
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getTransitiveResources() {
        return this.backingStore.get("transitiveResources");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("children", this.getChildren());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("organizationalUnitParent", this.getOrganizationalUnitParent());
        writer.writeCollectionOfObjectValues("resources", this.getResources());
        writer.writeCollectionOfObjectValues("transitiveChildren", this.getTransitiveChildren());
        writer.writeCollectionOfObjectValues("transitiveResources", this.getTransitiveResources());
    }
    /**
     * Sets the children property value. The children property
     * @param value Value to set for the children property.
     */
    public void setChildren(@jakarta.annotation.Nullable final java.util.List<OrganizationalUnit> value) {
        this.backingStore.set("children", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the organizationalUnitParent property value. The organizationalUnitParent property
     * @param value Value to set for the organizationalUnitParent property.
     */
    public void setOrganizationalUnitParent(@jakarta.annotation.Nullable final OrganizationalUnit value) {
        this.backingStore.set("organizationalUnitParent", value);
    }
    /**
     * Sets the resources property value. The resources property
     * @param value Value to set for the resources property.
     */
    public void setResources(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("resources", value);
    }
    /**
     * Sets the transitiveChildren property value. The transitiveChildren property
     * @param value Value to set for the transitiveChildren property.
     */
    public void setTransitiveChildren(@jakarta.annotation.Nullable final java.util.List<OrganizationalUnit> value) {
        this.backingStore.set("transitiveChildren", value);
    }
    /**
     * Sets the transitiveResources property value. The transitiveResources property
     * @param value Value to set for the transitiveResources property.
     */
    public void setTransitiveResources(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("transitiveResources", value);
    }
}
