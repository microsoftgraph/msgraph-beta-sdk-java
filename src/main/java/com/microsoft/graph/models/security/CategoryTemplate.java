package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CategoryTemplate extends FilePlanDescriptorTemplate implements Parsable {
    /**
     * Represents all subcategories under a particular category.
     */
    private java.util.List<SubCategoryTemplate> subCategories;
    /**
     * Instantiates a new categoryTemplate and sets the default values.
     */
    public CategoryTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a categoryTemplate
     */
    @jakarta.annotation.Nonnull
    public static CategoryTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CategoryTemplate();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("subCategories", (n) -> { this.setSubCategories(n.getCollectionOfObjectValues(SubCategoryTemplate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the subCategories property value. Represents all subcategories under a particular category.
     * @return a subCategoryTemplate
     */
    @jakarta.annotation.Nullable
    public java.util.List<SubCategoryTemplate> getSubCategories() {
        return this.subCategories;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("subCategories", this.getSubCategories());
    }
    /**
     * Sets the subCategories property value. Represents all subcategories under a particular category.
     * @param value Value to set for the subCategories property.
     */
    public void setSubCategories(@jakarta.annotation.Nullable final java.util.List<SubCategoryTemplate> value) {
        this.subCategories = value;
    }
}
