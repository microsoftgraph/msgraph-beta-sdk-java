package com.microsoft.graph.beta.models;

import com.microsoft.graph.beta.models.security.contentmanagement.ContentManagementRepository;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The contentManagement segment under `/security`. Groups the content-management resources(connected repositories) under a single node.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ContentManagementRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ContentManagementRoot} and sets the default values.
     */
    public ContentManagementRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ContentManagementRoot}
     */
    @jakarta.annotation.Nonnull
    public static ContentManagementRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContentManagementRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("repositories", (n) -> { this.setRepositories(n.getCollectionOfObjectValues(ContentManagementRepository::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the repositories property value. Connected source-control repositories that deliver security content as code.
     * @return a {@link java.util.List<ContentManagementRepository>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ContentManagementRepository> getRepositories() {
        return this.backingStore.get("repositories");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("repositories", this.getRepositories());
    }
    /**
     * Sets the repositories property value. Connected source-control repositories that deliver security content as code.
     * @param value Value to set for the repositories property.
     */
    public void setRepositories(@jakarta.annotation.Nullable final java.util.List<ContentManagementRepository> value) {
        this.backingStore.set("repositories", value);
    }
}
