package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExternalItem extends Entity implements Parsable {
    /**
     * Instantiates a new ExternalItem and sets the default values.
     */
    public ExternalItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExternalItem
     */
    @jakarta.annotation.Nonnull
    public static ExternalItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalItem();
    }
    /**
     * Gets the acl property value. The acl property
     * @return a java.util.List<Acl>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Acl> getAcl() {
        return this.backingStore.get("acl");
    }
    /**
     * Gets the content property value. The content property
     * @return a ExternalItemContent
     */
    @jakarta.annotation.Nullable
    public ExternalItemContent getContent() {
        return this.backingStore.get("content");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("acl", (n) -> { this.setAcl(n.getCollectionOfObjectValues(Acl::createFromDiscriminatorValue)); });
        deserializerMap.put("content", (n) -> { this.setContent(n.getObjectValue(ExternalItemContent::createFromDiscriminatorValue)); });
        deserializerMap.put("properties", (n) -> { this.setProperties(n.getObjectValue(Properties::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the properties property value. The properties property
     * @return a Properties
     */
    @jakarta.annotation.Nullable
    public Properties getProperties() {
        return this.backingStore.get("properties");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("acl", this.getAcl());
        writer.writeObjectValue("content", this.getContent());
        writer.writeObjectValue("properties", this.getProperties());
    }
    /**
     * Sets the acl property value. The acl property
     * @param value Value to set for the acl property.
     */
    public void setAcl(@jakarta.annotation.Nullable final java.util.List<Acl> value) {
        this.backingStore.set("acl", value);
    }
    /**
     * Sets the content property value. The content property
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final ExternalItemContent value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the properties property value. The properties property
     * @param value Value to set for the properties property.
     */
    public void setProperties(@jakarta.annotation.Nullable final Properties value) {
        this.backingStore.set("properties", value);
    }
}
