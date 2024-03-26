package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Product extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Product} and sets the default values.
     */
    public Product() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Product}
     */
    @jakarta.annotation.Nonnull
    public static Product createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Product();
    }
    /**
     * Gets the editions property value. Represents an edition of a particular Windows product.
     * @return a {@link java.util.List<Edition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Edition> getEditions() {
        return this.backingStore.get("editions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("editions", (n) -> { this.setEditions(n.getCollectionOfObjectValues(Edition::createFromDiscriminatorValue)); });
        deserializerMap.put("friendlyNames", (n) -> { this.setFriendlyNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("groupName", (n) -> { this.setGroupName(n.getStringValue()); });
        deserializerMap.put("knownIssues", (n) -> { this.setKnownIssues(n.getCollectionOfObjectValues(KnownIssue::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("revisions", (n) -> { this.setRevisions(n.getCollectionOfObjectValues(ProductRevision::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the friendlyNames property value. The friendly names of the product. For example, Version 22H2 (OS build 22621). Read-only.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getFriendlyNames() {
        return this.backingStore.get("friendlyNames");
    }
    /**
     * Gets the groupName property value. The name of the product group. For example, Windows 11. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGroupName() {
        return this.backingStore.get("groupName");
    }
    /**
     * Gets the knownIssues property value. Represents a known issue related to a Windows product.
     * @return a {@link java.util.List<KnownIssue>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<KnownIssue> getKnownIssues() {
        return this.backingStore.get("knownIssues");
    }
    /**
     * Gets the name property value. The name of the product. For example, Windows 11, version 22H2. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the revisions property value. Represents a product revision.
     * @return a {@link java.util.List<ProductRevision>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProductRevision> getRevisions() {
        return this.backingStore.get("revisions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("editions", this.getEditions());
        writer.writeCollectionOfPrimitiveValues("friendlyNames", this.getFriendlyNames());
        writer.writeStringValue("groupName", this.getGroupName());
        writer.writeCollectionOfObjectValues("knownIssues", this.getKnownIssues());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("revisions", this.getRevisions());
    }
    /**
     * Sets the editions property value. Represents an edition of a particular Windows product.
     * @param value Value to set for the editions property.
     */
    public void setEditions(@jakarta.annotation.Nullable final java.util.List<Edition> value) {
        this.backingStore.set("editions", value);
    }
    /**
     * Sets the friendlyNames property value. The friendly names of the product. For example, Version 22H2 (OS build 22621). Read-only.
     * @param value Value to set for the friendlyNames property.
     */
    public void setFriendlyNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("friendlyNames", value);
    }
    /**
     * Sets the groupName property value. The name of the product group. For example, Windows 11. Read-only.
     * @param value Value to set for the groupName property.
     */
    public void setGroupName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("groupName", value);
    }
    /**
     * Sets the knownIssues property value. Represents a known issue related to a Windows product.
     * @param value Value to set for the knownIssues property.
     */
    public void setKnownIssues(@jakarta.annotation.Nullable final java.util.List<KnownIssue> value) {
        this.backingStore.set("knownIssues", value);
    }
    /**
     * Sets the name property value. The name of the product. For example, Windows 11, version 22H2. Read-only.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the revisions property value. Represents a product revision.
     * @param value Value to set for the revisions property.
     */
    public void setRevisions(@jakarta.annotation.Nullable final java.util.List<ProductRevision> value) {
        this.backingStore.set("revisions", value);
    }
}
